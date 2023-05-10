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



def getSmallestString(strings):
    smallestString = strings[0]
    for i in range(1, len(strings)):
        if len(strings[i]) < len(smallestString):
            smallestString = strings[i]
    return smallestString
    
def commonCharacters(strings):
    # Write your code here.

    # find the smallest string
    smallestString = getSmallestString(strings)

    # put this string into a set
    possibleCommonChars = set(smallestString)
    print(f"possibleCommonChars: {possibleCommonChars}")

    # iterate through each of the rest of the strings, and look for values that are not in the possibleCommonChars
    removeSet = set()
    for string in strings:
        # turn this string into a set
        currentSet = set(string)
        # check if possibleCommonChars has any chars that currentSet does NOT have
        
        for x in possibleCommonChars:
            if x not in currentSet:
                removeSet.add(x)#possibleCommonChars.remove(x)
    # Finally, go through the removeSet and remove those chars from 'possibleCommonChars'
    for x in removeSet:
        possibleCommonChars.remove(x)
                
    # we got to the end, return these chars in list form 
    ret = list(possibleCommonChars)
    print(f"answer: {ret}")
    return ret