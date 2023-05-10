#include <vector>
using namespace std;

//write helper method
bool helperFunction(vector<vector<int>> edges, int node, vector<int>& colors) {
  //make it grey now that we have seen it
  colors[node]=1;
  //iterate through each neighbor
  vector<int> neighbors = edges[node];
  for (auto neighbor: neighbors) {
    if (colors[neighbor] == 0) {
      //
      bool containsCycle = helperFunction(edges, neighbor, colors);
      if (containsCycle) {
        return true;
      }
    }
    else if (colors[neighbor]==1) {
      //
      return true;
    }
    else {
      continue;
    }
  }
  
  
  //ok done with it make it black
  colors[node]=2;
  //return
  return false;
}

bool cycleInGraph(vector<vector<int>> edges) {
  // Write your code here.
  //0.setup auxiliary data structure and get length of edges
  int n = edges.size();
  vector<int> colors(n, 0); // size is n, each value is 0

  // begin iterating
  for (int i=0; i < colors.size() ; i++) {
    //
    if (colors[i]==0) {
      //run helper function
      bool containsCycle = helperFunction(edges, i, colors);
      if (containsCycle) {
        return true;
      }
    }
    else {
      continue;
    }
    
  }
  
  //if we got to the end, there is no circle
  return false;
}






//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()

int main() {
    vector<vector<int>> input = {{1, 3}, {2, 3, 4}, {0}, {}, {2, 5}, {}};
    auto expected = true;
    auto actual = cycleInGraph(input);
    assert(expected == actual);
    

    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};