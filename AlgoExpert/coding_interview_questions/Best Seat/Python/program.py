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



def bestSeat(seats):
    # Write your code here.

    # 0.setup
    bestSeat=-1
    maxGap=0
    left = 0
    # 1.while loop using 2 pointers
    while left < len(seats):
        right = left+1
        while right < len(seats) and seats[right]==0:
            right+=1
        # ok right here we just got to a 1
        gap = right-left-1
        if gap > maxGap:
            maxGap=gap
            bestSeat= int((left+right)/2)# do it like this so that you never divided by 0!
        left=right
    # end
    return bestSeat