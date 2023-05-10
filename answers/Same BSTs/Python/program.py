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


def getSmaller(arr):
    smallerList = []
    firstVal = arr[0]
    for x in arr:
        if x < firstVal:
            smallerList.append(x)
    return smallerList

def getGreaterThanOrEqual(arr):
    greaterThanOrEqualList = []
    firstVal = arr[0]
    for i in range(0, len(arr)):
        if i != 0:
            x = arr[i]
            if x >= firstVal:
                greaterThanOrEqualList.append(x)
    return greaterThanOrEqualList
    
def sameBsts(arrayOne, arrayTwo):
    # Write your code here.

    # 1. check for base cases 
    if len(arrayOne) != len(arrayTwo):
        return False
    
    if len(arrayOne) == len(arrayTwo):
        if len(arrayOne) == 0:
            return True
        elif arrayOne[0] != arrayTwo[0]:
            return False

    # 2. for both arrays, do the following:
    # - put values smaller than head in an array
    # - put values >= than head in an array
    arrayOneSmaller = getSmaller(arrayOne)
    arrayOneGreaterThanOrEqual = getGreaterThanOrEqual(arrayOne)
    arrayTwoSmaller = getSmaller(arrayTwo)
    arrayTwoGreaterThanOrEqual = getGreaterThanOrEqual(arrayTwo)
    
    # 3. apply recursive calls 
    ### left  - go for values smaller than the current heads (arrayOne[0]. arrayTwo[0])
    ### right - go for values >= than the current heads (arrayOne[0]. arrayTwo[0])
    leftRecursiveCall  = sameBsts(arrayOneSmaller, arrayTwoSmaller)
    rightRecursiveCall = sameBsts(arrayOneGreaterThanOrEqual, arrayTwoGreaterThanOrEqual)

    # 4. return 
    return leftRecursiveCall and rightRecursiveCall