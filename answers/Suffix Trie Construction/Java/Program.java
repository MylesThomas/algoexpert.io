// Step 0. Java Project Setup
// - Create a Folder for your project and open it in VSCode

// Step 1. Create a new file named 'Program.java'

// Step 2. Enable testing and adding test framework JARs to your project
// - Testing -> Enable Java Tests -> JUnit 
// --- In file explorer, there should now be a 'lib/' folder w/ 2 .jar files in your Project folder
// --- Note: One of the .jar files should start with junit-4, and the next few instructions come from the following link:
// https://code.visualstudio.com/docs/java/java-testing

// Step 2. Copy and Paste code from AlgoExpert.io into 'Program.java'

// Step 3. Copy and Paste code from Sandbox into a new file named 'ProgramTest.java'

// Step 4. Minor edits to 'ProgramTest.java' so that it can run without error:
// - Sandbox may not have this as a public class - make sure to add 'public' before 'class ProgramTest'
// - Remove 'Utils.' before the assertTrue() call, and add the following line of code at the top of the program:
// - import static org.junit.Assert.assertTrue;
// 
// - In order to make the '@Test' not throw an error, do 1 of the following:
// - Add this line of code to the top: import org.junit.Test; (recommended)
// - Change '@Test' into '@'

// Step 5. Run test(s) from 'Testing'
// - There is a 'run tests' button in the Testing sidebar


//// NOTE: This happened because I tried downloading a different Java because of that Udemy Spark class I am taking
// - if you are dealing with a project error ie. Build failed and 'var cannot be resolved to a type'
// - View -> Command Pallette -> Configure Java Runtime
// - Command prompt : for %i in (java.exe) do @echo.   %~$PATH:i
// - 






import java.util.*;

class Program {
  // Do not edit the class below except for the
  // populateSuffixTrieFrom and contains methods.
  // Feel free to add new properties and methods
  // to the class.
  static class TrieNode {
    Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  }

  static class SuffixTrie {
    TrieNode root = new TrieNode();
    char endSymbol = '*';

    public SuffixTrie(String str) { //constructor
      populateSuffixTrieFrom(str);
    }

    public void insert(Integer i, String str) {
      //start iteraing from i
      TrieNode node = root;
      for (int j=i; j < str.length(); j++) {
        //check if letter is int the node
        char letter = str.charAt(j);
        
        if (node.children.containsKey(letter)) {
          //node = node[letter];
          node = node.children.get(letter);
        }
        else if (!node.children.containsKey(letter)) {
          TrieNode newNode = new TrieNode();
          node.children.put(letter, newNode);
          node = node.children.get(letter);
        }
        
      }
      // for loop is over, insert an end symbol
      node = node.children.put(endSymbol, null);
      
    }

    public void populateSuffixTrieFrom(String str) {
      // Write your code here.
      for (int i=0; i < str.length(); i++) {
        insert(i, str);
      }
    }

    public boolean contains(String str) {
      // Write your code here.
      TrieNode node = root;
      //iterate each letter in the string
      for (int i=0; i < str.length(); i++) {
        //check if it is in the node
        char letter = str.charAt(i);
        if (node.children.containsKey(letter)) {
          //node = node[letter];
          node = node.children.get(letter);//move along down the path
        }
        else if (!node.children.containsKey(letter)) {
          return false;
        }
        
      }

      // end of for-loop: see if we are at the endSymbol
      Boolean bools = node.children.containsKey(endSymbol);
      return bools;
    }
  }
}
