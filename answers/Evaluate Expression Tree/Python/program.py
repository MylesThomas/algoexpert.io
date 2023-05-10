#
# Step 1. Create a file 'program.py' and Copy and Paste from top right editor on AlgoExpert.io
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

import math
def evaluateExpressionTree(tree):
    # Write your code here.

    # check if we are at a leaf node
    if tree.left is None and tree.right is None:
        return tree.value
    if tree.value == -1:
        return evaluateExpressionTree(tree.left) + evaluateExpressionTree(tree.right)
    if tree.value == -2:
        return evaluateExpressionTree(tree.left) - evaluateExpressionTree(tree.right)
    if tree.value == -3:
        # language: if it is a decimal, round towards 0
        # ie. if it is negative, ceil(), if it is positive, floor()
        ret = evaluateExpressionTree(tree.left) / evaluateExpressionTree(tree.right)
        if ret < 0:
            return math.ceil(ret)
        else:
            return math.floor(ret)
    if tree.value == -4:
        return evaluateExpressionTree(tree.left) * evaluateExpressionTree(tree.right)
    
