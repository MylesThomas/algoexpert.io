Example Instructions: 23 - MapReduce

Resources: 
- Having trouble running Git Bash: https://intellipaat.com/community/20921/installing-nodejs-sh-node-command-not-found-error
    - ended up using Ubuntu anyways lol

    
1. Setup directory
- make directory => open in integrated terminal
- npm init -y
- npm install express
- write code into 'map.js', 'reduce.js', 'map_reduce.js', and 'shuffle.js'

2. Use python to create and put .txt files in correct directories
- In main directory 'mapreduce', create the following: 
    - empty directory 'host1'
    - empty directory 'host2'
    - empty directory 'map_results'
    - empty directory 'reduce_results'
    - python file create_data.py

- Write code and run that script: python create_data.py
    - Double check now that host1 and host2 both have a file named 'latencies.txt'

- Ensure that host1 and host2 have a 'map_results' directory
    - obviously this will be empty for now 

3. Begin logic
- Note: You can do this with a .sh file, or you can do it one by one in the terminal
    - My Preference: Figure out how to get the .sh to work!

- Steps: 
    - Open a Ubuntu Terminal in VSCode in your directory:
        - Launch Profile => Ubuntu 
        - cd "/mnt/c/Users/Myles/OneDrive/Documents/algoexpert.io/SystemsExpert/23. MapReduce/mapreduce"

    - Make updates and install nodejs: 
        - sudo apt-get update
        - sudo apt-get install nodejs

    - Ensure your python script was run
        - python3 create_data.py
            - May need to run in a CMD if python3 doesn't work (it worked for me in Ubuntu - just saying)

    - Run shell script
        - bash run.sh