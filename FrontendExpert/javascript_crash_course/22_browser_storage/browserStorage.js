// Create/Open up a database (makes a new one named '')
// - name of database: myDatabase
// - version number: 1
const request = indexedDB.open('myDatabase', 1);

// upgradeneeded: first the first time we make a database OR when we upgrade the database
request.addEventListener('success', event => {
    const database = event.target.result;

    // get is asynchronous, need to wait for success event, so save into a request
    const req = database
        .transaction(['users'], 'readwrite')
        .objectStore('users')
        //.get(0); // get the index of id=1

        // you can also get via index of name, since we created that index
        .index('name') // note: this is non-unique, would return the 1st row with name == 'Ryan'
        .get('Ryan'); // 

    req.addEventListener('success', event => {
        console.log(event.target.result.name);
        console.log(event.target.result);
    })

})