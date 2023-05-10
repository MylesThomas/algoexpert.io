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




def searchForRange(array, target):
    # Write your code here.

    # implement binary search to find a '45'
    left = 0
    right = len(array) - 1
    found = False
    while left <= right:
        mid = (left + right) // 2
        potentialTarget = array[mid]

        if potentialTarget==target:
            left=mid
            right=mid
            found=True
            print(f"found the target ({target}) at index = {mid}")
            break
        elif target > potentialTarget:
            left=mid+1
        elif target < potentialTarget:
            right=mid-1

    # put down a l/r pointer and go as far l/r as you can
    if found:
        while True:
            if left-1 >= 0 and array[left-1]==target:
                left -= 1
            else:
                break
        while True:
            if right + 1 < len(array) and array[right+1]==target:
                right += 1
            else:
                break
        return [left, right]
    else:
        return [-1, -1]
    
        