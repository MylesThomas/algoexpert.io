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




def shiftedBinarySearch(array, target):
    # Write your code here.
    left=0
    right=len(array) - 1
    while left <= right:
        mid = int((left + right ) / 2)
        leftNum = array[left]
        rightNum = array[right]
        potentialTarget = array[mid]
        # if we found it 
        if potentialTarget==target:
            return mid
        # if we did not find it and array is sorted from our current spot
        if leftNum <= potentialTarget:
            if target < potentialTarget and target >= leftNum: # make sure target is between leftNum ...... potentialTarget
                right = mid - 1
            else:
                left = mid + 1

        # if we did not find it and array is NOT sorted from current spot 
        elif leftNum > potentialTarget:
            if target > potentialTarget and target <= rightNum: # make sure target is between potentialTarget ...... rightNum
                left = mid + 1
            else:
                right = mid - 1
        

    # return -1 if we get here
    return -1