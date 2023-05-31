// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import static org.junit.Assert.assertTrue;

//import java.util.*;

import org.junit.Test;

public class ProgramTest {
  @Test
  //@org.junit.Test
  public void TestCase1() {
    Program.BinaryTree tree = new Program.BinaryTree(2);
    tree.left = new Program.BinaryTree(4);
    tree.left.left = new Program.BinaryTree(4);
    tree.left.right = new Program.BinaryTree(6);
    tree.right = new Program.BinaryTree(10);
    tree.right.left = new Program.BinaryTree(3);
    tree.right.right = new Program.BinaryTree(3);
    int expected = 16;
    int actual = new Program().splitBinaryTree(tree);
    assertTrue(expected == actual);
  }
}
