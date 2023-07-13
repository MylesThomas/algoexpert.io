function foo() {
    'use strict';
    let x = 5;
    console.log(x);
}
foo();

x = 999;
console.log(x); // notice how there is no error since 'use strict' is inside function scope