import java.util.*;
// note; remove the following error "[myfile].java is a non-project file, only syntax errors are reported"
// https://stackoverflow.com/questions/61826895/how-to-avoid-visual-studio-code-warning-myfile-java-is-a-non-project-file-o

// NOTE: This .java file class uses static methods so that I did not have to make an instance ClassNameFindNodesDistanceK(); in main
// I don't think this is optimal and will work to improve on this in future problems, ie:
// - C:\Users\Myles\OneDrive\Documents\AlgoExpert.io\Remove Islands\Java
// - 
// - 


class ClassNameFindNodesDistanceK {
  // This is an input class. Do not edit.
  static class BinaryTree { 
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) { //constructor
      this.value = value;
    }
  }

  static class Pair<U, V> {
    public final U first;

    public final V second;

    private Pair(U first, V second) { //constructor
      this.first = first;
      this.second = second;
    }
  }

// Note: static = this method belongs to class, not an instance of the class
  public static ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
    // Write your code here.

    // 1. Get Parents Hashmap populated
    HashMap<Integer, BinaryTree> nodesToParents = new HashMap<Integer, BinaryTree> ();
    populateNodesToParents(tree, nodesToParents, null);

    // 2. Find the targetNode
    BinaryTree targetNode = getNodeFromValue(tree, target, nodesToParents);
      
    // 3. Breadth First Search, starting at the targetNode
    ArrayList<Integer> myAnswer = breadthFirstSearchForNodesDistanceK(targetNode, nodesToParents, k);
    
    // 4. return answer
    return myAnswer;
    //return new ArrayList<Integer>();
  }

  public static void populateNodesToParents(BinaryTree node, Map<Integer, BinaryTree> nodesToParents, BinaryTree parent) {
    if (node == null) {
      System.out.println("Node is " + null + ", do nothing to the HashMap.");
    }
    else {
      nodesToParents.put(node.value, parent);
      populateNodesToParents(node.left, nodesToParents, node);
      populateNodesToParents(node.right, nodesToParents, node);
    }
  }

  public static BinaryTree getNodeFromValue(BinaryTree tree, int target, Map<Integer, BinaryTree> nodesToParents) {
    if (tree.value == target) return tree;
    
    BinaryTree parentNode = nodesToParents.get(target);
    if (parentNode.left != null && parentNode.left.value == target) return parentNode.left;
    return parentNode.right;
  }

  public static ArrayList<Integer> breadthFirstSearchForNodesDistanceK(BinaryTree targetNode, Map<Integer, BinaryTree> nodesToParents, int k) {
    Queue<Pair<BinaryTree, Integer>> queue = new LinkedList<Pair<BinaryTree, Integer>>();
    queue.offer(new Pair<BinaryTree, Integer>(targetNode, 0));

    HashSet<Integer> seen = new HashSet<Integer>(); //targetNode.value
    seen.add(targetNode.value);

    while (queue.size() > 0) {
      Pair<BinaryTree, Integer> pair1 = queue.poll();
      BinaryTree currentNode = pair1.first;
      Integer distanceFromTarget = pair1.second;

      if (distanceFromTarget == k) {
        ArrayList<Integer> nodeDistanceK = new ArrayList<Integer>();
        //iterate over each Pair in the queue
        for (Pair<BinaryTree, Integer> pair : queue) {
          nodeDistanceK.add(pair.first.value);
        }
        nodeDistanceK.add(currentNode.value); //don't forget to add the current value that has just been popped from the queue

        // return the answer
        return nodeDistanceK;
      }//end if statement

      // else, we are not yet at distanceFromTarget==k
      ArrayList<BinaryTree> connectedNodes = new ArrayList<BinaryTree>();
      connectedNodes.add(currentNode.left);
      connectedNodes.add(currentNode.right);
      connectedNodes.add(nodesToParents.get(currentNode.value));

      for (BinaryTree node: connectedNodes) {
        if (node != null && !seen.contains(node.value)) {
          Pair<BinaryTree, Integer> newPair = new Pair<BinaryTree, Integer>(node, distanceFromTarget + 1); 
          queue.add(newPair);
          seen.add(node.value);
        }
      }
      
      
    }//end while loop
    
    // return a totally blank array of integers, if there is no answer
    return new ArrayList<Integer>();
    
  }//end of breadthFirstSearchForNodesDistanceK()




  // Main() for the Program
  public static void main(String[] args) {
 
    BinaryTree root = new BinaryTree(1);
    root.left = new BinaryTree(2);
    root.right = new BinaryTree(3);
    root.left.left = new BinaryTree(4);
    root.left.right = new BinaryTree(5);
    root.right.right = new BinaryTree(6);
    root.right.right.left = new BinaryTree(7);
    root.right.right.right = new BinaryTree(8);

    int target = 3;
    int k = 2;
    
    var expected = new ArrayList<Integer> (Arrays.asList(2, 7, 8));
    var actual = new ArrayList<Integer> (findNodesDistanceK(root, target, k));
    //ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 7, 8));
    //ArrayList<Integer> actual = new ArrayList<Integer>();
    //actual = findNodesDistanceK(root, target, k);


    System.out.println("\n\nPrinting the arrays\n--------------------------");
    System.out.println("Actual (my output from 'findNodesDistanceK()'): ");
    Collections.sort(actual);
    System.out.println(actual);

    System.out.println("\nExpected (The correct answer): ");
    System.out.println(expected);

    

    
    //Utils.
    //assertTrue(expected.equals(actual));
    if (actual.equals(expected)) {
        System.out.println("\nGood work!\n" + actual + " == " + expected);
    }
    else {
        System.out.println("\nSomething is wrong, they do not match...");
    }

    //System.out.println("\n Got passed the assertTrue call, good work!");


  }//end main()
  

}//end program