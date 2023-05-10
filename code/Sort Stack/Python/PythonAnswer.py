def sortStack(stack):
    # 0. base case
    if len(stack) == 0:
        return
    
    # 1. pop
    top = stack.pop()

    # 2. sort 
    sortStack(stack)

    # 3. insert
    insertIntoStack(stack, top)

    # 4. done
    return stack

def insertIntoStack(stack, value):
    # 0. base case 
    if len(stack) == 0:
        stack.append(value)
        return
    
    
    top = stack.pop()
    if value >= top:
        # 1. if the value is supposed to be next...
        stack.append(top)
        stack.append(value)
    else:
        # 2. if the value is not in the right spot... keep recursively calling until we are 
        insertIntoStack(stack, value)
        stack.append(top)


        


def TestCase1(input, expected):
    print(f"Starting test case 1:\n--------------------------------------------")
    actual = sortStack(input)

    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    

input = [-5, 2, -2, 4, 3, 1]
expected = [-5, -2, 1, 2, 3, 4]

TestCase1(
    input=input,
    expected=expected
)