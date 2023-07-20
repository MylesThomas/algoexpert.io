//export 
class Person {
    constructor(name) {
        this.name = name;
    }

    sayHello() {
        console.log(`Hi, this is ${this.name}`);
    }
}

//export default Person;
//export { Person as default }; // this is rare to see
export { Person };
