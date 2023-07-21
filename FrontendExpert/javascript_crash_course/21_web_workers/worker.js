// worker.js
worker.port.onmessage = function(event) {
    const port = event.ports[0]; // 1st in array of length=1

    port.onmessage = function(event) {
        port.postMessage(event.data);
        // console.log(event.data); may not be able to post to console in some browsers..
    };
};