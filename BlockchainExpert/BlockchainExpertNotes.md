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

##### Practice Questions

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

---

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

Blockchain: Sequence of blocks that are linked in chronological order
- Stored in different transaction data
- Stores log of every event/transaction that has happened on the blockchain

How to create a block:
- Miners look at the transaction pool, collect a bunch of transactions, and then attempt to create a block
    - Transaction pool: These are transactions that have been submitted, but not verified yet
    - Miners: A bunch of computers

- If a block is successfully created, this block gets submitted to the blockchain and added to the chain
    - Assuming this is not a fraudulent block.

This is a quick recap of what goes on with the blocks

##### Blockchain Data

What is actually on these blocks / what makes up a block:
- Magic number: Constant value for all of the blocks that are part of a blockchain network
    - This is to differentiate from other blockchain networks
    - Example: All blocks in Bitcoin Blockchain Network have the same magic number
        - Test networks, that people can play with for free, have a different magic number

- Block Size: Max amount of data / size limit of the block
    - It will not always be this size, but this is the max amount for a single block
    - Example: Bitcoin block size is 1 megabyte
        - (not that much... this is why it can be slow to store transactions)
    - Huge debate: What would happen if we increase the block size?
        - Pros: More transactions per block
        - Cons: 

- Block Header: Contains metadata about the block

- Transaction Count: # of transactions stored on the block

- Transaction Data: All transaction data (from the last video)
    - The bulk of the block

- Version: Version number of the block

- Previous Block Hash:
    - Very important: This links the blocks together! (Think of a LinkedList)
        - Example:
            - Block 1
            - Block 2
                - stores a reference to the previous block
                - it stores the hash of block 1
                    - Block 1 -> Hashing function -> Hash of Block 1 -> Stored on Block 2 as prevHash
                        - We can re-hash the prevHash (to ensure that the hash of the previous block is same as the prevHash on the current block)
                            - Tease for later: If you change any data in the previous block, this will change what needs to be stored in the current block.
                
- Hash Merkle Root: 
    - Complex topic we don't need to get into (Think of a binary tree storing hashes)

- Timestamp: When the block was created/added to blockchain

- Bits/Difficulty: Difficulty rating of the block
    - As the Bits increases, it becomes more difficult to mine that block
        - We will talk about this more during Proof of Work/Stake

- Nonce: Special number that proves work has been done sufficiently, and this block is valid
    - Determined by miner

- Block Reward: How much Bitcoin is given to the miner who successfully mines the block
    - This is what encourages miners to participate in the Bitcoin network
    - Can change (will decrease as a network gets older)
        - Back in 2009, the reward for the 1st bitcoin block was 50 (!!!) BTC
        - In 2012, this was halved to 25
        - In 2016, this was halved to 12.5
        - In 2020, this was halved to 6.25
            - This will continue to occur 

That is it for what is on a block!

##### Genesis Block

Next, let's talk about the 1st block on the blockchain - this is an initialization block with special properties.

In the last section, we talked about what properties a regular block has.

In this section, we will talk about the 1st block on the Bitcoin network, which is known as the "Genesis Block".

This block contains all of the data from before, plus the following fields/properties:
- Difficulty & Difficulty Interval
    - Difficulty (currently): Number of bits 
    - Difficulty Interval: How it is increasing/decreasing
        - Example: Increase every x blocks (this is beyond the scope of this video)

- Mining Reward & Reward Changes
    - Mining Reward (currently): Number of BTC your reward is
    - Reward Changes: How it is increasing/decreasing over time
        - Regular/Bitcoin: Decreases over time
        - Some coins: Increases over time
            - This is like a bank printing more money, it puts more in circulation and therefore de-values the currency
        - Note: This reward is new coin
            - Every time someone is rewarded with BTC, that is a new version of the coin (new instance)
                - You are increasing the supply/circulation
            - In some blockchain networks, the reward comes 0 coins, and all the miner receives is the gas/transaction fees from assigning transactions into a block

- Circulating Supply: Amount of coins that are circulating
    - With Bitcoin, there is a Max Supply (21 million)
        - What this means:
        - There will never be more than that in circulation
            - When this video was made: 19.1M BTC in circulation
            - Every 10 minutes, 6.25 BTC are added to circulation
            - Projection: We will hit 21 Million in _

        - Note: Quick conversation about the Genesis Block
            - When the genesis block was created by Satoshi, he was the one mining the block and subsequent blocks
            - When he received his first 50 BTC reward, only 50 had been minted/created/in circulation, but still a Max Supply of 21 million
            - Now, BTC comes into circulation at a much slower rate
                - This makes it a much more valuable asset

##### Practice Questions

1. What is the name of the first block in the Bitcoin network?
- Genesis Block

2. Blocks on the Bitcoin blockchain have an unlimited size that is based upon the number of transactions that happened before that block was mined.
- False
    - The size of a block is fixed at ~1 megabyte, this cannot change without changing the Bitcoin protocol.
    - Block size of 1 MB ~ 2000 transactions

3. In reference to the Bitcoin blockchain, what is a nonce?
- A special number determined by Bitcoin miners

4. Which of the following pieces of information must be included in a new block? Select all that apply.
- Nonce
- Block Header
- Transaction Data
- Previous Block Hash

### 7 - Blockchain Security

What are some security risks with blockchain and how do we avoid them?

#### Key Terms

n/a

#### Notes from the video

In this video, we will look at blockchain security concerns.

##### Double Spending

Starting out, let's look at a few potential problems when you have a blockchain network and you are trying to keep track of transactions:

First, when talking about any sort of digital ledger, we need to be concerned about Double Spending.

Double Spending: Occurs when someone is able to spend the some coin/amount of money multiple times
- Example: Handing somebody a dollar bill: Nothing to worry about, the money is in other hands.
- Example: Bank Ledger/Digital ledger: Have to be very careful, since spending the same $1 would be problematic

- How to avoid Double Spending?
    - Keep a history of every transaction that has happened on the blockchain
    - Proving sufficient balance before being allowed to send money
    - What happens if somebody tries to use the same set of transactions as the inputs to multiple new transactions?
        - We can go into the blockchain history and see that those inputs have already been used. That transaction will be nullified.

##### Transaction Order

The next problem/concern with the Blockchain has to do with order.

Remember, the blockchains are chronologically ordered. To expand on that:
- Blocks on the Blockchain: True, these are in order
- Transactions that make up Blocks: False, these are not in order
    - Miners do NOT select transactions based on the order they were submitted
        - The blocks are made up of ~2000 transactions, and inside of the blocks, the transactions are NOT always chronologically ordered.
    - Miners DO select transactions based on how high their fees are/other incentives.

So, now we know that transactions are not necessarily in chronological order. Let's talk about why this can be problematic:
- Theoretically, you can submit multiple of the exact same transactions
- You could also submit to the transaction pool multiple transactions that have the same inputs.
    - There can be problems adding these to the blockchain

Example:
- You submit 3 transactions to the transaction pool
- The first one gets picked up by a miner and ends up in the 1st block
- During the creation of block #2, another miner picks up one of your other 2 remaining transactions
- Because this transaction has already been done / these inputs have already been used, this should not be valid.
    - The blockchain will see that the inputs are not valid, and the transaction would be rejected!

Note: You don't know which transaction(s) the miners will pick up first. The order they are added to a new block comes down to randomness + gas/fees paid

##### Sufficient Balances

The next problem/concern: Having sufficient Balance to send funds
- This is why you need valid transactions to prove you have sufficient funds!

Example: You are creating a transaction where you send 6 BTC
- Inputs:
    - tx1: 2 BTC
    - tx2: 2 BTC
    - tx3: 3 BTC

- Outputs:
    - gas/fees: x
    - change: x

This is how a transaction would work on the Blockchain.

What would this look like if we didn't use transactions as inputs?
- Go back to the origin block (of the entire Blockchain)
- Traverse through each transaction node, keeping track of how much money is in your account
    - If you don't provide any proof, the miners need to know if you actually have 6 BTC

It is a little bit more complicated than that, but that's basically what it comes down to for validating that a certain user has a certain amount of money at any given time.

##### Exploited Code

The next risk/concern: Exploited Code

As programmers, we are aware that everyone makes mistakes when writing code, even the developers who write the source code for the blockchain network.

Examples of things that can go wrong/exploitation:
- Damage to the blockchain network
- Fraudulent transactions

Thankfully: These large networks have 1000's of people working on them, security audits, etc.
- For smaller coins, there are a lot of examples of blockchain networks/coins being exploited for their poorly written code.

##### 51% Attack

Most popular type of Blockchain security Breach: The 51% Attack

The 51% Attack occurs when 1 specific entity is able to control over 50% of a blockchain network.
- More specifically: They would be controlling the nodes and miners/validators
    - This will make more sense after the Proof of Work/Proof of Stake modules

If you are able to control over 50% of the entire network, you can do essentially what you want on that network. Why is that? Concensus algorithms.
- Concensus algorithms
    - Designed to achieve reliability in a network involving multiple users or nodes
    - All of the networks have them in place to allow people to determine if a transaction/a block is valid

Example: You controlled 3 of 5 nodes in a blockchain network
- If there was ever an argument/disagreement about a fraudulent transaction, you would have total control over what flies

This 51% Attack has happened to many smaller networks in the past! (It takes a lot of computing power, but it can happen, so therefore we should consider it)

##### Practice Questions

1. What best describes a 51% attack on the Bitcoin blockchain?
- When an entity controls more than 50% of the Bitcoin mining hash rate on the network
    - Note: The number of nodes on the network != hash rate of the network
        - Hash rate: How quickly a block's nonce can be guessed (so, how quickly blocks can be created/mine)
            - If you have a more powerful computer with a higher hash rate, your node is more powerful

### 8 - Proof Of Work

The original consensus mechanism that powers the Bitcoin network.

#### Key Terms

##### Proof of Work

Proof of Work is part of a consensus mechanism used by a blockchain network. 
- Blockchain miners compete to find a valid proof of work for blocks they assemble, based on recent transactions
    - Involves finding a special value (the nonce) that when added to a block makes the hash of that block start with a certain number of zeros.

##### Mining Difficulty

The mining difficulty is represented by a field known as bits.
- Number of bits: States the number of 0's that the hash of each block must start with to be accepted as valid
    - Miners must find a valid nonce that when added to a block make it's hash start with the number of bits zeros.

##### Miner

A miner is a special node on the blockchain network that is responsible for validating incoming transactions and assembling them into blocks.
- Miners compete/race to be the first to submit a valid block to the network.
- Upon submitting a valid block, miners are compensated by receiving the following:
    - The reward (if any)
    - Transaction/gas fees

#### Notes from the video

##### What is Proof of Work

In this video, we will look at Proof of Work.
- To put it simply, a Proof of Work is submitted alongside a block, by blockchain miners, to prove that a certain amount of computational power/work has been done
    - Lays the foundation for the security of blockchain networks like Bitcoin
    - The blockchain network gets more and more secure, as more work gets done
        - In order to go and try to change the network/do something malicious, they would have to provide the same amount of work (and even more!)

##### The Role of Miners

Overview of the blockchain network as a whole + the role that miners play (This will help us understand what a miner is doing when it submits a proof of work):
- Blockchain Network: We have an existing blockchain network
    - 

- Clients: We have clients on the Blockchain Network
    - who send transactions into the transaction pool
        - then, they wait for a miner to pick it up and add to the blockchain network
        
- Transaction Pool:
    - in reality: held individually by each miner on their computer

- Miners: Reads from transaction pool, gathers transactions, and assembles them into blocks
    - in reality: all miners have their own version of the transaction pool
        - they create 'tentative' version of blocks on their local machine
            - not all of them are seeing the same transaction pool
    - creating blocks is fast:
        - look at transaction
        - validate security based on previous block (no double spending)
        - assemble a block with the valid transactions
        - submit a proof of work alongisde the block, in order to add to blockchain

What is the Proof of Work?
- Essentially: Guessing a very specific number
    - Everybody is racing to get this number

Example: Miner #1 finds proof of work for the block
- Steps:
    - Miner transmit block to the network
    - Wait for it to get added, which entails the following:
        - Other miners on the network validate that the transactions on the block are secure
        - The block itself has a valid proof of work
    - Once it is added to the blockchain, all of the miners erase the blocks they are working on, and start mining a new block!
        - The blocks they were working on are now invalid, since those blocks need to contain the previous block's hash

The process repeats!

To reiterate, the basic flow:
- Miners assemble blocks from the transaction pool into a block
- Miners race to guess the proof of work
- Once a miner gets the the proof of work and submits it to the network and is validated, everyone starts at square 1

Note: The reason miners do this is because if they successfully submit a block to the network, they get a reward (Example: 6.25 BTC + transaction fees!)

##### Nonce and Difficulty/Bits

Now that we understand basics of the miners and flow of the network, let's look at what is involved in 'finding the proof of work'.

On our blocks, we have a bunch of information, such as:
- Version
- Previous block hash
- Data
- Transactions

What a miner is doing:
- Setting in the network and listening for transactions
    - Transaction pool runs in the RAM of the miner (some form of fast access memory)
    - Every time a new transaction is broadcasted to the network, it goes into this miner's pool
        - This miner is constantly trying to build blocks containing these transactions, find the proof of work, and submit to the network

What happens AFTER a miner builds a block and adds different transactions onto it:
- Check for a valid block / Validate that all transactions are indeed valid:
    - Check signatures
    - Check for double spending
        - Need access to the previous block in the blockchain (if a previous transaction exists, it becomes invalid)

- Find the proof of work:
    - proof of work: a number so that when this entire block is hashed, this hash starts with a certain amount of zeros
        - Nonce: 
        - Bits: the difficulty of the block

Example:
- Bits = 20
    - "the hash of this block must start with 20 zeros for the proof of work to be submitted"
        - When you hash this block, you get a random value - nearly impossible it will start with 20 zeros
        - You need to add a special number to this block that makes it such that the hash of this block does start with 20 zeros
            - This is where Nonce comes in ...

- Nonce = 
    - When someone is mining, they are guessing a bunch of nonces that you can add to the block so that the hash starts with 20 zeros
        - 

Note: Everytime you add another zero (increase the bits) it gets more difficult to determine a nonce, so that the hash of the block starts with that many zeros.

What is actually happening when you mine:
- Guessing millions of numbers per second
    - Adding that number to the block
    - Hashing the entire block
    - Hoping it starts with Bits = 20 zeros so you can submit the block!

Once you have a valid proof of work and submit that block to the blockchain, you will receive your reward and the block is added to the blockchain network.

##### How Miners Work Together

Let's make this example simple with only 3 miners.

What each miner has:
- Blockchain = Decentralized / Distributed ledger
    - Each miner has their own version of the blockchain
- Transaction pool
    - tx pools

Steps:
- Person broadcasts a transaction out to the network and it ends up in each miner's pool
    - The miners are listening for transactions, and when this transaction comes into the network, they all receive it in their transaction pools

- Now that they have transactions in their pool, the miners start to TRY building blocks with the transactions
    - They are looking for the nonce for these blocks
        - building block: simple
        - validating that transactions are valid: not so simple
            - How to do it: Having an up-to-date version/history of the blockchain

- Miner 1 has found the nonce and has successfully finds the nonce that makes the hash start with a specific number of zeros (depending on the bits). What he does next:
    - Broadcasts this block out to the network
        - Because these others miners are listening to the network, this new block goes to each of the other miners

- When the other miners receive the block, one of two things can happen:
    - block is valid: they delete the block they have been working on AND delete the one they have been working on
        - their blockchain is now up-to-date and they can continue mining ie. work on a new block with new transactions
    - block is NOT valid: they will reject adding this to their local copy of the blockchain
        - their blockchain stays the same, and they continue trying to find the nonce/proof of work


- Assuming the block was valid, the cycle continues and miners keep competing for new blocks and finding the proof of work.

More computing power and ability to guess numbers, the more you will win!

##### Fork Chains and Resolving Conflicts

Let's look at some edge cases, ie. multiple miners sending blocks in at the same time.

In the bitcoin network with millions of users, the probability that 2 miners submit a valid block at the same time is pretty likely
- Happens ~1x per week

What happens when this is the case?

Let's show with an example of 3 miners once again:
- 3 miners
- 1 blockchain in the middle (imagine that all 3 miners agree on the same valid version)
- Miners 1 and 2 find a valid block and a nonce and proof of work, and at the exact same moment in time, they submit the blocks.

Steps:
- A fork chain is created
    - We have 2 versions of the blockchain
        - both were submitted at same time and are valid, so you have to add them both (some miners on the network will accept block 1, others block 2)
            - depends on latency/when blocks were received by each miner

    - To resolve the issue and get back to a flat blockchain, we wait for the next block to be submitted and follow it (nodes are told to accept the longest chain)
        - if next valid block goes to block 1: all miners use the chain from block 1
        - if next valid block goes to block 2: all miners use the chain from block 2
            - longest chain on the network: the one that is up-to-date, which is measured by this:
                - more on this next...

##### Longest Chain

Longest Chain: Not as simple as the number of blocks!

Longest Chain: Chain with highest cumulative difficulty that is valid
- Chain must be valid: no double spends, etc.
- Chain must have highest cumulative difficulty: This refers to the amount of proof of work
    - Sum up all of the bits on all of the blocks, on that chain

Notes:
- Oftentimes: The longest chain has the highest cumulative difficulty (basic correlation)
- We take the highest proof of work because it makes the blockchain more secure
    - It would require more work to modify/change the blockchain

"Highest cumulative difficulty, valid chain"

Final note: If a fork chain happened twice in a row (unlikely), the process would just repeat itself
- 2 chains
- 4 chains
- 8 chains
- etc.

##### Confirmations

When sending transactions, there are Confirmations.

Confirmations: The number of blocks that have been added in the blockchain since this transaction
- Example: If your transaction is block 2, and now the blockchain is at block 5, that transaction has 3 confirmations
    - The more confirmations, the more confident you can be that the transaction is actually on the blockchain (and won't be reverted back)
        - it could have been added to a fork chain, which has a chance to be removed...

##### Difficulty and Hashing Time

Remember: Number of bits = The difficult for a block
- Block difficulty is adjusted every 2 weeks on the bitcoin blockchain network
    - This is adjusted based on the volume on the bitcoin network
        - Why is this? They want 1 new block to be created every 10 minutes (on average)

Bits gets adjusted using the hashing power of the entire network, and working its way back so that 1 bit takes 10 minutes.

##### Pool Mining

Now that we have gone over the fundamentals of mining, let's talk about mining strategy!
- Mining strategy: How a miner will most-efficiently find a valid block and submit it to the netowrk

With a network like bitcoin, there are millions of miners. What does this mean for 1 miner with 1 computer (a low output miner):
- Probability to mine 1 block is extremely slow

How to compensate for this problem? You join a pool!

Pool Mining: Pooling the resources of multiple miners
- increases the chance of mining a block
- distributing rewards based on amount of work that was done
- can be massive
    - can contain up to 10-30% of the hashing power of the entire network
        - hashing power: units for how quickly you can hash / guess nonces (megahash, gigahash, etc.) 

Pool mining is up for a large debate, so here are some advantages and disadvantages:
- advantages:
    - good for miners: increase chances of mining a block
- disadvantages:
    - miners have to share the reward with others in the pool
    - bad for the network: reduces the decentralization of the network
        - a very pool going down / being hacked, is a huge security risk
            - a pool over 51% would be very bad...

##### Mining Strategy/Empty Blocks

Lower level on the mining client level:

There are a bunch of different software (ie. clients) that can be used to mine bitcoin
- you just need to download a bitcoin miner client (no need to write code)
- this program/client runs on your computer

What these clients do if they are optimized:
- create empty blocks
    - does this because it knows the previous block hash, but not which transactions to hash
        - even if the block has no transactions, it is a block that can be submitted (blockchain does not care if the block has 1 transaction or 100 transactions or even 0 transactions - it just needs it to add further proof of work)

- after 1-2 seconds of cross-referencing between transaction pool and blockchain, the client begins to try and add transactions to its block
    - remember: it wants to submit a block as faster as possible
    - whether the block has 0 transactions or 100, it takes the same amount of time to get the nonce/proof of work, so the miner will continue to try and add blocks (even if empty) to the blockchain in the 1-2 seconds of cross-referencing

Final note: Empty blocks are added all of the time!

##### Environmental Impact

Environmental Impact of Proof of Work:
- There is a ton of repetitive work being done
    - more computing power = faster you can guess numbers = more electricity/power used!

Example: There are 1,000,000 bitcoin miners
- 1 miner's work gets the proof of work
- 999,999 miner's work is for naught, and they must start over
    - that is a lot of wasted power + computation resources!

This is a big reasons why newer network (ie. ETH) are transitioning to proof of stake > proof of work.

##### Attacks on Proof Of Work

How someone would try and hack a proof of work network:

As seen before, we can have fork chains:
- Chain that will live on/continue is the one that the next block is added to
    - People would try to hack by continuing on an invalid chain for as long as possible
        - They would need to control 51% of the network
            - they need to outwork/outprove the others in the network, so that the invalid/fraudulent chain continues on (you are racing against the rest of the network before they can invalidate your chain)

##### Practice Questions

1. What is the correct process for a transaction to be validated and added to the Bitcoin blockchain?
- Transaction Created and Signed -> Transaction Sent To Transaction Pool -> Miner Bundles Transaction Into A Block -> Miner Finds The Nonce -> Miner Submits Block

2. The difficulty of the Bitcoin blockchain increases at a fixed increment (i.e., it increases in difficulty every 3 days).
- False

3. The number of confirmations a transaction has is the number of new blocks that have been created on-top of or since the block that holds the transaction.
- True

4. Every time a Bitcoin miner successfully mines a block they receive a reward. What does this reward consist of?
- Transaction Fees
- Block Reward - Newly Minted Bitcoin

5. Pool mining involves a group of individual miners pooling/sharing their hashing power to increase the chance of mining a block. Which of the following statements is true about pool mining? Select all that apply.
- Pool mining decreases decentralization
- Rewards are split based on the hashing power contributed by each miner


### 9 - Proof Of Stake

An alternative consensus mechanism that was most recently implemented on the Ethereum network.

#### Key Terms

##### Proof of Stake

Proof of Stake is part of a consensus mechanism used by a blockchain network.
- Blockchain networks validators are selected to verify the next set of transactions
    - Validators must provide a stake/collateral that can be slashed if they act with malicious intent

##### Validator

A validator is the term used to denote a node in a proof of stake blockchain network that vlaidates transactions and creates new blocks.
- Typically: Validators must provide a stake/collateral to ensure they act ethically

#### Notes from the video

##### Proof of Stake Overview

Proof of Stake: Alternative consensus mechanism
- Address concerns/environmental impact of proof of work
    - proof of work is good, but wasteful of energy
- Decentralized the network further
    - Allows more people access to become validators
- Saves energy
    - up to 99% less energy used than proof of work!

Proof of Work vs. Proof of Stake:
- Proof of Work:
    - Miners are mining
        - Mining is:
            - Miners are the computer on the network trying to guess nonce/provide proof of work
            - They mine new cryptocurrency out of that block to get the reward

- Proof of Stake:
    - Miners are 'Validators'
    - Instead of Mining, we are 'Minting'
        - Minting is:
            - Rather than computing power/minings farms, you can use a simple computer
            - Access to validate nodes happens with a 'Stake' that your provide

Example:
- We have 5 Validators
    - These Validators put up stake
        - Their stake/collateral is in ETH
            - This ETH allows them to validate blocks
            - If they act maliciously/validate invalid transactions, they will lose their ETH (it gets 'slashed')
    - Each of these 5 Validators are on average local CPU's

- These validators are randomly selected, based on portion of stake being put up
    - performing well: receive rewards from block they mint/forge
        
    - performing poorly/incorrectly and malicously acting: they will lose their stake
        - motivation to validate correctly: you will lose financially!

Tradeoff for the 2:
- Proof of Work: Tons of wasted energy
- Proof of Stake: Malicious actors cannot act maliciously (boo-hoo)

##### How Validators Work

More Detailed Example using ETH:
- We have 6 validators on our network
    - Each of these 6 validators puts up some ETH as their stake
        - Minimum stake in proof of stake algo for ETH: 32 ETH (~$40,000)
            - this is a large amount/large financial barrier to entry to become a validator

- When a new block needs to be created, 1 of the 6 validators is chosen at random
    - Selected based on proportion of stake that they have (on the entire network)
        - Currently:
            - Each of the 6 validators has 32 ETH
                - The network has 6 * 32 = 192 ETH being staked
                - Each validator has a 6/192 ie. 1/6th chance of being selected at random

- A block is created using the transaction pool of that Validator
    - To create block:
        - Fill in required data
        - Validate individual transaction
            - That's it! (No need to guess nonce, provide proof of work, etc.)

- The new block is now submitted to the other validators
    - This is what the other validators do now:
        - Look at the block and make sure it looks valid
            - If a majority of the validators agree:
                - block is added to blockchain
                - validator receives reward (the sum of the transaction fees)
                    - no block reward - some blockchains have a block reward, Ethereum network does not!

            - If a majority of the validators do NOT agree:
                - block is NOT added to blockchain
                - the validator has a portion of its stake is 'slashed'
                    - of that 32 ETH being staked, they will lose more than they were going to gain
                        - example: was going to gain 5 ETH, but due to acting maliciously they lose 8 of their 32 ETH
                            - depends on a bunch of factors how much you will lose, but this example is all you need to know for now
                            - this encourages you to be a good actor more than 1/2 of the time!

- Assuming that the block is valid, this cycle continues


##### Advantages and Disadvantages

Advantages:
- environmental impact
    - reduces energy consumption by 99%

- increases decentralization
    - anyone can set up a validator
        - no need for a farm of high-performing CPU's

- make ETH (or any network) a more deflationary asset
    - how?
        - when you implement a Proof of Stake algorithm, many people will be 'locking' up their ETH ie. not using it/selling it
            - the more coin being taken out of regular circulation ie. trading platforms/etc. makes it more difficult to obtain your own ETH
                - this drives the price up! (less supply, so demand goes up)

Disadvantages:
- potential for a very rich person to take over the network
    - august 12th 2022: $230B in market cap
        - you would need access to $115B of ETH set up in different validators to take over the network
            - this is potentially doable, for a very rich person (you need 1/2 of the network to sell you coins, but technically it is still possible...)

- high barrier for entry
    - 32 ETH is a high barrier for entry
        - this is high (to make sure people act correctly)
        - counter-argument: You can pool your stake!
            - example: 32 people with 1 ETH can pool together to become 1 validator, and split the rewards 32 ways (this doesn't increase decentralization, though)


##### Validator Selection

Quick explanation on Validator Selection:
- When you have multiple validators, they are selected based on the proportion of stake that they provide
    - This cannot be the only way to select validators!
        - If 1 Validator had a large proportion, they would win almost every time...

- Other factors that determine which validators are chosen:
    - he does not explain in this video...

- There are scenarios where a Validator could be chosen, but then not be online/available to validate
    - Backup validators are then gone to (think of a queue of backups)


##### Practice Questions

1. What advantages do proof of stake algorithms have over proof of work? Select all that apply.
- Increases decentralization by avoiding large mining pools.
- Lower barrier to entry as even low end machines/hardware can become a validator.
- Reduces amount of electricity required to validate a block.

2. In a proof of stake blockchain network, nodes are chosen as validators solely based on the stake they provide.
- False

3. In a proof of stake algorithm, validators "stake" a certain quantity of the blockchain networks native coin. Why is a stake required?
- To ensure each validator has collateral that can be slashed if they act maliciously.

### 10 - Nodes and Masternodes

The blockchain's stakeholders who tirelessly work to validate transactions and ensure the ongoing integrity of the network.

#### Key Terms

##### Node

A node is any machine that is connected to the blockchain network.
- Nodes may be one of the following:
    - full nodes (store the entire blockchain)
    - partial nodes (stores part of the blockchain)

##### Full Node

A full node is a node on a blockchain network that stores the entire history of the blockchain.
- In the context of bitcoin: All miner nodes are full nodes.

##### Masternode

Masternodes are special nodes that only exist on certain blockchain networks.
- Typically: Full nodes that have the following traits:
    - require heavier equipment than normal nodes
    - facilitate special operations (such as voting)

- Providers of masternodes typically need to provide a stake and are compensated for their services.

#### Notes from the video

##### Full and Partial nodes

Nodes: Computers that store a copy of the blockchain
- 2 types of nodes:
    - Partial node: stores some history of the blockchain
    - Full node: stores the entire history of the blockchain
        - Validators/Miners
            - They need the entire blockchain, so they can actually validate transactions

- All nodes communicate with each other via transmitting blocks + transactions (this is how the blockchain works...)
    - Really what is happening on the blockchain:
        - Decentralized computers around the world storing their own version of the blockchain
        - They are trying to stay synchronized
            - Sometimes there are outdated chains / fork chains

Notes:
- Important to have many different nodes on the network (partial AND full)
- Masternodes are something completely different!
    - miners and masternodes are needed depending on the implementation of the blockchain


Quick Example: 
- We have 7 nodes in total
    - Miner node generates a block
        - The block is then transmitted to other nodes
            - This continues until the entire network is propogated with the new block
                - When certain nodes don't have the block yet and are outdated, they are not in sync yet (think of a stale cache)
                - Exact nodes it gets transmitted to can be complicated, so don't worry for now...

Remember: More nodes = More security of the blockchain

Examples of Full Nodes and Partial Nodes:
- Full Nodes: Should have an update-to-date/synchronized version of the blockchain
    - Miners
    - Wallets
        - To have current balance, need to have an entire history of the blockchain to know current balance
        - Can be partial OR full
            - Typically: Lightweight wallets (ie. ones on your phone) are partial nodes that actually link/connect to a full node, to determine an accurate balance for your specific wallet
                - These leverage special software that can help you approximate your balance w/ a good estimate, but it is not a replacement for connecting to a full node that has information on the full blockchain history!

            - What happens oftentimes on specific blockchain networks:
                - Run a full node
                - Rent out full node as a service
                - Allow lighter weight/partial wallets to connect to the full nodes and access certain information
                    - Partial wallets may have to pay a fee to the full node
                        - depends on the application!

- Partial Nodes:
    - 

Quick Notes on What non-mining Nodes do:
- If a node rejects the validity of a block but then it loses the majority vote, it will not be a full node since it is out of sync
    - It will have to synchronize later on, to keep up with consensus and be up-to-date

- If a majority of nodes reject the validity of a block, it gets denied
    - it is not just miners that validate the transactions, it is every node!!
        - they do not get the reward for mining, they still want to validate blocks (in order to have the information to be up-to-date)
        - these nodes help keep the blockchain more secure

Final Note on Nodes: Nodes can go offline!
- What happens when a full node goes offline:
    - When it comes back from its period of time offline, it needs to re-synchronize by downloading the blockchain data to be up-to-date again

##### Masternodes

Masternodes: A special type of node that runs on the blockchain network
- Only required when unique operations (ones that do not occur on all networks) are occurring

- Examples:
    - Bitcoin (BTC):
        - You can do 1 thing: Sending BTC to other people

    - Votes (Blockchain networks for political elections)
        - Masternodes do the special operations (that are beyond the scope of mining)

- Attributes:
    - Full Node: Masternodes must be Full Nodes
    - Online: Need to be online all the time (ie. have High Availability)
    - Stake: Provides stake/collateral
    - Faster: Has higher-end hardware such as more CPU cores, RAM
        - has minimum specs, unlike full nodes that can run on any computer that has enough memory to store the full blockchain
    - Reward: You are rewarded for running a masternode
        - this is why you need to present some stake
        - reward is usually less than mining (case by case, it depends on the volume of the network, what your masternode is doing, how many masternodes you have, etc.) 

Note: Remember, masternodes are only needed on networks that have special operations (like voting)

##### Practice Questions

1. In the context of blockchain networks, what is a node? Select the most correct answer.
- A computer that stores a partial or copmlete copy of the blockchain.

2. A node that stores an entire copy of the blockchain is referred to as a:
- Full Node

3. Which of the following statements are true about masternodes? Select all that apply.
- Masternodes store an entire copy of the blockchain.
- Masternodes are always online.
- To run a masternode you typically must provide collateral.

4. All proof of work blockchain networks have masternodes?
<<<<<<< HEAD
- False
=======
- False

### 11 - Bitcoin Summary

Congratulations on making it to the end of BlockchainExpert's first section! Let's take a stroll down memory lane and review what we've learned so far.

#### Key Terms

n/a

#### Notes from the video

Let's wrap up with a high-level summary of everything we have learned so far! This will help bring everything full-circle.

##### Introduction to Blockchains

Web 1: Read-only internet
- Used for research
- Ads are banned

Web 2: Dynamic/interactive webpages
- Focus on UI
- Communities
- Centrally controlled

Web 3: Decentralized Internet w/ Blockchain Technologies
- What we are moving into now
- Focus on back-end systems and AI

Blockchain: A decentralized, distributed ledger of valid transactions.

##### Centralized vs Decentralized

Decentralization: Important concept in trust
- When you have central entities (ie. Google, the government), we are putting a lot of trust when we use their services
    - They could lie/get hacked/do something bad

- When you have decentralized services ie. blockchain, you trust the network as a whole
    - Controlled by all participants, not 1 large company

##### Ledgers

Ledger: A way of storing/logging transactions and events
- Basis of the blockchain
- Held by many different people in different places
- Is continuously being validated/updated

Main Properties of our Blockchain Network (A Decentralized, Distributed Ledger of Valid Transactions):
- Immutable
- Publicly Available
- Distributed
- Chronologlical
- Decentralized
- Irrevocable

##### Wallets

Wallets: How we own/control different amounts of coins/tokens
- Like a bank account
- Security has to do with private/public key pairs
    - Private key: Password into the wallet
        - We never share this to anybody
    - Public key: Publicly available
        - We use a hashing function to get from private key to public key
        - Based on cryptography, you cannot get your private key from your public key
    - Address: More readable version of public key 
        - Shortened version of a public key (easier to work with)
            - we get it by going through a hashing function
        - What people see when we send/receive money from them

Important to know:

Hashing Function: A function with no known inverse
- Not actually mathematical provable (at this point we have not found one)
- Have to guess and check to get back to the input
- Properties of hash functions:
    - Uniform Outputs: Same length of output string
    - Deterministic: For a given input value it always generates the same output/hash value
    - Rare Hash Collisions 
    - Fast to Compute

##### Transactions

Transactions: 
- From your wallet, you send/receive transactions
- Inputs of Transactions:
    - These are other transactions that we received
    - The sum of this must be >= to the amount we send out
- Outputs of transactions:
    - Receipient's wallet
    - Amount
    - Fee/gas

- Sum of outputs MUST == Sum of inputs!
    - Change is used to even it out

- In order to send a transaction:
    - Prove to send money
    - Prove you are the owner of the account

How to prove you are the owner of an account:
- Produce a digital signature
    - Use private/sign-in key
    - Get an encyrpted output using the hash of the transactions with a sign-in key
    - Miners + validators on the network will now decrypt your transaction with the public key
        - If hash of decrypted message == hash of transaction data you are sending, it is a valid signature and the money can be sent since you proved to be the owner!

#### Blocks

Blocks: Collections of transactions + other data
- Generated by: Miners
    - Miners collect transactions from transaction pool
    - Miners assemble them into a block (min. size == 0)
    - Miners will try to guess the Nonce
    - Once they have the nonce, they can create a block and add it to the blockchain (assuming it is valid)

- Properties of a block:
    - Magic Number: Blockchain version ie. ETH/BTC
    - Block Size
    - Block Header
    - Transaction Count
    - List of transactions
    - Version
    - Link to Previous Block Hash
    - Hash Merkle Root (the hash of all the hashes of all the transactions that are part of a block in a blockchain network)
    - Timestamp
    - Bits
    - Nonce
    - Reward

- Special Block: Genesis Block (First block on a network!)
    - Lists a few special pieces of information to help the network do the following:
        - Adjust difficulty later on
        - Reward for mining
        - Number of coins in circulation

    - Think of this as special initialization block required to start the blockchain

Note: Depending on Blockchain, you may have less/more of this info!

#### Blockchain Security

Blockchain Security: Co
- Concerns include:
    - Double spending
    - Fraudulent transactions
    - Maintaining an order
    - Having sufficient balance to send
    - 51% attacks
    - Exploited code

Idea here: Understand the issues with any decentralized/distributed ledger, so that we can prevent them
- Big one: 51% attack (This would allow malicious actors to validate fraudulent transactions)

#### Proof of Work

Mining: Guessing a specific number that makes the hash of a block start with a certain number of zeros (Nonce)
- Number of zeros: Bits / Difficulty
    - This proves the amount of computational power required to make this block
        - As you add more work/computational power, you add to the security (it is harder to change it later)

- Why you mine: You receive a reward for adding a new block
    - Specific block reward ie. 6.25 BTC + transaction fees

- Confirmations: The number of blocks that have been added since your transactions was

- Difficulty: Automatically adjusted every 2 weeks (so that each block is created ~10 minutes, adjusts for hashing power on the network)

- Pool Mining/Environmental Impact: Pooling resources together to maximize probability of mining a block
    - Lowers the level of decentralization (not great for the network, but essentially necessary for small miners)
    - Lots of wasted computational power / electricity

#### Proof of Stake

Proof of Stake: Provide some stake in order to become a validator
- Replacement for Proof of Work
- Validator of the next block is randomly selected (based on your proportion of ETH staked vs. the entire network)
- Block reward: Transaction fees (ETH 2.0 has no other reward, some networks may)

Preferred to Proof of Work because it reduces environmental impact
- No need for powerful computers
- No wasted work, where only the winner's computational power does anything

#### Nodes and Masternodes

Node: A computer sitting on the blockchain network
- Blockchain is made up of a ton of nodes, such as:
    - Full nodes: Full blockchain
        - Miners/Validators are full since they need the entire blockchain to properly validate

    - Partial nodes: Part of the blockchain
        - Example: Lightweight wallet

    - Masternode: Special type of node
        - Also is a full node
        - Only required on specific blockchain networks that require a specific operation to be done ie. voting
        - Need to provide stake to run the masternode (will be slashed)
        - Masternodes get rewards based on number of masternodes, the network, etc.

#### Takeaways

Yes, you can write code and smart contracts without understanding all of these fundamentals, but knowing these concepts makes you a better developer and gives you a better perspective!

Not to mention: it is very interesting and good to know. (many of those investing in Blockchain Technologies don't take the time to learn these basic concepts that underpin everything we will do in the future)
>>>>>>> d4d6918 (Completed Blockchain Fundamental - Lessons)



##### Practice Questions

1. What advantages do proof of stake algorithms have over proof of work? Select all that apply.
- Increases decentralization by avoiding large mining pools.
- Lower barrier to entry as even low end machines/hardware can become a validator.
- Reduces amount of electricity required to validate a block.

2. In a proof of stake blockchain network, nodes are chosen as validators solely based on the stake they provide.
- False

3. In a proof of stake algorithm, validators "stake" a certain quantity of the blockchain networks native coin. Why is a stake required?
- To ensure each validator has collateral that can be slashed if they act maliciously.

### 10 - Nodes and Masternodes

The blockchain's stakeholders who tirelessly work to validate transactions and ensure the ongoing integrity of the network.

#### Key Terms

##### Node

A node is any machine that is connected to the blockchain network.
- Nodes may be one of the following:
    - full nodes (store the entire blockchain)
    - partial nodes (stores part of the blockchain)

##### Full Node

A full node is a node on a blockchain network that stores the entire history of the blockchain.
- In the context of bitcoin: All miner nodes are full nodes.

##### Masternode

Masternodes are special nodes that only exist on certain blockchain networks.
- Typically: Full nodes that have the following traits:
    - require heavier equipment than normal nodes
    - facilitate special operations (such as voting)

- Providers of masternodes typically need to provide a stake and are compensated for their services.

#### Notes from the video

##### Full and Partial nodes

Nodes: Computers that store a copy of the blockchain
- 2 types of nodes:
    - Partial node: stores some history of the blockchain
    - Full node: stores the entire history of the blockchain
        - Validators/Miners
            - They need the entire blockchain, so they can actually validate transactions

- All nodes communicate with each other via transmitting blocks + transactions (this is how the blockchain works...)
    - Really what is happening on the blockchain:
        - Decentralized computers around the world storing their own version of the blockchain
        - They are trying to stay synchronized
            - Sometimes there are outdated chains / fork chains

Notes:
- Important to have many different nodes on the network (partial AND full)
- Masternodes are something completely different!
    - miners and masternodes are needed depending on the implementation of the blockchain


Quick Example: 
- We have 7 nodes in total
    - Miner node generates a block
        - The block is then transmitted to other nodes
            - This continues until the entire network is propogated with the new block
                - When certain nodes don't have the block yet and are outdated, they are not in sync yet (think of a stale cache)
                - Exact nodes it gets transmitted to can be complicated, so don't worry for now...

Remember: More nodes = More security of the blockchain

Examples of Full Nodes and Partial Nodes:
- Full Nodes: Should have an update-to-date/synchronized version of the blockchain
    - Miners
    - Wallets
        - To have current balance, need to have an entire history of the blockchain to know current balance
        - Can be partial OR full
            - Typically: Lightweight wallets (ie. ones on your phone) are partial nodes that actually link/connect to a full node, to determine an accurate balance for your specific wallet
                - These leverage special software that can help you approximate your balance w/ a good estimate, but it is not a replacement for connecting to a full node that has information on the full blockchain history!

            - What happens oftentimes on specific blockchain networks:
                - Run a full node
                - Rent out full node as a service
                - Allow lighter weight/partial wallets to connect to the full nodes and access certain information
                    - Partial wallets may have to pay a fee to the full node
                        - depends on the application!

- Partial Nodes:
    - 

Quick Notes on What non-mining Nodes do:
- If a node rejects the validity of a block but then it loses the majority vote, it will not be a full node since it is out of sync
    - It will have to synchronize later on, to keep up with consensus and be up-to-date

- If a majority of nodes reject the validity of a block, it gets denied
    - it is not just miners that validate the transactions, it is every node!!
        - they do not get the reward for mining, they still want to validate blocks (in order to have the information to be up-to-date)
        - these nodes help keep the blockchain more secure

Final Note on Nodes: Nodes can go offline!
- What happens when a full node goes offline:
    - When it comes back from its period of time offline, it needs to re-synchronize by downloading the blockchain data to be up-to-date again

##### Masternodes

Masternodes: A special type of node that runs on the blockchain network
- Only required when unique operations (ones that do not occur on all networks) are occurring

- Examples:
    - Bitcoin (BTC):
        - You can do 1 thing: Sending BTC to other people

    - Votes (Blockchain networks for political elections)
        - Masternodes do the special operations (that are beyond the scope of mining)

- Attributes:
    - Full Node: Masternodes must be Full Nodes
    - Online: Need to be online all the time (ie. have High Availability)
    - Stake: Provides stake/collateral
    - Faster: Has higher-end hardware such as more CPU cores, RAM
        - has minimum specs, unlike full nodes that can run on any computer that has enough memory to store the full blockchain
    - Reward: You are rewarded for running a masternode
        - this is why you need to present some stake
        - reward is usually less than mining (case by case, it depends on the volume of the network, what your masternode is doing, how many masternodes you have, etc.) 

Note: Remember, masternodes are only needed on networks that have special operations (like voting)

##### Practice Questions

1. In the context of blockchain networks, what is a node? Select the most correct answer.
- A computer that stores a partial or copmlete copy of the blockchain.

2. A node that stores an entire copy of the blockchain is referred to as a:
- Full Node

3. Which of the following statements are true about masternodes? Select all that apply.
- Masternodes store an entire copy of the blockchain.
- Masternodes are always online.
- To run a masternode you typically must provide collateral.

4. All proof of work blockchain networks have masternodes?
- False

### 11 - Bitcoin Summary

Congratulations on making it to the end of BlockchainExpert's first section! Let's take a stroll down memory lane and review what we've learned so far.

#### Key Terms

n/a

#### Notes from the video

Let's wrap up with a high-level summary of everything we have learned so far! This will help bring everything full-circle.

##### Introduction to Blockchains

Web 1: Read-only internet
- Used for research
- Ads are banned

Web 2: Dynamic/interactive webpages
- Focus on UI
- Communities
- Centrally controlled

Web 3: Decentralized Internet w/ Blockchain Technologies
- What we are moving into now
- Focus on back-end systems and AI

Blockchain: A decentralized, distributed ledger of valid transactions.

##### Centralized vs Decentralized

Decentralization: Important concept in trust
- When you have central entities (ie. Google, the government), we are putting a lot of trust when we use their services
    - They could lie/get hacked/do something bad

- When you have decentralized services ie. blockchain, you trust the network as a whole
    - Controlled by all participants, not 1 large company

##### Ledgers

Ledger: A way of storing/logging transactions and events
- Basis of the blockchain
- Held by many different people in different places
- Is continuously being validated/updated

Main Properties of our Blockchain Network (A Decentralized, Distributed Ledger of Valid Transactions):
- Immutable
- Publicly Available
- Distributed
- Chronologlical
- Decentralized
- Irrevocable

##### Wallets

Wallets: How we own/control different amounts of coins/tokens
- Like a bank account
- Security has to do with private/public key pairs
    - Private key: Password into the wallet
        - We never share this to anybody
    - Public key: Publicly available
        - We use a hashing function to get from private key to public key
        - Based on cryptography, you cannot get your private key from your public key
    - Address: More readable version of public key 
        - Shortened version of a public key (easier to work with)
            - we get it by going through a hashing function
        - What people see when we send/receive money from them

Important to know:

Hashing Function: A function with no known inverse
- Not actually mathematical provable (at this point we have not found one)
- Have to guess and check to get back to the input
- Properties of hash functions:
    - Uniform Outputs: Same length of output string
    - Deterministic: For a given input value it always generates the same output/hash value
    - Rare Hash Collisions 
    - Fast to Compute

##### Transactions

Transactions: 
- From your wallet, you send/receive transactions
- Inputs of Transactions:
    - These are other transactions that we received
    - The sum of this must be >= to the amount we send out
- Outputs of transactions:
    - Receipient's wallet
    - Amount
    - Fee/gas

- Sum of outputs MUST == Sum of inputs!
    - Change is used to even it out

- In order to send a transaction:
    - Prove to send money
    - Prove you are the owner of the account

How to prove you are the owner of an account:
- Produce a digital signature
    - Use private/sign-in key
    - Get an encyrpted output using the hash of the transactions with a sign-in key
    - Miners + validators on the network will now decrypt your transaction with the public key
        - If hash of decrypted message == hash of transaction data you are sending, it is a valid signature and the money can be sent since you proved to be the owner!

#### Blocks

Blocks: Collections of transactions + other data
- Generated by: Miners
    - Miners collect transactions from transaction pool
    - Miners assemble them into a block (min. size == 0)
    - Miners will try to guess the Nonce
    - Once they have the nonce, they can create a block and add it to the blockchain (assuming it is valid)

- Properties of a block:
    - Magic Number: Blockchain version ie. ETH/BTC
    - Block Size
    - Block Header
    - Transaction Count
    - List of transactions
    - Version
    - Link to Previous Block Hash
    - Hash Merkle Root (the hash of all the hashes of all the transactions that are part of a block in a blockchain network)
    - Timestamp
    - Bits
    - Nonce
    - Reward

- Special Block: Genesis Block (First block on a network!)
    - Lists a few special pieces of information to help the network do the following:
        - Adjust difficulty later on
        - Reward for mining
        - Number of coins in circulation

    - Think of this as special initialization block required to start the blockchain

Note: Depending on Blockchain, you may have less/more of this info!

#### Blockchain Security

Blockchain Security: Co
- Concerns include:
    - Double spending
    - Fraudulent transactions
    - Maintaining an order
    - Having sufficient balance to send
    - 51% attacks
    - Exploited code

Idea here: Understand the issues with any decentralized/distributed ledger, so that we can prevent them
- Big one: 51% attack (This would allow malicious actors to validate fraudulent transactions)

#### Proof of Work

Mining: Guessing a specific number that makes the hash of a block start with a certain number of zeros (Nonce)
- Number of zeros: Bits / Difficulty
    - This proves the amount of computational power required to make this block
        - As you add more work/computational power, you add to the security (it is harder to change it later)

- Why you mine: You receive a reward for adding a new block
    - Specific block reward ie. 6.25 BTC + transaction fees

- Confirmations: The number of blocks that have been added since your transactions was

- Difficulty: Automatically adjusted every 2 weeks (so that each block is created ~10 minutes, adjusts for hashing power on the network)

- Pool Mining/Environmental Impact: Pooling resources together to maximize probability of mining a block
    - Lowers the level of decentralization (not great for the network, but essentially necessary for small miners)
    - Lots of wasted computational power / electricity

#### Proof of Stake

Proof of Stake: Provide some stake in order to become a validator
- Replacement for Proof of Work
- Validator of the next block is randomly selected (based on your proportion of ETH staked vs. the entire network)
- Block reward: Transaction fees (ETH 2.0 has no other reward, some networks may)

Preferred to Proof of Work because it reduces environmental impact
- No need for powerful computers
- No wasted work, where only the winner's computational power does anything

#### Nodes and Masternodes

Node: A computer sitting on the blockchain network
- Blockchain is made up of a ton of nodes, such as:
    - Full nodes: Full blockchain
        - Miners/Validators are full since they need the entire blockchain to properly validate

    - Partial nodes: Part of the blockchain
        - Example: Lightweight wallet

    - Masternode: Special type of node
        - Also is a full node
        - Only required on specific blockchain networks that require a specific operation to be done ie. voting
        - Need to provide stake to run the masternode (will be slashed)
        - Masternodes get rewards based on number of masternodes, the network, etc.

#### Takeaways

Yes, you can write code and smart contracts without understanding all of these fundamentals, but knowing these concepts makes you a better developer and gives you a better perspective!

Not to mention: it is very interesting and good to know. (many of those investing in Blockchain Technologies don't take the time to learn these basic concepts that underpin everything we will do in the future)

## Assessment

1. Which of the following are examples of fiat currency? Select all that apply.
- US Dollar
- Canadian Dollar

Note: Fiat currency is a government-issued currency that is not backed by a commodity such as gold.

2. All cryptocurrencies rely on their own blockchain network.
- False

3. Which of the following technologies are considered turing complete? Select all that apply.
- Ethereum
- Solidity
- Python

4. What are the major differences between Ethereum and Bitcoin? Select all that apply.
- Ethereum is a platform that can be built upon, while Bitcoin is only useful for decentralized finance.
- Ethereum supports decentralized applications and smart contracts, while Bitcoin does not.

Note: Neither Ethereum or Bitcoin is objectively cheaper, faster or more secure than the other, they are simply different technologies with different advantages and disadvantages.

5. Which of the following are characteristics of smart contracts hosted on Ethereum? Select all that apply.
- Immutable
- Publicly available
- Can hold a balance

6. A coin is the default cryptocurrency of a blockchain network, while a token is created using a smart contract.
- True

7. A token on the Ethereum network follows which protocol?
- ERC-20

8. Which of the following assets/items would be considered fungible.
- US Dollar Bill ($1)
- Bitcoin

9. Which of the following technologies are examples of Layer-1 Chains? Select all that apply.
- Solana
- Binance Smart Chain
- Ethereum

10. All stablecoins are backed by some commodity, fiat currency, or other cryptocurrencies.
- False

Note: Although many stablecoins are backed by commodities, fiat currency or other stablecoins there are some that are not. These are referred to as algorithmic stablecoins.

11. It is impossible for a stablecoin to lose its peg.
- False

Note: Although rare, it is possible for a stablecoin to lose it's peg and this has happened. When a stablecoin loses it's peg it's value drops below the price of the underlying asset.

12. Smart contracts can call APIs and make HTTP requests.
- False

13. In the context of blockchains, what is an Oracle? Select the most accurate option.
- Any device or entity that connects blockchains with off-chain data.

14. Why is it important to use a decentralized Oracle network? Select all that apply.
- To ensure data stays consistent and is verifiable.
- To ensure multiple data sources/entities agree on data before it's posted to the blockchain.
- To reduce the security risks of using a single Oracle in a smart contract.

15. What are the three vertices of the scalability trilemma? Select all that apply.
- Decentralization
- Security
- Scalability

---

# 4 - Solidity Fundamentals

Learning blockchain development wouldn't be complete without learning Solidity, a popular object-oriented programming language used to implement smart contracts on Ethereum and other blockchains.

## Lessons

### 1 - MetaMask Setup

A versatile Ethereum wallet with a cuter Fox logo than Firefox—what's not to love?

#### Key Terms

##### Metamask

Metamask is a browser extension and mobile application that provides a cryptocurrency wallet.
- Makes it simple to do the following:
    - Interact with DApps
    - Send/receive Ethereum (and other cryptocurrencies)

You can download it [here](metamask.io).

#### Notes from the video

Let's wrap up with a high-level summary of everything we have learned so far! This will help bring everything full-circle.

##### Section Overview

What we will learn in the next set of videos:
- Setup IDE to code in Solidity
- Theory of Smart Contracts
    - Immutability
    - Stack
    - How they are executed/deployed
- Solidity Syntax
    - Writing basic smart contracts
    - More aspects of the Solidity language
- How to deploy to test networks and/or the real Ethereum network

##### MetaMask Setup

Metamask: Very popular cryptocurrency wallet
- We will use it in a lot of videos in this series

Download the Google Chrome extension here: https://metamask.io/

If you need to create a new wallet, agree to the terms, press 'Create a new wallet', and follow the instructions on-screen. Make sure to write down the following information with pencil and paper:
- wallet address
- password
- secret recovery phrase

Note: MAKE SURE TO HAVE YOUR SECRET RECOVERY PHRASE WRITTEN DOWN ON PAPER/PENCIL IN A SAFE LOCATION.

If you are importing an existing wallet (I am since I created a MetaMask account in 2021), agree to the terms, press 'Import an existing wallet', and follow the instructions on-screen. You will need the following information:
- 12-word secret recovery phrase

Once this has been entered in, you are logged in!

Head to the Metamask application by clicking Chrome > Extensions (Puzzle Piece) > MetaMask

##### MetaMask Walkthrough

If you click on MetaMask in the top right, you will see the following:
- Account Name: Account 1 (This is the default name)
    - You can setup different accounts, which can be on 
        - These are just different addresses/locations to send ETH

- Lock: Hitting this will lock MetaMask. (You will need to enter your password again before being able to buy/send ETH)

- Network we are currently on: 
    - Default: Ethereum Mainnet
    - You can also connect to other networks:
        - Binance Smart Chain
        - More!
            - If you hit 'Show test networks', you can switch over to one of those.
            - More on test networks: They are kind of like a "fork" of the Ethereum network. Properties include:
                - Meant for testing
                - All ETH on these networks is fake/free
                    - Typically: You would deploy smart contracts on a test network + make sure it working, before paying the real gas fee on the Ethereum Mainnet

- Address: Right by 'Account 1' you can copy/paste your public wallet address
    - We can head to https://etherscan.io/, a Blockchain Explorer, and view our address online.
    - Important information:
        - none (we have not done anything yet with these accounts)

- Buy: Deposit ETH/Other crypto

- Send: Creating transactions
    - Information needed:
        - Wallet address of recipient
        - Amount of ETH

- Swap: Swapping ERC-20 Tokens

##### Practice Questions

1. What is Metamask?
- A wallet application.

2. The password that Metamask asks you to enter is the same as your private key.
- False

Note: The password is used to encrypt your wallet, it is not the same as your private key. Applications like Metamask do not show you your private key, they simply lock/unlock it using your password.

### 2 - Remix IDE

A popular IDE for smart contract development with a cool name to boot!

#### Key Terms

##### Remix

Remix is a free IDE (integrated development environment) for smart contract development. It is available in-browser or as a desktop application.

You can download the desktop version (recommended) [here](https://remix-project.org/).

#### Notes from the video

##### Remix Introduction/Setup

Remix: an IDE for smart contract development
- Popular because it has online AND desktop versions
    - Recommended: Download the desktop application

- Main reason we use Remix: It makes it very easy to do everything we need to do! This included:
    - Writing code
    - Compiling smart contracts
    - Deploying smart contracts to different blockchain networks
    - "Virtual machine"

##### Remix Online IDE Walkthrough

Remix Online IDE - Properties:
- File Explorer (left pane):
    - Workspaces (folders for projects)
        - Online IDE stores all workspaces/data on your browser
            - Browser storage can be lost, so that is another reason why you should lean towards using the desktop version!
        - Example workspace: default_workspace
            - Folder: contracts
                - Files:
                    - 1_Storage.sol
                    - 2_Owner.sol
                    - 3_Ballot.sol
                        - Note: All solidity files end in .sol (that is the extension for smart contracts)

- Terminal (bottom of screen): Displays important actions made while interacting with the Remix IDE (i.e. sending a new transaction).
    - You can type in different commands, view logs of transactions, etc.

- Search: Search for different files, etc.

- Solidity Compilter:
    - You need to compile your smart contracts before deploying to a blockchain network
        - More on compiling later, but here's a quick lesson:
            - Write source code (Ethereum virtual machine cannot read this)
            - Compile source code into byte code
            - Ethereum virtual machine can now read byte code
            - You can now deploy
    - Allows you to choose compiler version

- Deploy & Run Transactions: Where you actually deploy smart contracts once they have been compiled
    - Environment to deploy in:
        - Remix VM
        - Injected Provider - Metamask (Deploy via MetaMask)
        - and more!
    - Account: Select test account
        - We are using the VM, a fake blockchain network
    - Gas limit
    - Value (Amount of ETH to send to smart contract)
    - Smart Contract (Which contract to send to)

- Solidity Static Analysis: This goes through and audits the smart contract for issues/problems

- Solidity Unit Testing: If you are writing a production application, you write tests for your code here

- Plugin Manager: Install plugins (just like any other IDE or editor)
    - Should have the following plugins installed:
        - Solidity Static Analysis
        - Solidity Unit Testing

- Settings:
    - Can change theme, etc.

That is it for the Remix IDE!

##### Remix Local IDE Walkthrough

Instructions:
- I downloaded this file: Remix-IDE-1.3.6-win.zip
    - Extracted all contents from zip folder
    - Run 'Remix-IDE-1.3.6-win.exe'

The desktop version is pretty much the same thing as online, except on your desktop.

We are missing a few thing, though:
- Plugins:
    - Go into the Plugin Manager (Ctrl-Shift-A) and download/activate the following:
        - Solidity Static Analysis (I believe it is now called 'Solidity Analyzers')
        - Solidity Unit Testing

Reminder: Use the Remix IDE Desktop Version!

##### Practice Questions

n/a

### 3 - Your First Smart Contract

This lesson will guide you to writing your first smart contract, an accomplishment that will undoubtedly become one of your life's fondest memories.

#### Key Terms

##### Pragma Line

In Solidity, the `pragma` line is placed at the beginning of a code file to indiciate the solidity compiler version(s) that can be used for this contract.

Example:

```
pragma solidity >=0.7.0 <0.9.0;
```

#### Notes from the video

##### Creating Your First Smart Contract

Let's start by creating a new workspace that we will be working in for the next few videos:
- Create new workspace: Workspaces > Create > 'blockchain-expert'
    - After creating this workspace, delete all of its contents (folders, dependencies, etc.)
- Create new folder: Create new folder > 'contracts'
- Create new file: Create new file > 'HelloWorld.sol'
    - Pascal case convention: Begin with a capital letter, use capital letters for each word in the filename.

##### Pragma Line

The first thing you write with each Smart Contract is the Pragma Line.
- What it does: States which compiler versions work for this smart contract
    - Solidity is fairly new, so there are a lot of new features begin added. The older (or even newer) versions of the compiler may not always work!
- How to set the Pragma Line:
    - min
    - max

Example:

```
pragma solidity >=0.7.0 <0.9.0;
```

##### Contract Class / Class Variables

Next, we will write the Contract Class.

Contracts Class:
- Contract: Special class type for Smart Contracts
    - Has the logic for your smart contract
- You can import from other files and use them within your Solidity file
- Typically: Name of contract == name of filename
    - If you have multiple contracts in one file, you obviously can ignore this

Example:

```
contract HelloWorld {
    uint256 number;
}
```

Note: We will get into data types more later, but here is a breakdown of what we currently have:
- uint256: Can store an unsigned integer with 256 bits.

##### Functions/Operations

Next, let's write the following:
- a function that will allow us to assign a value to this uint256 variable `number`
- a function that will allow us to retrieve the `number` value

Notes:
- `public` in the function definition means that the function is callable.
- `returns (uint256)` in the function definition means that the function will return a uint256.

Current state of code:

```
pragma solidity >=0.7.0 <0.9.0;

contract HelloWorld {
    uint256 number;

    function store(uint256 num) public {
        number = num;
    }

    function get() public view returns (uint256) {
        return number;
    }
}
```

Save the contract - this will cause the contract to automatically be compiled by Solidity. (You can disable this in the settings if you'd like - I will leave as-is)

##### Deploying to Local VM

Before we can execute our smart contracts and deploy them, we need to compile them.

(Even though saving the file should have compiled our code, let's do it manually to get the hang of it.)

Head to Solidity Compiler > select a Compiler that will fit into the Pragma conditions (anything 0.8 will work) > Press 'Compile HelloWorld.sol'

Now that it has been compiled, let's head to Deploy & Run Transactions.

In Deploy & Run Transactions, take note of the following:
- Environment: Remix VM (London)
    - You don't have to worry about the difference between London/Berlin
    - This is the Remix Virtual Machine, ie. a temporary blockchain (this lets us test out the smart contract)
        - One note about Virtual Machines: Any state associated with our Smart Contract will not be stored persistently
            - As soon as we turn off/on our computer, or close/open Remix IDE, our state will be destroyed (in other words: this is only used for basic testing purposes)

- Account: 
    - We are given 10-15 accounts by default (to test/mess around with), all have 100 Ether

- Gas Limit: The maximum amount of gas we will allow the smart contract to represent
    - Allows the smart contract to actually operate (all operations in the smart contract cost a certain amount of gas)

- Value: 

- Contract: Select HelloWorld.sol
    - Sometimes we will have multiple contracts, so this is how we switch between them\

- Deploy: This will deploy your contract!
    - After deploying, we will see output in the terminal:
        - creation of HelloWorld pending... [vm]from: 0x5B3...eddC4to: HelloWorld.(constructor)value: 0 weidata: 0x608...00033logs: 0hash: 0x4cb...df349
            - This means "you have successfully deployed the smart contract!"

Reminder: This is all local - not actually on the blockchain and is for testing purposes on a temporary blockchain!

Next, scroll down to Deployed Contracts, hit the dropdown box next to HelloWorld, and we will see the 2 functions we wrote:
- store: set a value
    - default value: 0
    - if you store a 10, it will send that value to the smart contract, and you will get the following in the terminal: [vm]from: 0x5B3...eddC4to: HelloWorld.store(uint256) 0xD7A...F771Bvalue: 0 weidata: 0x605...0000alogs: 0hash: 0xb4e...a4154
- get: get a value
    - you will see 'uint256: 10' when pressing this button

In reality: In order to be able to call the store function, you must submit a transaction.
- This is because you are modifying state
    - You need a gas fee to do this
    - You also need to wait a few seconds because miners/validators on the Ethereum network need to mine it
        - Once this is done, the value will update

Takeaways:
- This is a very basic smart contract to explain some of the different concepts we will need going forward
    - Some of it may be confusing right now, but it will start to make more sense as we go along!
- Remember: If we close/re-open Remix IDE, we will have destroyed the temporary blockchain network, and the value of 10 will be gone from our smart contract.

##### Practice Questions

1. What is the purpose of the pragma line at the beginning of a Solidity program?
- To specify the Solidity compiler version this contract is written for.

2. Which of the following code snippets accurately defines a Solidity smart contract with the name HelloWorld?
- Code chunk below:

```
contract HelloWorld {
  ...  
}
```

Note: A Solidity smart contract uses the keyword contract and the pascal case naming convetion for the class name.

3. What character is used to terminate lines in Solidity?
- ;

4. What is the correct file extension for Solidity code?
- .sol

### 4 - Smart Contract Theory

It's time to dive deeper into the weeds of smart contract theory in our quest for smart contract mastery.

#### Key Terms

##### Transaction

In the context of blockchains, a transaction (commonly denoted "tx") represents a state changing operation.
- May represent the transfer of coins, or the invocation of a smart contract.

##### Call

In the context of smart contracts, a call is a free operation that reads information from a smart contract.
- Calls do not require transactions, therefore cannot modify the state of a smart contract 

##### Gas

In the context of Ethereum, gas is a fee required to execute transactions or smart contracts.
- Gas is paid in Ether
- Gas is denoted in gwei

##### Source Code

Source Code is the code that programmers write/read.

##### Bytecode

Bytecode is the program code that has been compiled from source code into a lower level language that can be understood by an interpreter.

#### Notes from the video

Smart Contract Theory:
- How to write Smart Contracts 
- Terminology
    - How they are deployed
        - Source code vs. bytecode
    - Gas/Transactions/Calls
    - Storage options
        - Memory
        - Storage
        - Stack
    - Op codes

Current state of our code:

```
pragma solidity >=0.7.0 <0.9.0;

contract HelloWorld {
    uint256 number;

    function store(uint256 num) public {
        number = num;
    }

    function get() public view returns (uint256) {
        return number;
    }
}
```

##### Contract Deployment Process

Starting out: How do we get our code that we have written, onto the blockchain? (We should have some idea of how this works, but let's go deeper into it)

Answer: 

- Source code: High level, human-readible
    - Not typically executed
        - Un-optimized/inefficient
        - This is where a compiler comes in
- Compiler: Takes source code and re-writes it into a way our machine can understand it
    - Compiles Solidity into Bytecode
- Bytecode: Lower level code 
    - Not easy for humans to understand, but a machine can
    - This is what the machine actually reads/executes

We now have the information needed to send our smart contract to the blockchain!

Note: The blockchain stores our Bytecode, not our Source Code

EVM (Ethereum Virtual Machine): An interpreter for the Bytecode
- Interpreter: Can read code and execute instructions based on it
- All of the full nodes on the Ethereum blockchain run a version of the EVM, making them capable of reading/executing Bytecode

Steps to Deploy our Smart Contract:
- Compile our Source code into Bytecode
- Bundle up our Bytecode and send it to the blockchain in a transaction
    - Once we pay our fees, it will be mined, and added to the blockchain, making our contract immutable
    - It now has an address, and we can interact with the code on the blockchain!
- We then have different nodes sitting on the blockchain network that are able to execute the smart contract by running their Ethereum Virtual Machine
    - This can be done with one of the following:
        - Transactions
        - Calls

##### Calls vs. Transactions

State: Something permanent stored in the blockchain database
- Same for every person that interacts with the contract
    - Must be validated and stored
        - Expensive to store state (any data stored permanently on the blockchain costs us a lot money)

- Goal of smart contracts: Minimize amount of state!
    - As mentioned before: Expensive to store state

- Anything in state == Secure
- Whenever you write something inline with the contract, it is considered state
    - When the contract is first deployed, we allocate blockchain resources for storing the value of state 
        - By default: 0 (default for uint256)


As mentioned above, when interacting with the contract, we can do so in 2 ways:
- Call: For reading/viewing information on the blockchain
    - Free
        - We are getting the current state, not modifying anything

Note: Beyond scope of this video, but sometimes you have to pay for a call.

- Transaction: 
    - For modifying/updating state
    - Requires Gas Fee
        - We are modifying the current state, and since a transaction has to be mined/validated by the nodes on the network, run through EVM, we must pay

##### Gas and Transactions

Transaction:
Gas: Fee given to miners
- Not related to: Traffic on network
- Related to: Gas required for specific operations (Proportional to the type of computations you are performing)
    - Example: Lots of state changes/lots of computations: More gas
    - Example: Something simple: Less gas
        - We will go into these calculations more later

- Address: Address of the Smart Contract on the Blockchain
    - Smart contracts have their own address/balance, and sit on the network like any other account

- Data: What operation we want to perform
    - Will be in a format difficult for use to read
    - Example: store(7)

All of this gets bundled into the transaction we are submitting to our blockchain network.

Steps to submit a transaction to change state:
- You call store(7), it goes to the transaction pool
- One of the miners sees your transaction in the transaction pool
- Miner performs the operations on the smart contract, using Ethereum Virtual Machine (EVM)
- New state is determined / updated
- A block is submitted that says "based on this transaction, this smart contract now has a new value of state, which is 7"
- Block is broadcasted out to the network, and validated by other miners/nodes sitting on the network
- Assuming everything is correct, this transaction is in and the state has changed!

One last note: Transaction are asynchronous
- What this means: Transactions can take any amount of time
    - You don't know when/if it will go through, since we never know if/when your transaction will be validated
    - You cannot return a value from transactions
        - Instead: You would make a call to view OR listen for an event using a webhook (More on this later...)

##### Op Codes

Back to beginning of video, this is what we have:
- We have Source code
- We compile Source Code to get Bytecode
- We submit Bytecode to the blockchain network
    - This Bytecode is made up of 'Op codes'

Op codes (Operational codes): What is understood by Ethereum Virtual Machine
- Made up of 2 hexadecimal digits
    - hexadecimal digits: 0-9, a-f (16 digits total)
        - 16*16 = 256 possible operational codes
            - Currently: Solidity implements 140 Op codes, so we have room for 116 in the future
                - These 140 Op codes allow Solidity to be Turing Complete
                - All of these codes are associated with a specific operation (typically a low-level operation) 
                    - Example: Op code 1 - This op code may 'Jump' to another Op code or Block

- Each op code has a required amount of gas to perform the operation
    - Depends based on other factors, but value varies

You will see Op Codes if you look at graphs/charts on Solidity!

##### Types of Smart Contracts

In our Smart Contracts, we have 3 main areas/methods to store data:

1. Storage: Holds state
- Permanent
- Stored on blockchain
- Most expensive way to store something (expensive: gas needed to write/change values)
- Can store large values, essentially whatever you'd like

2. Memory (Similar to RAM on computer): Holds arguments you pass to different functions
- Temporary
- Used during functions arguments (cleared after usage)
- Much cheaper than storage
- Can store relatively large values
- Example: 
    - I just need access while processing the function, after it is done, I don't need that value anymore

3. Stack: Local function variables
- Temporary
- Used for small values that need to be accessed immediately/quickly
- Cheaper than memory
- Can only store small values
    - The stack is very small, can only store 1024 different values - Each are stored in 32 bits spots (not a lot of bits)
- Example:
    - Array will not fit in the stack (not enough slots)

Advice:
1. Storage: Permanent - Only use if you absolute need it to be permanent/state of the project
2. Memory: Temporary - Relatively large values
3. Stack: Temporary - Very small values, limited slots
- default location for values that need to be immediately accessed
    - try to fit into stack, if you cannot, use storage

Note: You will never be manually referencing the stack, but you will with Memory + Storage.

##### Practice Questions

1. What is source code? Select the best definition.
- The code that programmers/humans write.

2. Select all of the true statements as they relate to smart contract calls.
- A call typically reads data from a smart contract and does not result in state changes.
- Anyone can perform a smart contract call.
- Calls are typically executed instantly.

Notes: 
- Most calls are instant and do not require any gas.
- Anyone can make a smart contract call as these calls simply return data that is publicly available on the blockchain.

3. Select all of the true statements as they relate to smart contract storage.
- All smart contract state variables are stored in storage.
- Storage is permenant and cannot be changed without a transaction.

Note: You should only use storage when necessary.

4. Select all true statements as they relate to smart contract memory.
- Memory is a cheap way to store temporary data.
- Memory is used to store larger values like arrays, strings and structs that can't be stored on the stack.

5. Smart contracts always require the same amount of gas to execute any arbitrary operation?
- False

### 5 - Deploying Smart Contracts

How do you deploy smart contracts to an actual live network? You've got questions, we've got answers.

#### Key Terms

##### EVM (Ethereum Virtual Machine)

The EVM (Ethereum Virtual Machine) is a computation engine that runs on Ethereum nodes such as miners.
- EVM allows for the execution of smart contracts
- EVM is also the foundation for Ethereum's entire operating structure

#### Notes from the video

Learn about Ethereum Mainnet vs. Ethereum Testnets [here](https://ethereum.org/en/developers/docs/networks/).

##### Ethereum Test Networks

Ethereum Mainnet: The main network

Ethereum Testnets: Test Networks
- There are bunch of them
    - they are all unreliable
    - less decentralization
    - used just for testing
    - provided by the community
    - if the one you want to use doesn't work, don't worry - they are all essentially the same

- Examples:
    - Sepolia
    - Goerli
    - Ropsten (depracated - we can still use, may not have all features though)
    - ...
    - Layer 2 test networks (not going to get into these)

Fortunately: We are not going to be deploying to a real/persistent network in this video, just a test network!

For all of these test networks, we have the following:
- main page
- faucet

##### Faucets

Faucet: Way to get free Ethereum on test networks
- Unfortunately: Many of these faucets simply do not work

Let's try and get some free Ethereum!

Steps:
- Change which network your MetaMask wallet is on: MetaMask > Networks > Show test Networks > Sepolia
    - You should see '0 GoerliETH' instead of '0 ETH'
- Connect your wallet to a Faucet and send yourself some ETH: https://sepoliafaucet.com/ > Enter Wallet Address > 'Send me ETH'.
    - Once the Request is complete, you should see the following:
        - 0.5 SepoliaETH in your MetaMask wallet
        - Link to the transaction hash on Etherscan (See the note: [ This is a Sepolia Testnet transaction only ])

Note: Your wallet address is the same for each test network.

##### Deploying to Test Networks

Now that we have some test Ethereum, let's deploy to the test Ethereum network!

Steps:
- Open up Remix IDE in your Google Chrome browser: https://remix.ethereum.org/
    - Why we are not using Desktop: It is difficult to connect MetaMask to the desktop
- Solidity Compiler: Compile the file '1_Storage.sol'
- Deploy & Run Transactions:
    - Environment: Injected Provider: MetaMask
        - This will open MetaMask and prompt you to connect to the wallet with 0.5 SepoliaETH
    - Account: This is your account with 0.5 ether
    - Deploy: Once you press Deploy, MetaMask will open, and you will hit 'Confirm'
        - If you click the link to view on Etherscan, you can see contract details.

Note: 2_Owner.sol is a larger file with more bytes, so it will require more gas if you want to Deploy! (almost double in this case)

Now that we can see our deployed contract transaction on Etherscan, let's update the state!
- Remix IDE > Deployed Contracts
    - Store a new number:
        - To update state: You need to send a transaction (MetaMask pops up)
    - Retrieve:
        - No need to send a transaction (MetaMask will not pop up)

##### Practice Questions

n/a

### 6 - Data Types

What do Pokémon and Solidity data have in common? They both come in a variety of different types!

#### Key Terms

##### Data Types

In Solidity, data types are separated into value types and reference types.
- The common value types are as follows:
    - uint
    - int
    - bool
    - address
    - bytes

#### Notes from the video

##### Data Types Overview

Note: There are many other data types - these are the simple value data types. (We will go over the rest of the value data types, and the reference data types, in another video)

Solidity: Strongly typed language
- What this means: When you declare a variable, you need to do the following:
    - declare the type
    - make sure it stays that type the entire program
        - if it does not, you will crash the program/compiler will not let you compile

Note: Python is a dynamically typed programming languages, where you can change the type of values.

Unlike many dynamically typed programming languages, you can declare a program without giving it a value:

```
contract HelloWorld {
    uint x;
}
```

This will give x the default value for a uint type, which is 0.

##### Value Data Types

Types we want to talk about:

```
contract HelloWorld {
    unit
    // signed int: one of the bits being used is the signed bit, we can store negative values
    int
    // boolean: true/false (lowercase)
    bool
    // address: an Ethereum address
    // - default: address(0) or address(0x)
    // - uses 20 bytes / 160 bits to store a value (by default)
    address
}
```

##### uint

uint: un-signed integer
- un-signed meaning: no +/- sign (no negative values!)
- can store from 0 -> number of bits it is using to represent its value, minus 1
    - this is because the 0 is taking up a value
- default value: 0
- uint defaults to the uint256 variant (which takes up the most space)
    - if you try and store a value too large for your unit size, you get a compiler error

```
contract HelloWorld {
    // uint: unsigned int
    uint    // 32 bytes
    uint8   // 1 byte   (goes from 0 to 2^8 - 1)
    uint16  // 2 bytes  (goes from 0 to 2^16 - 1)
    uint32  // 4 bytes  (goes from 0 to 2^32 - 1)
    uint64  // 8 bytes  (goes from 0 to 2^64 - 1)
    uint128 // 16 bytes (goes from 0 to 2^128 - 1)
    uint256 // 32 bytes (goes from 0 to 2^256 - 1)
}
```

##### int

uint: un-signed integer
- can store from negative number of bits -> number of bits minus 1
    - this is because the sign (+/-) is taking up a value, and so is the 0
- default value: 0
- uint defaults to the uint256 variant (which takes up the most space)
    - if you try and store a value too large for your unit size, you get a compiler error

```
contract HelloWorld {
    // int: signed int
    int    // 32 bytes
    int8   // 1 byte   (goes from -2^(8-1) to 2^(8-1) - 1)
    int16  // 2 bytes  (goes from -2^(16-1) to 2^(16-1) - 1)
    int32  // 4 bytes  (goes from -2^(32-1) to 2^(32-1) - 1)
    int64  // 8 bytes  (goes from -2^(64-1) to 2^(64-1) - 1)
    int128 // 16 bytes (goes from -2^(128-1) to 2^(128-1) - 1)
    int256 // 32 bytes (goes from -2^(256-1) to 2^(256-1) - 1)
}
```

Note: You cannot make a larger bit int (ie. int32) fit into a smaller bit int (ie. int8), unless you use type a conversion. Example:

```s
int32 y = 8;
int8 x = y; // error
int8 x = int8(y); // type conversion (good, as long as the number is not too large)
```

##### bool

bool: boolean value
- can only store 2 values (anything else gets a compile error):
    - true
    - false

##### address

address: stores an ethereum address
- any to/from address
- default value: address: 0x0000000000000000000000000000000000000000

You can see the default value with a function like this:

```s
// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.2 <0.9.0;

contract HelloWorld {
    address x;

    function getAddress() public view returns(address) {
        return x;
    }
}

```

Note: I did the following in Remix Online IDE to test this out:
- copy/pasted this into HelloWorld.sol
- compile
- deploy
- deployed contracts > getAddress
    - return value: address: 0x0000000000000000000000000000000000000000

##### Variable Naming

Variable Naming: Regular, using Camel Case
- Camel Case:
    - capital letters at the start of words
    - no underscores
    - no special characters
- Cannot start with a number

##### Comments

Anything that is commented out will be ignored by the compiler. (Simply there for documentation/readability)

How to do a single line comment:

```
// hello world
```

How to do a multi-line comment:

```
/*
hello
world
*/
```

##### Practice Questions

1. Which of the following are valid data types in Solidity? Select all that apply.
- uint
- int
- address
- bool

Note: Reference data types like arrays will be covered in later lessons.

2. How many bits can the uint8 data type store?
- 8

Recall, 8 bits = 1 byte. Hence, the unit8 data type can store 1 byte/8 bits.

3. What are the accepted values for the bool type in Solidity? Select all that apply.
- true
- false

4. Referring to the Solidity smart contract below, what is the value of the variable x?
- address(0)

```
contract BlockchainExpert {
  address x;
}
```

Note: In Solidity, the default value of the address type is the zero address which can be represented by address(0) or 0x0000000000000000000000000000000000000000, which is a 20 byte long value.

5. Write a smart contract named DataTypes that declares four public state variables as follows:
- A variable named smallNumber that can store numbers in the range of 0 - 255 that is equal to 9.
- A variable named negativeNumber that can store numbers in the range of -127 - 128 that is equal to -7.
- A variable named zeroAddress that stores an address and is equal to the zero address.
- A variable named canEdit that stores a boolean and is equal to true.

Use the most correct data type for each variable. The order in which you declare them does not matter.

Note: For our automated tests to run properly you'll need to make sure you denote your state/storage variables as public. For example, if you were defining a variable named x, you'd do it like so: uint public x;.

My answer:

```s
pragma solidity >=0.4.22 <=0.8.17;

// Write your code here
contract DataTypes {
    uint8 public smallNumber = 9;
    int8 public negativeNumber = -7;
    address public zeroAddress;
    bool public canEdit = true;
}

```

### 7 - Operators & Type Conversions

What do Porygon (the Pokémon) and Solidity have in common? They can both convert types!

#### Key Term

##### Logical Operators

In Solidity, the Logical Operators are implemented using the following symbols:
- && == and
- || == or
- ! == not

#### Notes from the video

##### Arithmetic Operators

Arithmetic Operators:
- `+`
- `-`
- `/`
- `*`
- `&`
- `++`
- `--`

```
contract HelloWorld {
    int y = 9;
    uint x = 10;

    function op() public {
        x = x + 1; // 11
        x++;       // 11
        x = x - 1; // 9
        x--;       // 9
        
    }
}
```

Rules:
- Division: You will always get the same type back as the main type, which in the case of `x = x / 7` would be the left-hand side

- When working with arithmetic, types should be one of the two:
    - the same
    - easily converted (compiler can convert for us)

- Working with decimals in Solidity is quite complicated

- Rule of thumb: Go with the larger/more detailed type
    - Even if it takes up more space, at least it will not error out

- 

Note: An overflow is when you assign a negative value to an unsigned int. Example:

```
contract HelloWorld {
    int y = -9;
    uint x = 10;

    function op() public {
        x = x + uint(y);
    }
}
```

Tip: Convert uint into int
- Can get a runtime error if you do it the other way around!

Now, let's look at an example doing arithmetic with same base type, but different number of bits:

```
contract HelloWorld {
    uint8 y = 9;
    uint x = 100000;

    function op() public {
        x = x + y; // works (x is uint256, so it can handle an uint8)
        y = x + y; // may not work (y is a uint8, so it cannot handle a uint256)
        y = uint8(x) + y; // types match on left and right side now, but x is too large for uint8
    }

    function getY() public view returns (uint8) {
        return y; // if you call the first first and then this, you will not get 10009 (integer overflow)
    }
}
```

Takeaways:
- When you convert down on the base type, you will get a different number
    - This is another subject on what number you get, but just know this is integer overflow. 

##### Conditional/Comparison Operators

Conditional/Comparison Operators:
- `==`
- `!=`
- `>`
- `<`
- `>=`
- `<=`

These work the same as other programming languages
- However: Left/Right side operands need to be the same type or convertible

Example without type conversions:

```
contract HelloWorld {
    int8 y = 9; // would not work
    uint8 y = 9; // works!
    uint x = 100000;

    function op() public {
        bool result = (x == y);
    }
}
```

Example WITH conversions:

```
contract HelloWorld {
    int8 y = 9;
    uint x = 100000;

    function op() public {
        bool result = int8(x) == y; // does not work (cannot convert x from uint256 to int8 - not enough bits!)
        bool result = int(x) == y; // works (int256 works, y becomes an int256, and it works)
    }
}
```

Note: All of the operands work the same way when it comes to type conversions.

##### Logical Operators

Logical Operators:
- `&&`
- `||`
- `!`

Ordering for chained conditions:
- NOT
- AND
- OR

##### Assignment Operators

Assignment Operators:
- `=`
- `+=`
- `-=`
- `*=`
- `/=`
- `%=`

```
contract HelloWorld {
    int8 y = 9;
    uint x = 100000;

    function op() public {
        y = y + 100; // old way
        y += 7;      // assigns to y
        y -= 8;      // assigns to y
        y *= 8;      // assigns to y
        y /= 8;      // assigns to y
        y %= 8;      // assigns to y
    }
}
```

##### Video Takeaways

Notes:
- When we want to perform type conversion, we use construction syntax ie. `int8()`
    - This is a constructor
    - This is how we perform type conversions

- Most important thing to learn from this lesson:
    - Type conversions
        - Implicit/Explicit
        - Which types are comparable
            - which ones Solidity takes care of for you
            - which ones you must take care of yourself
    - Overflows
    - What happens when you convert larger value to smaller data type
        - runtime error
        - weird number spits out