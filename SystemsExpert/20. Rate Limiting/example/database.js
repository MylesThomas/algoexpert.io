const database = {
    ['index.html']: '<html>Hello Myles!</html>',
};

module.exports.get = (key, callback) => {
    setTimeout(() => {
        callback(database[key]);
    }, 1000); //1000: wait 1 second 
};