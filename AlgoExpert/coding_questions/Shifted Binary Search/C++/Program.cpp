#include <vector>
using namespace std;

int shiftedBinarySearch(vector<int> array, int target) {
  // Write your code here.

  int left=0;
  int right=array.size() - 1;
  while (left <= right) {
    int mid = (left+right) / 2;
    int potentialMatch = array[mid];
    int leftNum = array[left];
    int rightNum = array[right];

    //begin logic
    if (target == potentialMatch) {
      return mid;
    }

    else if (leftNum <= potentialMatch) {
      // see if target is between leftNum and mid-point
      if (leftNum <= target && target < potentialMatch) {right = mid - 1;}
      else {left = mid + 1;}
    }

    else if (leftNum > potentialMatch) {
      // see if target is between rightNum and mid-point
      if (potentialMatch < target && target <= rightNum) {left = mid + 1;}
      else {right = mid - 1;}
    }
    
  }
  
  //while loop has ended - return
  return -1;
}









//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
    assert(shiftedBinarySearch({45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 33) ==
             8);

    assert(shiftedBinarySearch({45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 33111) ==
             -1);

    assert(shiftedBinarySearch({45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 45) ==
             0);

    
    
    

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};