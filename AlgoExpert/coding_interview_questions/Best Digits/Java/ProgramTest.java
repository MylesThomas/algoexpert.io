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
    String number = "462839";
    int numDigits = 2;
    String expected = "6839";
    var actual = new Program().bestDigits(number, numDigits);
    //Utils.
    assertTrue(expected.equals(actual));
  }
  @Test
  public void TestCase2() {
    String number = "9989";
    int numDigits = 1;
    String expected = "999";
    var actual = new Program().bestDigits(number, numDigits);
    //Utils.
    assertTrue(expected.equals(actual));
  }
}
