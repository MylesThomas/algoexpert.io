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




// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

public class ProgramTest {
  @Test
  public void TestCase1() {
    Program.LinkedList linkedList = new Program.LinkedList(0);
    linkedList.next = new Program.LinkedList(1);
    Program.LinkedList expected = new Program.LinkedList(2);
    linkedList.next.next = expected;
    expected.next = new Program.LinkedList(3);
    var actual = new Program().middleNode(linkedList);
    assertTrue(expected.equals(actual));
  }


}
