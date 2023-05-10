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

class LinkedList {
public:
  int value;
  LinkedList *next;

  LinkedList(int value) {
    this->value = value;
    this->next = nullptr;
  }
};

LinkedList *reverseLinkedList(LinkedList *head) {
  // Write your code here.

  // create pointers
  LinkedList* p1 = nullptr;
  LinkedList* p2 = head;
  LinkedList* p3 = head->next;
  
  // begin while loop
  while (true) {
  p2->next=p1;
  if (p3==nullptr) {
    return p2;
  }
  else {
    p1=p2;
    p2=p3;
    p3=p3->next;
  }
    }//end while loop
}



//helper functions from algo expert (for test cases)
LinkedList *newLinkedList(vector<int> values) {
  LinkedList *ll = new LinkedList(values[0]);
  LinkedList *current = ll;
  for (int i = 1; i < values.size(); i++) {
    current->next = new LinkedList(values[i]);
    current = current->next;
  }
  return ll;
}

vector<int> toArray(LinkedList *ll) {
  vector<int> arr = {};
  LinkedList *current = ll;
  while (current != nullptr) {
    arr.push_back(current->value);
    current = current->next;
  }
  return arr;
}

bool arraysEqual(vector<int> arr1, vector<int> arr2) {
  if (arr1.size() != arr2.size())
    return false;
  for (int i = 0; i < arr1.size(); i++) {
    if (arr1[i] != arr2[i])
      return false;
  }
  return true;
}
// end helper functions from algoexpert.io

//my c++ function to print vectors cleanly
template<typename t>
void printAnyVector(vector<t> arr) {
    if (arr.size() > 0) {
        printf("length: %d \n", arr.size());
        printf("[");
        for (auto x: arr) {
            printf("%d, ", x);
        }
        printf("] \n");
    }
    else{
        printf("answer had length 0....");
    }
}

//test cases
bool TestCase1() {
  printf("Starting test case 1:\n--------------------------------------------\n");
  vector<int> input = {0, 1, 2, 3, 4, 5};
  printf("input:\n");
  printAnyVector(input);

  LinkedList *test = newLinkedList(input);
  vector<int> actual = toArray(reverseLinkedList(test));
  vector<int> expected = {5, 4, 3, 2, 1, 0};

  bool bools = arraysEqual(actual, expected);

  printf("expected:\n");
  printAnyVector(expected);
  printf("actual:\n");
  printAnyVector(actual);
  
  assert(bools);
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}

bool TestCase2() {
  printf("Starting test case 2:\n--------------------------------------------\n");
  vector<int> input = {0, 1, 2, 3, 4, 5, 66, 777, 8888, 999999};
  printf("input:\n");
  printAnyVector(input);

  LinkedList *test = newLinkedList(input);
  vector<int> actual = toArray(reverseLinkedList(test));
  vector<int> expected = {999999, 8888, 777, 66, 5, 4, 3, 2, 1, 0};

  bool bools = arraysEqual(actual, expected);

  printf("expected:\n");
  printAnyVector(expected);
  printf("actual:\n");
  printAnyVector(actual);

  assert(bools);
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}



//main
int main() {
    bool bools = TestCase1();
    printf("bools: %d \n", bools);
    bool bools2 = TestCase2();
    printf("bools2: %d \n", bools2);
}
    