import static org.junit.Assert.assertTrue;
import org.junit.Test;
//public

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!



//paste below



// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

//import java.util.*;

public class ProgramTest {
  @Test
  public void TestCase1() {
    Program.BinaryTree tree = new Program.BinaryTree(-1);
    tree.left = new Program.BinaryTree(2);
    tree.right = new Program.BinaryTree(-2);
    tree.right.left = new Program.BinaryTree(5);
    tree.right.right = new Program.BinaryTree(1);
    int expected = 6;//2+4
    int actual = new Program().evaluateExpressionTree(tree);
    //Utils.
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase4() {
    Program.BinaryTree tree = new Program.BinaryTree(-4);
    tree.left = new Program.BinaryTree(2);
    tree.right = new Program.BinaryTree(-2);
    tree.right.left = new Program.BinaryTree(5);
    tree.right.right = new Program.BinaryTree(1);
    int expected = 8;//2*4
    int actual = new Program().evaluateExpressionTree(tree);
    //Utils.
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase3() {
    Program.BinaryTree tree = new Program.BinaryTree(-3);
    tree.left = new Program.BinaryTree(2);
    tree.right = new Program.BinaryTree(-2);
    tree.right.left = new Program.BinaryTree(5);
    tree.right.right = new Program.BinaryTree(1);
    int expected = 0;//2/4
    int actual = new Program().evaluateExpressionTree(tree);
    //Utils.
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase2() {
    Program.BinaryTree tree = new Program.BinaryTree(-2);
    tree.left = new Program.BinaryTree(2);
    tree.right = new Program.BinaryTree(-2);
    tree.right.left = new Program.BinaryTree(5);
    tree.right.right = new Program.BinaryTree(1);
    int expected = -2;//2-4
    int actual = new Program().evaluateExpressionTree(tree);
    //Utils.
    assertTrue(expected == actual);
  }

  

  
}
