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
// import static org.junit.Assert.assertTrue;
// 
// - In order to make the '@Test' not throw an error, do 1 of the following:
// - Add this line of code to the top: import org.junit.Test; (recommended)
// - Change '@Test' into '@'

// Step 5. Run test(s) from 'Testing'
// - There is a 'run tests' button in the Testing sidebar




import java.util.*;

class Program {
  public static List<Integer> getSmaller(List<Integer> arr) {
    List<Integer> smallerList = new ArrayList<Integer> ();
    for (int i=1; i < arr.size(); i++) {
      int x = arr.get(i);
      if (x < arr.get(0)) {
        smallerList.add(x);
      }
    }
    return smallerList;
  }
  public static List<Integer> getGreaterThanOrEqual(List<Integer> arr) {
    List<Integer> greaterThanOrEqualList = new ArrayList<Integer> ();
    for (int i=1; i < arr.size(); i++) {
      int x = arr.get(i);
      if (x >= arr.get(0)) {
        greaterThanOrEqualList.add(x);
      }
    }
    return greaterThanOrEqualList;
  }
  
  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
    // Write your code here.

    // 0. check the 3 base cases
    if (arrayOne.size() != arrayTwo.size()) {
      return false;
    }
    else if (arrayOne.size() == arrayTwo.size() && arrayTwo.size() == 0) {
      return true;
    }
    else if (arrayOne.get(0) != arrayTwo.get(0)) {
      return false;
    }
    //else....
    // 1. go through the 2 lists, and come up with 4 lists:
    // - < arr1
    // -  < arr2
    // -  >= arr1
    // -  >= arr2
    List<Integer> arrayOneSmaller = getSmaller(arrayOne);
    List<Integer> arrayTwoSmaller = getSmaller(arrayTwo);
    List<Integer> arrayOneGreaterThanOrEqual = getGreaterThanOrEqual(arrayOne);
    List<Integer> arrayTwoGreaterThanOrEqual = getGreaterThanOrEqual(arrayTwo);

    // 3. return recursive calls to see if BSTs are matching up!
    return sameBsts(arrayOneSmaller, arrayTwoSmaller) && sameBsts(arrayOneGreaterThanOrEqual, arrayTwoGreaterThanOrEqual);
    
    
  }
}
