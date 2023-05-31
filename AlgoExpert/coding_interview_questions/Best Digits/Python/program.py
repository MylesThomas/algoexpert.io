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





def bestDigits(number, numDigits):
    # Write your code here.
    stack = []
    for i in range(0, len(number)):
        currentNumber = int(number[i])
        if len(stack) == 0:
            stack.append(currentNumber)
        elif len(stack) > 0:
            #topOfStack = stack[len(stack) - 1]
            while numDigits > 0 and len(stack) > 0 and currentNumber > stack[len(stack) - 1]:
                numDigits -= 1
                stack.pop() # get rid of top value

            # end of while loop, finally add that currentNumber
            stack.append(currentNumber)

    # if we still have elements to pop off, do that now!
    for i in range(0, numDigits):
        stack.pop()

    # stack is compmlete
    print(f"stack: {stack}")
    return "".join([str(x) for x in stack])
            
