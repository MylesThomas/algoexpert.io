const slowButton = document.getElementById('slow');
const sayHelloButton = document.getElementById('say-hello');

slowButton.addEventListener('click', slowOperation);
sayHelloButton.addEventListener('click', sayHello);

// function slowOperation() {
//     for (let i = 0; i < 30000000000; i++) {
//         1 + 2;
//     }
//     console.log('slow operation finished');
// }

function slowOperation() {
    const pathToWorkerWhoRunsSeparateThread = 'worker.js';
    const worker = new Worker(pathToWorkerWhoRunsSeparateThread);
    worker.postMessage(10);

    worker.port.onmessage = function(event) {
        console.log(event.data);
    };
}

function sayHello() {
    console.log('hello world');
}