//givens
const express = require('express');             //init express
const fs = require('fs');                       //for write/read to disk
const app = express();                          //init app
app.use(express.json());                        //only allow json data
const DATA_DIR = 'disk';                        //data_directory - make sure this directory exists in this app's folder!
const hashtable = {};                           //init blank local memory. note: it is a hashtable because we are working with this data right now: {"data": "This is some data on our local disk!"}
port = 3001;                                    //set port number

//make db paths re-usable
db_dir_memory_data = '/db/memory/:version'
db_dir_disk_data = '/db/disk/:version'

//MEMORY-----------------------------------------------------------------------------------------------------------------------------------------------------------
app.post(db_dir_memory_data, (req, res) => {
    console.log(`\n\n\nPOST to memory at db/memory/${req.params.version} ...\n--------------------------------------------------------------------\n\n`);

    console.log(`State of hashtable BEFORE: ${JSON.stringify(hashtable)}`);
    hashtable[req.params.version] = req.body['data']; 
    console.log(`State of hashtable AFTER: ${JSON.stringify(hashtable)}`);

    res.send(); 
    return;
});

app.get(db_dir_memory_data, (req, res) => {
    console.log(`\n\n\nGET from memory at db/memory/${req.params.version} ...\n--------------------------------------------------------------------\n\n`);

    console.log(`This is what the data on the local memory looks like: ${JSON.stringify(hashtable)}`);
    if (req.params.version in hashtable) {
        console.log("The key/value pair has been found in the memory, send it as the response!");
        res.send(hashtable[req.params.version]);
    }
    else {
        console.log("The key/value pair has NOT been found, send null as the response.");
        res.send('null');
    } 
    return;
});

//DISK-----------------------------------------------------------------------------------------------------------------------------------------------------------
app.post(db_dir_disk_data, (req, res) => { 
    console.log(`\n\n\nPOST to disk at db/disk/${req.params.version} ...\n--------------------------------------------------------------------\n\n`);

    const destinationFile = `${DATA_DIR}/${req.params.version}`;
    console.log(`Writing data to local disk at destinationFile of ${destinationFile} ...`);

    fs.writeFileSync(destinationFile, JSON.stringify(req.body['data']));
    console.log("The data has successfully been written to the disk.")

    res.send(); 
});

app.get(db_dir_disk_data, (req, res) => {
    console.log(`\n\n\nGET from disk at db/disk/${req.params.version} ...\n--------------------------------------------------------------------\n\n`);

    const destinationFile = `${DATA_DIR}/${req.params.version}`;
    console.log(`Reading data at ${destinationFile} ...`)
    try {
        const data = fs.readFileSync(destinationFile);
        console.log("The data has successfully been read from the disk, send it as the response!")
        res.send(data); 
        return;
        
    } catch (e) {
        console.log("The data has NOT successfully been read from the disk.")
        res.send('null');
        return;
    }
});

app.listen(port, () => {
    console.log(`Listening on port ${port}!`);
});