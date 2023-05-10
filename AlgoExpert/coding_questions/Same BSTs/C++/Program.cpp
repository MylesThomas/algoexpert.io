
//ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh



// Step 1. 


// Step 0. C++ Project Setup
// - Create a Folder for your project and open it in VSCode
// - Create a new file 'Program.cpp'


// Step 1. Copy and Paste your code from AlgoExpert.io into 'Program.cpp'


// Step 2. Download Catch2: https://github.com/catchorg/Catch2 (Code -> Download .zip)
// - Download into 'Downloads' and unzip the folder
// - 
// - 



// Step 2. Download 'vscode-solution-explorer' from Extensions
// - Click on Solution: Explorer on Left Pane
// - Click 'Create New Solution'

// Step 3. 






// - Testing -> Enable Java Tests -> JUnit 
// --- In file explorer, there should now be a 'lib/' folder w/ 2 .jar files in your Project folder
// --- Note: One of the .jar files should start with junit-4, and the next few instructions come from the following link:
// https://code.visualstudio.com/docs/java/java-testing

// Step 2. Copy and Paste code from AlgoExpert.io into 'Program.java'

// Step 3. Copy and Paste code from Sandbox into a new file named 'ProgramTest.java'

// Step 4. Minor edits to 'ProgramTest.java' so that it can run without error:
// - Sandbox may not have this as a public class - make sure to add 'public' before 'class ProgramTest'
// - Remove 'Utils.' before the assertTrue() call, and add the following line of code at the top of the program:
// import static org.junit.Assert.assertTrue;
// - In order to make the '@Test' not throw an error, do 1 of the following:
// - Add this line of code to the top: import org.junit.Test; (recommended)
// - Change '@Test' into '@'

// Step 5. Run test(s) from 
// - There is a 'run tests' button in the Testing sidebar

#include <vector>

using namespace std;

vector<int> getSmaller(vector<int> arr) {
  vector<int> l;
  for (int i=1; i < arr.size(); i++) {
    if (arr[i] < arr[0]) {
      l.push_back(arr[i]);
    }
  }
  return l;
}
vector<int> getGTOE(vector<int> arr) {
  vector<int> l;
  for (int i=1; i < arr.size(); i++) {
    if (arr[i] >= arr[0]) {
      l.push_back(arr[i]);
    }
  }
  return l;
}


bool sameBsts(vector<int> arrayOne, vector<int> arrayTwo) {
  // Write your code here.

  //0. check for base cases 
  int n1 = arrayOne.size();
  int n2 = arrayTwo.size();
  
  if (n1!=n2) {
    return false;
  }
  if (n1==0 && n2==0) {
    return true;
  }
  if (arrayOne[0] != arrayTwo[0]) {
    return false;
  }

  //1. get 4 arrays:
  // arr1 < 
  // arr2 < 
  // arr1 >= 
  // arr2 >=
  vector<int> arrayOneSmaller = getSmaller(arrayOne);
  vector<int> arrayTwoSmaller = getSmaller(arrayTwo);
  vector<int> arrayOneGTOE = getGTOE(arrayOne);
  vector<int> arrayTwoGTOE = getGTOE(arrayTwo);
  
  //2. return
  
  return sameBsts(arrayOneSmaller, arrayTwoSmaller) && sameBsts(arrayOneGTOE, arrayTwoGTOE);
}



//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()
int main() {
    vector<int> arrayOne = {10, 15, 8, 12, 94, 81, 5, 2, 11};
    vector<int> arrayTwo = {10, 8, 5, 15, 2, 12, 11, 94, 81};
    assert(sameBsts(arrayOne, arrayTwo) == true);

    vector<int> arrayOne2 = {1,2,3};
    vector<int> arrayTwo2 = {1,2,3};
    assert(sameBsts(arrayOne2, arrayTwo2) == true);

    
    vector<int> arrayTwo3 = {1,2,3,9999999};
    assert(sameBsts(arrayOne2, arrayTwo3) == false);

    

    



    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};