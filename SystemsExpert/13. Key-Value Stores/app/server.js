const database = require('./database');
const express = require('express');
const redis = require('redis').createClient();
//const redis = require('redis').createClient({legacyMode: true}); //added {legacyMode: true} to fix error: ClientClosedError: The client is closed (await client.connect(); could work too!)

//ignore code in line 4 - the next line fixes things


const app = express();

app.get('/nocache/index.html', (req, res) => {
    database.get('index.html', page => {
        res.send(page);
    });
});

app.get('/withcache/index.html', (req, res) => {
    redis.get('index.html', (err, redisRes) => {
        if (redisRes) {
            res.send(redisRes);
            return;
        }
        //else {
        database.get('index.html', page => {
            redis.set('index.html', page, 'EX', 10); //'EX' is for Expiration, 10 means 10 seconds until the data becomes stale/is removed from the cache!
            res.send(page);
        });
        //}
    });
});

const port_num = 3001;
app.listen(port_num, function() {
    console.log(`Listening on port ${port_num}!`)
});