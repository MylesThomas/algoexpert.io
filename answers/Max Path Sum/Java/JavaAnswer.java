import java.util.*;//import everything

class JavaAnswer {

  public static ArrayList<Integer> findMaxPathSum(BinaryTree tree) {
    //base case
    if (tree == null) {
      //Integer myNegativeInf = Integer.MIN_VALUE; //MAX_VALUE
      ArrayList<Integer> baseCase = new ArrayList<Integer> (Arrays.asList(0, Integer.MIN_VALUE)); 
      return baseCase;
    }

    // 2 recursive calls
    ArrayList<Integer> left = findMaxPathSum(tree.left);
    ArrayList<Integer> right = findMaxPathSum(tree.right);

    // begin logic
    // find max path as a branch
    Integer v = tree.value;
    Integer leftMaxAsBranch = left.get(0);
    Integer rightMaxAsBranch = right.get(0);
    //Integer mathPathSumAsBranch = Math.max(v + leftMaxAsBranch, v + rightMaxAsBranch, v);
    //have to do it in multiple lines of code - can only compare 2 at a time
    Integer mathPathSumAsBranch = Math.max(v + leftMaxAsBranch, v + rightMaxAsBranch);
    mathPathSumAsBranch = Math.max(mathPathSumAsBranch, v);
    
    // find max path as a root note
    Integer maxPathSumAsRootNote = Math.max(v + leftMaxAsBranch + rightMaxAsBranch, mathPathSumAsBranch);
      
    // find max path sum
    Integer leftMax = left.get(1);
    Integer rightMax = right.get(1);
    //Integer maxPathSum = Math.max(leftMax, rightMax, maxPathSumAsRootNote);
    Integer maxPathSum = Math.max(leftMax, rightMax);
    maxPathSum = Math.max(maxPathSum, maxPathSumAsRootNote);
    
    // return
    ArrayList<Integer> ret = new ArrayList<Integer> (Arrays.asList(mathPathSumAsBranch, maxPathSum)); 
    return ret;
    
  }
  
  public static int maxPathSum(BinaryTree tree) {
    // Write your code here.

    // Run helper
    ArrayList<Integer> returns = findMaxPathSum(tree);
      
    // Return maxPathSum
    return returns.get(1);
  }

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  // test case
  public boolean TestCase1() {
    //
    System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

    //set up input/actual/expected
    BinaryTree n1 = new BinaryTree(1);
    BinaryTree n2 = new BinaryTree(2);
    BinaryTree n3 = new BinaryTree(3);
    BinaryTree n4 = new BinaryTree(4);
    BinaryTree n5 = new BinaryTree(5);
    BinaryTree n6 = new BinaryTree(6);
    BinaryTree n7 = new BinaryTree(7);
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;
    n3.right = n7;
    n4.left = null;
    n4.right = null;
    n5.left = null;
    n5.right = null;
    n6.left = null;
    n6.right = null;
    n7.left = null;
    n7.right = null;
    
    BinaryTree tree = n1;


    Integer expected = 18;
    var actual = maxPathSum(tree);

    //
    if (actual == expected) {
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
}


}//end program



  

    