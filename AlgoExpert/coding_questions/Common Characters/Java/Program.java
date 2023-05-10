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
  public String getSmallestString(String[] strings) {
    String smallestString = strings[0];
    for (String string: strings) {
      if (string.length() < smallestString.length()) {
        smallestString = string;
      }
    }
    return smallestString;
  }//end helper method
  
  public String[] commonCharacters(String[] strings) {
    // Write your code here.
    //return new String[] {};

    // find smallest string
    String smallestString = getSmallestString(strings);
    // turn smallestString into a hashSet
    HashSet<Character> potentialCommonCharacters = new HashSet<Character>();
    for (int i=0; i < smallestString.length(); i++) {
      potentialCommonCharacters.add(smallestString.charAt(i));
    }
    //iterate through each other string, removing values from the hashset if they don't exist in that set
    for (String string : strings) {
      HashSet<Character> currentHashSet = new HashSet<Character>();
      for (int i=0; i < string.length(); i++) {
        currentHashSet.add(string.charAt(i));
      }
      HashSet<Character> charsToRemoveFromAnswer = new HashSet<Character>();
      for (char character : potentialCommonCharacters) {
        if (!currentHashSet.contains(character)) {
          //
          //potentialCommonCharacters.remove(character);
          charsToRemoveFromAnswer.add(character);
        }
      }
      //finally, now that we know which variables to remove from 'potentialCommonCharacters', remove them
      for (char character : charsToRemoveFromAnswer) {
        potentialCommonCharacters.remove(character);
      }
      
    }//end of looping through each string
    // return, but first turn the set into a list of char
    int n = potentialCommonCharacters.size();
    String[] output = new String[n];
    int i=0;
    //for (int i=0; i<n; i++) {}
    //you cannot index on a hashset, so will use the pythonic way
    for (var ch : potentialCommonCharacters) {
      output[i] = ch.toString();
      i++;
    }
    return output;
  }//end method
  
}//end program
