#! /bin/bash

# Note: It is fine to run this from command prompt: 
# - bash run.sh
# ----------------------------------------------------
echo 'starting script.....'

# Init npm
npm init -y
echo 'npm init -y.....'

# Install 
npm install http-server -g
echo 'npm install http-server --global'
echo 'more on npm install http-server here: https://www.npmjs.com/package/http-server/v/13.0.1'

# Start server
echo 'reminder on how to see your webpage: run http-server in your terminal!'

# Notify script ending 
echo 'script done!'