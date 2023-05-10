# Started with this error:
# Python was not found; run without arguments to install from the Microsoft Store, or disable this shortcut from Settings > Manage App Execution Aliases.

# Answer: 
# 1. Open a command prompt (or terminal down below)
# 2. 'where python'
# 3. Ended up just restarting computer lol thanks to this stack overflow user: 
### https://stackoverflow.com/questions/52332554/vscode-the-term-python-is-not-recognized-but-py-works
# 4. In the bottom right, I had not selected an interpreter
# - You can either choose your Anaconda interpreter (recommended), or the python on your system that you found with 'where python'
##### ie. C:\Users\Myles\anaconda3\python.exe
##### vs. C:\Users\Myles\AppData\Local\Programs\Python

# Bonus: go to your search bar and search for Manage App Execution Aliases. 
# You will find the attached screen and you need to turn off App Installers


# Make a class with a basic name ie. Program
class Program:
    def __init__(self, stringOne, stringTwo):
        self.stringOne = stringOne
        self.stringTwo = stringTwo

    def oneEdit(self):
        # Write your code here.
        #stringOne = self.stringOne
        #stringTwo = self.stringTwo
        print(f"Running oneEdit() from class 'Program' with the following attributes:\nself.stringOne = {self.stringOne} \nself.stringTwo = {self.stringTwo}")
        
        # Get lengths
        len1 = len(self.stringOne)
        len2 = len(self.stringTwo)
        if len1 < 2 and len2 < 2:
            return True
            
        len_diff = abs(len1 - len2)
        if len_diff > 1:
            return False

        i = 0
        j = 0
        counter = 0
        if len_diff == 1:
            # Iterate through - if you find a difference, move ONLY the bigger string ahead 1
            while i < len1 and j < len2:
                if self.stringOne[i] != self.stringTwo[j]:
                    counter += 1
                    if len1 > len2:
                        i += 1
                    elif len1 < len2:
                        j += 1
                elif self.stringOne[i] == self.stringTwo[j]:
                    i += 1
                    j += 1
            
        elif len_diff == 0:
            # Iterate through - if you find a difference, counter += 1
            while i < len1:
                if self.stringOne[i] != self.stringTwo[i]:
                    counter += 1
                i += 1

        # Find how many iterations to do (equal to the length of the smaller string)
        # Return depending on counter
        return_val = True if counter <= 1 else False
        print(f"return_val: {return_val}")
        return return_val


# We have created the following
### - 'Program' Class
### - 'init' method
### - 'one_edit' method

# We can now make an instance of Program and get our results
instance_of_program = Program("myles", "jamison")
print(instance_of_program.oneEdit())

# Edit values, do it again
print("\nRunning the method again, this time with new values!")
instance_of_program.stringOne = "Max"
instance_of_program.stringTwo = "Maxy"
print(instance_of_program.oneEdit())