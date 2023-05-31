
//ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh



using namespace std;
#include <iostream>
#include <vector>
int bestSeat(vector<int> seats) {
  // Write your code here.

  //setup
  int left=0;
  int bestSeat=-1;
  int maxGap=0;
  while (left < seats.size()) {
    int right=left+1;
    //keeep moving right over until we find a 1...
    while (right < seats.size() && seats[right]==0) {
      //increment
      right++;
      
    }
  
    //ok, we have arrived at a 1, time to see if we can update gap/bestSeats
    int gap = right-left-1;
    
    if (gap > maxGap) {
      maxGap=gap;
      bestSeat=(left+right)/2;
    }//end if statement
    left=right;
  }//end while loop

  return bestSeat;
  }//end method


//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
  vector<int> input = {1, 0, 1, 0, 0, 0, 1};
  auto expected = 4;
  auto actual = bestSeat(input);
  assert(expected == actual);

  vector<int> input2 = {1, 0, 1, 1};
  auto expected2 = 1;
  auto actual2 = bestSeat(input2);
  assert(expected2 == actual2);

  

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};