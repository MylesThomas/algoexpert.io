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

using namespace std;

// This is an input class. Do not edit.
class BST {
public:
  int value;
  BST *left = nullptr;
  BST *right = nullptr;

  BST(int value) { this->value = value; }
};

bool searchForDescendant(BST* startingNode, BST* targetNode) {
  //
  BST* currentNode = startingNode;
  while (currentNode != nullptr) {
    if (currentNode->value == targetNode->value) {
      return true;
    }
    else if (currentNode->value > targetNode->value) {
      currentNode = currentNode->left;
    }
    else {
      currentNode = currentNode->right;
    }
  }
  return false;
}

bool validateThreeNodes(BST *nodeOne, BST *nodeTwo, BST *nodeThree) {
  // Write your code here.
  bool bool1;
  bool bool2;
  // 1 -> 2 -> 3
  bool1 = searchForDescendant(nodeOne, nodeTwo) && searchForDescendant(nodeTwo, nodeThree);
  // 3 -> 2 -> 1
  bool2 = searchForDescendant(nodeThree, nodeTwo) && searchForDescendant(nodeTwo, nodeOne);
  return bool1 || bool2;
}


//test cases
bool TestCase1() {
  printf("Starting test case 1:\n--------------------------------------------\n");

  BST *root = new BST(5);
  root->left = new BST(2);
  root->right = new BST(7);
  root->left->left = new BST(1);
  root->left->right = new BST(4);
  root->right->left = new BST(6);
  root->right->right = new BST(8);
  root->left->left->left = new BST(0);
  root->left->right->left = new BST(3);
  BST *nodeOne = root;
  BST *nodeTwo = root->left;
  BST *nodeThree = root->left->right->left;
  bool expected = true;
  auto actual = validateThreeNodes(nodeOne, nodeTwo, nodeThree);

  //bool bools = arraysEqual(actual, expected);
  bool bools = actual==expected;

  printf("expected:\n");
  cout << expected << endl;
  printf("actual:\n");
  cout << actual << endl;
  
  assert(bools);
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}

//main
int main() {
    bool bools = TestCase1();
    printf("bools: %d \n", bools);
    //bool bools2 = TestCase2();
    //printf("bools2: %d \n", bools2);
}
    