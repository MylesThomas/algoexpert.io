import java.util.*;//import everything
import java.util.stream.Collectors;

class JavaAnswer {
  //
  //helper
  public static LinkedList reverseLinkedList(LinkedList head) {
    // Write your code here.

    //set pointers
    LinkedList p1 = null;
    LinkedList p2 = head;
    LinkedList p3 = head.next;
    

    //begin loop
    while(true) {
      //1 
      p2.next = p1;
      //2 (do ifelse)
      if(p3 == null) {
        return p2;
      }
      else {
        p1=p2;
        p2=p3;
        p3=p3.next;
      }
      
    }
    //return null;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }

//helper function from algoexpert.io
public LinkedList newLinkedList(int[] values) {
  LinkedList ll = new LinkedList(values[0]);
  LinkedList current = ll;
  for (int i = 1; i < values.length; i++) {
    current.next = new LinkedList(values[i]);
    current = current.next;
  }
  return ll;
}

public List<Integer> toArrayList(LinkedList ll) {
  List<Integer> arr = new ArrayList<Integer>();
  LinkedList current = ll;
  while (current != null) {
    arr.add(current.value);
    current = current.next;
  }
  return arr;
}

public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
  if (arr1.size() != arr2.length) return false;
  for (int i = 0; i < arr1.size(); i++) {
    if (arr1.get(i) != arr2[i]) return false;
  }
  return true;
}


  // test case
  public boolean TestCase1() {
    //
    System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

    int[] input = new int[] {0, 1, 2, 3, 4, 5};
    LinkedList test = newLinkedList(input);
    System.out.println("input: ");
    System.out.println(Arrays.toString(input));

    List<Integer> actual = toArrayList(reverseLinkedList(test));
    int[] expected = new int[] {5, 4, 3, 2, 1, 0};
    
    
    boolean booleanAssertion = arraysEqual(actual, expected);
    if (booleanAssertion) {
      System.out.println("Good work!\n");
      System.out.println(actual);
      System.out.println("==");
      System.out.println(Arrays.toString(expected)); // turns int[] into a print-able array
      
        
        return true;
    }
    else {
        System.out.println("\nSomething is wrong, they do not match...");
        //System.out.println("...\n" + actual + " == " + expected);
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



  

    