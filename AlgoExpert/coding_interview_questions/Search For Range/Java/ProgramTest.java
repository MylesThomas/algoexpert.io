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
    int[] expected = {4, 9};
    int[] output = Program.searchForRange(new int[] {0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73}, 45);
    assertTrue(compare(output, expected));
  }


  @Test
  public void TestCase2() {
    int[] expected = {0,4};
    int[] output = Program.searchForRange(new int[] {0, 0, 0, 0, 0}, 0);
    assertTrue(compare(output, expected));
  }


  @Test
  public void TestCase3() {
    int[] expected = {-1, -1};
    int[] output = Program.searchForRange(new int[] {0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73}, 4555555);
    assertTrue(compare(output, expected));
  }


  

  public boolean compare(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }
}
