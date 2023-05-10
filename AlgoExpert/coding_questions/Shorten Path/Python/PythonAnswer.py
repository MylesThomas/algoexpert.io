def isImportantToken(token):
    return len(token) > 0 and token != '.'
    
def shortenPath(path):
    # Write your code here.

    # 1. boolean check for absolutePath
    absolutePath = path[0] == '/'
    print(f"absolutePath: {absolutePath}")

    # 2. split path up into a list
    listVals = path.split("/")
    print(f"listVals: {listVals}")
    
    # 3. remove values that we don't need
    # . is never relevant
    # ""
    tokens = filter(isImportantToken, path.split('/'))
    print(f"tokens: {tokens}")

    # 4. init empty stack
    ### add a "" for the absolutePath if needed
    stack = []
    if absolutePath:
        stack.append("")

    # 5. begin logic for edge cases and '..'
    for x in tokens:
        if x != "..":
            stack.append(x)
            continue

        # dealing with edge cases from '..'
        if len(stack) == 0:
            stack.append(x)
        elif stack[len(stack) - 1] == x:
            stack.append(x)
        elif stack[len(stack) - 1] == "":
            continue
        elif stack[len(stack) - 1] != "":
            stack.pop()
            # What can be before a '..'?
            # 1. a totally empty path
            # 2. another x = '..'
            # 3. a blank "", which represents a slash
            # 4. anything else

    returnVal = None
    if absolutePath and len(stack) == 1:
        returnVal = '/'
    else:
        returnVal = "/".join(stack)
    print(f"returnVal: {returnVal}")
    return returnVal

def TestCase1():
    print(f"Starting test case 1:\n--------------------------------------------")
    expected = "/foo/bar/baz"
    input = "/foo/../test/../test/../foo//bar/./baz"
    actual = shortenPath(input)

    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")

def TestCase2():
    print(f"Starting test case 2:\n--------------------------------------------")
    expected = "/"
    input = "/myles/is/king/../../../../../../../../"
    actual = shortenPath(input)

    bools = (actual == expected)
    if bools:
        print(f"Good work!\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")
    else:
        print(f"Something went wrong...\n\ninput = {input}\nactual = {actual}\nexpected = {expected}\n\nbools: {bools}\n")

# Run test case
TestCase1()
TestCase2()
