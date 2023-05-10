import java.util.*;//import everything

class Program {

    // Class methods
    public ArrayList<int[]> getAdjacentPositions(int row, int col, int[][] matrix) {
        //
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        ArrayList<int[]> list = new ArrayList<int[]> ();
    
        if (row > 0) {//up
          list.add(new int[] {row - 1, col});
        }
        if (col > 0) {//left
          list.add(new int[] {row, col - 1});
        }
        if (row + 1 < numRows) {//down
          list.add(new int[] {row + 1, col});
        }
        if (col + 1 < numCols) {//right
          list.add(new int[] {row, col + 1});
        }
    
        //error;  incompatible types: int[][] cannot be converted to ArrayList<int[]>
        //fix: I changed my method return type from 'public int[][]' to 'public ArrayList<int[]>'
        return list;    
      }

    public int minimumPassesOfMatrix(int[][] matrix) {
        // Write your code here.
        // Write your code here.

    // Find the coordinates of all positive values
    ArrayList<int[]> queue = new ArrayList<int[]> ();

    int numRows = matrix.length;
    int numCols = matrix[0].length;
    
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        if(matrix[row][col] > 0) {
          queue.add(new int[] {row, col});
        }
      }
    } //

    // Begin a while loop that does the following:
    // 1. For loop of x iterations (x==current size of queue)
    // 2. Look at the 4 neighbors of this position
    // - if any are negative, add them to the queue and turn them positive
    // Repeat this until the queue is empty
    // After the while loop, return -1 or passes - 1 (minus 1 because the last pass doesn't make any changes ie. why the queue is empty!)
    int iters;
    int passes = 0;
    while (queue.size() > 0) {
      // find number of iterations needed
      iters = queue.size();
      // begin iterating
      while (iters > 0) {

        //pop off end of queue
        //int indexOfLastElement = queue.size() - 1;
        int[] vals = queue.remove(0);
        int currentRow = vals[0];
        int currentCol = vals[1];
  
        // get neighbors, iterate over them 
        ArrayList<int[]> adjacentPositions = getAdjacentPositions(currentRow, currentCol, matrix);
        for(int[] pos: adjacentPositions) {
          int row = pos[0];
          int col = pos[1];
          // check if this position is negative
          if (matrix[row][col] < 0) {
            matrix[row][col] = matrix[row][col]*-1;
            queue.add(new int[] {row, col});
          }
        }
        iters -=1; //decrement
      }//end inner while loop
      passes += 1;
    }//end outer while loop

    // check if matrix is all positives
    int counter = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        if (matrix[row][col] < 0) {
          counter += 1;
        }
      }
    }//end loops
    if (counter > 0) {
        System.out.println("Returning a -1 because there was no way to make all values non-negative.\n");
      return -1;
    }
    else {
        System.out.println("All values are positive, returning 'passes - 1'.\n");
      return passes-1;
    }

}// end of method




        
    // Test methods
    public boolean TestCase1() {
        int[][] matrix = new int[][] {
            {0, -1, -3, 2, 0}, 
            {1, -2, -5, -1, -3}, 
            {3, 0, 0, -4, -1}
        };
        int expected = 3;
        int actual = new Program().minimumPassesOfMatrix(matrix);
        //assert (expected == actual);

        if (actual != expected) {
            System.out.println("\nSomething is wrong, actual = " + actual + "; expected = " + expected);
            return false;
        }
        else {
            System.out.println("\nGood work!!!\n" + actual + " == " + expected);
            return true;
        }
    }


    // Test methods
    public boolean TestCase2() {
        System.out.println("\nTrying again with TestCase2() [All negative values lol] \n");

        int[][] matrix = new int[][] {
            {0, -1, -3, -277, 0}, 
            {-188, -2, -5, -1, -3}, 
            {-3, 0, 0, -4, -166}
        };
        int expected = -1;
        int actual = new Program().minimumPassesOfMatrix(matrix);
        //assert (expected == actual);

        if (actual != expected) {
            System.out.println("\nSomething is wrong, actual = " + actual + "; expected = " + expected);
            return false;
        }
        else {
            System.out.println("\nGood work!!!\n" + actual + " == " + expected);
            return true;
        }
    }


    // Main
    public static void main(String[] args) {
        //
        Program myCurrentInstance = new Program(); // init an instance of this class Program 'removeIslands'
        boolean myResult = myCurrentInstance.TestCase1(); //run the method 'TestCase1()'
        System.out.println("myResult1 = " + myResult);

        boolean myResult2 = myCurrentInstance.TestCase2(); //run the method 'TestCase1()'
        System.out.println("myResult2 = " + myResult2);

        
    }

  

}//end of class Program