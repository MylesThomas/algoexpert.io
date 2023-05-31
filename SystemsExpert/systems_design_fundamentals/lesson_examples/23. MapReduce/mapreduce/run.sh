#! /bin/bash
echo 'starting script...'

# Clean up stray files from the previous run.
rm -f host1/map_results/*.txt
rm -f host2/map_results/*.txt
rm -f map_results/*.txt
rm -f reduce_results/results.txt

# Run the map step on both hosts in parallel.
HOST=host1 node map.js &
HOST=host2 node map.js &

# Wait for them both to be done
wait 
echo 'waiting for map.js to finish...' # me again

# Run the shuffle step.
HOSTS=host1,host2 node shuffle.js

# Run the reduce step.
node reduce.js

# View the final result of the MapReduce job.
echo 'printing results:'
cat reduce_results/results.txt # Cat: Read the contents of files: https://www.cyberciti.biz/faq/howto-use-cat-command-in-unix-linux-shell-script/

# (I added this in to see how to print with Ubuntu/Shell Script) echo = print
echo 'done !'

# Another note: Cancel an ongoing script ie. if bash run.sh is taking too long: Ctrl-C