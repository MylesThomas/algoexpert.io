'use strict';

class Person {
    constructor(name) {
        this.name = name;
    }

    // method on the class
    speak() {
        console.log('Hello, I am ' + this.name);
    }
}

const conner = new Person('Conner');
const clement = new Person('Clement');

conner.speak(); // Hello, I am Conner
clement.speak(); // Hello, I am Clement