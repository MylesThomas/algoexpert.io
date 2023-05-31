//imports 



using namespace std;



#include <stack>
#include <string>
#include <algorithm>
#include <vector>
#include<iostream>


#include <assert.h> //assert()
#include <cstdio>   //printf()





// program
#include <unordered_map>
using namespace std;

// Do not edit the class below except for the
// populateSuffixTrieFrom and contains methods.
// Feel free to add new properties and methods
// to the class.
class TrieNode {
public:
  unordered_map<char, TrieNode *> children;
};

class SuffixTrie {
public:
  TrieNode *root;
  char endSymbol;

  SuffixTrie(string str) {
    this->root = new TrieNode();
    this->endSymbol = '*';
    this->populateSuffixTrieFrom(str);
  }

  void insert(int i, string str) {
    //make the beginning node theroot
    TrieNode* currentNode = root;
    //iterate starting at i
    for (int j=i; j < str.length(); j++) {
      char letter = str[j];
      // check if letter in string (if not, starting from beginning with an empty dict)
      if (currentNode->children.find(letter) == currentNode->children.end()) { // this is basically .contains()
        TrieNode* emptyMap = new TrieNode();//create empty map and add that empty map as a key to the current dictionary
        currentNode->children[letter] = emptyMap;
        currentNode = currentNode->children[letter];//move ahead   
      }
      else {
        currentNode = currentNode->children[letter];//move ahead 
      }
    }
    //end of for-loop, add the * to the children
    //currentNode->children[this->endSymbol]=true;
    currentNode->children.insert({this->endSymbol, nullptr});
    //unordered_map<char, TrieNode *> map1 = {this->endSymbol, nullptr};
    //currentNode->children.insert(map1);
  }

  void populateSuffixTrieFrom(string str) {
    // Write your code here.
    //iterate and call insert method for each i
    for (int i=0; i < str.length(); i++) {
      insert(i, str);
    }
  }

  bool contains(string str) {
    // Write your code here.
    //make the beginning node theroot
    TrieNode* currentNode = root;
    for (int i=0; i < str.length(); i++) {
      char letter = str[i];
      if (currentNode->children.find(letter) == currentNode->children.end()) { // this is basically ! does not contain or opposite of .contains()
        return false;
      }
      else {currentNode = currentNode->children[letter];}
    }
    
    //end of for loop, check if we have a *
    if (currentNode->children.find(this->endSymbol) == currentNode->children.end()) { // 
      return false;}
    else{return true;}
  }
};












// unit testing


//#include <cassert>







int main() {
  //paste sandbox here
  string word1 = "babc";
  SuffixTrie actual(word1);
  assert(actual.contains("abc") == true);

  
  
                          
    
  //
  printf("\nCan't figure out how to do unit testing but at least this worked !\n");
};