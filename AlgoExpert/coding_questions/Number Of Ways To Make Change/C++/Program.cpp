#include <vector>
using namespace std;

int numberOfWaysToMakeChange(int n, vector<int> denoms) {
  // Write your code here.

  //setup auxiliary data structure
  vector<int> arr(n+1, 0); //setup 'arr' to be n+1 length, each value = 0
  arr[0]=1;//base case, can only make $0 in 1 way!
  //iterate denoms
  for(auto denom: denoms) {
    //iterate from 1...n in arr
    for(auto i=1; i <= n; i++) {
      if (i < denom) {
        continue;
      }
      else {
        arr[i] += arr[i-denom];
      }
    }
  }
  return arr[n];
}







//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
    assert(numberOfWaysToMakeChange(6, {1, 5}) == 2);
    assert(numberOfWaysToMakeChange(6, {1, 5, 10, 100}) == 2);
    assert(numberOfWaysToMakeChange(0, {1, 5, 10, 100}) == 1);
    
    

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};