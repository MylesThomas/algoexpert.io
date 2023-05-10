def minimumPassesOfMatrix(matrix):
    # Write your code here.
    numRows = len(matrix)
    numCols = len(matrix[0])

    # 0. Add all positive values to the stack
    stack = []
    for row in range(numRows):
        for col in range(numCols):
            val = matrix[row][col]
            if val > 0:
                stack.append([row, col])

    passes = 0
    print(f"stack before first sweep through (passes = {passes}): {stack}")
    
    # 1. For each x,y location in stack...
    # find up to 4 neighbor
    # - if neighbor is negative,
    # --- make it positive
    # --- make it add to stack
    
    while len(stack) > 0:
        validNeighbors = []
        for stack_val in stack:
            row = stack_val[0]
            col = stack_val[1]
            
            #up
            if row - 1 >= 0:
                validNeighbors.append([row - 1, col])
            #down
            if row + 1 < numRows:
                validNeighbors.append([row + 1, col])
            #left
            if col - 1>= 0:
                validNeighbors.append([row, col - 1])
            #right
            if col + 1 < numCols:
                validNeighbors.append([row, col + 1])

        # look at each valid neighbor and see if it is negative
        stack = []
        for neighbor in validNeighbors:
            row = neighbor[0]
            col = neighbor[1]
            if matrix[row][col] < 0:
                matrix[row][col] = matrix[row][col]*-1
                stack.append([row, col])
                
        passes += 1
        print(f"stack after (passes = {passes}): {stack}")
        ###stack = []
        
        


    # 2. The stack is now empty, so there are no more values to turn positive
    # - if every value is positive, return passes - 1 (the last pass doesn't do anything)
    # - else, return -1
    print(f"stack is empty: {stack} ; we now return -1 or {passes} - 1 = {passes-1} ")
    numNegativeValues = 0
    for row in range(numRows):
        for col in range(numCols):
            val = matrix[row][col]
            if val < 0:
                numNegativeValues += 1
                
    print(f"numNegativeValues: {numNegativeValues}")
    returnVal = -1 if numNegativeValues > 0 else passes-1
    return returnVal




input = [
    [0, -1, -3, 2, 0],
    [1, -2, -5, -1, -3],
    [3, 0, 0, -4, -1],
]
expected = 3
actual = minimumPassesOfMatrix(input)

print(f"actual = {actual} ; expected = {expected}")
assert(actual, expected)

print("Made it to the end, correct answer!\n")


print("#2: ")

input = [
    [0, -1, -3, -2, 0],
    [-1, -2, -5, -1, -3],
    [-3, 0, 0, -4, -1],
]
expected = -1
actual = minimumPassesOfMatrix(input)

print(f"actual = {actual} ; expected = {expected}")
assert(actual, expected)

print("Made it to the end, correct answer!")

