//mock database script
//replace cache from lesson 8 with Redis!
const database = {
    ['index.html']: '<html>Hello Myles Thomas!</html>',
};

module.exports.get = (key, callback) => {
    setTimeout(() => {
        callback(database[key]);
    }, 2000); //3000 = 3 seconds
};