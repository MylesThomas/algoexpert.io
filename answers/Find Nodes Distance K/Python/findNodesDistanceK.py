# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def findNodesDistanceK(tree, target, k):
    # Write your code here.

    # 1. Find the parent nodes for everybody
    nodesToParents = {}
    populateNodesToParents(tree, nodesToParents)
    print(f"nodesToParents: {nodesToParents} \n")

    # 2. Find the node of the target variable
    targetNode = getNodeFromValue(target, tree, nodesToParents)
    print(f"targetNode.value: {targetNode.value}")

    # 3. Begin Breadth First Search from targetNode
    answer = breadthFirstSearchForNodesDistanceK(targetNode, nodesToParents, k)
    print(f"answer: {answer}")
    return answer
    
    
def breadthFirstSearchForNodesDistanceK(targetNode, nodesToParents, k):
    # Remember: This is FIFO, so we will pop from the right (pop()) and append to the left (appendleft())
    queue = [(targetNode, 0)] # Want to have node, and distance
    seen = {targetNode.value}  # Keep track of node values we have seen already 

    while len(queue) > 0:
        print(f"looping through the while loop again...")
        poppedVals = queue.pop(0)
        currentNode = poppedVals[0]
        distanceFromTarget = poppedVals[1]

        if distanceFromTarget == k:
            print(f"we are now the correct k={k} from our target!")
            # Here is where the logic comes in that if we find k=2 away, everything in the queue is always k=2 away!
            nodesDistanceK = [node.value for node, _ in queue]
            # Don't forget to add yourself too, since you are the one who found being k=2 away
            nodesDistanceK.append(currentNode.value)
            return nodesDistanceK

        
        connectedNodes = [currentNode.left, currentNode.right, nodesToParents[currentNode.value]] # There should be up to 3 of these (left, right, parent)
        for node in connectedNodes:
            if node is None:
                continue
            if node.value in seen:
                continue

            # Add this node to seen, then add to the back (left side) of the queue 
            seen.add(node.value)
            appendValue = (node, distanceFromTarget + 1) # We add the one because all 3 of these nodes are even farther away from starting point
            queue.append(appendValue)
        
    empty_list = []
    print("got to the end without finding any 'k' away!")
    return empty_list # We made it to the end and nothing was 'k' away
                
            
def populateNodesToParents(node, nodesToParents, parent=None):
    if not node:
        return
    nodesToParents[node.value] = parent
    populateNodesToParents(node.left, nodesToParents, parent=node)
    populateNodesToParents(node.right, nodesToParents, parent=node)

def getNodeFromValue(target, tree, nodesToParents):
    if tree.value == target:
        return tree
    else:
        targetNodeParent = nodesToParents[target]
        # 1 - Check if we are our parent's Left child
        if targetNodeParent.left and targetNodeParent.left.value == target:
            return targetNodeParent.left
        else:
            return targetNodeParent.right # We must be the right child, then
    
    
    
### Start getting ready to actually use 'findNodesDistanceK(tree, target, k)'


n1 = BinaryTree(1) # Init all 8 nodes
n2 = BinaryTree(2)
n3 = BinaryTree(3)
n4 = BinaryTree(4)
n5 = BinaryTree(5)
n6 = BinaryTree(6)
n7 = BinaryTree(7)
n8 = BinaryTree(8)

n1.left = n2 # Point the nodes to their correct Node Objects
n1.right = n3
n2.left = n4
n2.right = n5
n3.left = None
n3.right = n6
n4.left = None
n4.right = None
n5.left = None
n5.right = None
n6.left = n7
n6.right = n8
n7.left = None
n7.right = None
n8.left = None
n8.right = None

tree = n1 # Set n1 as tree

target = 3 # Other params
k = 2

answer = findNodesDistanceK(tree, target, k) # Run method
print(answer)