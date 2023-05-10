import java.util.*;//import everything
import java.util.stream.Collectors;

import java.util.*;

class JavaAnswer {
  // class
  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }

  //methods
  public static LinkedList findLoop(LinkedList head) {
    
    // Write your code here.

    // set pointers
    LinkedList p1 = head.next;
    LinkedList p2 = head.next.next;

    // find intersection
    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next.next;
    }
    // found intersection
    LinkedList pointOfIntersection = p1;

    // find 
    p1 = head;
    p2 = pointOfIntersection;
    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
}//end method

  // test case
  // test case
  public boolean TestCase1() {
    //
    System.out.println("\nStarting test case 1:\n---------------------------------------------\n");

    LinkedList head = new LinkedList(0);
    head.next = new LinkedList(1);
    head.next.next = new LinkedList(2);
    head.next.next.next = new LinkedList(3);
    head.next.next.next.next = new LinkedList(4);
    head.next.next.next.next.next = new LinkedList(5);
    head.next.next.next.next.next.next = new LinkedList(6);
    head.next.next.next.next.next.next.next = new LinkedList(7);
    head.next.next.next.next.next.next.next.next = new LinkedList(8);
    head.next.next.next.next.next.next.next.next.next = new LinkedList(9);
    //circle
    head.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next;

    // set up expected output
    Integer n = 5;
    Integer counter = 1;
    LinkedList current = head;
    while (counter < n) {
        current = current.next;
        counter += 1;
      }
      
    LinkedList expected = current;

    // get actual output
    LinkedList actual = findLoop(head);

    // assert equal
    boolean bools = (actual == expected);
    
    if (bools) {
      System.out.println("Good work!\n");
      System.out.println(actual.value);
      System.out.println("==");
      System.out.println(expected.value); // turns int[] into a print-able array
      
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
}//end main 
}//end program
