#include <vector>
using namespace std;

int binarySearch(vector<int> array, int target) {
  // Write your code here.
  //set pointers
  int l = 0;
  int r = array.size() - 1;
  //start while loop
  // use <= because when l==r, that is when we are done basically
  while (l <= r) {
    int mid = (l+r)/2;
    int val = array[mid];
    if (val==target) {
      return mid;
    }
    else if (val > target) {
      r=mid-1;
    }
    else if (val < target) {
      l=mid+1;
    }
  }
  return -1;
}








//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
    assert(binarySearch({0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
    
    

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};