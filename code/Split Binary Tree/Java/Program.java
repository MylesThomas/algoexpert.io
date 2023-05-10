// Step 0. Java Project Setup
// - Create a Folder for your project and open it in VSCode
// - Create a new file 'Program.java'
// - In Java Projects, Create a new Java Project with no build tools. Use the current folder as the Project Location.

// Step 1. Enable testing and adding test framework JARs to your project
// - Testing -> Enable Java Tests -> JUnit 
// --- In file explorer, there should now be a 'lib/' folder w/ 2 .jar files in your Project folder
// --- Note: One of the .jar files should start with junit-4, and the next few instructions come from the following link:
// https://code.visualstudio.com/docs/java/java-testing

// Step 2. Copy and Paste code from AlgoExpert.io into 'Program.java'

// Step 3. Copy and Paste code from Sandbox into a new file named 'ProgramTest.java'

// Step 4. Minor edits to 'ProgramTest.java' so that it can run without error:
// - Sandbox may not have this as a public class - make sure to add 'public' before 'class ProgramTest'
// - Remove 'Utils.' before the assertTrue() call, and add the following line of code at the top of the program:
// import static org.junit.Assert.assertTrue;
// - In order to make the '@Test' not throw an error, do 1 of the following:
// - Add this line of code to the top: import org.junit.Test; (recommended)
// - Change '@Test' into '@'

// Step 5. Run test(s) from 
// - There is a 'run tests' button in the Testing sidebar


//import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  //helper method 1
  public int findBinaryTreeSum(BinaryTree tree) {
    //deal w/ base case
    if (tree == null) {
      return 0;
    }
    else {
      return tree.value + findBinaryTreeSum(tree.left) + findBinaryTreeSum(tree.right);
    }
  }

  // tuples are not built in, write a class that takes 1-int, 2-boolean
  static class Tuple {
    public int num;
    public boolean bools;

    public Tuple(int num, boolean bools) {
      this.num=num;
      this.bools=bools;
    }
  }//end of class

  //helper method 2
  public Tuple checkIfTreeExists(BinaryTree tree, int target) {
    //base case
    if (tree == null) {
      return new Tuple(0, false);
    }
    else {
      //
      Tuple left = checkIfTreeExists(tree.left, target);
      Tuple right = checkIfTreeExists(tree.right, target);

      //calculate current sum
      int currentSum = left.num + right.num + tree.value;

      //see if current tree, or l/r has boolean true
      boolean hasTarget = (left.bools || right.bools || currentSum==target);

      //return a tuple
      return new Tuple (currentSum, hasTarget);
      
    }//end else
  }

  public int splitBinaryTree(BinaryTree tree) {
    // Write your code here.
    
    // 1. find the value of interest ie. total sum / 2
    int target = findBinaryTreeSum(tree);

    // 2. check if it is an odd number
    if (target % 2 != 0) {
      return 0;
    } 
    else {
      target = target / 2;
    }
    // 3. find out if any of the subtrees have the target value as sum
    Tuple rets;
    rets = checkIfTreeExists(tree, target);
    boolean canBeSplit = rets.bools;

    // 4. return
    // note: this is the same logic as the if-else on 1 line as Python!
    return canBeSplit == true ? target : 0; // '?' = then, ':' = else


    
  }//end method
}//end program
