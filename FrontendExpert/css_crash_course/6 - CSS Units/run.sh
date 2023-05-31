#! /bin/bash

# Note: It is fine to run this from command prompt: 
# - bash run.sh
# ----------------------------------------------------
echo 'starting script.....'

# Init npm
npm init -y

# Install 
npm install http-server -g

# Start server
# http-server (This has not been working - run it manually in command prompt)
# ----------------------------------------------------
# Notify script ending 
echo 'script done!'