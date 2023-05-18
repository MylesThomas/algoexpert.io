Instructions: Example from Lesson 12 - Relational Databases

Resources: 
- https://www.postgresqltutorial.com/postgresql-getting-started/install-postgresql/
- https://www.microfocus.com/documentation/idol/IDOL_12_0/MediaServer/Guides/html/English/Content/Getting_Started/Configure/_TRN_Set_up_PostgreSQL.htm
- https://www.postgresql.org/docs/current/tutorial-createdb.html
- https://stackoverflow.com/questions/9736085/run-a-postgresql-sql-file-using-command-line-arguments
- https://stackoverflow.com/questions/19674456/run-postgresql-queries-from-the-command-line
- Meaning of INSERT 0 1: https://www.google.com/search?q=meaning+of+insert+0+1&oq=meaning+of+insert+0+1&aqs=chrome..69i57j33i160j33i299l2j33i22i29i30l2.4127j1j7&sourceid=chrome&ie=UTF-8


1. Setup PostgreSQL
- Download for Windows: https://www.postgresql.org/download/
    - info I chose during PostgreSQL setup: 
        - password: Myle$T23
        - port: 5432
    - My version on 5/22/2023: postgresql-15.3-1-windows-x64
        - this will take awhile (15 mins approx.)
            - no need to check box for Stack Builder at end, but if you do: (installation was for 'PostgreSQL 15 (x64) on port 5432)
    
2. Setup PATH And system variables
- Setup path: Windows Search Bar > System Properties > Environment Variables > System Variables > select PATH > 'Edit' > Add the path where bin and lib are on your local ie. C:\...\PostgreSQL/15/lib > OK > OK > Apply
    - For me it was these two I added: 
        - C:\Program Files\PostgreSQL\15\bin
        - C:\Program Files\PostgreSQL\15\lib

3. Ensure the environment variables on your computer work:
- New way: 
    - Restart VSCode and Open a new command prompt in VSCode
    - Check version: psql --version
        - Should return 15.3
    - Open the psql command-line tool by running this in VSCode Command Prompt: psql -U userName
        - the default username will be 'postgres', so this is the call to make: psql -U postgres
        - after providing your password, the screen should have "postgres=#" before calls and looks something like this: 
    - Exit psql command-line tool: \q


4. Create your first database 
- Does not matter where you are directory-wise, we are going to delete this!
    - I did it in downloads since it was easy ie. I did this in command line before steps: cd "C:\Users\Myles\Downloads" 
- Steps: 
    - Enter into psql tool: psql -U postgres
    - Create a database: createdb --username=postgres --port=5432 --echo demodb
        - u or --username=: our username (default=postgres)
        - p or --port=: port
        - e or --echo: show the commands being sent to the server
        - end of call: name of database to be made
            - demodb works for now
            - can add a description with [...] after dbname (i did not do this)
    - If all of this worked, delete the database: dropdb --username=postgres --port=5432 --echo --interactive demodb
            - i or --interactive: Issues a verification prompt before doing anything destructive.
            - optional: --force (I had to use this when I got an error about 'dropdb: error: database removal failed: ERROR:  database "learning_database_indexes_db" is being accessed by other users')

- note: this documentation helps know how to make command line calls for this : https://www.postgresql.org/docs/current/app-createdb.html
    - this also can help: createdb --help
    - this helps for dropdb: dropdb --help

5. Setup directory for this example project that Clement made on SystemsExpert video
- CD into the directory of your project: cd "C:\Users\Myles\OneDrive\Documents\GitHub\algoexpert.io\SystemsExpert\12. Relational Databases\first_postgresql_instance"
    - Note: I actually don't know if this is necessary - just do it for good measure
- Create new database: createdb --username=postgres --port=5432 --echo learning_database_indexes_db
- Copy and paste Clement's code into tables.sql and queries.sql (this can be found in the google drive link at the end OR on his video on Systems Expert here: https://www.algoexpert.io/systems/fundamentals/relational-databases)
    - Note: We are not required to be running both entire scripts, as you will see in the next sections, but it is good to have this all organized/in order for simplicity.
- Check list of available databases: psql --list --username=postgres
    - You should see 'learning_database_indexes_db' under List of databases (there will most likely be 'postgres' and 'template0'/'template1' too, you shouldn't delete 'postgres' and simply can't delete those templates so don't worry)
    - You may need to use \q to exit this page...
- Connect to the database: 
    1. psql -h localhost --username=postgres --dbname learning_database_indexes_db
    2. \c learning_database_indexes_db
    - Your cmd should now look like this: 
    dkdksdkdk

- You just created this database so it should have no tables - confirm that with this SQL call: \dt

- Run command to execute .sql file: \i tables.sql
    - This script does the following:
        - Creates 3 tables
        - Inserts values into all 3 tables
        - Note: help can be found here: psql --help
    - If it worked correctly, you should see something like this: 
    klsdldklsd
    - Note: 'INSERT 0 1' is a good thing (see reference at top of document)
- The last will be 'INSERT 0 5000000000', and this will take 10-20 minutes possibly since it is SO much data
    - You can exit this command prompt alltogether now

7. Observe the power of Relational Databases and Postgres
- Queries
- Transactions
- Database Indexes

Follow along using scripts in 'queries.sql' to understand what is going on when we make certain queries/calls:

- Begin by opening 2 new command prompts that are both connected to our database, so we can simple copy/paste the SQL into command prompt instead of running .sql files everytime: 
    - cd into local directory: cd "C:\Users\Myles\OneDrive\Documents\GitHub\algoexpert.io\SystemsExpert\12. Relational Databases\first_postgresql_instance"
    - This call will get you into psql so you can make queries easily: psql -h localhost --username=postgres --dbname learning_database_indexes_db
    - Check we are in the correct spot by looking at list of relationship tables: \c learning_database_indexes_db ; \dt

Begin querying:

- Powerful Queries: these give you a basic idea of what you can do with SQL queries - there are obviously joins and whatnot but these examples are all 1 table:
    - For all 4 of these, you can use the same terminal

    - Run code for '1'
        - see how clement has 4 and it descends down to simon with 1 observation

    - Run query for '2'
        - see how there are 3 total months 

    - Run query for '3'
        - see how simon had payments in 1 month, but clement had payments in 3 different months 

    - Run query for '4'
        - see how january 2020 had max=300, february 2020 had max=1000, december 2019 had max=20 
    

- Transactions:

    - Clear terminal for cleanliness: \! cls
        - In cmd, this would be cls -> enter

    - Terminal 1 OR 2: Run this to confirm antoine has balance=0 and clement's is 1000: 
        - SELECT * FROM balances; 
    
    - Terminal 1: Begin the transaction: BEGIN TRANSACTION;
        - Notice how we started it but didn't make changes yet or commit yet 

    - Terminal 1 AND 2: Run the basic query again to see that both terminals have the same output
        - they should - nothing has been updated yet!

    - Terminal 1: Run the 2 lines of code following the 'BEGIN TRANSACTIONS:
        - UPDATE balances set balance = balance - 100 WHERE username = 'clement';
        - UPDATE balances set balance = balance + 100 WHERE username = 'antoine';
        - Note: If you get 'UPDATE 0', then something went wrong
            - that means 'you updated 0 rows'
                - i know this because I had been spelling Antoine wrong in some spots of my code

    - Terminal 1 AND 2: Run the basic query again to see that the outputs are NOT the same anymore
        - Terminal 1 has not committed its changed to the database yet, so Terminal 2 is still going to be looking at the old/stale version until T1 commits
            - This is the 'Atomicity' of the ACID Transaction

    - Terminal 1: COMMIT;
        - We can now look at both terminals and compare

    - Terminal 1 AND 2: basic query     
        - In both terminals, the basic query should return 900 for clement and 100 for antonie

- Transactions: Showing 'Isolation' of transactions
    - remember: ACID's I stands for Isolation, which essentially makes sure that "Multiple transactions can occur at the same time; but, ultimately it will execute as if they were done 1 by 1 in a queue

    - See it in action: 

    - Terminal 1: BEGIN TRANSACTION;
        - notice how the 'BEGIN' message flashes, telling us we have started our sequence

    - Terminal 1: Run the line of code that removes 100 from clement
        - notice 'UPDATE 1' meaning we have updated 1 row

    - Terminal 2: BEGIN TRANSACTION;
        - notice how the 'BEGIN' message flashes telling us we have started our sequence in this terminal

    - Terminal 2: Run the line of code that removes 100 from clement
        - notice we DO NOT get a message for 'UPDATE 1', meaning our transaction is 'hanging'
            - Until the transaction that was executed first in Terminal 1 is committed, the bottom terminal will continue to hang
            - This demonstrates the isolation

    - Terminal 1: COMMIT;
        - The update in terminal 1: has been recorded
            - if you do the basic select query, you will get clement 800, antoine 100
                - this is because clement's call to lose 100 more from terminal 2 has not been committed yet
    
    - Terminal 2: COMMIT;
        - Now, you will see that in both terminal we get clement 700, antoine 100
        

- Database Indexes:

    - Clear both terminals: \! cls

    - Shut down Terminal #2 (no longer needed)

    - Run Query #1 that grabs 10 rows that have the highest 10 values in random_int column, descending
        - Remember, 50 million rows is going to take some time to go through! (mine took 20 seconds)
            - In practice, you would probably create your index beforehand, but this is just for show

    - Run Query #2 that Creates a database index
        - Creating this index also takes around 20 seconds
            - That is OK because we want to create database indexes for queries we plan on using ALOT
                -  I had to wait a couple minutes for this process to complete. wait 1 time, then instant access after (just like in caching)
            - Next time we run the Query #1, it should take a very short time ie. .00001 seconds
                - Only downside is creating this 'auxiliary data structure' takes up space

    - Run Query #1 again
        - my 10 rows appeared in the terminal nearly instantly