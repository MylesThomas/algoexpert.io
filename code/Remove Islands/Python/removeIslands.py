def removeIslands(matrix):
    # Write your code here.

    # 1. Iterate over each value that is on the border
    numRows = len(matrix)
    numCols = len(matrix[0])

    for row in range(numRows):
        for col in range(numCols):
            border = row==0 or col==0 or row==numRows-1 or col==numCols-1
            if border:
                if matrix[row][col] == 0:
                    print(f"there is nothing to do with 0's")
                if matrix[row][col] == 1:
                    print(f"we found a 1 on the border, need to use the stack to block off its neighbors")

                    # 2. take the values of 1 and look at its neighbors, turn everything into 2's
                    turn1to2(matrix, row, col)
                if matrix[row][col] == 2:
                    print(f"we already took care of this, that is why it is a 2")

    # 3. Finish by turning 2's back to 1's, 1's back to 0's
    for row in range(numRows):
        for col in range(numCols):  
            val = matrix[row][col]
            if val==1:
                matrix[row][col] = 0
            if val==2:
                matrix[row][col] = 1

    print(f"matrix: {matrix}")
    return matrix

def turn1to2(matrix, row, col):
    stack = []
    stack.append([row, col])

    while len(stack) > 0:
        currentPosition = stack.pop()
        currentRow = currentPosition[0]
        currentCol = currentPosition[1]

        # change current value to 2 
        matrix[currentRow][currentCol] = 2

        # look for neighbors that should be added to the stack
        # Make sure of the following:
        # 1. the neighboor is 'in bounds ' to prevent indexing errors
        # 2. the neighbor is a 1 (2's are already dealt with, 0's are irrelevant)
        neighbors = getNeighbors(matrix, currentRow, currentCol)
        for neighbor in neighbors:
            row = neighbor[0]
            col = neighbor[1]
            if matrix[row][col] == 1:
                stack.append(neighbor)
            
            
def getNeighbors(matrix, row, col):
    neighbors = []

    numRows = len(matrix)
    numCols = len(matrix[0])

    #up
    if row - 1 >= 0:
        neighbors.append([row - 1, col])

    #down
    if row + 1 < numRows:
        neighbors.append([row + 1, col])

    #left
    if col - 1 >= 0:
        neighbors.append([row, col - 1])

    #right
    if col + 1 < numCols:
        neighbors.append([row, col + 1])

    return neighbors

    
    
input = [
    [1, 0, 0, 0, 0, 0],
    [0, 1, 0, 1, 1, 1],
    [0, 0, 1, 0, 1, 0],
    [1, 1, 0, 0, 1, 0],
    [1, 0, 1, 1, 0, 0],
    [1, 0, 0, 0, 0, 1],
]
expected = [
    [1, 0, 0, 0, 0, 0],
    [0, 0, 0, 1, 1, 1],
    [0, 0, 0, 0, 1, 0],
    [1, 1, 0, 0, 1, 0],
    [1, 0, 0, 0, 0, 0],
    [1, 0, 0, 0, 0, 1],
]
actual = removeIslands(input)
assert(actual == expected)
print("\n\nAssertion passed, good work!\n\n")
    
                