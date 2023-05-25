const database = require('./database')
const express = require('express')
const app = express();

app.listen(3000, () => console.log('Listening on port 3000.'));

// Keep a hash table (in memory) of previous access times, per user.
const accesses = {};

app.get('/index.html', function(req, res) {
    const {user} = req.headers;
    if (user in accesses) {
        const previousAccessTime = accesses[user];

        // limit 1 request per 5 seconds 
        if (Date.now() - previousAccessTime < 5000) { //5000=5seconds
            res.status(429).send('Too many requests !\n');
            return;
        }
    }

    // Serve the page and store access time,  for future use.
    database.get('index.html', page => {
        accesses[user] = Date.now();
        res.send(page + '\n');
    });
});