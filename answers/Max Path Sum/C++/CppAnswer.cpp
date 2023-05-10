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

//void // because function is called on line 28, before definition

class BinaryTree {
public:
  int value;
  BinaryTree *left = nullptr;
  BinaryTree *right = nullptr;

  BinaryTree(int value) {
    this->value = value;
    
}
void insert(vector<int> values, int i = 0); //i did not think we would use the insert function, but do for TestCase2()

};

vector<int> findMaxPathSum(BinaryTree* tree) {
    //base case
    if (tree == nullptr) {
        return vector<int> {0, INT_MIN};
    }

    //2 recursive calls
    vector<int> left = findMaxPathSum(tree->left);
    vector<int> right = findMaxPathSum(tree->right);

    //max as branch
    int v = tree->value;
    int leftMaxPathSumAsBranch = left[0];
    int rightMaxPathSumAsBranch = right[0];
    int maxPathSumAsBranch = max(leftMaxPathSumAsBranch + v, rightMaxPathSumAsBranch + v);
    maxPathSumAsBranch = max(v, maxPathSumAsBranch);
    
    //max as node
    int maxPathSumAsNode = max(maxPathSumAsBranch, v + leftMaxPathSumAsBranch + rightMaxPathSumAsBranch);

    //maxpathsum
    int leftMaxPathSum = left[1];
    int rightMaxPathSum = right[1];
    int maxPathSum = max(leftMaxPathSum, rightMaxPathSum);
    maxPathSum = max(maxPathSum, maxPathSumAsNode);

    //return
    return vector<int>{maxPathSumAsBranch, maxPathSum};
}

int maxPathSum(BinaryTree tree) {
  // Write your code here.

  // run helper method
  vector<int> arr = findMaxPathSum(&tree);

  // return 
  int x = arr[1];
  return x;
}

bool TestCase1() {
    printf("\nStarting test case 1:\n---------------------------------------------\n");

    BinaryTree n1(1); // not using 'new' because input is NOT a pointer
    BinaryTree* n2 = new BinaryTree(2); 
    BinaryTree* n3 = new BinaryTree(3);
    BinaryTree* n4 = new BinaryTree(4);
    BinaryTree* n5 = new BinaryTree(5);
    BinaryTree* n6 = new BinaryTree(6);
    BinaryTree* n7 = new BinaryTree(7);

    n1.left = n2;
    n1.right = n3;
    n2->left = n4;
    n2->right = n5;
    n3->left = n6;
    n3->right = n7;
    n4->left = nullptr;
    n4->right = nullptr;
    n5->left = nullptr;
    n5->right = nullptr;
    n6->left = nullptr;
    n6->right = nullptr;
    n7->left = nullptr;
    n7->right = nullptr;
    
    BinaryTree& tree = n1;
    int expected = 18;
    int actual = maxPathSum(tree);

    printf("expected: %d \n", expected);
    printf("actual: %d \n", actual);

    assert(expected == actual); // need '#include <cassert>' for assert()
    printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
    return true;
}

// trying out the other way, gonna set up testcase2
//BinaryTree::BinaryTree(int value) {
  //this->value = value;
  //this->left = nullptr;
  //this->right = nullptr;
//}

void BinaryTree::insert(vector<int> values, int i) {
  if (i >= values.size()) {
    return;
  }
  deque<BinaryTree *> queue;
  queue.push_back(this);
  while (queue.size() > 0) {
    BinaryTree *current = queue.front();
    queue.pop_front();
    if (current->left == nullptr) {
      current->left = new BinaryTree(values[i]);
      break;
    }
    queue.push_back(current->left);
    if (current->right == nullptr) {
      current->right = new BinaryTree(values[i]);
      break;
    }
    queue.push_back(current->right);
  }
  this->insert(values, i + 1);
}

bool TestCase2() {
    printf("\nStarting test case 2:\n---------------------------------------------\n");

    BinaryTree test(1);
    test.insert({2, 3, 4, 5, 6, 7, 100, 150, 250});

    int expected = 411;
    int actual = maxPathSum(test);

    printf("expected: %d \n", expected);
    printf("actual: %d \n", actual);

    assert(expected == actual); // need '#include <cassert>' for assert()
    printf("\nSuccess! The program did not abort, so the assert() proves our answer is still correct!\n");
    return true;
}

//main
int main() {
    bool bools = TestCase1();
    
    printf("bool bools: %d \n");

    bool bool2 = TestCase2();
    printf("bool bools2: %d \n");

}
    