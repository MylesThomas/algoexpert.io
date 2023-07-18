const SLOW_API = 'http://localhost:3000/users'; // GET, except it is slow

async function main(event) {
    const abortController = new AbortController();
    setTimeout(() => abortController.abort(), 2000); // this function is called after 2 seconds

    try {
        const response = await fetch(SLOW_API, {
            signal: abortController.signal // signal takes in the signal property, aborting fetch treq.
        });

        const text = await response.text();
        console.log(text);
    } catch (error) {
        console.error('Oh no ' + error);
    }
}