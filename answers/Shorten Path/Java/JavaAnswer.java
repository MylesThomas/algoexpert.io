import java.util.*;//import everything
import java.util.stream.Collectors;

class JavaAnswer {
  //
  //helper
  public static boolean isImportantToken(String token) {
    return token.length() > 0 && !(token.equals("."));
  }
  //method
  public static String shortenPath(String path) {
    // Write your code here;

    // get boolean for relativePath
    boolean relativePath = path.charAt(0) == '/';

    // put path into a list of strings via split()
    String[] tokensArr = path.split("/");

    // filter for the relavant tokens ie. remove periods and anything with len == 0
    List<String> tokensList = Arrays.asList(tokensArr);
    List<String> filteredTokens = tokensList.stream().filter(token -> isImportantToken(token)).collect(Collectors.toList());

    // create a stack (add "/" if necessary)
    List<String> stack = new ArrayList<String>();
    if (relativePath) {stack.add("");}

    // begin logic that iterates through filteredTokens and deals with edge cases for ".."
    for (var x: filteredTokens) {
      if (!x.equals("..")) {
        //System.out.println(x);
        stack.add(x);
      }
      else if (x.equals("..")) {
        //edge case 1: empty stack
        if (stack.size() == 0) {
          stack.add(x);
        }
        //edge case 2: end of stack == ".."
        else if (stack.get(stack.size() - 1).equals(x)) {
          stack.add(x);
        }
        //edge case 3:
        else if (stack.get(stack.size() - 1).equals("")) {
          continue;
        }
        // all others
        else {
          stack.remove(stack.size() - 1);
        }
      }
    }//end for loop

    //create returnVal
    String ret = "/";
    if (stack.size() == 1 && stack.get(0).equals("")) {
      System.out.println("Return value: ");
      System.out.println(ret);
      return ret;
    }
    else {
      ret = String.join("/", stack);
      System.out.println("Return value: ");
      System.out.println(ret);
      return ret;
    }
  }

  // test case
  public boolean TestCase1() {
    //
    System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

    var expected = "/foo/bar/baz";
    var actual = shortenPath("/foo/../test/../test/../foo//bar/./baz");

    boolean booleanAssertion = expected.equals(actual);
    if (booleanAssertion) {
        System.out.println("Good work!\n" + actual + " == " + expected);
        return true;
    }
    else {
        System.out.println("\nSomething is wrong, they do not match...");
        //System.out.println("...\n" + actual + " == " + expected);
        return false;
    }
}
public boolean TestCase2() {
  //
  System.out.println("\nStarting test case 2:\n---------------------------------------------\n");

  var expected = "/";
  var input = "/myles/is/king/../../../../../../../../";
  var actual = shortenPath(input);

  boolean booleanAssertion = expected.equals(actual);
  if (booleanAssertion) {
      System.out.println("Good work!\n" + actual + " == " + expected);
      return true;
  }
  else {
      System.out.println("\nSomething is wrong, they do not match...");
      return false;
  }
}

//main
public static void main(String[] args) {
    JavaAnswer classInstance = new JavaAnswer(); //init the program instance
    boolean testCaseResults = classInstance.TestCase1(); //get the results from the test case
    System.out.println("boolean testCaseResults: " + testCaseResults + " \n"); //print the return value

    JavaAnswer classInstance2 = new JavaAnswer(); //init the program instance
    boolean testCaseResults2 = classInstance2.TestCase2(); //get the results from the test case
    System.out.println("boolean testCaseResults2: " + testCaseResults2 + " \n"); //print the return value

    
}


}//end program



  

    