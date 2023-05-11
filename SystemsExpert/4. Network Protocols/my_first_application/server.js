const express = require('express'); // Express - Node.js web application framework
const app = express();

//commenting out since I added stuff on line _
//app.use(express.json()); // only allow json data as requests body
//app.use(bodyParser.json());  

//Myles' added Code
//------------------------------------------------------------------------------------------------------------------------------------------------------------
port = 3000         //hardcode port (Link to why 3000: https://stackoverflow.com/questions/37929173/significance-of-port-3000-in-express-apps#:~:text=3000%20is%20a%20somewhat%20arbitrary,elevated%20privilege%20in%20most%20environments.)
path = '/hello'     //hardcode path
bodyParser = require('body-parser')         //define bodyParser
                 
app.use(bodyParser.urlencoded({
    extended: true  //line 31, req.body always showed up as {} in server's httpRequest, this fixed it: (Link: https://stackoverflow.com/questions/24543847/req-body-empty-on-posts)
  }));              //this should also fix 'content-type': 'application/x-www-form-urlencoded', which we see when doing method: POST
//------------------------------------------------------------------------------------------------------------------------------------------------------------

//Note: Wrap a quote in `` and put a ${} to make it f-string like!
app.listen(port, () => console.log(`Listening on port ${port}.`)); // listen on port (we hardcoded 3000 on line 9)

app.get(path, (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    res.send('Received GET request!\n');
});

app.post(path, (req, res) => {
    console.log('Headers:', req.headers);
    console.log('Method:', req.method);
    console.log('Body:', req.body);
    res.send('Received POST request!\n');
});