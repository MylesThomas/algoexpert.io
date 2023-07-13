const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],

    [Symbol.toPrimitive](hint) {
        if (hint === 'number') {
            return website.rating;
        }
        else if (hint === 'string') {
            return website.name
        }
        else {
            return 'default';
        }
    }
};

website.toString = function() { // this is over-ruled / ignored
    return 'Hello World';
}
website.valueOf = function() { // this is over-ruled / ignored
    return 999;
}

console.log(String(website)); // AlgoExpert
console.log(Number(website)); // 5

// 
console.log("\nThese act differently, surprisingly...")
console.log(10 - website); // 5 (- is subtraction)
console.log(10 + website); // 10default (+ can be division OR concat - here it concat)