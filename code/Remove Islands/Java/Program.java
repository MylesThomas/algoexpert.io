import java.util.*;

class Program {
    public int[][] getNeighbors(int row, int col, int[][] matrix) {
            //init empty int[][]
            int numRows = matrix.length;
            int numCols = matrix[0].length;
            //int[][] temp = new int[][];
            //use this logic when you don't know the eventual sizes
            ArrayList<int[]> temp = new ArrayList<int[]>();
            
            if (row > 0) {//up
                temp.add(new int[] {row - 1, col});
            }
            if (row + 1 < numRows) {//down
                temp.add(new int[] {row + 1, col});
            }
            if (col > 0 ) {//left
                temp.add(new int[] {row, col - 1});
            }
            if (col + 1 < numCols ) {//right
                temp.add(new int[] {row, col + 1});
            }

            // this is some weird stuff so I can return it as int[][]
            int[][] neighbors = new int[temp.size()][2];
            for (int i = 0; i < temp.size(); i++) {
                neighbors[i] = temp.get(i);
            }

            return neighbors;
        }//end getNeighbors()
    

    public void changesOnesToTwos(int row, int col, int[][] matrix) {
        Stack <int[]> stack = new Stack <int[]> ();
        int[] firstValue = new int[]{row, col}; 
        stack.push(firstValue);
    
        while (stack.size() > 0) {
            //
            int[] currentPosition = stack.pop();
            int currentRow = currentPosition[0];
            int currentCol = currentPosition[1];
    
            // change val
            matrix[currentRow][currentCol] = 2;
    
            //get up to 4 neighbors
            int[][] neighbors = getNeighbors(currentRow, currentCol, matrix);
    
            // for each neighbor...
            // check if value is 1 (add to stack) else (do nothing)
            for (int[] neighbor : neighbors) {
            int r = neighbor[0];
            int c = neighbor[1];
    
            if (matrix[r][c] == 1) {
                stack.push(neighbor);
            }
            } 
        }
    }//end changesOnesToTwos
    
    public int[][] removeIslands(int[][] matrix) {
        // Write your code here.
    
        // 1. Start iterating through all values that are on one of the 4 borders
          int numRows = matrix.length;
          int numCols = matrix[0].length;
          System.out.println("numRows: " + numRows + " ; numCols: " + numCols);
          for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
              // checking if value is on border AND is a 1
              boolean onBorder = row==0 || col==0 || row==numRows-1 || col==numCols-1;
              boolean isOne = matrix[row][col] == 1;
    
              if (onBorder && isOne) {
                changesOnesToTwos(row, col, matrix);
              }
            }
          }//end first 2loops
    
          // loop again to fix 2 to 1, 1 to 0
          for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
              if (matrix[row][col] == 1) {
                matrix[row][col] = 0;
              }
              if (matrix[row][col] == 2) {
                matrix[row][col] = 1;
              }
            }
          }//end of loop 2
    
        int[][] answer = matrix;
        
        return answer;
      }//end removeIslands()


    //@Test - 
    // having @Test gives an error lol
    public boolean TestCase1() {
        
        int[][] input =
        new int[][] {
          {1, 0, 0, 0, 0, 0},
          {0, 1, 0, 1, 1, 1},
          {0, 0, 1, 0, 1, 0},
          {1, 1, 0, 0, 1, 0},
          {1, 0, 1, 1, 0, 0},
          {1, 0, 0, 0, 0, 1},
        };
        int[][] expected =
            new int[][] {
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 1, 0},
            {1, 1, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1},
            };
        int[][] actual = new Program().removeIslands(input); // change 'Program' to the name of the class/java file, which here is 'Program'
        
        int counter = 0;
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                
                if (actual[i][j] != expected[i][j]) {
                    System.out.println("Found values that do not match...");
                    counter += 1;
                }
            }
        }
        if (counter > 0) {
            System.out.println("\nSomething is wrong, " + counter + " values did not match.");
            return false;
        }
        else {
            System.out.println("\nGood work!!!\n");
            return true;
        }

    }//end of public void TestCase1()
    public static boolean TestCase2() {
        System.out.println("\n--------------------------------------------\nRunning this again, but with TestCase2().\n--------------------------------------------");

        int[][] input =
        new int[][] {
          {1, 0, 1},
          {0, 1, 0},
          {1, 0, 1},
        };
        int[][] expected =
        new int[][] {
          {1, 0, 1},
          {0, 0, 0},
          {1, 0, 1},
        };
        
        int[][] actual = new Program().removeIslands(input); // change 'Program' to the name of the class/java file, which here is 'Program'
        
        int counter = 0;
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                //Utils.assertTrue(actual[i][j] == expected[i][j]);
                
                if (actual[i][j] != expected[i][j]) {
                    System.out.println("Found values that do not match...");
                    counter += 1;
                }
            }
        }
        if (counter > 0) {
            System.out.println("\nSomething is wrong, " + counter + " values did not match.");
            return false;
        }
        else {
            System.out.println("\nGood work!!!\n");
            System.out.println(counter);
            System.out.println(actual);
            
            return true;

        }

    }//end of public void TestCase1()

    public static void main(String[] args) {
        // Run TestCase1()
        Program myCurrentInstance = new Program(); // init an instance of this class Program 'removeIslands'
        boolean myResult = myCurrentInstance.TestCase1(); //run the method 'TestCase1()'
        System.out.println("myResult1 = " + myResult);


        // Run TestCase2()
        //Program myCurrentInstance2 = new Program(); // init an instance of this class Program 'removeIslands'
        //boolean myResult2 = myCurrentInstance2.TestCase2(); //run the method 'TestCase1()'

        var AnswerTwo = Program.TestCase2(); // Note: C++ uses 'auto', Java uses 'var'
        System.out.println("AnswerTwo = " + Program.TestCase2()); 
        System.out.println("\nNote: \nProgram.TestCase2() is a static method, so I did not need to set up an instance ie. Program myCurrentInstance = new Program();"); 
        
        //read about static methods here if necessary: https://stackoverflow.com/questions/290884/what-is-the-reason-behind-non-static-method-cannot-be-referenced-from-a-static
        //
    }


}//end of class remove Islands