using namespace std;

// This is an input struct. Do not edit.
class LinkedList {
public:
  int value;
  LinkedList *next = nullptr;

  LinkedList(int value) { this->value = value; }
};

LinkedList *middleNode(LinkedList *linkedList) {
  // Write your code here.
  //init fast/slow pointers
  LinkedList* slow = linkedList;
  LinkedList* fast = linkedList;

  //iterate until fast doesn't have a next
  while (fast != nullptr && fast->next != nullptr) {
    slow=slow->next;
    fast=fast->next->next;
  }
  //return slow
  return slow;
  
}









//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
    LinkedList *linkedList = new LinkedList(0);
    linkedList->next = new LinkedList(1);
    LinkedList *expected = new LinkedList(2);
    linkedList->next->next = expected;
    expected->next = new LinkedList(3);
    auto actual = middleNode(linkedList);
    assert(expected == actual);
    
    

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};