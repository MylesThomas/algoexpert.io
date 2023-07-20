function* generator1() {
    yield 1;
    yield 2;
}

function* generator2() {
    yield 3;
    yield 4;
}

function* getNumbers(count) {
    yield* generator1();
    yield 2.5;
    yield* generator2();
}

const generator = getNumbers();

console.log(generator.next()); // 1, false
console.log(generator.next()); // 2, false
console.log(generator.next()); // 2.5, false
console.log(generator.next()); // 3, false
console.log(generator.next()); // 4, false

console.log(generator.next()); // undefined, true