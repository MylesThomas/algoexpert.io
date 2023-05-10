#include <vector>
#include <cassert> // needed for assert()
#include <cstdio> // needed for printf()
using namespace std;

vector<vector<int>> getNeighbors(int row, int col, vector<vector<int>> matrix) {
  int numRows = matrix.size();
  int numCols = matrix[0].size();

  vector<vector<int>> neighbors;
  if (row - 1 >= 0) {neighbors.push_back(vector<int>{row-1, col});} //up
  if (row + 1 < numRows) {neighbors.push_back(vector<int>{row+1, col});} //down
  if (col - 1 >= 0) {neighbors.push_back(vector<int>{row, col-1});} //left
  if (row + 1 < numCols) {neighbors.push_back(vector<int>{row, col+1});} //right

  //don't forget to return lol
  return neighbors;
}

void turn1to2(int row, int col, vector<vector<int>> &matrix) {// This function EDITS matrix, make sure input takes a reference ie. '&matrix'
  vector<vector<int>> stack;
  stack.push_back(vector<int>{row, col});

  while (stack.size() > 0) {
    auto currentPosition = stack[stack.size() - 1];
    stack.pop_back();
    int currentRow = currentPosition[0];
    int currentCol = currentPosition[1];

    matrix[currentRow][currentCol] = 2;
    
    auto neighbors = getNeighbors(currentRow, currentCol, matrix);
    for (auto neighbor: neighbors) {
      int row = neighbor[0];
      int col = neighbor[1];
      if (matrix[row][col] == 1) {stack.push_back(neighbor);}
    }
    
  }
 
}

vector<vector<int>> removeIslands(vector<vector<int>> matrix) {
  // Write your code here.

  // 1. Iterate through each position that is on the border, looking for connected positions 
  int numRows = matrix.size();
  int numCols = matrix[0].size();
  for (int row = 0; row < numRows; row++) {
    for (int col = 0; col < numCols; col++) {
      if (row==0 || col==0 || row==numRows-1 || col==numCols-1) {
        if (matrix[row][col] == 1) {
          // 2. Turn 1's on the border, and anything touching them, into 2's
          turn1to2(row, col, matrix);
        }
      }
    }
  }

  // 3. Turn 2's (connected to 1's on the border) into 1's, turn 1's (islands that need to be removed) into 0's
  for (int row = 0; row < numRows; row++) {
    for (int col = 0; col < numCols; col++) {
      if (matrix[row][col] == 1) {matrix[row][col] = 0;}
      if (matrix[row][col] == 2) {matrix[row][col] = 1;}
    }
  }
  return matrix;
}


int main() {
    vector<vector<int>> input = {
        {1, 0, 0, 0, 0, 0}, 
        {0, 1, 0, 1, 1, 1}, 
        {0, 0, 1, 0, 1, 0},
        {1, 1, 0, 0, 1, 0}, 
        {1, 0, 1, 1, 0, 0}, 
        {1, 0, 0, 0, 0, 1},
    };
    vector<vector<int>> expected = {
        {1, 0, 0, 0, 0, 0}, 
        {0, 0, 0, 1, 1, 1}, 
        {0, 0, 0, 0, 1, 0},
        {1, 1, 0, 0, 1, 0}, 
        {1, 0, 0, 0, 0, 0}, 
        {1, 0, 0, 0, 0, 1},
    };

    auto actual = removeIslands(input);
    assert(expected == actual);
    printf("\n\nAssertion passed, good work!\n\n");

    return 0;
}


