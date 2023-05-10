
using namespace std;
#include <stack>
#include <string>
#include <algorithm>


string bestDigits(string number, int numDigits) {
  // Write your code here.
  //create an empty stack
  stack<char> stack;
  //iterate through the numbers in number, applying the while loop logic
  // make sure to end by adding the current number
  for (auto currentNumber : number ) {
    while (stack.size() > 0 && currentNumber > stack.top() && numDigits > 0) {
      numDigits --;
      stack.pop();
    }
    //appending to stack at end
    stack.push(currentNumber);
  }

  //check if we have any more numDigits remaining
  while (numDigits > 0) {
    numDigits --;
    stack.pop();
  }
  
  //turn the stack into a string
  string bestDigitString = "";
  while (stack.size() > 0) {
    char c = stack.top();
    bestDigitString += c;
    stack.pop();
  }

  //reverse it because stacks go backwards
  reverse(bestDigitString.begin(), bestDigitString.end());
  
  return bestDigitString;
}//end method




//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()



int main() {
  //paste here
  string number = "462839";
  int numDigits = 2;
  string expected = "6839";
  auto actual = bestDigits(number, numDigits);
  assert(expected == actual);

  string number2 = "99999";
  int numDigits2 = 2;
  string expected2 = "999";
  auto actual2 = bestDigits(number2, numDigits2);
  assert(expected2 == actual2);

  
                          
    
    //
    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};