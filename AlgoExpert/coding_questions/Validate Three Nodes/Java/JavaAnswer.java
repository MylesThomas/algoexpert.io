import java.util.*;//import everything
//import java.util.stream.Collectors;

import java.util.*;

class JavaAnswer {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  public boolean searchForDescendant(BST startingNode, BST targetNode) {
    BST currentNode = startingNode;
    while (currentNode != null) {

      if (currentNode.value == targetNode.value) {
        return true;
      }
      //logic for going left or right
      else if (targetNode.value < currentNode.value) {
        currentNode = currentNode.left;
      }
      else if (targetNode.value >= currentNode.value) {
        currentNode = currentNode.right;
      }
    }//end while loop
    return false;
  }//end method

  public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
    // Write your code here.
    boolean bool1;
    boolean bool2;
    
    // 1. check for 1 -> 2 -> 3
    bool1 = searchForDescendant(nodeOne, nodeTwo) && searchForDescendant(nodeTwo, nodeThree);
    // 2. check for 3 -> 2 -> 1
    bool2 = searchForDescendant(nodeThree, nodeTwo) && searchForDescendant(nodeTwo, nodeOne);
    
    //return
    return bool1 || bool2;
  }

  // test case
  public boolean TestCase1() {
    //
    System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

    var root = new BST(5);
    root.left = new BST(2);
    root.right = new BST(7);
    root.left.left = new BST(1);
    root.left.right = new BST(4);
    root.right.left = new BST(6);
    root.right.right = new BST(8);
    root.left.left.left = new BST(0);
    root.left.right.left = new BST(3);

    var nodeOne = root;
    var nodeTwo = root.left;
    var nodeThree = root.left.right.left;
    boolean expected = true;
    boolean actual = validateThreeNodes(nodeOne, nodeTwo, nodeThree);
    
    //boolean booleanAssertion = arraysEqual(actual, expected);
    boolean booleanAssertion = expected==actual;
    if (booleanAssertion) {
      System.out.println("Good work!\n");
      System.out.println(actual);
      System.out.println("==");
      System.out.println(expected);
      
      //System.out.println(Arrays.toString(expected)); // turns int[] into a print-able array
      
        
        return true;
    }
    else {
        System.out.println("\nSomething is wrong, they do not match...");
        //System.out.println("...\n" + actual + " == " + expected);
        return false;
    }
}

//main
public static void main(String[] args) {
    JavaAnswer classInstance = new JavaAnswer(); //init the program instance
    boolean testCaseResults = classInstance.TestCase1(); //get the results from the test case
    System.out.println("boolean testCaseResults: " + testCaseResults + " \n"); //print the return value
}

}






  

    