
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

using namespace std;

// This is an input class. Do not edit.
class BinaryTree {
public:
  int value;
  BinaryTree *left = nullptr;
  BinaryTree *right = nullptr;

  BinaryTree(int value) { this->value = value; }
};

int evaluateExpressionTree(BinaryTree *tree) {
  // Write your code here.
  //base case
  int x = tree->value;
  if(x >= 0) {
    return x; 
  }
  int left = evaluateExpressionTree(tree->left);
  int right = evaluateExpressionTree(tree->right);
  if (x==-1) {
    return left+right;
  }
  if (x==-2) {
    return left-right;
  }
  if (x==-4) {
    return left*right;
  }
  
  if (x==-3) {
    int ret = left/right;
    return ret;
  }
  
  return -1;
}




//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()
int main() {
  BinaryTree *tree = new BinaryTree(-1);
    tree->left = new BinaryTree(2);
    tree->right = new BinaryTree(-2);
    tree->right->left = new BinaryTree(5);
    tree->right->right = new BinaryTree(1);
    int expected = 6;
    auto actual = evaluateExpressionTree(tree);
    assert(expected == actual);


    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};