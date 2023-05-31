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






# Do not edit the class below except for the
# populateSuffixTrieFrom and contains methods.
# Feel free to add new properties and methods
# to the class.
class SuffixTrie:
    def __init__(self, string):
        self.root = {}
        self.endSymbol = "*"
        self.populateSuffixTrieFrom(string)

    def populateSuffixTrieFrom(self, string):
        # Write your code here.
        for i in range(0, len(string)):
            self.insert(i, string)

    def insert(self, i, string):
        node = self.root
        for j in range(i, len(string)): # start at i instead of 0 so we can not repeat work
            letter = string[j]
            if letter not in node:
                node[letter] = dict() # create an empty node for this letter (new branch)
                node = node[letter] # update node we are referencing ie. move down the line
            elif letter in node:
                node = node[letter] # update node we are referencing ie. move down the line
                
        # for loop is over, mark the * to end the end of this branch 
        node[self.endSymbol] = True
                

    def contains(self, string):
        # Write your code here.
        node = self.root
        for i in range(0, len(string)):
            letter = string[i]
            if letter in node:
                node = node[letter] # move along down the line 
            elif letter not in node:
                return False # nowhere to move down 

        # made it to the end of this input 'string', let's see if we arrived at endSymbol!
        weAreAtTheEnd = self.endSymbol in node
        return weAreAtTheEnd
