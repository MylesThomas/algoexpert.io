const start = document.getElementById('start');
const stop = document.getElementById('stop');
const count = document.getElementById('count');
start.addEventListener('click', startTime);
stop.addEventListener('click', stopTime);

let animationFrameID;

// performance.now()
// Date.now()
setTimeout(() => {
    console.log(performance.now()); // 
    console.log(Date.now()); // # of milliseconds past Jan 1 1970
}, 1000);

// Another way to log the dates
const date = new Date(2025, 0, 10, 9, 25, 10, 30); 
date.setMonth(9);
console.log("date" + date);

function startTime(timestamp) { // time since 'time origin'
    console.log(timestamp);
    count.textContent++;
    animationFrameID = requestAnimationFrame(startTime);
}

function stopTime() {
    cancelAnimationFrame(animationFrameID);
}