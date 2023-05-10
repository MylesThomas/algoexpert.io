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

def binarySearch(array, target):
    # Write your code here.
    leftPointer = 0
    rightPointer = len(array) - 1
    # begin while loop
    while leftPointer <= rightPointer:
        midPointer = int((rightPointer + leftPointer) / 2)
        if array[midPointer] == target:
            return midPointer
        elif array[midPointer] > target:
            rightPointer = midPointer - 1
        elif array[midPointer] < target:
            leftPointer = midPointer + 1
    #while loop ended, return -1
    return -1
        
    