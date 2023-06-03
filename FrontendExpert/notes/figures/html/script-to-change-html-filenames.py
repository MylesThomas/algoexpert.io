# Setup / Imports
import os       # Miscellaneous operating system interfaces
import glob     # Unix style pathname pattern expansion

# Telling me that the file is running
print(f"\n\nRunning script... \n")

# Where is this file being run from?
dir_path = os.path.dirname(os.path.realpath(__file__))
print(f"the current file lives here: {dir_path} \n")

# Get a list of the names of each file in this directory
list_filenames = os.listdir()
print(f"number of files total: {len(list_filenames)} \n")

# Iterate through files that end in .png
for filename in list_filenames:
    # Make sure we are only messing with the .png files
    if not filename.endswith(".png"):
        print(f"file {filename} does not match the .png requirements")
        break
    
    # Get absolute file path
    relative_filename = filename
    absolute_filename = os.path.join(dir_path, relative_filename)
    # print(f"absolute_filename: {glob.glob(absolute_filename)}")
    # print(f"absolute_filename: {absolute_filename}")

    # Remove the -css part
    new_absolute_filename = absolute_filename.replace("-html", "")
    print(new_absolute_filename)

    # 
    try:
        os.rename(
            src=absolute_filename,
            dst=new_absolute_filename
        )

    except OSError as e:
        print("Something happened:", e)
    

# for number, filename in enumerate(glob.glob(pathname=dir_path)):
#     print(number)
#     print(filename)
    # try:
    #     print(number)
    #     print(filename)

    #     #os.rename(filename, "Picture_{0}".format(number)) [https://stackoverflow.com/questions/12336594/trying-to-rename-files-with-glob-and-os-modules]
    # except OSError as e:
    #     print("Something happened:", e)