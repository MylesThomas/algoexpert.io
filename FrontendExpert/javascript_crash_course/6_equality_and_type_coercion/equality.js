console.log({} == {});  // false
console.log({} === {}); // false

const obj = {};
console.log(obj == obj); // true
console.log(obj === obj); // true

const arr = [];
console.log(arr == arr); // true
console.log(arr === arr); // true

const arr2 = [];
console.log(arr == arr2); // false