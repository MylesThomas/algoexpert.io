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



class Program {
  public static int[] searchForRange(int[] array, int target) {
    // Write your code here.

    //find middle with binary search
    int left=0;
    int right=array.length-1;
    boolean found=false;
    while (left <= right) {
      int mid = (left+right)/2;
      int potentialTarget = array[mid];
      if (target == potentialTarget) {
        left=mid;
        right=mid;
        found=true;
        break;
      }
      else if (target > potentialTarget) {
        left=mid+1;
      }
      else if (target < potentialTarget) {
        right=mid-1;
      }
      
    }

    //go as far left/right as possible from the midpoint 
    if (!found) {
      return new int[] {-1, -1};
    }

    //else...
    //2 while true loops
    while (true) {
      if (left - 1 >= 0 && array[left-1]==target) {
        left-=1;
      }
      else {break;}
    }
    while (true) {
      if (right + 1 < array.length && array[right+1]==target) {
        right+=1;
      }
      else {break;}
    }
    //return 
    return new int[] {left, right};
    
  }//end method
}//end program
