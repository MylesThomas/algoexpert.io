#include <sstream> // this is needed for making the filteredTokens with istringstream


#include <vector>
#include <utility>
#include <unordered_map>
#include <deque>
#include <unordered_set>
#include <cassert>
#include <algorithm> // added to help use 'sort' and 'assert'
#include<iostream>
#include <climits> // for INT_MIN
using namespace std; // always import
using namespace std; // always import

bool isImportantToken(string token) {
  return token.length() && token != ".";
}

string shortenPath(string path) {
  // 1. check if it is a relative path (begins with '/')
  auto firstChar = path[0];
  bool relativePath;
  if (firstChar == '/') {relativePath=true;}
  else {relativePath=false;}
  printf("relativePath: %d \n", relativePath);

  // 2. split the path up into a list with a 'split function'
  string token;
  istringstream iss(path); //idk what this does tbh
  
  vector<string> tokens;
  vector<string> filteredTokens;

  while (getline(iss, token, '/')) { // not exactly sure here
    cout << token << " ";
    tokens.push_back(token);
  }
  copy_if(tokens.begin(), tokens.end(), back_inserter(filteredTokens), isImportantToken); // all of this is grabbing relative tokens
  
  // 3. create an empty stack (add the '' at beginning of relativePath == true)
  vector<string> stack;
  if (relativePath){stack.push_back("");}

  // 4. begin logic of iterating through character and looking for edge cases for x=='..'
  for (auto x: filteredTokens) {
    if (x != "..") {
      stack.push_back(x);
    }
    else if (x == "..") {
      // 1. preceeding value is nothing (empty stack) 
      if (stack.size()==0) {stack.push_back(x);}
      // 2. preceeding value is another '..'
      else if (stack[stack.size() - 1] == "..") {stack.push_back(x);}
      // 3. preceeding value is "", which stands for a space
      else if (stack[stack.size() - 1] == "") {continue;}
      // 4. anything else
      else {stack.pop_back();}    
    }
  }

  // 5. check if the stack consists of only 1 value and that 1 value is the relative path slash '/'
  string returnVal;
  if (stack.size() == 1 && stack[0] == "") {returnVal = "/";}
  else {
    ostringstream oss;
    for (auto i = 0; i < stack.size(); i++) {
      if (i > 0) {
        oss << "/";
      }
      oss << stack[i];
    }
    returnVal = oss.str();
  }
  printf("\nreturnVal: %s \n", returnVal.c_str()); // note adding .c_str() so the end of the string variable
  return returnVal;
}

bool TestCase1() {
  printf("Starting test case 1:\n--------------------------------------------\n");
  string expected = "/foo/bar/baz";
  string input = "/foo/../test/../test/../foo//bar/./baz";
  string actual = shortenPath(input);

  bool bools = (actual == expected);

  printf("expected: %d \n", expected);
  printf("actual: %d \n", actual);

  assert(expected == actual); 
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}
bool TestCase2() {
  printf("Starting test case 2:\n--------------------------------------------\n");
  string expected = "/";
  string input = "/myles/is/king/../../../../../../../../";
  string actual = shortenPath(input);

  bool bools = (actual == expected);

  printf("expected: %d \n", expected);
  printf("actual: %d \n", actual);

  assert(expected == actual); 
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}
//main
int main() {
    bool bools = TestCase1();
    printf("bool bools: %d \n");
    bool bool2 = TestCase2();
    printf("bool bools2: %d \n");
}
    