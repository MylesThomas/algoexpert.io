#include <vector>
#include <utility>
#include <unordered_map>
#include <deque>
#include <unordered_set>
#include <cassert>
#include <algorithm> // added to help use 'sort' and 'assert'
#include<iostream>
using namespace std; // always import

void insertIntoStack(vector<int> &stack, int value); // because function is called on line 28, before definition

vector<int> sortStack(vector<int> &stack) {
    // 0. check base case
    if (stack.size() == 0) {
        return stack;
    }

    // 1. pop top
    int top = stack.back();
    stack.pop_back();

    // 2. sort
    sortStack(stack);


    // 3. insert
    insertIntoStack(stack, top);

    // 4. return
    return stack;

}

void insertIntoStack(vector<int> &stack, int value) {
    // 0. check base case
    if (stack.size() == 0) {
        stack.push_back(value);
        return;
    }

    int top = stack.back();
    stack.pop_back();
    if (value >= top) {
        // 2. if the value belongs here...
        stack.push_back(top);
        stack.push_back(value);        
    }
    else {
        // if it does not...
        insertIntoStack(stack, value);
        stack.push_back(top);
    }
}

template<typename t>
void printAnyVector(vector<t> arr) {
    if (arr.size() > 0) {
        printf("length: %d \n", arr.size());
        printf("[");
        for (auto x: arr) {
            printf("%d, ", x);
        }
        printf("] \n");
    }
    else{
        printf("answer had length 0....");
    }
}

bool TestCase1() {
    printf("\nStarting test case 1:\n---------------------------------------------\n");

    vector<int> input = {-5, 2, -2, 4, 3, 1};
    vector<int> expected = {-5, -2, 1, 2, 3, 4};
    auto actual = sortStack(input);

    printf("expected: \n");
    printAnyVector(expected);
    printf("actual: \n");
    printAnyVector(actual);

    assert(expected == actual); // need '#include <cassert>' for assert()
    printf("\nSuccess! The program did not abort, so the assert() proves our answer is correct!");
    return true;
}

int main() {
    //
    bool bools = TestCase1();
    printf("bool bools: %d \n");

}