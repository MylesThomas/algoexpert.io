const express = require('express');
const fs = require('fs');

//const PORT = process.env.PORT;
//const DATA_DIR = process.env.DATA_DIR;
const PORT = process.argv[2];
const DATA_DIR = process.argv[3];


const app = express();
app.use(express.json());

app.post('/:key', (req, res) => {
    const {key} = req.params;
    console.log(`Storing data at key ${key}.`);
    const destinationFile = `${DATA_DIR}/${key}`;
    fs.writeFileSync(destinationFile, req.body.data);
    res.send();
});

app.get('/:key', (req, res) => {
    console.log(req.params);
    const {key} = req.params;
    console.log(key);
    console.log(`Retrieving data at key ${key}.`);
    const destinationFile = `${DATA_DIR}/${key}`;
    try {
        const data = fs.readFileSync(destinationFile);
        res.send(data);
    } catch (e) {
        res.send('null');
    }
});

//console.log(process.argv)

app.listen(PORT, () => {
    //console.log(process.env); //- how to look at the environemnt variables ie. process.env
    //console.log(process.argv) //another try at this
    //console.log(process.argv[2]);
    //console.log(process.argv[3]);
    
    console.log(`Listening on port ${PORT}!`);
});