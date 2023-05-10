# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def validateThreeNodes(nodeOne, nodeTwo, nodeThree):
    # Write your code here.

    # 1. check if it goes 1 -> 2 -> 3
    bool1 = searchForDescendant(targetNode=nodeTwo, startingNode=nodeOne) and searchForDescendant(targetNode=nodeThree, startingNode=nodeTwo)  

    # 2. check if it goes 3 -> 2 -> 1
    bool2 = searchForDescendant(targetNode=nodeTwo, startingNode=nodeThree) and searchForDescendant(targetNode=nodeOne, startingNode=nodeTwo)
    
    # return
    return bool1 or bool2
    
    
def searchForDescendant(targetNode, startingNode):
    currentNode = startingNode
    while currentNode is not None:
        if currentNode.value == targetNode.value:
            return True
        elif currentNode.value > targetNode.value:
            currentNode = currentNode.left
        elif currentNode.value <= targetNode.value:
            currentNode = currentNode.right
            
    return False
   

def TestCase1():
    print(f"Starting test case 1:\n--------------------------------------------")

    root = BST(5)
    root.left = BST(2)
    root.right = BST(7)
    root.left.left = BST(1)
    root.left.right = BST(4)
    root.right.left = BST(6)
    root.right.right = BST(8)
    root.left.left.left = BST(0)
    root.left.right.left = BST(3)

    nodeOne = root
    nodeTwo = root.left
    nodeThree = root.left.right.left
    expected = True
    actual = validateThreeNodes(nodeOne, nodeTwo, nodeThree)
    
    bools = (actual == expected)
    if bools:
        #print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
        print(f"Good work!\n\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
        
    else:
        #print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
        print(f"Something went wrong...\n\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
        

        
# run program
TestCase1()

