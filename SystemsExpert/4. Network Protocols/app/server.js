// Express - Node.js web application framework
const express = require('express');
const app = express();

// only allow json data as requests body
app.use(express.json());

// listen on port 3000
app.listen(3000, () => console.log('Listening on port 3000.'));

// GET method on path /hello
app.get('/hello', (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    res.send('Received GET request! \n');

});

// POST method on path /hello
app.post('/hello', (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    console.log('Body:', req.body);
    res.send('Received POST request! \n');

});