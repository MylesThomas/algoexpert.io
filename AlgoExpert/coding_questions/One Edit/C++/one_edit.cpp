#include <iostream>
using namespace std;

// Creating a class that has public attributes for the 2 inputs of our method

class oneEditGraderClass {      // Class
public:                     // Access specifier
    string stringOne;           // Attributes
    string stringTwo;

    // Constructor
    // This is so that we can assign values to class attributes while creating a class object in main.
    oneEditGraderClass(string random_stringOne, string random_stringTwo) {
        stringOne = random_stringOne; // Make sure these are diff (Python would be self.a = a, we can't do that here!)
        stringTwo = random_stringTwo;
    }

    bool oneEdit();             // Method/function declaration

};


// Note: Method 'oneEdit' definition outside the class (we already declared it above though)
// Make sure to have 'oneEditGraderClass::' when defining function outside of class
bool oneEditGraderClass::oneEdit() {
  // Write your code here.
  cout << "Calling oneEditGraderClass::oneEdit() on a oneEditGraderClass object with stringOne = " << stringOne << " and stringTwo = " << stringTwo << endl;

  // Get lengths
  int len1 = stringOne.size(); // Having errors because the class method doesn't know these are class attributes
  int len2 = stringTwo.size();
  if ((len1 < 2) && (len2 < 2)) {
    cout << "Lengths are 0 or 1, return true" << endl;
    return true;
  }

  int len_diff = abs(len1 - len2);
  if (len_diff > 1) {
    cout << "Length difference is greater than 1: return false" << endl;
    return false;
  }

  int i = 0;
  int j = 0;
  int counter = 0;

  if (len_diff == 1) {
    // Iterate through - if you find a difference, move ONLY the bigger string ahead 1
    while ((i < len1) && (j < len2)) {
      if (stringOne[i] != stringTwo[j]) {
        counter += 1;
        if (len1 > len2) {
          i += 1;
        }
        else {
          j += 1;
        }
      }
        
      else if (stringOne[i] == stringTwo[j]) {
        i += 1;
        j += 1;
      }
    }
  }
    
  else if (len_diff == 0) {
    while (i < len1) {
      if (stringOne[i] != stringTwo[i]) {
        counter += 1;
      }
      i += 1;
    }
  }

  // Return value depending on counter
  bool return_val;
  if (counter <= 1) {
    return_val = true;
  }
    
  else if (counter > 1) {
    return_val = false;
  }

  cout << "stringOne = " << stringOne << "\nstringTwo = " << stringTwo << endl;
  cout << "counter: " << counter << endl;
  cout << "return_value: " << return_val << endl;
  return return_val;
}

// Run the Class method in main
int main() {

    // Create a class object
    oneEditGraderClass object1("abcd", "abc");

    // Print the values that our 'object1' has
    cout << "At creation:" << endl;
    cout << "object1.stringOne: " << object1.stringOne << endl;
    cout << "object1.stringTwo: " << object1.stringTwo << endl;

    // Run our method
    object1.oneEdit();

    // Change up the values of object1, run again
    cout << "\nChanging the values of object1 now..." << endl;
    object1.stringOne = "abcdefghijk";
    object1.stringTwo = "abcdefghijklm";
    object1.oneEdit();

    return 0;
}

