//basic html page of a website 
const database = {
    ['index.html']: '<html>Hello Myles Thomas!!!</html>',
};

const milliseconds = 3000;//pretending to be a database call that takes 3 whole seconds (expensive)

module.exports.get = (key, callback) => {
    setTimeout(() => { //callback the value after 3000 milliseconds/3 seconds
        callback(database[key]);
    }, milliseconds);
};