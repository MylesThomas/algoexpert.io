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




//import java.util.*;

public class Program {

  public int bestSeat(int[] seats) {
    // Write your code here.
    
    //setup
    Integer maxGap=0;
    Integer bestSeat=-1;
    Integer left=0;

    //begin first while loop
    while (left < seats.length) {
      Integer right=left+1;
      //2nd while loop to skip the observations where seats[i] == 0
      //use while loop becuase right=left+1 logic cannot be repeated
      while( (right < seats.length) && (seats[right]==0) ){
        right ++;
      }
      // we are now at a 1
      Integer gap = right-left-1;
      
      if (gap > maxGap) {
        maxGap=gap;
        bestSeat=(right+left)/2;
      }
      left=right;
    }//end while loop
    return bestSeat;
    
  }//end method
}//end Program

