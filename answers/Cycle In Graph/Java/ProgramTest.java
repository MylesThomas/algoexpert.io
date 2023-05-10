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
// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

//import java.util.*;
// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

public class ProgramTest {
  @Test
  public void TestCase1() {
    int[][] input =
        new int[][] {
          {1, 3},
          {2, 3, 4},
          {0},
          {},
          {2, 5},
          {}
        };
    boolean expected = true;
    var actual = new Program().cycleInGraph(input);
    assertTrue(expected == actual);
  }
  @Test
  public void TestCase2() {
    int[][] input =
        new int[][] {
          {},
          {}
        };
    boolean expected = false;
    var actual = new Program().cycleInGraph(input);
    assertTrue(expected == actual);
  }
  @Test
  public void TestCase3() {
    int[][] input =
        new int[][] {
          {0},
        };
    boolean expected = true;
    var actual = new Program().cycleInGraph(input);
    assertTrue(expected == actual);
  }
  
}
