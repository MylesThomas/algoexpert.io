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



def cycleInGraph(edges):
    # Write your code here.
    n = len(edges)
    seen = [0] * n # 0=unseen, 1=seen and in stack, 2=seen and done
    for i in range(0, n):
        if seen[i] == 0:
            containsCycle = traverseAndColorNodes(edges, i, seen)
            if containsCycle:
                return True
        elif seen[i] == 1:
            continue
        elif seen[i] == 2:
            continue
    #if we get to the end, we didn't find a circle 
    return False
        
def traverseAndColorNodes(edges, node, seen):
    # start by marking it grey/1
    seen[node] = 1
    # traverse connectedNodes to this node
    connectedNodes = edges[node]
    for x in connectedNodes:
        # if our neighbor is white, we can do recursive call
        if seen[x] == 0:
            containsCycle = traverseAndColorNodes(edges, x, seen)
            if containsCycle:
                return True
        # if our neighbor is grey, return True
        
        elif seen[x] == 1:
            return True
        # if our neighbor is black, do nothing
        elif seen[x] == 2:
            continue
    
    # end by marking it black/2 since we never need to visit this node again
    seen[node] = 2
    return False