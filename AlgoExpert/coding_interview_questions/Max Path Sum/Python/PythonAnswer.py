def maxPathSum(tree):
    # Write your code here.
    answer = findMaxSum(tree)
    return answer[1]

def findMaxSum(tree):
    if tree is None:
        return [0, -999999999999999999]

    #recursive calls
    left = findMaxSum(tree.left)
    right = findMaxSum(tree.right)

    # find math path sum as branch
    v = tree.value
    leftMaxSumAsBranch = left[0]
    rightMaxSumAsBranch = right[0]
    maxSumAsBranch = max(leftMaxSumAsBranch + v, rightMaxSumAsBranch + v, v)
    
    #find max path sum as root note
    maxSumAsRootNode = max(maxSumAsBranch, leftMaxSumAsBranch + v + rightMaxSumAsBranch)

    #find max path sum
    leftMaxSum = left[1]
    rightMaxSum = right[1]
    maxPathSum = max(maxSumAsRootNode, leftMaxSum, rightMaxSum)

    return [maxSumAsBranch, maxPathSum]


class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, values, i=0):
        if i >= len(values):
            return
        queue = [self]
        while len(queue) > 0:
            current = queue.pop(0)
            if current.left is None:
                current.left = BinaryTree(values[i])
                break
            queue.append(current.left)
            if current.right is None:
                current.right = BinaryTree(values[i])
                break
            queue.append(current.right)
        self.insert(values, i + 1)
        return self


def TestCase1():
    print(f"Starting test case 1:\n--------------------------------------------")
    input = BinaryTree(1).insert([2, 3, 4, 5, 6, 7])
    expected = 18
    actual = maxPathSum(input)

    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")


# Run test case
TestCase1()