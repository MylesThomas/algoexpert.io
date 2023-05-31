const database = require('./database');
const express = require('express');

const app = express();
const cache = {};

//endpoint 1
app.get('/nocache/index.html', (req, res) => {
    database.get('index.html', page => {
        res.send(page);
    });
});

//endpoint 2
app.get('/withcache/index.html', (req, res) => {
    if ('index.html' in cache) {
        res.send(cache['index.html']);
        return;
    }
    //else
    database.get('index.html', page => {
        cache['index.html'] = page;
        res.send(page);
    });
});

app.listen(3001, function() {
    console.log('Listening on port 3001!');
});