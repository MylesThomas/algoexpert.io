// Imports
//import java.util.*; it doesn't get used so cancelled it out 

// Creating a class named 'one_edit'
// Was getting error 'public type one_edit must be defined in its own file' 
// Until I changed 'public class one_edit' into 'class one_edit'
//public 
class one_edit { // Make sure that the class name is the same as the file (ie. one_edit.java)
    public String stringOne;
    public String stringTwo;

    // Constructor 
    public one_edit(String s1, String s2) {
        stringOne = s1;
        stringTwo = s2;
        // either of these can work!
        //this.stringOne = s1
        //this.stringTwo = s2
    }

    // Method
    public boolean oneEdit() {
        // Write your code here.
        String s = String.format("Running method oneEdit from an object from class 'one_edit' with the following:\nstringOne = %s \nstringTwo = %s \n !", stringOne, stringTwo);
        System.out.println(s);

        // Get lengths
        int len1 = stringOne.length();
        int len2 = stringTwo.length();

        if (Math.abs(len1 - len2) > 1) {
            System.out.println("The difference between stringOne and stringTwo is > 1: return false");
            return false;
          }

        boolean madeEdit = false;
        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) {
            if (stringOne.charAt(i) != stringTwo.charAt(j)) {
                if (madeEdit) {
                  System.out.println("Making a 2nd edit: return false");
                  return false;
                }

                else if (!madeEdit) {
                  System.out.println("Making first edit... next one means false");
                  madeEdit = true;
        
                  if (len1 > len2) {
                    i++;
                  }

                  else if (len1 < len2) {
                    j++;
                  }

                  else {
                    i++;
                    j++;
                  }
                  
                }
              }
        
              else if (stringOne.charAt(i) == stringTwo.charAt(j)) {i++; j++;}

        } // End of while loop

        // Return the answer
        s = String.format("Made it to the end, %s and %s are good to go! \n", stringOne, stringTwo);
        System.out.println(s);
        return true;

    } // End of 'oneEdit' method declaration

    // Declare the main
    public static void main(String[] args) {
        // Create an instance of our class 'one_edit'
        
        // Note: As long as we turn this into an object, we don't need 'static' above 
        // ie. public static boolean vs. public boolean
        ///// one_edit myInstance = new one_edit();
        ///// System.out.println(myInstance.instanceMethod()); //will work
        one_edit instance1 = new one_edit("grab", "grabs"); //System.out.println();

        // Run the 'oneEdit()' method with instance1
        boolean bools;
        bools = instance1.oneEdit();
        System.out.println(bools);


        // Edit the values of instance1
        instance1.stringOne = "abcd";
        instance1.stringTwo = "abcdefg";

        // Run the method one more time!
        bools = instance1.oneEdit();
        System.out.println(bools);



        // return ??? I don't think we need this in Java



    } // End of public static void main()


    
} // End of class one_edit declaration
    



