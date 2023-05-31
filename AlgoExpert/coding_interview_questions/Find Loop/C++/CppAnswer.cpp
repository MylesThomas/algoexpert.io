#include <sstream> // this is needed for making the filteredTokens with istringstream

#include <vector>
#include <utility>
#include <unordered_map>
#include <deque>
#include <unordered_set>
#include <cassert>
#include <algorithm> // added to help use 'sort' and 'assert'
#include <iostream>
#include <climits> // for INT_MIN
using namespace std; // always import

#include <vector>
using namespace std;

class LinkedList {
public:
  int value;
  LinkedList *next;

  LinkedList(int value) { //MAKE SURE TO ADD THIS CONSTRUCTOR OR THE POINTERS WON'T WORK DOWN BELOW !!!
    this->value = value;
    this->next = nullptr;
  }
};

LinkedList *findLoop(LinkedList *head) {
  // set pointers
  LinkedList* p1 = head->next;
  LinkedList* p2 = head->next->next;

  //first while loop
  while (p1 != p2) {
    p1 = p1->next;
    p2 = p2->next->next;
  }

  //set pointOfIntersaction
  LinkedList* pointOfIntersaction = p1;

  //second while loop
  p1 = head;
  p2 = pointOfIntersaction;
  while (p1 != p2) {
    p1 = p1->next;
    p2 = p2->next;
  }

  // return either p1 or p2
  return p1;
}


//test cases
bool TestCase1() {
  printf("Starting test case 1:\n--------------------------------------------\n");

  //init first LinkedList (not a pointer)
  //LinkedList firstValue = LinkedList(0);

  //init pointer
  LinkedList* head;
  
  // point pointer at a new linked list
  head = new LinkedList(0);

  //continue creating linked List
  head->next = new LinkedList(1);
  head->next->next = new LinkedList(2);
  head->next->next->next = new LinkedList(3);
  head->next->next->next->next = new LinkedList(4);
  head->next->next->next->next->next = new LinkedList(5);
  head->next->next->next->next->next->next = new LinkedList(6);
  head->next->next->next->next->next->next->next = new LinkedList(7);
  head->next->next->next->next->next->next->next->next = new LinkedList(8);
  head->next->next->next->next->next->next->next->next->next = new LinkedList(9);
  //circle
  head->next->next->next->next->next->next->next->next->next->next = head->next->next->next->next;

  //get expected
  int n = 5;
  int counter = 1;
  LinkedList* current = head;
  while (counter < n) {
      current = current->next;
      counter ++;
    }
    
  LinkedList* expected = current;

  // get actual output
  LinkedList* actual = findLoop(head);

  bool bools = (actual == expected);

  printf("expected:\n");
  cout << expected->value << endl;

  printf("actual:\n");
  cout << actual->value << endl;
  
  assert(bools);
  printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!\n");
  return true;
}

//main
int main() {
    bool bools = TestCase1();
    printf("bools: %d \n", bools);
}
    