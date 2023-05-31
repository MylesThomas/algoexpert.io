# inspiration for this script: https://www.howtogeek.com/devops/how-to-work-with-json-on-the-command-line/

##### Setup
import json
import logging
import os
import pathlib
current_file_location = pathlib.Path(__file__).parent.resolve()
print(f"Our .py script is being ran from this directory: {current_file_location}")
print("\n\nBeginning of script:\n-----------------------------------------------------------------------------------------------------------------------------")

### Write strings (we can iterate through them later)
strings = {}

# disk data
x = '''
{
    "data": "This is data on our disk! (Persistent Storage)"
}
'''
strings["disk"] = x
del x

# memory data
x = '''
{
    "data": "This is data on our disk! (Volatile Storage)"
}
'''
strings["memory"] = x
del x

#print(f"Here is the dictionary we will iterate through, making .json files for each key-value pair: {strings}")

### Iterate through strings, create a .json file with the filename ending in _{key} and the contents of the file being {value}
i = 0
for key, value in strings.items():
    # print number/key
    print(i)
    i += 1
    print(f"key: {key} ")

    # checks that data looks good
    assert isinstance(value, str)       # assert that our value is a string ie. JSON string data
    data = json.loads(value)            # Use the json.loads() function to convert a string to an object:
    print(f"looking at our new python object: {data}")
    assert isinstance(data, dict)        # assert that our value is a dict ie. JSON format

    # get ready to write
    relative_file_name_str = f"{key}.json"
    print(f"relative file name: {relative_file_name_str}")

    absolute_file_name_str = os.path.join(current_file_location, relative_file_name_str)
    
    # write to disk
    with open(absolute_file_name_str, 'w') as f: # 'w' is for 'writing data', 'f' is just a placeholder 
        print("saving file...")
        json.dump(data, f)
        print(f"location of saved data on local disk: {absolute_file_name_str}")
        print()