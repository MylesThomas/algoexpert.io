# Not my code 
import os
print('abspath:     ', os.path.abspath(__file__))
print('abs dirname: ', os.path.dirname(os.path.abspath(__file__)))
print("------------------------------------")
# My code
import random
directories_list = [
    'host1', 
    'host2'
]

n = 500

for directory in directories_list:
    # Init a blank list
    random_integers_list = []

    # Create the list of random integers
    for i in range(0, n):
        x = random.randint(0, 10000*2) # Note: latencies are in milliseconds
        random_integers_list.append(x)

    # Export the Python list as a .txt file 
    path_location_new_txt_file_str = os.path.join(
        os.path.dirname(os.path.abspath(__file__)), 
        directory,
        "latencies.txt"
    )
    print(path_location_new_txt_file_str)
    with open(path_location_new_txt_file_str, 'w') as fp:
        for i in range(0, len(random_integers_list)):
            item = random_integers_list[i]
            if i == len(random_integers_list) - 1:
                fp.write(f"{item}")
            else:
                fp.write(f"{item}\n")

        print(f"Done writing latencies for directory: {directory}")

print(f"\nDone!")