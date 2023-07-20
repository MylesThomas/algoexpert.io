function sum(a, b, c) {
    return a + b + c;
}

function curry(func) {
    return (a) => (b) => (c) => func(a, b, c);
}

const curriedSum = curry(sum);

const addFour = curriedSum(4);
console.log(addFour(10)(10)); // 24