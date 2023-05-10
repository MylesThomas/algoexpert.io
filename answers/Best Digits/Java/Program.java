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
  public String bestDigits(String number, int numDigits) {
    // Write your code here.
    
    //1, make a stack with the 1st value 
    Stack<Character> stack = new Stack<Character>();
    stack.push(number.charAt(0));
    
    //2. iterate through the rest of the number,
    for (int i=1; i < number.length(); i++) {
      char character = number.charAt(i);
      while (stack.size()>0 && numDigits >0 && character > stack.peek()) {
        stack.pop();
        numDigits --;
      }
      //make sure to add the current value to the stack at the end of the while loop....
      stack.push(character);
    }
    // check if we have any more numDigits to remove 
    while (numDigits > 0) {
      numDigits --;
      stack.pop();
    }

    // build the stack into a string that can be returned
    StringBuilder bestDigitString = new StringBuilder();
    while (!stack.isEmpty()) {
      bestDigitString.append(stack.pop());
    }
    bestDigitString.reverse();
    return bestDigitString.toString();
  }//end method
}// end java program

