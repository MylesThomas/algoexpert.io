// Step 0. Java Project Setup
// - Create a Folder for your project and open it in VSCode

// Step 1. Create a new file named 'Program.java'

// Step 2. Enable testing and adding test framework JARs to your project
// - Testing -> Enable Java Tests -> JUnit 
// --- In file explorer, there should now be a 'lib/' folder w/ 2 .jar files in your Project folder
// --- Note: One of the .jar files should start with junit-4, and the next few instructions come from the following link:
// https://code.visualstudio.com/docs/java/java-testing

// Step 2. Copy and Paste code from AlgoExpert.io into 'Program.java'

// Step 3. Copy and Paste code from Sandbox into a new file named 'ProgramTest.java'

// Step 4. Minor edits to 'ProgramTest.java' so that it can run without error:
// - Sandbox may not have this as a public class - make sure to add 'public' before 'class ProgramTest'
// - Remove 'Utils.' before the assertTrue() call, and add the following line of code at the top of the program:
// - import static org.junit.Assert.assertTrue;
// 
// - In order to make the '@Test' not throw an error, do 1 of the following:
// - Add this line of code to the top: import org.junit.Test; (recommended)
// - Change '@Test' into '@'

// Step 5. Run test(s) from 'Testing'
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

  public int evaluateExpressionTree(BinaryTree tree) {
    // check base case
    if (tree.value >= 0) {return tree.value;}
    // check operands
    if (tree.value == -1) {return evaluateExpressionTree(tree.left) + evaluateExpressionTree(tree.right);}
    if (tree.value == -2) {return evaluateExpressionTree(tree.left) - evaluateExpressionTree(tree.right);}
    if (tree.value == -3) {
      int ret=evaluateExpressionTree(tree.left) / evaluateExpressionTree(tree.right);
      return ret;
    }
    if (tree.value == -4) {return evaluateExpressionTree(tree.left) * evaluateExpressionTree(tree.right);}

    //token return statement
    return tree.value;
  }
}
