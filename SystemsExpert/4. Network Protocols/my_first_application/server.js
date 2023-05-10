// Express - Node.js web application framework
const express = require('express');
const app = express();

//hardcode port and  (Clement did NOT do this)
port = 3000
path = '/hello'

// only allow json data as requests body
app.use(express.json());

// listen on port 3000
app.listen(port, () => console.log('Listening on port ${port}.'));

// GET method on path /hello
app.get(path, (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    res.send('Received GET request!\n');
});

// POST method on path /hello
app.post(path, (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    console.log('Body:', req.body);
    res.send('Received POST request!\n');
});