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
    var trie = new Program.SuffixTrie("babc");
    //Utils.
    assertTrue(trie.contains("abc"));
  }
}
