//imports 



using namespace std;



#include <stack>
#include <string>
#include <algorithm>
#include <vector>
#include<iostream>


#include <assert.h> //assert()
#include <cstdio>   //printf()





// program


int reversePolishNotation(vector<string> tokens) {
  // Write your code here.

  
  //inite stack
  stack <int> stack;
  //begin iterating
  for (string token : tokens) { //auto const& = means leave this value how it appears (can use that instead of string token, if i didn't know everything was going to be a string!)
    if (token == "+") {
      int pop1 = stack.top();
      stack.pop();
      int pop2 = stack.top();
      stack.pop();
      int new_value = pop2 + pop1;
      stack.push(new_value);
      cout << new_value << endl;
    }

    else if (token == "-") {
      int pop1 = stack.top();
      stack.pop();
      int pop2 = stack.top();
      stack.pop();
      int new_value = pop2 - pop1;
      stack.push(new_value);
      cout << new_value << endl;
    }

    else if (token == "*") {
      int pop1 = stack.top();
      stack.pop();
      int pop2 = stack.top();
      stack.pop();
      int new_value = pop2 * pop1;
      stack.push(new_value);
      cout << new_value << endl;
    }

    else if (token == "/") {
      int pop1 = stack.top();
      stack.pop();
      int pop2 = stack.top();
      stack.pop();
      int new_value = pop2 / pop1;
      stack.push(new_value);
      cout << new_value << endl;
    }

    else {
      //int pop1 = stack.top();
      //stack.pop();
      //int pop2 = stack.top();
      //stack.pop();
      //int new_value = token;
      //stack.push(stoi(token));
      int new_value = stoi(token); // std::stoi - Convert string to integer
      stack.push(new_value);
      cout << new_value << endl;
      
    }



    //cout << new_value << endl;
    //stack.push(new_value); //idkw why this way doesn't work since each should make a new_value but whatever.....
  }//end for loop

  // now that for loop is done, return an integer of the only value left in the stack!
  int ret = stack.top();
  return ret;

}











// unit testing


//#include <cassert>







int main() {
  //paste sandbox here
  vector<string> input = {"3", "2", "+", "7", "*"};
  int expected = 35;
  auto actual = reversePolishNotation(input);
  assert(expected == actual);

  input = {"3", "200",  "*"};
  expected = 600;
  actual = reversePolishNotation(input);
  assert(expected == actual);

  
  
                          
    
  //
  printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};