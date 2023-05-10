import static org.junit.Assert.assertTrue;
import org.junit.Test;
//public

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;


//public
public class ProgramTest {
  @Test
  public void TestCase1() {
    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));
    assertTrue(Program.sameBsts(arrayOne, arrayTwo) == true);
  }

  @Test
  public void TestCase2() {
    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, -1, 100, 45, 12, 8, -1, 8, 2, -34));
    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100));
    assertTrue(Program.sameBsts(arrayOne, arrayTwo) == true);
  }

  @Test
  public void TestCase3() {
    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,8,8,7,7,6,6));
    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,8,8,7,7,6,6));
    assertTrue(Program.sameBsts(arrayOne, arrayTwo) == true);
  }

  @Test
  public void TestCase4() {
    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,8,8));
    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,8,8,7,7,6,6));
    assertTrue(Program.sameBsts(arrayOne, arrayTwo) == false);
  }

  
  
}
