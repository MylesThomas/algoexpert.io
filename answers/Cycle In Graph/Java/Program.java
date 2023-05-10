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

import java.util.*;

class Program {

  boolean traverseAndColorNodes(int[][] edges, int node, int[] colors) {
    //grey because we have seen it now 
    colors[node]=1;
    int[] neighbors=edges[node];
    for (int neighbor: neighbors) {
      if (colors[neighbor]==0) {
        //
        boolean containsCycle = traverseAndColorNodes(edges, neighbor, colors);
        if (containsCycle) {
          return true;
        }
        
      }
      else if (colors[neighbor]==1) {
        return true;
      }
    }

    colors[node]=2;
    return false;//for end
  }//end method

  public boolean cycleInGraph(int[][] edges) {
    // Write your code here.

    //setup
    int n = edges.length;
    int[] colors = new int[n];
    Arrays.fill(colors, 0);

    //iterate
    for (int i=0; i < n; i ++) {
      if (colors[i]==0) {
        boolean containsCycle = traverseAndColorNodes(edges, i, colors);
        if (containsCycle) {
          return true;
        }
      }
      else if (colors[i]==1) {
        continue;
      }
      else if (colors[i]==2) {
        continue;
      }
      
    }
    
    //if we got here, then we don't have a circle
    return false;
  }
}
