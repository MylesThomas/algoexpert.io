#include <unordered_set>
#include <vector>

using namespace std;

string getSmallestString(vector<string> strings) {
  string smallestString = strings[0];
  for (int i=1; i < strings.size(); i++) {
    if (strings[i].size() < smallestString.size()) {
      smallestString = strings[i];
    }
  }
  return smallestString;
}

vector<string> commonCharacters(vector<string> strings) {
  // use method to get smallestString
  auto smallestString = getSmallestString(strings);

  // turn smallestString into an unordered_set of possibleCommonChars
  unordered_set<char> possibleCommonChars;
  //for (auto character : smallestString) {
  for (int i=0; i < smallestString.length(); i++) {
    possibleCommonChars.insert(smallestString[i]);
  }

  //make a set of characters seen in smallestString/possibleCommonChars and NOT seen in other strings
  unordered_set<char> removeChars;
  for (auto string: strings) {
    //iterate through each letter putting it into a set
    unordered_set<char> currentSet;
    for (auto x: string) {
      currentSet.insert(x);
    }
    //iterate through possibleCommonChars and add values to 'removeChars' if they are not in currentSet
    for (auto ch : possibleCommonChars) {
      if (!currentSet.count(ch)) {removeChars.insert(ch);}
    }

  //use removeChars to update possibleCommonChars
  for (auto x : removeChars) {
    possibleCommonChars.erase(x);
  }
  
}
  //return what is left of 'possibleCommonChars', but in list form 
  vector<string> output;
  for (auto c: possibleCommonChars) {
    output.push_back(string(1, c));
  }
  return output;
}//end method





#include <algorithm>



//#include <cassert>
#include <assert.h> //assert()
#include <cstdio>   //printf()



int main() {
  //paste here
  vector<string> input = {"abc", "bcd", "cbad"};
    vector<string> expected = {"b", "c"};
    auto actual = commonCharacters(input);
    sort(expected.begin(), expected.end());
    sort(actual.begin(), actual.end());
    assert(expected == actual);

                             

    
    
    //
    printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};