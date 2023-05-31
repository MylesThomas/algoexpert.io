#include <vector>
using namespace std;

vector<int> searchForRange(vector<int> array, int target) {
  // Write your code here.
  
  // use binary search to find the target
  int left=0;
  int right=array.size()-1;
  bool found=false;

  while (left <= right) {
    int mid = (left + right)/2;
    int potentialTarget = array[mid];
    if (target==potentialTarget) {
      left=mid;
      right=mid;
      found=true;
      break;
    }
    else if (target > potentialTarget) {
      left=mid+1;
    }
    else if (target < potentialTarget) {
      right=mid-1;
    }
    
  }

  // use 2 pointers to see how far l/r we can go 
  if (found) {
    while (true) {
      if (left -1 >= 0 && array[left-1]==target) {
        left -= 1;
      }
      else {break;}
    }
    while (true) {
      if (left + 1 < array.size() && array[right + 1]==target) {
        right += 1;
      }
      else {break;}
    }
    //
    return vector<int> {left, right};
    
  }
  else {
    return vector<int> {-1, -1};
  }
}





//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()



int main() {
  //paste here
    vector<int> expected{4, 9};
    assert(searchForRange({0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73},
                            45) == expected);

    vector<int> expected2{-1, -1};
    assert(searchForRange({0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73},
                            455555) == expected2);

                             

    
    
    //
    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};