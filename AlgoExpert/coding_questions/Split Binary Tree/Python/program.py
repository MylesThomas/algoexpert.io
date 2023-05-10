# Step 0. Create a file 'program.py'
# ----------------------------------------------------------------------------------

# Step 1. Copy and Paste methods/classes from top right editor on AlgoExpert.io
# ----------------------------------------------------------------------------------

# Step 2. Create a new file in this folder named 'test_program.py' and Copy/Paste from AlgoExpert.io Sandbox
# ----------------------------------------------------------------------------------

# Step 3. Add the 2 following lines of code to the bottom of 'test_program.py':
#if __name__ == '__main__':
    #unittest.main(verbosity=2)
# ----------------------------------------------------------------------------------

# Step 4. Execute the test program.
# ----------------------------------------------------------------------------------


# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def getSumOfBinaryTree(tree):
    if tree is None:
        return 0
    else:
        return tree.value + getSumOfBinaryTree(tree.left) + getSumOfBinaryTree(tree.right)

def findBinaryTreeWithTargetValue(tree, target):
    if tree is None:
        return (0, False) #base case: 0 for sum of None, False because target is not 0
    else:
        left =  findBinaryTreeWithTargetValue(tree.left,  target)
        right = findBinaryTreeWithTargetValue(tree.right, target)

        # get sum of this tree
        currentSum = tree.value + left[0] + right[0]

        # see if currentSum == target OR if a different tree from L/R got it already
        treeExistsBoolean = currentSum==target or left[1] or right[1]

        # return
        return (currentSum, treeExistsBoolean)
        
    
        
def splitBinaryTree(tree):
    # Write your code here.

    # 1. Find the value of interest ie. Sum of tree / 2
    sumOfEntireTree = getSumOfBinaryTree(tree)
    target = sumOfEntireTree / 2
    print(f"target: {target}")

    # 2. See if there is any binary tree that has a sum equal to the target value 
    rets = findBinaryTreeWithTargetValue(tree, target)
    treeExists = rets[1]

    # return
    return target if treeExists else 0



if __name__ == "__main__":
    # Setup
    import os
    path = os.path.dirname(os.path.abspath(__file__))
    print(f"current file path: {path} \n")

    # Before creating
    dir_list = os.listdir(path) 
    print("List of directories and files before creation:")
    print(dir_list)
    print()
    
    # Creating a file at specified location
    file = "test_program.py"
    with open(os.path.join(path, file), 'w') as fp:
        # fp.write("#!/usr/bin/python")
        fp.write("If you need help with unittest and Testing, follow this link: https://realpython.com/python-testing/")
        print("New file created! \n")
    
    # After creating 
    dir_list = os.listdir(path)
    print("List of directories and files after creation:")
    print(dir_list)









# Step 4. Finish up in 'test_program.py'
# ----------------------------------------------------------------------------------
# - Open up the new file
# - Copy/Paste from 'Sandbox' in Bottom-left editor on AlgoExpert.io
# - Add the following lines of code to the bottom before running the script: 
#if __name__ == '__main__':
    #print("Code in this section will not run on imports. More on this here: https://realpython.com/if-name-main-python/ \n")
    #unittest.main(verbosity=2) # hey uncomment me!