fs = require('fs');
express = require('express');
app = express();

staticConfig = JSON.parse(fs.readFileSync('static_config.json'));

app.listen(3000, () => console.log('Listening on port 3000.'));

app.get('/static/new_feature.html', function(req, res) {
    if (!staticConfig.newFeatureLaunched) {
        res.status(401).send('Unauthorized!\n');
    }
    else {
        res.send('<html>Hello to the new feature!</html>\n');
    }
});