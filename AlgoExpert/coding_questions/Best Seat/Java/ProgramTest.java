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

public class ProgramTest {
  @Test
  public void TestCase1() {
    var input = new int[] {1, 0, 1, 0, 0, 0, 1};
    var expected = 4;
    var actual = new Program().bestSeat(input);
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase2() {
    var input = new int[] {1, 0, 1,1};
    var expected = 1;
    var actual = new Program().bestSeat(input);
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase3() {
    var input = new int[] {1, 0, 1, 0, 0, 0, 0, 0, 1};
    var expected = 5;
    var actual = new Program().bestSeat(input);
    assertTrue(expected == actual);
  }

  @Test
  public void TestCase4() {
    var input = new int[] {1, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, 1};
    var expected = 8;
    var actual = new Program().bestSeat(input);
    assertTrue(expected == actual);
  }

  

  
}
