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

def numberOfWaysToMakeChange(n, denoms):
    # Write your code here.

    # set up auxiliary dataframe from 0 to n
    arr = [0] * (n+1) # add 1 so that there is a value for 0
    arr[0]=1 # there is always only 1 way to make $0

    # iterate through each denominator, adding the values of arr[x-denom]
    for denom in denoms:
        # iterate the array, starting at 1 (the 0 never gets changed)
        for i in range(1, n+1):
            if denom > i:
                continue
            elif denom <= i:
                arr[i] = arr[i] + arr[i-denom]
    return arr[n]