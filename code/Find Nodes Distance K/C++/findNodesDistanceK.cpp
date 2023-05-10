#include <vector>
#include <utility>
#include <unordered_map>
#include <deque>
#include <unordered_set>
#include <cassert>
#include <algorithm> // added to help use 'sort' and 'assert'

using namespace std;



// This is an input class. Do not edit.
class BinaryTree {
public:
  int value;
  BinaryTree *left = nullptr;
  BinaryTree *right = nullptr;

  BinaryTree(int value) { // This is the constructor 
    this->value = value; 
  }  
};

  // Init / declare the functions we are going to be writing below our findnodesDistanceK method.
  vector<int> breadthFirstSearchForNodesDistanceK(
        BinaryTree *targetNode, 
        unordered_map<int, BinaryTree*> &nodesToParents,
        int k);
  void populateNodesToParents(
        BinaryTree *node, 
        unordered_map<int, BinaryTree*> &nodesToParents,
        BinaryTree *parent);

  BinaryTree *getNodeFromValue(
        int target,
        BinaryTree *tree,
        unordered_map<int, BinaryTree*> &nodesToParents);

// Main function
vector<int> findNodesDistanceK(BinaryTree *tree, int target, int k) {
  // Write your code here.
  
  // 1 - Find parents
  unordered_map<int, BinaryTree*> nodesToParents;
  populateNodesToParents(
        tree, // tree is a pointer to a defined as BinaryTree* tree, so we feed it regularly
        nodesToParents, // nodesToParents is an empty hashmap, we pass it as itself because the function makes it a reference, therefore just needs an object
        nullptr); // the input tree node does not have a Parent, so we put nullptr

  // 2 - Find our target Node
  BinaryTree* targetNode;
  targetNode = getNodeFromValue(
        target, // target is an input to main function
        tree, // tree is the pointer 
        nodesToParents); // once again using a reference 

  // 3 - Breadth First Search from target Node using a FIFO queue
  vector<int> vectorNodesDistanceK;
  vectorNodesDistanceK = breadthFirstSearchForNodesDistanceK(
        targetNode, // this is the targetNode that was returned from the 'getNodeFromValue()' method
        nodesToParents, // nodesToParents is the same hashmap we have been referencing 
        k); // k is an integer input to main function
    
  // 4 - Return answer  
  return vectorNodesDistanceK;
}




// Write the helper functions
void populateNodesToParents(
        BinaryTree *node, 
        unordered_map<int, BinaryTree*> &nodesToParents,
        BinaryTree *parent) {

  // check if node exists
  if (!node) {return;}

  // Add to the hashmap. Key = my value, Value = my parent
  nodesToParents[node->value] = parent;

  // recursive call on left + right, passing myself as 'parent'
  populateNodesToParents(node->left, nodesToParents, node);
  populateNodesToParents(node->right, nodesToParents, node);
  
}





BinaryTree *getNodeFromValue(
        int target,
        BinaryTree *tree,
        unordered_map<int, BinaryTree*> &nodesToParents) {
  // Remember - you can be either 2 things 
  // Your parents's left
  // Your parents's right

  // Get the target's parentNode
  BinaryTree* parentNode = nodesToParents[target];

  // Check if we are the parent's left, or right
  // Make sure to check if value exists before checking the ->value
  if ((parentNode->left != nullptr) && (parentNode->left->value == target)) {
    return parentNode->left;
  }
  else {
    return parentNode->right;
  }
  
}




vector<int> breadthFirstSearchForNodesDistanceK(
        BinaryTree *targetNode, 
        unordered_map<int, BinaryTree*> &nodesToParents,
        int k) {
  // Init a vector (this is not O(1) but we can explain this to the interviewer)
  deque<pair<BinaryTree*, int>> queue; // pair == tuple

  // Add ourselves to the q to start out
  pair<BinaryTree*, int> myself_as_pair = {targetNode, 0}; //Value[0] = node, Value[1] = distance from target
  queue.push_front(myself_as_pair);

  // Create the 'seen' hashset
  unordered_set<int> seen;
  seen.insert(targetNode->value);

  // Start the while loop
  while (queue.size() > 0) {
    // Grab the front of the queue
    auto currentNode = queue.front().first;
    auto distanceFromTarget = queue.front().second;
    queue.pop_front();

    // Check if distance k: If so, our work here is done essentially and we return this with everything in the queue
    if (distanceFromTarget == k) {
      vector<int> nodesDistanceK;
      for (auto item: queue) {
        nodesDistanceK.push_back(item.first->value);
      }
      // Don't forget to do it for ourself too!
      nodesDistanceK.push_back(currentNode->value);
      return nodesDistanceK;
    }
    else { // if we are before K away, we have work to do with the 3 surrounding nodes
      // Create the list of 3 values we can iterate through: left, right, parent
      vector<BinaryTree*> connectedNodes;
      connectedNodes.push_back(currentNode->left);
      connectedNodes.push_back(currentNode->right);
      connectedNodes.push_back(nodesToParents[currentNode->value]);
      
      for (auto node: connectedNodes) {
        if (node == nullptr) {continue;} 
        if (seen.find(node->value) != seen.end()) {continue;}
        seen.insert(node->value);//add to seen

        pair<BinaryTree*, int> new_pair;
        new_pair = {node, distanceFromTarget+1};
        queue.push_back(new_pair);
        
      }
      
    } //end else loop
    
  }//end while loop

  return {};//return empty if there are 0 nodes K values away!
  
}//end method

template<typename t>
void printAnyVector(vector<t> arr) {
    if (arr.size() > 0) {
        printf("length of answer: %d \n", arr.size());
        printf("[");
        for (auto x: arr) {
            printf("%d, ", x);
        }
        printf("]");
    }
    else{
        printf("answer had length 0....");
    }

}

int main() {

    // Create the tree

    ////// Start getting ready to actually use 'findNodesDistanceK(tree, target, k)'


    BinaryTree* n1 = new BinaryTree(1); // Init all 8 nodes
    BinaryTree* n2 = new BinaryTree(2);
    BinaryTree* n3 = new BinaryTree(3);
    BinaryTree* n4 = new BinaryTree(4);
    BinaryTree* n5 = new BinaryTree(5);
    BinaryTree* n6 = new BinaryTree(6);
    BinaryTree* n7 = new BinaryTree(7);
    BinaryTree* n8 = new BinaryTree(8);

    n1->left = n2; // Point the nodes to their correct Node Objects
    n1->right = n3;
    n2->left = n4;
    n2->right = n5;
    n3->left = nullptr;
    n3->right = n6;
    n4->left = nullptr;
    n4->right = nullptr;
    n5->left = nullptr;
    n5->right = nullptr;
    n6->left = n7;
    n6->right = n8;
    n7->left = nullptr;
    n7->right = nullptr;
    n8->left = nullptr;
    n8->right = nullptr;

    BinaryTree* tree = n1; // Set n1 as tree
    int target = 3; // Other params
    int k = 2;
    auto answer = findNodesDistanceK(tree, target, k); // Run the method
    printf("auto answer: \n");
    printAnyVector(answer);


    printf("\n\nTrying this 1 more time, with a different tree setup and tree:\n\n");
    

    BinaryTree* root = new BinaryTree(1);
    root->left = new BinaryTree(2);
    root->right = new BinaryTree(3);
    root->left->left = new BinaryTree(4);
    root->left->right = new BinaryTree(5);
    root->right->right = new BinaryTree(6);
    root->right->right->left = new BinaryTree(7);
    root->right->right->right = new BinaryTree(8);
    int target2 = 3;
    int k2 = 2;
    vector<int> expected = {2, 7, 8};
    auto actual = findNodesDistanceK(root, target2, k2);
    sort(actual.begin(), actual.end()); // need '#include <algorithm>' for sort()
    
    assert(expected == actual); // need '#include <cassert>' for assert()

    printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!");

    return 0;
}