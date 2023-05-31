//First time writing a server on my own
//Resources that helped: 
// post had GREAT examples of other simple server.js files: https://www.digitalocean.com/community/tutorials/use-expressjs-to-get-url-and-post-parameters
// .post() - https://www.geeksforgeeks.org/express-js-app-post-function/
// .get()  - https://www.geeksforgeeks.org/express-js-app-get-request-function/
// video helped with curl call details: https://www.youtube.com/watch?v=BuEYquQweGo
// stackoverflow thread to help get things printed to the console: https://stackoverflow.com/questions/41336663/console-logresult-prints-object-object-how-do-i-get-result-name
//
//givens
const express = require('express');             //init express
const fs = require('fs');                       //for write/read to disk
const app = express();                          //init app
app.use(express.json());                        //only allow json data
//app.use(express.urlencoded({ extended: true }));//for urls, which i am not using!
const DATA_DIR = 'app_disk';                    //data_directory - make sure this directory exists in this app's folder!
const hashtable = {};                           //init blank local memory. note: it is a hashtable because we are working with this data right now: {"data": "This is some data on our local disk!"}
port_num = 3001;                                //set port number

//MEMORY-----------------------------------------------------------------------------------------------------------------------------------------------------------
app.post('/db/memory/:version', (req, res) => {
    console.log("Writing to memory...\n--------------------------------------------------------------------\n\n");
    console.log(`req.params should be this since I plan on passing '1' everytime:  /db/memory/1 == /db/memory/${req.params.version}`);
    //note: the reason the following 3 args are optional is because a simple '/' works, but then you can only post 1 piece of data
    //arg (/db)         -> I have this for all data servers
    //arg (/memory)     -> optional, I have this for all data servers w/ 2+ kinds of data ie. this one has memory vs. disk
    //arg (/:version)  -> optional, I have this for all data servers w/ 2+ data files ie. most databases. 
    //                     (this database has 1 data file for memory and 1 for disk, so this arg is not needed since I will be passing '1' everytime!)
    //arg req           -> represents the httpRequest
    //arg res           -> represents the httpResponse
    
    const version_passed_str = req.params.version;    //this key can be anything, and is what is passed after /db/memory/ in the curl call, will be '1' for now
    const key = req.body;                        //all of the data passed comes in req.body
    const value = req.body['data'];                 //the value of key for this key-value pair is data
    const key_stringified = JSON.stringify(req.body);//use JSON.stringify() for readability of print later
    const value_stringified = JSON.stringify(req.body['data']);//use JSON.stringify() for readability of print later
    
    console.log(`This is a POST Method to the directory: '/db/memory/:version', and right now that is db/memory/${version_passed_str} `);
    //console.log(`Note: This is a peak at req.body, which is the data that the requesting server is attempting to post (either some, or all of this!): ${key} or ${key_stringified}`);
    //console.log(`We are using key-value pairs with key="data", so let's look at the value for that key-value pair is: ${value} or ${value_stringified} `); // body is the data, body['data'] means find the key "data" and return its associated value 


    console.log(`Current state of our hashtable BEFORE: ${JSON.stringify(hashtable)}`);
    hashtable[version_passed_str] = req.body['data']; // we are going to pass 1 for version, so hashtable[/db/memory/1] = body["data"]
    console.log(`Current state of our hashtable AFTER: ${JSON.stringify(hashtable)}`);


    res.send(); 
    console.log("Response sent.");
});

app.get('/db/memory/:version', (req, res) => {
    console.log("Reading from memory...\n--------------------------------------------------------------------\n\n");
    console.log(`req.params should be this since I plan on passing '1' everytime:  /db/memory/1 == /db/memory/${req.params.version}`);
    console.log(`\n\nThis is a GET Method to the directory: '/memory/:key' OR /memory/${req.params.version} `);
    console.log("------------------------------------------------------------------------------------------------------------------------------------------------");

    console.log(`Attempting to retrieve the data at this location in the memory: ${req.params.version}`);

    const version = req.params.version;
    console.log(version);
    console.log(`This is what the data on the local memory looks like: ${JSON.stringify(hashtable)}`);
    if (version in hashtable) {
        console.log("The key/value pair has been found, send it as the response!");
        res.send(hashtable[req.params.version]);
        console.log("Response sent.");
        return;
    }
    else {
        console.log("The key/value pair has NOT been found, send null as the response.");
        res.send('null');
        console.log("Response sent.");
        return;
    } 
});

//DISK-----------------------------------------------------------------------------------------------------------------------------------------------------------
app.post('/db/disk/:version', (req, res) => { 
    console.log("Writing to disk...\n--------------------------------------------------------------------\n\n");
    //console.log(`req.params should be this since I plan on passing '1' everytime:  /db/disk/1 == /db/disk/${req.params.version}`);
    const version_passed_str = req.params.version;
    const key = req.body                        
    const value = req.body['data']              
    const key_stringified = JSON.stringify(req.body)
    const value_stringified = JSON.stringify(req.body['data'])
    
    //console.log(`This is a POST Method to the directory: '/db/disk/:version', and right now that is db/disk/${version_passed_str} `);
    //console.log(`Note: This is a peak at req.body, which is the data that the requesting server is attempting to post (either some, or all of this!): ${key} or ${key_stringified}`);
    //console.log(`We are using key-value pairs with key="data", so let's look at the value for that key-value pair is: ${value} or ${value_stringified} `); 

    /////////////////////////
    // defining a JavaScript object
    const user = {
        id: 5,
        firstName: "Maria",
        lastName: "Williams",
        age: 34,
        email: "m.williams@example.com",
        address: {
        streetAddress: "123 Main St",
        city: "Anytown",
        state: "US",
        postalCode: "12345",
        },
        phoneNumbers: [
        {
            type: "home",
            number: "555-555-5554",
        },
        {
            type: "work",
            number: "555-555-5555",
        },
        ],
    };
    
    // converting user to JSON
    const userJSON = JSON.stringify(user);
    //console.log(user);
    console.log(userJSON);
    ////////////////////////////


    //console.log(`Attempting to add the following data to local disk: ${value_stringified}`);
    const destinationFile = `${DATA_DIR}/${version_passed_str}`;
    console.log(`Writing data to local disk at destinationFile of ${destinationFile} ...`);

    //

    //"
    //console.log("Myles!!!!!");
    //console.log(req.body);

    const my_written_data = req.body;
    console.log(my_written_data);
    const my_written_data2 = JSON.stringify(my_written_data);
    console.log(my_written_data2);
    //console.log(req);

    //fs.writeFileSync(destinationFile, req.body); //['data']
    fs.writeFileSync(destinationFile, my_written_data2);//2?
    console.log("The data has successfully been written to the disk.")

    res.send(); 
    console.log("Response sent.")
});

app.get('/db/disk/:version', (req, res) => {
    console.log("Reading from disk...\n--------------------------------------------------------------------\n\n");
    console.log(`req.params should be this since I plan on passing '1' everytime:  /db/disk/1 == /db/disk/${req.params.version}`);
    console.log(`\n\nThis is a GET Method to the directory: '/disk/:version' OR /disk/${req.params.version} `);
    console.log("------------------------------------------------------------------------------------------------------------------------------------------------");
    //console.log(`Attempting to retrieve the data at this location on the disk: ${req.params.version}`);

    const destinationFile = `${DATA_DIR}/${req.params.version}`;
    console.log(`Reading data at ${destinationFile} ...`)
    try {
        const data = fs.readFileSync(destinationFile);
        //console.log(`This is what the data on the local disk looks like: ${JSON.stringify(data)}`);
        console.log("The data has successfully been read from the disk, send it as the response!")
        res.send(data); 
        console.log("Response sent.");
        return;
        
    } catch (e) {
        console.log("The data has NOT successfully been read from the disk.")
        res.send('null');
        console.log("Response sent.");
        return;
    }
});

// What happens when you run node server.js...
app.listen(port_num, () => {
    //if (err) console.log(err);
    console.log(`Listening on port ${port_num}!`);
});