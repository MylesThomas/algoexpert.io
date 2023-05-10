import java.util.*;//import everything


//in Java, put everything inside of a class
class JavaAnswer {
    //public ArrayList<Integer> stack; // class arguments
    //
    //public JavaAnswer(ArrayList<Integer> stack_input) { // Constructor 
    //    stack = stack_input;
    //}

    // Methods + Functions
    public ArrayList<Integer> SortStack(ArrayList<Integer> stack) {
        // 0. base case
        if (stack.size() == 0) {
            return stack;
        }
        // 1. remove top
        int top = stack.remove(stack.size() - 1);

        // 2. sort
        SortStack(stack);

        // 3. insert top
        InsertIntoStack(stack, top);

        // 4. return
        return stack;
        
    }

    public void InsertIntoStack(ArrayList<Integer> stack, int value) {
        // 0. base case 
        if (stack.size() == 0) {
            stack.add(value);
            return;
        }
        
        int top = stack.remove(stack.size() - 1);
        if (value >= top) {
            // 1. if the value belongs here...
            stack.add(top);
            stack.add(value);
        }
        else {
            // 2. if the value does not belong here...
            InsertIntoStack(stack, value);

            // 3. add that top back on
            stack.add(top);
        }
    }

    
    public boolean TestCase1() {
        //
        System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

        //set up input/actual/expected
        ArrayList<Integer> stack = new ArrayList<Integer>(Arrays.asList(-5, 2, -2, 4, 3, 1));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(-5, -2, 1, 2, 3, 4));
        var actual = SortStack(stack);

        //
        if (actual.equals(expected)) {
            System.out.println("\nGood work!\n" + actual + " == " + expected);
            return true;
        }
        else {
            System.out.println("\nSomething is wrong, they do not match...");
            return false;
        }
    }

    public static void main(String[] args) {
        JavaAnswer classInstance = new JavaAnswer(); //init the program instance
        boolean testCaseResults = classInstance.TestCase1(); //get the results from the test case
        System.out.println("boolean testCaseResults: " + testCaseResults + " \n"); //print the return value
        //System.out.println("");//extras
    }
}