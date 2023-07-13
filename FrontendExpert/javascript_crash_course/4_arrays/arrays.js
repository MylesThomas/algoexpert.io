const arr = [5,7,3,0];

arr.sort(compareNumbers);

function compareNumbers(firstNumber, secondNumber) {
    if (firstNumber == 3) {
        return -1;
    }
    if (secondNumber === 3) {
        return 1;
    }

    return secondNumber - firstNumber;
    
}

console.log(arr); // [3,7,5,0]