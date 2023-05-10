// This file exists simply to help me debug, specifically this error: "Unexpected token _ in JSON at position 1"
// link to article that helped: 
//
//
console.log('program starting....');

// user input
//const x = {"foo": "baz"};
//const x = 'abc'
//const x = 999;
//const x = {"employee":{"name":"John", "age":30, "city":"New York"}};
const x = {
    "employee":{"name":"John", "age":30, "city":"New York"}
    };
const x_stringified = JSON.stringify(x);
const x_stringified_and_parsed = JSON.parse(x_stringified);

console.log('---------------------------------------------------------------------')
console.log(`\nx: ${x} ; \nx_stringified: ${x_stringified} ; \nx_stringified_and_parsed: ${x_stringified_and_parsed} \n`);


console.log('looks good.\nafter stringify() and parse(), the input should be in JSON, either as a string, integer, or data structure (ie. [object Object]).')

console.log('---------------------------------------------------------------------')
console.log('my inputs are done.\n');
// this will also result in an error if you don't comment it out:
//throw new Error("Not an error, just throwing this before the code below does!");


//
//console.log('attempting to cause the error: "Unexpected token {} in JSON at position 1"\n');



console.log('before stringify:');
bad = {};
console.log(bad);
console.log('after stringify:');
bad = JSON.stringify(bad);
console.log(bad);
console.log('after parse:');
bad_parsed = JSON.parse(bad);
console.log(bad_parsed);
//console.log('did the error print?\n');