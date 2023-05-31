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

public class ProgramTest {
  @Test
  public void TestCase1() {
    assertTrue(
        Program.shiftedBinarySearch(new int[] {45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 33) == 8);
  }

  @Test
  public void TestCase2() {
    assertTrue(
        Program.shiftedBinarySearch(new int[] {45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 33282828) == -1);
  }

  @Test
  public void TestCase3() {
    assertTrue(
        Program.shiftedBinarySearch(new int[] {45, 61, 71, 72, 73, 0, 1, 21, 33, 37}, 45) == 0);
  }

  
}
