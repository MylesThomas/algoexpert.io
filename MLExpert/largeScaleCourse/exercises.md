# Examples in Videos

## Setup

[Link to AWS - Dashboard for EC2 Console](https://us-east-1.console.aws.amazon.com/ec2/home?region=us-east-1#Home): 

Ryan appears to be working from an EC2 (Amazon Elastic Compute Cloud), which is Amazon's way to provide scalable-computing capacity in the AWS Cloud

[Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts.html)

### Features of EC2:
- Virtual computing environments (instances)
  - Various configurations of CPU/memory/storage/networking capacity (instance types)

- Secure login
  - AWS stores public key, you store private key

- Persistent storage volumes (Amazon Elastic Block Store/EBS volumes)

- Multiple physical locations for your resources (instances/amazon EBS volumes)
  - regions
  - availability zones

- Virtual networks you can create that are isolated from the rest of AWS Cloud
  - Virtual Private Clouds (VPCs)

### How to get started with Amazon EC2











## Lesson 2 - Data Ingestion








































































## Setup Before Following Along

### Download Java

1. Make sure I have Java 8+ Installed
- If not, Download: [Link](https://adoptium.net/)

2. Add to PATH system variables: C:\Java\jdk\bin
- Had to rename jdk and make a new Java folder to get this

3. Restart Computer

4. Checks:
Command Prompt: 
- java -version
- javac -version
Install VSCode Extensions:
- Extension Pack for Java

### Download Kafka

1. Download the latest Kafka release
- Link: https://www.apache.org/dyn/closer.cgi?path=/kafka/3.4.0/kafka_2.13-3.4.0.tgz

2. Extract the .tgz file
- tar -xzf kafka_2.13-3.4.0.tgz
- cd kafka_2.13-3.4.0

Note: After unzipping, I moved the folder '' to C:\Users\Myles
- ie. cd C:\Users\Myles\kafka_2.13-3.4.0

3. Checks: 
- cd kafka_2.13-3.4.0
- bin\kafka-topics.sh --version 
- OR, from C:\Users\Myles: kafka_2.13-3.4.0\bin\kafka-topics.sh --version

This will load up a .sh file from the Kafka directory.

Note: [Not sure if there's a convenient way, but you can just inspect your kafka/libs folder. You should see files like kafka_2.10-0.8.2-beta.jar, where 2.10 is Scala version and 0.8.2-beta is Kafka version.](https://stackoverflow.com/questions/27606065/how-to-find-the-kafka-version-in-linux)


### Download Hadoop

1. Download and extract Hadoop
Download Hadoop 3.2.1 from the archive
- Link: https://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-3.2.1/hadoop-3.2.1.tar.gz
- Click the link to the right of "The object is in our archive"
    - I downloaded the .tar.gz here: C:\Users\Myles

Extract the .tar.gz file
- Extract: tar -xzf hadoop-3.2.1.tar.gz (I got 4 errors, don't worry about it)
- Remove file we don't need: rm hadoop-3.2.1.tar.gz
    - Make sure /bin folder is here: C:\Users\Myles\hadoop-3.2.1\bin

2.  Install Hadoop native IO binary
- cd C:\Users\Myles\Downloads
- git clone https://github.com/cdarlint/winutils.git
- Delete the 'bin' folder from your local computer ie. rmdir C:\Users\Myles\hadoop-3.2.1\bin
- In this new repo from Github, copy the contents of your Hadoop (3.2.1) into hadoop/bin
  - Your C:\Users\Myles\hadoop-3.2.1\bin has now been restored with the native IO binary

3. Install Java JDK
- I already have this installed, just make sure you know where jdk is located ie. C:\Java\jdk\bin

4. Configure environment/PATH variables
Start by adding 2 USER variables:
- JAVA_HOME: C:\Java\jdk
- HADOOP_HOME: C:\Users\Myles\hadoop-3.2.1

Add the PATH variables:
- C:\Java\jdk\bin
- C:\Users\Myles\hadoop-3.2.1\bin
- C:\Users\Myles\hadoop-3.2.1\sbin

You can add these too:
- * %JAVA_HOME%\bin
- * %HADOOP_HOME%\bin
- * %HADOOP_HOME%\sbin

Restart computer, and now check if hadoop command is available:
- hadoop -version

echo %JAVA_HOME% 
echo %HADOOP_HOME%
echo %PATH%

5. Configure Hadoop

 hadoop-3.2.1\etc\hadoop has 4 important files that we need to change:

- core-site.xml:

``` xml
<configuration>
  <property>
    <name>fs.defaultFS</name>
    <value>hdfs://localhost:9000</value>
  </property>
</configuration>
```

- hdfs-site.xml

Note: Before changing hdfs-site.xml, do the following:
- cd C:\Users\Myles\hadoop
- mkdir data
- cd data
- mkdir datanode
- mkdir namenode

(These folders are important because files on HDFS resides inside the datanode.)

``` xml
<configuration>
  <property>
    <name>dfs.replication</name>
    <value>1</value>
  </property>
  <property>
    <name>dfs.namenode.name.dir</name>
    <value>C:\hadoop\data\namenode</value>
  </property>
  <property>
    <name>dfs.datanode.name.dir</name>
    <value>C:\hadoop\data\datanode</value>
  </property>
</configuration>
```

- mapred-site.xml

``` xml
<configuration>
  <property>
    <name>mapreduce.framework.name</name>
    <value>yarn</value>
  </property>
</configuration>
```

- yarn-site.xml

``` xml
<configuration>
  <property>
    <name>yarn.nodemanager.aux-services</name>
    <value>mapreduce_shuffle</value>
  </property>
  <property>
    <name>yarn.nodemanager.auxservices.mapreduce.shuffle.class</name>
    <value>org.apache.mapred.ShuffleHandler</value>
  </property>
</configuration>
```

We have 1 more file to edit: hadoop-env.cmd

Change line 25:

``` xml
set JAVA_HOME=C:\Java\jdk\bin
```


- Note: If you have not already, you will have to move the folder jdk-17.0.7.1 to C:\Java instead of its current location 
  - old: C:\Program Files\Eclipse Adoptium\jdk-17.0.7.7-hotspot\bin
  - new: C:\Java\jdk\bin

Note:
- Make sure to update PATH for system variables to have new C:\Java\jdk\bin
- Before proceeding, Restart computer and run javac/java -version to see if Java is not broken


4. Set the environment variables
- User variables: HADOOP_HOME = C:\hadoop\bin
- System variables: PATH append C:\hadoop\bin AND 

5. Check that Hadoop has been successfully installed
Command Prompt: hdfs namenode -format





# OLD

# Kafka / Zookeeper Setup

Steps:

# 1. GET KAKFA

1. Download the latest Kafka release
- Link: https://www.apache.org/dyn/closer.cgi?path=/kafka/3.4.0/kafka_2.13-3.4.0.tgz

2. Extract the .tgz file
- tar -xzf kafka_2.13-3.4.0.tgz
- cd kafka_2.13-3.4.0

Note: After unzipping, I moved the folder '' to C:\Users\Myles
- ie. cd C:\Users\Myles\kafka_2.13-3.4.0

# 2. START THE KAFKA ENVIRONMENT
Note: Make sure you have Java 8+ installed
- Apache Kafka can be started with ZooKeeper or KRaft, we will use Zookeeper:

0. Make sure I have Java 8+ Installed
- Download: [Link](https://adoptium.net/)
- Add to PATH system variables: C:\Program Files\Eclipse Adoptium\jdk-17.0.7.7-hotspot\bin 
- Restart Computer
- Command Prompt: 
    - java -version
    - javac -version
- Install VSCode Extensions:
    - Extension Pack for Java

1. Start the ZooKeeper service
- Powershell #1: bin/zookeeper-server-start.sh config/zookeeper.properties

Note:
- You should see '... binding top port 0.0.0.0/0.0.0.0.2181'

2. Start the Kafka broker service
- Powershell #2: bin/kafka-server-start.sh config/server.properties

Notes:
- Powershell #2 (where Kafka is being started) should say "waiting until connected (to zookeeper)"
- Powershell #1 (where Zookeeper is already started) should say "Creating new log file"
- Powershell #2 (where Kafka is being started) should say "[KafkaServer id=0] started"

Note: Once all services have successfully launched, you will have a basic Kafka environment running and ready to use.
- Zookeeper(left): Server is started at PORT=2181
- Kafka(right): Server is started at PORT=9092


# 3. CREATE A TOPIC TO STORE YOUR EVENTS
Note: events are organized and stored in topics. 
- Very simplified, a topic is similar to a folder in a filesystem, and the events are the files in that folder.

Create a topic
- Powershell #3: bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

Optional: Describe the topic - this function can show you details such as the partition count of the new topic:
- Powershell #3: bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092
- All of Kafka's command line tools have additional options: run the kafka-topics.sh command without any arguments to display usage information.

# 4. WRITE SOME EVENTS INTO THE TOPIC
Run the console producer client to write a few events into your topic.
- Powershell #3: 
    - bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
    - This is my first event
    - This is my second event
    - Ctrl-c

# 5. READ THE EVENTS
- Command Prompt #4: 
    - bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
    - Ctrl-c

Optional: Feel free to experiment: for example, switch back to your producer terminal (previous step) to write additional events, and see how the events immediately show up in your consumer terminal.
- Because events are durably stored in Kafka, they can be read as many times and by as many consumers as you want.
    - You can easily verify this by opening yet another terminal session and re-running the previous command again.


References: 
- [APACHE KAFKA QUICKSTART](https://kafka.apache.org/quickstart)
- [hADOOP SETUP](https://gist.github.com/vorpal56/5e2b67b6be3a827b85ac82a63a5b3b2e)
