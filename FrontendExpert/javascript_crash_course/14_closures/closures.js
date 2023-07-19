for (let i = 0; i < 3; i++) {
    setTimeout(() => {
        console.log(i);
    }, 500);
} // 0,1,2

console.log(i); // error!

for (var i = 0; i < 3; i++) {
    setTimeout(() => {
        console.log(i);
    }, 500);
} // 3,3,3

console.log(i); // 3