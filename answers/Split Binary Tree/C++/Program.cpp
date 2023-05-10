
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

// creating my own personal Tuple data structure
class Tuple {
public:
  int value;
  bool bools;

  Tuple(int value, bool bools) {// constructor
    this->value=value;
    this->bools=bools;
  }
};

int getTreeSum(BinaryTree* tree) {
  //
  //base case
  if (tree == nullptr) {
    return 0;
  }
  else {
    return tree->value + getTreeSum(tree->left) + getTreeSum(tree->right);
  }
}

Tuple canTreeBeSplitInHalf(BinaryTree* tree, int target) {
  //base case
  if (tree == nullptr) {
    Tuple base_case_tuple = {0, false};
    return base_case_tuple;
  }
  // else
  // make recursive calls to l/r
  Tuple left  = canTreeBeSplitInHalf(tree->left,  target);
  Tuple right = canTreeBeSplitInHalf(tree->right, target);
  
  
  //get sum of current + l + r
  int currentSum = tree->value + left.value + right.value;

  //check if left/right/or current can split it in half
  bool returnBools = currentSum==target || left.bools || right.bools;
  //return
  Tuple return_tuple = {currentSum, returnBools};
  return return_tuple;
  
}

int splitBinaryTree(BinaryTree *tree) {
  // Write your code here.

  // 1. get the number that the entire tree sums up to
  int treeSum = getTreeSum(tree);

  if (treeSum % 2 == 1) {
    return 0;
  } 
  
  int targetNumber = treeSum / 2;
  
  // 2. See if any of the trees have the target as their sum
  Tuple rets = canTreeBeSplitInHalf(tree, targetNumber);
  bool bools = rets.bools;
  // 3. return
  if (bools) {
    return targetNumber;
  }
  else {
    return 0;
  }
}


//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()
int main() {
    BinaryTree *tree = new BinaryTree(2);
    tree->left = new BinaryTree(4);
    tree->left->left = new BinaryTree(4);
    tree->left->right = new BinaryTree(6);
    tree->right = new BinaryTree(10);
    tree->right->left = new BinaryTree(3);
    tree->right->right = new BinaryTree(3);
    int expected = 16;
    auto actual = splitBinaryTree(tree);
    assert(expected == actual);

    printf("Can't figure out how to do unit testing but at least this worked !");
};