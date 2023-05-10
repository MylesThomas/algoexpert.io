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








def reversePolishNotation(tokens):
    # Write your code here.
    #return -1
    stack=[]
    list_operators = ["+", "-", "*", "/", ]
    for i in range(0, len(tokens)):
        value = tokens[i]
        if value in list_operators:
            # if it is an operator, pop 2 values off the stack and add the new number onto the stock
            operator = value
            pop1 = int(stack.pop())
            pop2 = int(stack.pop())
            new_value = 0
            if operator == "+":
                new_value = int(pop2 + pop1)
            if operator == "-":
                new_value = int(pop2 - pop1)
            if operator == "*":
                new_value = int(pop2 * pop1)
            if operator == "/":
                new_value = int(pop2 / pop1)
            #add to stack
            stack.append(new_value)
            
            new_value = pop1 
        else:
            # if it is an operand, just add it onto the stack
            operand = value
            stack.append(operand)

    # we are at the end
    # stack should be size 1, return the one value
    only_value_in_stack = int(stack[0])
    return int(only_value_in_stack)
            
