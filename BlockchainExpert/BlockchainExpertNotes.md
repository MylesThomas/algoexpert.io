# BlockchainExpert

AlgoExpert.io

Learn Blockchain Developoment

https://www.algoexpert.io/blockchain/index

# 1 - Introduction

As the classic adage goes, "A journey of a thousand miles begins with a single step."

This is that first step. Welcome to BlockchainExpert!

## Notes from the video

### Why Blockchain Development?

Why Clement is so excited about the world of Blockchain/Blockchain Development:

- Up until very recently in the world Web2, we could only created centralized apps
    - Users: When we used a product or service, we had to give/trust a central power that controls the product or service
        - May not seem like a big deal, but it is!
            - The central power can prevent you from using the service, change the terms and conditions, etc., without you having any say in the matter!

            - Example: You lose access to your bank account tomorrow
                - The bank/government says they say suspicious actions
                - You now are no longer able to access it

            - Example: You lose all of your social media followers

            - Example: You lose all of your $ on some centralized exchange
            
            - Example: You are prevented from sending money to another person in another country
                - You may have to deal with outrageous fees

- Web3/Blockchain/Crypto comes in to fix these problems!
    - We can create fully decentralized applications
    - We can also inject some level of decentralization in centralized settings
        - Who people trust in a centralized setting:
            - Government
            - Politician
            - Company
            - Single individual

        - Who people trust in a de-centralized setting:
            - Code
            - Math
            - Cryptography
            - Open-source protocol that anybody has access to

        - This is incredibly impactful!
            - To add on, there is an economic shift
                - We can incentivize user participation in a network, by providing the users with tokens that appreciate once more users join the network
                    - This encourages the members of the community to get others to join 
                        - The cycle continues

Clement's final opinion: This is a transformative paradigm!
- As transformative as Web2/Internet 20-25 years ago
- The most exciting role to play in Blockchain: Builder
    - This is where BlockchainExpert comes in!

BlockchainExpert: Going 0 to 100 in the world of Blockchain Development in 1 place.

### Platform Overview

Tim (Tech With Tim) is the instructor for this course.

Overview/Features

BlockchainExpert Website
- Product page
- Content menu
    - Lesson
    - Assessments
    - Practice Questions
    - Project Walkthroughs
    - etc.

One thing to notice: Everything in BlockchainExpert is on 1 page!

Note: This is a living product - it will continue to grow and develop, so these videos could end up being a bit outdated with current features.

Core Features/Lessons:
1. Introduction
2. Blockchain Fundamentals
3. Ethereum And Smart Contracts
4. Solidity Fundamentals
5. Advanced Solidity
6. Interacting With Smart Contracts
7. Web3 Tools
8. Projects

One thing to note - Each lesson has the following:
- Time estimate (time to watch video content AND finish practice questions)
- Number of videos
- Number of practice questions

Let's take a look at an Example Lesson - Blockchain Fundamentals:
- Left-hand side: Progress in the Lessons
- Middle: Content
    - Each Lesson has the following:
        - video
        - key terms
        - practice questions
- Right-hand side: Glossary

Now that we have seen a Lesson, let's look at a practice question. Scroll down and click 'Test Yourself'

We are given a few questions, which you can go through with the Prev/Next buttons.
- Right now: Multiple Choice
- Later on: Coding Workspace

After you click through all of the questions, you will automatically go to the next Lesson.

Next, let's look at an assessment question, which is below Lessons on the main page.
- These are more challenging
    - You only want to look at these once you actually finish the assessment

- You can write and test all code on this screen
    - No need for IDE's or any outside coding!

Last big feature - Projects!

These projects will teach you the following:
- How to Write a Smart Contract
- How to Deploy a Smart Contract
- How to Test a Smart Contract
- How to Write a Frontend (that lets you interact with the contract)

If you click into the Project, you have 3 things to do:
- Watch the project walkthrough
    - Explains everything you need to do to finish from scratch
- Download Solutions
- View Github Repo

Last feature: The Certificate!
- Left-side of screen: Tracker to see your current progress
- You will have a certificate when you complete the following:
    - All practice questions
    - All assessment questions

At this point, you should be ready to use the BlockchainExpert platform!!

---

# 2 - Blockchain Fundamentals

Like with any field of study, we can only move forward by first mastering the basics. This course is dedicated to teaching you fundamental concepts and getting you from knowing nothing about blockchains to understanding the core principles that underpin them.

## Lessons

### 1 - Introduction to Blockchain And Web3

What is blockchain? What is Web3? And how are these concepts related?

#### Key Terms

##### Web 1.0

Web 1.0: First stage of the internet
- Also known as the "read-only internet"
- Focused heavily on providing information with limited focus on the following:
    - user experience
    - user generated context
    - web design

##### Web 2.0

Web 2.0: The era of the internet most people are familiar with
- Large focus on the following:
    - community
    - social media
    - user experience
    - how users interact with web pages (front-end user interfaces and design)

- Brought popularity for the following:
    - AJAX
    - JavaScript (for designing dynamic websites)

- Downsides of Web 2.0:
    - Data is controlled by intermediaries
        - Facebook
        - Google
        - Amazon
    - Privacy is limited

##### Web 3.0

Web 3.0: An idea for a new iteration of the world-wide web
- Focused heavily on the following:
    - backend systems
    - ledgers
    - decentralization
    - user immersion > interactions
    - share data (rather than have it be controlled by intermediaries)

- The following are prevalent in Web 3.0:
    - Blockchains
    - Artificial intellgience (AI)
    - Token-based economics

In Web 3.0, no one person/entity controlls the internet or services provided on it, instead it is distributed and decentralized.

#### Notes from the video

What we can expect to learn:
- Blockchain Fundamentals
    1. What is a Blockchain?
    2. How does a Blockchain work?
    3. How is it secure?

- Concepts:
    - Decentralization
    - Wallets
    - Transactions
    - Signatures
    - Blocks
        - First block vs. later blocks
        - How they are created/mined
    - Proof of work vs. Proof of stake

Aiming to learn all of the theoretical concepts!
- These are important to know before doing any of the development in later stages.

##### Full Video

###### Web 1.0 (Past)

Web 1.0
- Earliest stage of the internet (1991-2004)
- Browsing information
    - static pages
        - "read-only web"
    - not a lot of dynamic content

- Running advertisements was banned
- Mostly used for information and research
    - Styling did not matter

- Frames/tables used to position elements
    - Everything very "boxxy"

###### Web 2.0 (Current State)

Web 2.0
- Era of communities / community focused
- Worldwide websites which highlight user-generated content
- Large focus on UI/UX design
- Brought popularity of AJAX/JavaScript for dynamic websites
- User data owned / controlled by intermediaries
    - Google
    - Twitter
        - Example: Twitter owns your tweets + every piece of data you put on their platform

- This is most of the stuff you interact with today!

###### Web 3.0 (Future)

Web 3.0
- We see some of this today
    - Few years before we adapt most of these technologies (Bitcoin/ETH/Metaverse)

- Focus on backend systems, databases, ledgers
    - "How is data stored"
    - "How is data controlled"
        - Focus on the backend, whereas Web 2.0 focused on frontend

- Data is shared / owned by the network
    - Not owned by intermediaries

- Portable and personal
- Immersion over interaction
    - Everything you do revolves around Web 3.0
    - "You could live a life in the internet"

- Blockchain and Decentralization
- Artificial Intelligence

New technologies and a new look at the internet! (Focus is on the data)

###### Web 2.0 vs. Web 3.0

Example: Tweet (Posting content online)
- Web 2.0:
    - It is controlled by twitter.
    - They can do the following:
        - Censor
        - Remove your account / the tweet
        - Ban you from the platform

- Web 3.0:
    - Decentralized, the data is owned by the network as a whole
    - You make a tweet, once it is there, it is there forever! (cannot be changed/immutable)

Example: Paypal
- Web 2.0:
    - Lots of rules / regulations
        - When you sign up, you have to enter a ton of information
        - If you are in a certain country, you can only receive payment in certain currencies
    - They can do the following:
        - Shut you down
        - Make you unable to send payments
        - Make you unable to receive payments
        
- Web 3.0:
    - Platform that requires no personal data
        - No privacy concerns
    - You can send to anybody, in any currency
    - They don't need to know who you are / where you are
        - There may be fees, that is the main difference

Example: Rogers (Canadian Telecom company - similar to AT&T)
- Web 2.0:
    - Entire networks can go down
        - If a company doesn't maintain operations, this can occur
        
- Web 3.0:
    - Servers can NOT go down (it is nearly impossible)
        - They would be controlled/distributed around the world 
            - 100's of people running their own nodes
            - 1 single entity cannot bring you down

Note: This example shows how much of an effect 1 single company can have on an entire country's economy
- Event: Internet / Data was out for an entire day (Half of Canada did not have internet)
    - Rogers was trying to upgrade their servers and something went wrong. This impacted the following groups of people:
        - Restaurants
        - Businesses
        - People

###### Introduction to Blockchains

Blockchain
- A system of recording information in a way that makes it difficult/impossible to change, hack, or cheat
    - Being reliant on something like a modern day banking system, they can change whatever they want
        - It is possible to change/hack into that system

- Digital ledger of transactions
    - Duplicated and distributed across the entire network of computer systems on the blockchain
        - If a few computers go down/are hacked, the network would be secured and data safely stored

- Most important point: NOT owned by a central entity
    - We have not gotten into the architecture yet, so this will make more sense later on.

###### Takeaways

Web 3: Future of the internet
- De-centralized
- Distribute control so everyone has equal rights/control/access

Web 2: Mostly what we use today
- Data

###### Practice Questions

1. Which of the following characteristics most accurately describe the Web 1.0 ecosystem. Select all that apply.
- Read-only websites and static web pages
- No advertisements
- Primarily used for research and information access

2. Which of the following characteristics most accurately describe the Web 2.0 ecosystem. Select all that apply.
- User-generated content with focus on usability and interoperability
- Focus on front-end user interfaces and website design
- Social media, communities and interactions

3. Which of the following characteristics most accurately describe the Web 3.0 ecosystem. Select all that apply.
- Heavy focus on backend systems, databases and ledgers
- Immersion over interaction
- Data is not owned but shared amongst a network
- Blockchain, artificial intelligence and decentralized protocols

### 2 - Centralized vs Decentralized

Would you rather trust humans or mathematics?

#### Key Terms

##### Centralization

Centralization refers to concentration of control of an activity by a single organization or entity.
- Examples of centrally controlled entities:
    - Banks
    - Governments
    - Corporations

##### Decentralization

Decentralization refers to the transfer of control of an activity or decision making to a distributed network.
- Example: The bitcoin network is decenatralized
    - It is not controlled by a central entity, but by the participants in the network.

#### Notes from the video

##### Centralized Systems

Centralized Systems: Systems controlled by a single entity
- Most of the systems we interact with today are centralized, and we give a lot of trust to them
- Examples:
    - Google
    - Whatsapp
    - Coinbase
    - Amazon
    - Exchanges

- Anything that is centrally controlled
    - There is no notion of "fairness"
    - You need to trust a system in order to use it
        - We trust sites like Google, but what would happen if they were hacked?
            - If we lose trust, they cannot operate
        
Example: Coinbase (An exchange, more specifically a crypto currency exchange)
- Centralized
    - Seems decentralized because it is with crypto, but not true
        - You can be banned
        - You can be charged different fees
        - Certain countries may not get access

Note: Just because something has to do with Blockchain/Crypto, does NOT make it decentralized!

##### Decentralization

Decentralization: Process by which the activities of an organization are distributed/delegated away from a central location/group.
- Allows for trust-less interaction
    - You trust the network (made of many entities)
        - Trust in cryptography, math, etc.
        - You do not need to even trust the others on the network
            - No need to worry about malicious actors
    - You do NOT need to trust a single person/organization
- Systems that are distributed across multiple nodes
    - 1 person/node does NOT have complete control
        - If 1 node acts maliciously, you can just go to another one

##### Decentralization Advantages and Disadvantages

Advantages and Disadvantages
- Centralized:
    - Advantage: Fast flow of data (low network diameter, everything is going in/out 1 place)

    - Advantage: Simple to implement / highly performant
        - 1 central location allows for ease of use and higher performance

    - Advantage: Data conflicts are easily solved / synchronization is easy and clear
        - 2 versions of the same thing, easy to choose

    - Disadvantage: Single point of failure
        - Easy to take down / offline

    - Disadvantage: A central authority can sensor/change or delete data

    - Disadvantage: Participation is regulated by a central authority
        - "gatekeeping"

- Decentralized:
    - Disadvantage: Slower flow of data (Participants can be many edges away, larger network diameter)

    - Disadvantage: Harder to implement / lower performance
        - Lower throughput

    - Disadvantage: A complex protocol is needed to dispute data conflicts / synchronization is difficult
        - No single source of truth
        - Requires complex algorithms

    - Advantage: No single point of failure
        - Network still functions if a large portion of participants are offline

    - Advantage: Censorship is much harder
        - Nearly impossible to change/delete existing data

    - Advantage: Anyone can participate
        - no "gatekeeping"
            - asterisk/exception: monetary requirements to put up
                - many don't have this

##### Takeaways

You should now understand the differences, advantages, and disadvantages of Centralized vs. Decentralized!

Most of the time: Does NOT make sense to make something decentralized
- No need to do this with things like creating a website
    - Unless you really want to make sure everybody trusts it

If you are going for a trustless interaction with a system: Decentralized!
- That is why Blockchain is popular in places you cannot trust the central authority

##### Practice Questions

1. What definition best describes a decentralized system?
- "A system in which multiple parties are required to make their own independent decisions."

2. Which of the following are examples of a centralized system? Select all that apply.
- Banks
- Governments

### 3 - Ledgers

If you had to define blockchain using only one word, this would be it!

#### Key Term

##### Ledger

A ledger is simply a collection or store of financial accounts or information.
- Blockchain: A decentralized, distributed ledger of verifiable transactions.

#### Notes from the video

##### Intro to Ledgers

What a Blockchain is: A ledger!
- Goal: Keep track of the history of transactions

Ledgers: 

Example: We have 2 people/actors
- Situation: They give each other loans and pay for each other.
    - This is hard to keep track of, so they want to set up a system (a ledger)

- Ledger:
    - Bob -> ($1) -> Alice (Bob sends $1 to Alice)
    - Alice -> ($2) -> Bob
    - Bob -> ($1) -> Alice

    - This ledger is great, allows to keep track of who owes who!
        - Issue: It must be trusted by BOTH: Bob AND Alice
            - Need to trust each other, otherwise it is meaningless
            - Example: Bob goes into the ledger and rigs it so that Alice owes him $10 extra
    
Note: Bob and Alice are the typical names used for Crypto examples

So, how do we make it so that this ledger can be trusted by both parties?
1. Intermediary: Bank
- They don't trust the ledger, so they want something/someone to deal with security
    - Bank now stores the ledger
        - Bank records transactions and writes to the ledger

- In this scenario: Trust is no longer between Bob/Alice, but the trust is with the bank!
    - But, somebody from the bank could compromise the ledger
        - The ledger can still be manipulated
            - We are right back to the same underlying problem

Note: 99% of the time, this method will work just fine
- Politics and other things play into this, but usually this will be fine.
- Blockchain was created to help solve the other 1% of the time, where you cannot trust the intermediary!

Let's imagine that the bank was burned down. The ledger is now gone!
- Storing data in a central place allows for the possibility for it to be gone forever

Now, if we don't want a single person in control, we turn to Blockchain Technology and Ledgers.

##### Blockchains and Ledgers

Note: Blockchain and Ledger are synonymous

Blockchain: Ledger of transactions that are verified
- Traits:
    - Distributed
    - Decentralized
    - Publicly available

Note: We will talk about verification/validation later - for now just assume it is done.

Let's compare this to the bank:
- Traits:
    - Not distributed
        - Ledger stored in 1 place (if bank disappears, oh well!)

    - Not Decentralized
        - You must trust the central identity

    - Not publicly available
        - You may be able to see all of your transactions
        - Bank may remove your access at any time
        - You cannot view other's transactions

And back to the Blockchain Ledger, so we can expand on some of its characteristics:
- Traits:
    - Distributed: Each node stores a copy of the ledger
        - If one node goes offline/disappears, we still have access to the blockchain
            - This holds true even if a bunch of nodes disappear

    - Decentralized: A copy of the ledger is held by a bunch of different people/nodes
        - We don't need to trust a single entity/authority

    - Publicly available: Anybody can go and read the ledger from any of the different nodes
        - I can see any bit of history that has every occurred on the blockchain

##### Blockchain Properties

Listing out some more important properties:
- Immutable: unchanging over time
    - "cannot change or delete anything"

- Chronological: starting with the earliest, then following the order in which they occurred.
    - "everything is in order"
        - Necessary so that we can know the balance of accounts at certain times
            - We need to check if you have the balance to send something, among others

- Irrevocable: Unable to be changed/reversed/recovered/final.
    - once it is finished, it is done and will be there forever!
        - Similar to the immutable property

##### Examples (Bitcoin)

Important Distinction: There are many different blockchain networks
- Some are not distributed / decentralized, and have different properties than described here.
- All of the properties we went over apply to Bitcoin, and most standard blockchain technologies/coins
    - Later on, we will have a section on Ethereum and other blockchain networks

##### Practice Questions

1. A blockchain like Bitcoin is a distributed ledger of verifiable transactions.
- True

2. Ledgers are only utilized by blockchain technology.
- False

3. Select all of the propertiews of the Bitcoin blockchain ledger.
- Immutable
- Publicly Available
- Chronological
- Irrevocable
- Distributed

### 4 - Wallets

Just like their analog counterparts, wallets allow users to store their digital tokens on the network.

#### Key Terms

##### Private Key

The private key of an account acts as the password for that account. Any person with access to the private key can send/sign transactions and access the funds associated with that private keys account.
- Private keys should be stored in a secure location (ideally: multiple secure locations) and should never be shared online / with other people

##### Public Key

A blockchain accounts public key is derived from a `private key` and acts as the identifier for an account.
- Nodes on a network can validate transactions that were signed properly using an account's public key
- It is safe to share your public key

Note: a public key is a longer and less convenient form of an address.

##### Address

On Ethereum, an address is made of 20 bytes (160 bits or 40 hex characters) and is a more convenient and shorter version of an account's public key.

An example of an address: `0x71C7656EC7b88b098defB751B7401B5f6dd8976F`

##### Hash Function

Hash Functions are known as "one-way" functions that have no known inverse.
- They are the foundation of modern internet security and cryptography
- Hash Functions have the following properties:
    - Fast to compute
    - Generate a uniform output (ie. digest)
    - No known inverse
    - Deterministic (always produces the same text given a key, even over separate executions)
    - Very rare hash collisions

#### Notes from the video

##### What is a Wallet?

Wallet: Bank account on a Blockchain network
- Allows you to:
    - Send/receive funds
    - Store funds

What is in this video:
- How wallets work
- Terminology
- How to create them
- How they are secure

Preface: The fundamentals behind wallets are the same across different blockchain networks (typically - they are fairly consistent), but there may be different types of wallets.
- Everything you learn here will apply to 99% of networks, including Bitcoin.

##### Private Key, Public Key, and Addresses

First, we will break down the architecture of a wallet.

Wallet
- The following 3 items are all correlated to one another:

1. Private Key: Password to your wallet
- Most important - You cannot lose this!
    - Store it offline in multiple locations
    - If you lose the private key, nobody can access the funds in your wallet!
        - Unlike at a bank, where you can call the Bank and re-gain access

- What it is: 64 digit hexadecimal string (long string of random numbers)  
    - Randomly generated 
    - There can be an infinite amount of wallets
    - Anybody can generate a private key at any time
        - This will create the wallet

- Typically: The private key can be encrypted
    - What an encryption is: Taking some data (the string of private data) and scrambling it with another piece of data (our personal password)
        - Once these 2 are passed through the encryption algorithm, and it spits out a bunch of random characters. This is the encrypted data!
            - To view the encrypted data, you need to de-crypt it with the password.

Summary of how this works:
- Private key is given to user when Wallet is created
- You make a password
- Private key + password are run through encryption algorithm
- We have an encrypted private key
- To get private key back, we run encrypted private key and password through a de-cryption algorithm
- The de-cryption algorithm spits out the private key

Reminder: Private key is the most important!
- Treat it like your ID, you need it to own the funds in your wallet

2. Public Key: Unique Identifier for your wallet
- When you create your private key, you pass it through a hash function
    - From the private key, the hash function spits out your public key!

- Public key: Another random 64 digit hexadecimal string (long string of random numbers)
    - Very tedious to deal with/type out

- Point of a public key: You can verify digital signatures with the public key's encryption and ability to be freely shared
    - Because of hash function, it is nearly impossible to derive your private key from having the public key
        - This has to do with properties of hash functions, but more on this later

3. Address: The thing we give to people, for them to send us stuff (funds)
- Once you have the public key for a wallet, it goes into another hashing function.
    - From the public key, the hash functions spits out your Address!

- Point of having an Address:

    - Reason #1: Allows other users to send your funds
        - We generate an address that is in a much more readable format than the public key
            - Bitcoin: Will be between 27 and 34 characters, so it is easier to use

    - Reason #2: It also adds 1 more layer of security
        - There are ways of guessing private key from having public key, so this makes that malicious user having to guess the public key and then the private key as well

    - Reason #3: One some blockchain networks, you can generate multiple addresses
        - If you have multiple addresses pointing back to the same public key, you can distribute them and organize where funds are coming from

Summary: This process all starts at the Private Key!

At this point, it seems like the wallet may not be secure, and that is because we don't understand everything yet. Once we understand how Hash Functions work, we will have a better understanding!

##### Hash Functions

Hash Functions: The basic security mechanism behind our wallet
- How it works:
    - Take your private key
    - Feed it into a hashing function
    - Hashing function outputs a public key

Traits of a hashing function:

- No known inverse
    - How does a hashing function "work":
        - Think of an equation: y = f(x)
            - input (x): Private key
            - function (f): Hashing function
            - output (y): Public key

        - Usually, with a function, you can find the inverse of the function ie. f-1(y) = x
            - If you would just "reverse engineer" the Private key, then this system would not work.
            - With a hashing function, you cannot easily find this
                - It is nearly impossible mathematically!

                    - Note: Hash functions are complicated, so we will save on learning the math behind there being no inverse for the hash functions. Theoretically, there is an inverse, but humans and computer have yet to find one.

    - One way that malicious users try and guess the private key (input) to a hashing function:
        - Givens/Inputs:
            - Hashing Function
            - Output (Public key)
        - Process:
            - The user will keep feeding random inputs into the hashing function, until they find an output that gives them the output they are searching for!
                - It could take millions of years to find the inverse this way...


- Speed: Nearly instant to check a hash
    - Hashing Functions are complex, but are very fast to compute

- Uniform outputs: The output will have specific properties
    - Properties::
        - Same length of characters (64 hexadecimals, or can be within a character bound)
            - Important because when generating a public key, it needs to be a certain number of characters

- Deterministic: Same input gives the same output
    - If you pass in X, you will get Y
        - This is important because if we want to unlock a wallet (prove it is ours), we have to pass in a private key as proof
            - If the hash function gives us a different public key, then we will not be able to verify that the wallet is ours

- Hash Collisions: Very rare collisions
    - Collision: 2+ different inputs (private keys) that give the same y (public key)
        - Doesn't really happen in practice
            - Similar to "no known inverse", not mathematically impossible

- Hash digest: 
    - x -> f(x) -> digest
        - When you generate the output from a hash function, it is a 'digest'


Takeaways on Hashing Functions Attributes:
1. No known inverse
2. Fast to compute
3. Generate uniform outputs
4. Deterministic
5. Hash collisions are rare/impossible
6. Hash outputs are referred to as the 'digest'

##### Summary/Recap

Summary:
- Private key: Random 64 digit hexadecimal string
    - Generated when we want to create a wallet on a blockchain network
    - We don't share this with others
        - Private password
    - This allows us access to the wallet and its funds

- Public key: Random 64 digit hexadecimal string
    - Created by passing the private key through a hashing function with no known inverse
    - 

- Address: 27-34 character string (easier to read)
    - Created by passing the public key through a hashing function
    - More readable version of the public key
    - More secure than the public key
        - If you tried to get the private key, you now need to do an entire extra step

    - Note: It is possible to have multiple addresses for the same 1 public key

##### Seed Phrases

Almost forgot this section!

Seed Phrases: Backup / recovery code
- You are given this when you create a wallet application
    - Typical format: 12 or 24 words
        - 2048 total words in the pool that make this up
    - You usually write down the seed phrases offline

- Allows you to get your private key and recover your account
    - Sort of an "encryption" of the private key

Note: If you're curious, this has to do with the BIP39 (Bitcoin Improvement Proposal number 39), which describes how cryptocurrency wallets generate mnemonic phrases and convert them into binary seeds, which can be used to create deterministic wallets.

##### Practice Questions

1. Select all true statements as they relate to a Private Key.
- Private keys are typically encrypted with a password.
- You should never share your private key.
- Private keys can be thought of as the password to a Bitcoin (or other cryptocurrency) account.

2. It is safe to share your Public Key with others.
- True

3. Which of the following are properties of a cryptographic hash function? Select all that apply.
- Fast To Compute
- Generate a Normalized Output (e.g. same length)
- Have No Known Inverse
- Deterministic
- No Or Extremely Rare Collisions

4. The address of a Bitcoin account is the same as the public key.
- False

### 5 - Transactions

A self-explanatory term, transactions are the mechanism that allows us to send value across cyberspace.

#### Key Term

##### Digital Signature

In the context of blockchain networks, a digital signature is attached to a message or transaction to prove that the sending user has adequate permissions.
- To create a digital signature, you require the following:
    - The private key (a.k.a. signing key) associated with the public key of the sender of the transaction

#### Notes from the video

Transaction: Fundamental to understand
- This is how we send money or tokens across the Blockchain
    - We create a transaction, and the transaction has the information submitted to the blockchain network
        - It then verifies that we can actually transfer funds
        - Just like a bank, we create a transaction when we want to send funds/tokens

This video will focus transactions on Bitcoin.

##### Transaction Properties

Composition of a Transaction:

- From Address: Whoever will be sending
- To Address: Whoever we are sending to
- Amount: How many tokens we are sending
    - Example: 0.1 BTC
- Signature (Digital Signature): 
    - Secures the transaction (Proves you are owner of account, who can send the funds)
- Gas/Fee
    - Name depends on network, but either way it is the fee that pays the miners to allow our transaction to be added to the Blockchain network
        - Amount of fees/gas depends on a few things (more on this later)
- Tx hash (Transaction Hash)
    - A hash of all of this information above!
    - Point of this: A unique identifier for the transaction

Once you submit:
- Timestamp
    - We don't manually add this, though

So, the things you actually need to add YOURSELF when sending a transaction, are:
- To
- Amount
- Gas (pre-generated)

Note: Most modern wallet do the From, Digital Signature and Tx hash for you.
- You only need to put these in manually if you are writing your own wallet program

ETH Note: This works similarly to Bitcoin, but not the exact same
- When dealing with Ethereum, all of this holds true, except 2 more fields matter:

    - nonce: confirmed transaction counter for this specific account
        - first transaction sent from an address: nonce = 0
            - it uniquely identifies transactions sent from an account.
            - why we have this? for blockchain security features.

    - data: we need to be able to submit data up to the blockchain (since it supports smart contracts) 
        - contains examples like:
            - what function is called on a smart contract
            - compiled code for a smart contract

This is the makeup of a transaction!

##### Transaction Lifecycle

1. Creating the Transaction: Create the transaction with all of the properties that we have discussed so far.

2. Submit to Transaction Pool: As part of blockchain, we have the Transaction/Tx pool
- This is where transactions go before they actually make it to the blockchain
    - Miners and validators read from the transaction pool
        - What the minors do:
            - Take the transaction
            - Verify that it is correct (based on digital signature)
            - Submit it to a transaction pool
            - Minors/validators on the network start assembling a "block"
                - This block has a bunch of transactions (not just ours!)
            - Once they have a block that meets requirements, they will submit the block to the blockchain, where it will be added and applied to our transaction
                - Permanently added, unless something sketchy/nefarious was going on.

Notes:
- We will talk more about blockchains and mining algorithms in later videos
- This process can take awhile to be confirmed

##### Transaction Inputs and Outputs

Let's take a closer look at creating the transaction:
- Most is on outputs side
- For inputs, we must prove we have enough balance in our account to send this transaction
    - We provide other transactions as inputs for this new transaction!
        

- Inputs:
    - Transactions (More specific: The hashes of transactions in your account)
        - Pass into the transaction we are trying to create, a bunch of past transactions with amounts received that sums to >= the amount + fees/gass you are trying to send
            - This will show that you have enough funds available

- Outputs:
    - To Addresses: Who we are sending money to
        - On some networks, you can send to multiple places

    - Amount: How much we are sending

    - Fee/Gas: For Bitcoin, the gas is how much we submit with the transaction for the minors to use and prioritize sending our transaction
        - Minors look at all transactions in the pool, and depending on the volume in the network, they will select transactions with the highest gas fees
            - They receive that fee if they are able to submit that transaction on a valid block
                - So, obviously, they will pick transactions with higher fees first!
                    - There is a minimum fee though, if you go below, your transaction is not going to get picked up (more on this later)

    - Change: How much money/BTC is returned to YOU
        - Why we need this: Inputs
            - Example: Your past transactions show you have 6 BTC, this new transaction took an amount of 5.5 BTC with gas of 0.1 BTC, so your change will be 0.4 BTC!
                - Change = (6.0 - 5.5 - 0.1) = 0.4

            - How to understand this: You will use all 6 BTC from the inputs, and once the transaction goes through, the remaining 0.4 BTC goes to your wallet. (This is your net balance)

What all of this does:
- Keeps an entire history on the Blockchain of transactions
    - Where funds are coming from/going to
        - You can see where input money for each transaction came from
            - can see all of the wallets that the BTC went through
            - "forever log"

##### Digital Signatures

Digital Signatures: Your proof that you have the ability to send a transaction

Example:
- We have a transaction with a bunch of data, inputs, outputs. This data is known as the "message"

- Step #1: First, get the transaction hash.
    - Message: Autofilled by Wallet
    - Hash function: What we run the message through
    - Transaction hash: The output from the hash function
        - What the transaction hash does: It includes all of the data from the message
            - if you change an input/output, the hash becomes associated with something different

- Step #2: Next, now that we have the transaction hash, we must generate a digital signature for it.
    - Aside: When talking about digital signatures, we have 2 aspects:
        - Signing Key (Private Key): Used to sign the transaction hash.
        - Verification Key (Public key): Used to de-crypt the signature + determine the transaction hash that is associated with it.

    - Back to the steps:
    - Take the signing/private key and the transaction hash, and put it through a signing function.
        - Signing function = Encryption function
            - What it does: Takes these 2 pieces of data, encrypts the transaction hash WITH our signing/private key
                - This signing function outputs a 'Signature'

Note: Encrypted Transaction Hash == Signature

- Step #3: Next, now that we have the signature, we submit the signature alongside our transaction data to the blockchain network / transaction pool.
    - If our gas fee is high enough, a miner will pick this transaction up and try to add it to a block.
    - While they are doing that, they will verify that the transaction is valid by using the signature
    - How this works:
        - Take the "message" data and hash it, creating their own transaction hash
        - They will then take the verification/public key + the signature, run it through a verification function (therefore de-crypting the signature)
            - The decrypted Signature is a 2nd transaction hash
        - Verify/Check now that transaction hash 1 == transaction hash 2
            - If they match: Transaction is submitted on the Blockchain network!

Note: We will not go over signing function OR verification function, as those are beyond the scope of this tutorial.

That is how a digital signature works!

One more summary of this process:
1. Take the "message" data and hash it
- That gives us the transaction hash.

2. Take the signing/private key, with the transaction hash from step #1, and encrypt the transaction hash
- This gives us the Signature.

3. We submit the signature + transaction data to the blockchain network / transaction pool.

4. Miners take our verification/public key + the Signature and de-crypt it
- This gives the miner a 2nd transaction hash

5. Miners verify that the following match:
- Transaction Hash #1 (Output from Step 1)
- Transaction Hash #2 (Output from Step 4)
    - If they match, the signature we submitted IS correct for this transaction, it is valid, and the transaction can be submitted onto the Blockchain Network! 


What happens if we change ANY part of the transaction "message":
- The Signature is now old and not valid
    - The transaction hashes won't match later on when you try and compare 1/2
    
##### Summary/Recap

Summary: We are creating a transaction:
- Outputs/Need to specify:
    - To
    - Amount
    - Fee/Gas
    - Change to receive back

- Inputs:
    - Past transactions on the Blockchain
        - They must sum to be >= (amount + fee/gas)

- Message: All of the above input/outputs ie. all data associated with the transaction is the "message"

- Submitting the transaction:
    - Hash the message: message -> f(x) -> transaction hash
    - Create a signature of that transaction hash: (Signing/Private key + transaction hash) -> s(x) -> Signature/Sig
    - Submit the Signature/Sig with the message/transaction data to the blockchain network
    - Once a miner picks the transaction up from the pool, they will verify that the Signature is correct AND for this transaction by de-crypting it: (Verification/Public key + Signature) -> v(x) -> transaction hash

Assuming transaction hash 1 == transaction hash 2, we add the transaction to the Blockchain, and call it a day!

##### Practice Questions

1. Which of the following answers correctly outlines the process to create and submit a transaction to the Bitcoin network?
- Create The Transaction -> Hash The Transaction -> Digitally Sign The Hashed Transaction -> Submit To Bitcoin Network

2. Each transaction requires a unique digital signature (i.e. a signature is dependant on the transaction).
- True

3. When creating a Bitcoin transaction you must provide the inputs and outputs for that transaction. What input(s) are required for each transaction?
- Transactions Proving Sufficient Balance

4. Above is a simplified Bitcoin transaction showing the inputs and outputs to Transaction C. If you wanted to send a total of 7 Bitcoin in Transaction C, what would the "output" and "change" amounts need to be?
- Output: 7, Change: 2.8

Note: We are told that the Output is 7. We are also given that the gas is 0.1, so this ends up being the formula to calculate Change:
- Inputs = Outputs
- (Input 1 + Input 2) = (Output + Change + Fee)
- (6.5 + 3.4) = (7 + x + 0.1)
- 9.9 = 7.1 + x
- 2.8 = x = Change

### 6 - Blocks

The essence of blockchain.

#### Key Terms

##### Block

In typical blockchain networks (such as Bitcoin and Ethereum) a block is a place where blockchain data (like transactions) is stored.
- In the Bitcoin Blockchain network, blocks contain the following properties:
    - Magic Number
    - Block Number
    - Block Size
    - Transaction Count
    - Transaction Data
    - Version
    - Previous Block Hash
    - Hash Mertle Root
    - Timestamp
    - Bits/Difficulty
    - Nonce
    - Block Reward
    - ...

##### Genesis Block

On the Bitcoin blockchain, the Genesis block is the first block ever created.
- It contains special information about the blockchain network as a whole.

##### Nonce

A nonce is a special number that is added to the contents of a block by miners.
- Nonce is used to make the hash of a block start with a certain number of zeros
    - This provides the 'proof of work' for a block

#### Notes from the video

This video, we will learn why it is actually called the "Blockchain".

##### Blockchain Overview



##### Blockchain Data



##### Genesis Block


