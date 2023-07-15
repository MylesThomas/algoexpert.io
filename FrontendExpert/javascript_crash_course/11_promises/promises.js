async function tester() {
    return await new Promise((res, rej) => {
        setTimeout(() => rej(new Error('Error: Something went wrong')), 1000);
    });
}

tester().then(console.log).catch(error => console.log("Oh No " + error)); // returns same error