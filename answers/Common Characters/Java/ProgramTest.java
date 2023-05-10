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

import java.util.*;

public class ProgramTest {
  @Test
  public void TestCase1() {
    String[] input = new String[] {"abc", "bcd", "cbad"};
    String[] expected = new String[] {"b", "c"};
    String[] actual = new Program().commonCharacters(input);
    Arrays.sort(actual);
    assertTrue(expected.length == actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertTrue(expected[i].equals(actual[i]));
    }
  }
}
