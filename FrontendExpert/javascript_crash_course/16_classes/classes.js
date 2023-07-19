class Person {
    constructor(name) {
        this.name = name;
    }
    speak() {
        console.log('Hello this is ' + this.name);
    }
}

// Child: instance of Person 
// Person: -
class Child extends Person {
    #age; // private age

    constructor(name, age) {
        super(name) // calls constructor of class we are inheriting from! ie. Person
        this.#age = age;
    }
}

const child = new Child('John', 10);
child.speak();
console.log(child instanceof Person); // true
console.log(child instanceof Child);  // true
console.log(Person instanceof Function); // reminder that Person is a function, under the hood 