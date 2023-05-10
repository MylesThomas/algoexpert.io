#include <vector>
#include <utility>
#include <unordered_map>
#include <deque>
#include <unordered_set>
#include <cassert>
#include <algorithm> // added to help use 'sort' and 'assert'
#include<iostream>
using namespace std; // always import

vector<vector<int>> getNeighbors(int row, int col, vector<vector<int>> matrix) {
  //init
  vector<vector<int>> neighbors;
  int numRows = matrix.size();
  int numCols = matrix[0].size();
  //up
  if (row > 0) {
    neighbors.push_back({row-1, col}); //vector<int>
  }
  //left
  if (col > 0) {
    neighbors.push_back({row, col-1}); //vector<int>
  }
  
  //down
  if (row + 1 < numRows) {
    neighbors.push_back({row+1, col}); //vector<int>
  }
  //right
  if (col + 1 < numCols) {
    neighbors.push_back({row, col+1}); //vector<int>
  }
  
  return neighbors;
}

int minimumPassesOfMatrix(vector<vector<int>> matrix) {
  // Write your code here.
  int numRows = matrix.size();
  int numCols = matrix[0].size();

  // init vector for positive values 
  vector<vector<int>> queue;

  //find coordinates of positive values
  for (int row = 0; row < numRows; row ++) {
    for (int col = 0; col < numCols; col ++) {
      if (matrix[row][col] > 0) {
        //
        queue.push_back(vector<int> {row, col});
      }
    }
  }

  // 
  int passes = 0;
  int iters;
  // iterating back and forward until 1-we finish the job 2-we figure out it is impossible 
  while (queue.size() > 0) {
    iters = queue.size();
    // while loop so that we only iterate on the values that started out in the queue
    while (iters > 0) {
      auto currentPosition = queue.front();
      queue.erase(queue.begin());//equivalent to pop() in python
      int currentRow = currentPosition[0];
      int currentCol = currentPosition[1];

      //get the 4 possible neighbors
      vector<vector<int>>neighbors;
      neighbors = getNeighbors(currentRow, currentCol, matrix);

      // iterate over neighbors
      if (neighbors.size() > 0) {
        for (auto x: neighbors) {
          int row = x[0];
          int col = x[1];
          if (matrix[row][col] < 0) {
            matrix[row][col] = matrix[row][col]*-1;
            queue.push_back({row, col});
          }
        }
      }
      //
      iters -=1;
      
    }//end of iters loop
    passes += 1;
  }//end of queue


  //return
  int counter = 0;
  for (int row = 0; row < numRows; row ++) {
      for (int col = 0; col < numCols; col ++) {
        if (matrix[row][col] < 0) {
          counter += 1;
        }
      }
      
    }
  
  
  if (counter == 0) {
    cout << "passes: " << passes - 1 << endl;
    return passes-1;
  }

  // if we get here, we cannot make everthing positive
  cout << "we failed to complete the mission. \nreturn -1." << endl;
  return -1;
}




template<typename t>
void printAnyVector(vector<t> arr) {
    if (arr.size() > 0) {
        printf("[");
        for (auto x: arr) {
            printf("%d, ", x);
        }
        printf("] \n");
    }
    else{
        printf("length 0....");
    }
}

bool TestCase1() {
    printf("\nStarting test case 1:\n---------------------------------------------\n");

    vector<vector<int>> input = {
            {0, -1, -3, 2, 0}, {1, -2, -5, -1, -3}, {3, 0, 0, -4, -1}};
        ;
    auto expected = 3;
    auto actual = minimumPassesOfMatrix(input);

    printf("input: \n");
    for(auto x : input) {
        printAnyVector(x);
    }
    cout << "\n";

    printf("expected: %d \n", expected);
    printf("actual: %d \n", actual);


    assert(expected == actual); // need '#include <cassert>' for assert()
    printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!");
    return true;
}

int main() {
    //
    bool bools = TestCase1();
    printf("bool bools: %d \n");

}