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

##### Practice Questions

1. Counter - Complete the `Timer` smart contract such that each functions implements the functionality described below. All of these functions should use the `count` state variable. The `count` variable represents the number of seconds on the timer that have elapsed.
- `increment`: should increase the count by one.
- `decrement`: should decrease the count by one.
- `reset`: should reset the count to zero.
- `addBy`: should add the passed value to the count.
- `subtractBy`: should subtract the passed value to the count.
- `multiplyBy`: should multiply the count by the passed value.
- `getMinutesElapsed`: should return the number of minutes based on the current count (there are 60 seconds in 1 minute).

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Counter {
    uint256 public count;

    function increment() external {
        count++;
    }

    function decrement() external {
        count--;
    }

    function reset() external {
        count=0;
    }

    function addBy(uint256 value) external {
        count+=value;
    }

    function subtractBy(uint256 value) external {
        count-=value;
    }

    function multiplyBy(uint256 value) external {
        count*=value;
    }

    function getMinutesElapsed() external view returns (uint256) {
        return count/60;
    }
}

```

2. Complete the functions in the contract `LogicGates` such that they implement the functionality described below:
- `and`: return `true` if both the arguments passed to the function are `true`; otherwise, return `false`.
- `or`: return `true` if either of the arguments passed to the function are `true`; otherwise, return `false`.
- `not`: return `true` if the input passed is `false`; otherwise, return `false`.
- `xor`: return `true` if one of the two inputs passed are `true`, but not both; otherwise, return `false`.

My answer:

```s
pragma solidity >=0.4.22 <=0.8.17;

contract LogicGates {
    function and(bool a, bool b) public pure returns (bool) {
        return (a && b);
    }

    function or(bool a, bool b) public pure returns (bool) {
        return (a||b);
    }

    function not(bool a) public pure returns (bool) {
        return !a;
    }

    function xor(bool a, bool b) public pure returns (bool) {
        // return ((!a)||(!b));
        return (a && !b) || (!a && b);
    }
}

```

### 8 - Conditionals

Conditionals are just as fundamental to Solidity as they are to most other programming languages, so don't skip this video. No ifs and elses buts about it!

#### Key Terms

##### Conditional Operators

Solidity has the following Conditional Operators:
- `<`
- `<=`
- `>`
- `>=`
- `==`
- `!=`

#### Notes from the video

##### if/else/else if

Let's look at the if/else/else if structure in Solidity:

```s
pragma solidity >=0.4.22 <=0.8.17;

contract HelloWorld {
    bool canEdit = true;
    bool admin = false;

    function canEditDoc() public view returns (bool) {
        if (canEdit) {
            return true;
        }
    }
}

```

##### Conditional Operator

Conditional Operator: Shorthand for writing simple if-statements
- This is the 1 line if-else:
    - condition 
    - then (?)
    - else (:)

Example:

```s
contract HelloWorld {
    bool canEdit = true;
    bool admin = false;

    function canEditDoc() public view returns (uint) {
        // basic example
        // return canEdit || admin ? 1 : 0;
        
        // nesting!
        uint8 result = canEdit || admin ? (true ? 1 : 0) : 0;
        return result;
    }
}
```

##### Practice Questions

1. Within the `Comparison` smart contract complete the `compare` function that accepts two `int` arguments. This function should return the following `int` values:
- `0`: if the arguments are the same value.
- `1`: if the first argument is greater than the second.
- `-1`: if the second argument is greater than the first.

Please use `if/else/else if` statements to complete this problem.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Comparison {
    function compare(int256 a, int256 b) public pure returns (int256) {
        if (a==b)
        {
            return 0;
        }
        else if (a>b)
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}

```

2. Within the `Comparison` smart contract complete the `compare` function that accepts two `int` arguments. This function should return the following `int` values:
- `0`: if the arguments are the same value.
- `1`: if the first argument is greater than the second.
- `-1`: if the second argument is greater than the first.

Please use the conditional operator `?` to complete this problem. (You may need more than 1)
- Do not use `if/else/else if` statements

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Comparison {
    function compare(int256 a, int256 b) public pure returns (int256) {
        return a==b ? int256(0) : (a>b ? int256(1) : (int256(-1)));
    }
}

```

### 9 - Mappings

Solidity's version of dictionaries allows you to store and look up key-value pairs, much like a physical dictionary lets you look up words and their associated definition.

#### Key Term

##### Mapping

In Solidity, the reference data type known as `mapping` allows you to store key-value pairs.
- Mappings, like in other languages, are useful for quickly accessing associated data.
- Mappings can only be stored in contract storage

#### Notes from the video

##### Mappings

Mappings: Similar to hashmaps, dictionaries, etc. (Key-value pairs)
- They are a bit different due to some limitations, such as:
    - You can only use certain types for the key: (Hash to be something hashable/fixed value)
        - uint
        - 
        - 
    - You cannot initialize a map with values (You must create an empty map, and add on later)
    - 

Let's get into an example:

```
contract HelloWorld {
    mapping(uint => bool) map;

    function addItem(uint key, bool value) public {
        map[key] = value;
    }

    function getItem(uint key) public view returns (bool) {
        return map[key];
    }
}

```

Notes:
- If you try and retrieve a value you have not added yourself, it will return the default value for that data type.
    - Example: bool (false), uint (0)
        - Keep this in mind: Makes it difficult to tell if we set a value, since we get a value back no matter what...
            - Will have to use auxiliary data structure to be able to keep track of what we have added.

##### Nested Mappings

Nested Mappings: 
- This involves making the value of the map, another map!

Let's look at another example: (Note how we have changed value/return types to int)

```
contract HelloWorld {
    mapping(uint => mapping(uint => int)) map;

    function addItem(uint key, uint key2, int value) public {
        map[key][key2] = value;
    }

    function getItem(uint key, uint key2) public view returns (int) {
        return map[key][key2];
    }
}

```

##### Mappings as Local Variables

Mappings vs. Local Variables (Using a Map inside of a function as a local variable)

```
// This does not work!
contract HelloWorld {
    function x() public {
        mapping(uint => int) storage map;
    }
}
```

2 problems with this code:
1. We are going to have to store this somewhere other than the stack (For this data type, you cannot be in the stack)
- How: specify `storage` when initializing the map
    - This also gets an error, taking us to #2...
2. There is a rule that you cannot make an empty map inside of the function
- You cannot create them dynamically, must assign from a state variable


How to fix: Copy an existing map and then change within the function
- initialize an empty map in the State/Storage of the contract
- initialize your map from that map

```
contract HelloWorld {
    mapping(uint => int) map1;

    function x() public {
        mapping(uint => int) storage map = map1;
        map[0] = 1;
        map[1] = 2;
    }

    function getItem(uint key) public view returns (int) {
        return map1[key];
    }
}

```

What happened here:
- Made a reference to existing map
    - Any changes you make to `map` will go onto `map1`

Takeaway: It is not very useful to use maps inside of functions as local variables!

##### Map Limitations

Map Limitations: We cannot access all of the keys/values at all time at once
- Nothing like this:
    - .keys()
    - .values()
- How to get around this: Using an external data structure
    - Initialize an array
    - Store keys in the array that you have added to the map
    - Remove keys from the array that you have removed from the map

Notes:
- If you never add any value that is default, you don't need the external data structure
    - If it has a value 0, it means you have not added it yet
    - If it has a value other than 0, it means you HAVE added it!

##### Mappings as Parameters

Mappings as Parameters to a Function: (It is a little bit confusing)
- Other programming languages: You can make the 1st function arg a mapping/hashmap
- Solidity: You cannot do this
    - You cannot have parameters to functions that are not in-memory (default: they are in the stack)
        - But then, if you put it in-memory, you get an error saying nested mappings must be in-storage
            - This happens because the access/visibility modifier `public`

Remedy: This is the only way to use a mapping as a parameter to a function:

```s
contract HelloWorld {
    function x(mapping(uint => uint) storage map) internal {
        ...
    }
}

```

Why this works:
- Visibility modifier must be `internal` (More on this later!)
    - The function can only be called within the smart contract
        - Cannot be called from outside blockchain/the contract itself (if you deploy, you cannot use Remix IDE to access it)

- Type must be `storage`

Takeaways:
- Mappings are very limited
    - Typically: Only used as state for the contract
- To use within a local function: You are copying the existing mapping
    - This is essentially making a reference to it (anytime you change the mapping you defined, it changes the original as well)

##### Practice Questions

1. Write a smart contract named `Inventory` that declares a state variable named `quantities` that holds a `mapping` of `uint` to `int`. Each `uint` key will represent the id of a specific item, while each `int` value will be the quantity of that item in the inventory.

Implement the following functions in this smart contract. Do NOT change any of the function signatures.
- `addItem(uint itemId, uint quantity)`: Adds an item to the inventory by adding it to the `quantities` mapping. If the `itemId` already exists in the mapping it should increment the value associated with the `itemId` key by the passed quantity.
- `getQuantity(uint itemId)`: Returns the quantity of the passed `itemId` that is currently stored in the `quantities` mapping. If there is no item with the given `itemId`, it should return `-1`.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Inventory {
    // Write your code here
    mapping(uint => int) quantities;

    function addItem(uint256 itemId, uint256 quantity) public {
        // 
        quantities[itemId] += int256(quantity);
    }

    function getQuantity(uint256 itemId) public view returns (int256) {
        // 
        if (quantities[itemId] == 0) {
            return -1;
        }
        else {
            return quantities[itemId];
        }
    }
}

```

2. Write a smart contract named `DebtTracking` that declares a state variable `owing` which is of the type `mapping(address => mapping(address => uint))`. This nested mapping maps the addresses of people who are owed money with a mapping containing all of the addresses that owe this user money, and how much money they owe. See below for an example:

If address `1` is owed `5 ether` from address `2`, and `7 ether` from address `3`, then the mapping would look like this:

```
1: {
    2: 5,
    3: 7
}
```

Complete the following functions on this smart contract:
- `addDebt(address toBePaidAddress, address payingAddress, uint amount)`: Adds the correct entry in the mapping to indicate that `payingAddress` owes `toBePaidAddress` `amount` ether.

- `payDebt(address toBePaidAddress, address payingAddress, uint amountPayed)`: Updates the mapping accordingly to reduce the amount of debt owed by `payingAddress` to `toBePaidAddress` by the `amountPayed`. If `amountPayed` is greater than the amount that was owed, then update the mapping accordingly such that `toBePaidAddress` owes `payingAddress` the difference/change.

- `getDebt(address toBePaidAddress, address payingAddress)`: Returns the amount of ether that `payingAddress` owes `toBePaidAddress`.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract DebtTracking {
    mapping(address => mapping(address => uint)) owing;

    function addDebt(
        address toBePaidAddress,
        address payingAddress,
        uint256 amount
    ) public {
        owing[toBePaidAddress][payingAddress] += amount;
    }

    function payDebt(
        address toBePaidAddress,
        address payingAddress,
        uint256 amount
    ) public {
        if (amount <= owing[toBePaidAddress][payingAddress]) {
            // normal
             owing[toBePaidAddress][payingAddress] -= amount;
        }
        else if (amount > owing[toBePaidAddress][payingAddress]) {
            // if there is change
            owing[payingAddress][toBePaidAddress] = amount - owing[toBePaidAddress][payingAddress];
            owing[toBePaidAddress][payingAddress] = 0;
        }
    }

    function getDebt(address toBePaidAddress, address payingAddress)
        public
        view
        returns (uint256)
    {
        return owing[toBePaidAddress][payingAddress];
    }
}

```

### 10 - Functions and Access Modifiers

Like in many other programming languages, functions in Solidity come with a variety of access and behavioral modifiers.

#### Key Terms

##### Public

In Solidity, `public` is a visibility modifier that can be used to mark variables and functions as accessible from within or outside of the contract.
- Any variable or function marked as public can be accessed from any location.

##### Private

In Solidity, the `private` visibility modifier is used to mark a function or variable as only accessible from within the contract it is defined in.
- Private functions and variables cannot be accessed from any of the following:
    - derived contracts
    - outside of the blockchain
    - any location other than the contract they are defined in!

Note: even if something is marked as `private`, its value can still be read from outside of the blockchain. (This is because everything on the blockchain is publicly available and transparent, remember)

##### Internal

In Solidity, `internal` is a visibility modifier that can be used to mark functions and variables as only accessible from within the contract or any derived contracts.
- `internal` functions can only be called from the contract type they are defined in.

##### External

In Solidity, `external` is a visibility modifier that can be used to mark functions and variables as only callable from outside of the contract itself.
- `external` functions can only be called from outside of the blockchain or from another smart contract.

##### Pure

In Solidity, a `pure` function is one that does not rely on any contract state to execute.
- However: pure functions can call other pure functions and utilize types like structs, enums

##### View

In Solidity, a `view` function is one that does not mutate/modify the state of a contract but may read it.
- View functions can read contract state and call other view/pure functions

#### Notes from the video

##### Internal (Variables)

When we make a variable, by default the visibility/access modifier is internal.

```
contract HelloWorld {
    uint x = 0;
    uint internal x = 0; // same thing
}
```

What private means:
- This variable can only be accessed by the contract, or a derived contract (Same as 'protected' in Java)
    - derived contract: a contract that inherits from this contract (uses it from its base class - think Inheritance from Object Oriented Programming)

You can see this by deploying the contract - you will see there are no actions you can perform on it!

##### Public (Variables)

Building on internal, if you change internal to public and deploy, you will see that there is automatically a 'getter' function for this variable! (If you click on x, you will get the value of 0)

What public means:
- This variable can be accessed by the following:
    - contracts
    - derived contracts
    - outside of the contract 

##### Private (Variables)

Next, we have the option to make this private.

What private means:
- Variable is only accessible from within the contract
    - difference between internal: no derived contracts can access it

##### Variables Recap

In order from most security to least security, here are our 3 visibility/access modifiers:
- Public: Anyone can access (Within, inherited, and outside)
    - YES: Within the same contract
    - YES: From a derived contract
    - YES: Outside of the contract

- Internal: Within and derived
    - YES: Within the same contract
    - YES: From a derived contract
    - NO: Outside of the contract

- Private: Within only
    - YES: Within the same contract
    - NO: From a derived contract
    - NO: Outside of the contract

##### Public (Functions)

Public Function: We can invoke it from anywhere (Essentially same as a public variable)
- You can call this function from within functions/derived function/outside of the blockchain

```s
contract HelloWorld {
    function x() public returns (uint) {
        return 1;
    }
}
```

##### Private (Functions)

Private Function: We can only invoke from within
- You can only call this functions from within the function
    - not derived from contract
    - not from outside blockchain

##### Internal (Functions)

Internal Function: We can only invoke from within OR 
- You can only call this functions from within the function OR derived from contract
    - not from outside blockchain

##### External (Functions)

External Function: We can only invoke from outside of the function
- You can only call this functions from outside the function
    - not within the contract
    - not derived from the contract

Why use this over Public:
- Public: Can be called within the contract OR other smart contracts OR transactions
- External: Only called outside of this contract
    - Important because of the way data is passed to the function:
        - If External: Data can be passed in a more efficient way (optimizing performance vs. using public)
        - If Public: Not sure if it will be called from another contract/within this one/another transaction

The following example would give us an error:

```s
contract HelloWorld {
    function x() external returns (uint) {
        return 1;
    }

    function y() public {
        x();
    }
}

```

Why does this not work:
- x() is external
    - it cannot be called from within the same contract (which these 2 obviously are both in the smart contract `HelloWorld`)
        - would need to make it `public` for the error to go away

Note: If you fix the error and deploy, you will be able to call x from Remix IDE (that is because you are outside of the contract!)

##### Functions Recap

In order from most security to least security, here are our 3 visibility/access modifiers:
- Public: Anyone can access (Within, inherited, and outside)
    - YES: Within the same contract
    - YES: From a derived contract
    - YES: Outside of the contract

- Internal: Within and derived
    - YES: Within the same contract
    - YES: From a derived contract
    - NO: Outside of the contract

- External: Outside only
    - NO: Within the same contract
    - NO: From a derived contract
    - YES: Outside of the contract

- Private: Within only
    - YES: Within the same contract
    - NO: From a derived contract
    - NO: Outside of the contract

##### Returning Multiple Values

Returning Multiple Values: You cannot return data to a transaction
- If you have a return value, it only returns under 2 conditions:
    - You are making a call
    - Another smart contract is calling this one

- If we want to return some data: Write the type we want to return in parentheses!
    - 

Example:

```
contract HelloWorld {
    function x() public returns (uint, uint, uint) {
        return (1, 1, 1); // looks good!
        return 1, 2, 3;   // error
    }
}

```

##### View Functions

We have seen the keyword view already!

View Functions: Function that does NOT modify any state
- We do not have to specify as `view`, but it helps with readability/strict that we cannot modify state.
- In a view function, you can only call functions that are view OR pure:
    - view: can invoke
    - pure: can invoke
    - others: cannot invoke (even if it does not modify state!)
        - Solidity is not smart enough to tell, so we need to say it is view or pure.

Example:

```
contract HelloWorld {
    uint a = 1;

    function x() public view returns (uint) {
        y(); // this would error, since y() is NOT a view function
        z(); // this would work, since we marked it as a view function

        return a; // view function: does not modify state
    }

    function y() public {
        a = 2; // pure function: DOES modify state
    }

    function z() public view {
        a + 1; // view function: does not modify state
    }
}

```

Advice: We want our code to be readable, so if you are writing a view function, put that in the initialization!

##### Pure Functions

Pure Functions: Does not view, modify, or rely on anything that is in the contract
- Essentially: Pure is a view function, but Pure functions do not read and do not modify state of the block chain
    - It is a function that does a calculation, and returns it to you

Example:

```s
contract HelloWorld {
    uint a = 1;

    function x() public pure returns (uint) {
        return 1;
    }

    function y() public pure {
        1;   // valid: does not access state or do anything
        x(); // valid: pure function can call another pure function 
    }

```

Note: You have to see these a bunch of times before you will have it memorized!

Difference between View and Pure:
- View: Can view (but not modify) the state
- Pure: Cannot view OR modify the state
    - only gets used when you do something that has nothing to do with state, or a function that may have to do with state

##### Recap (View vs. Pure)

Recap (View vs. Pure):
- Similarities:
    - Invoke a function that is not View OR Pure: NO
    - Modify/Overwrite state variables: NO
    - Create new contracts: NO
    - Omit events: NO
    - Use the function self-destruct: NO
    - Use low-level function calls: NO
    - Send/receive ETH: NO

- Differences:
    - Invoke a function that is View OR Pure:
        - View: YES
        - Pure: NO

##### Practice Questions

1. Select the access/visibility modifier that fits the following description:
Functions that are part of the contract interface and can be called from other contracts. They cannot be called internally.
- external

2. Select the access/visibility modifier that fits the following description:
Functions and state variables that can be accessed within the same contract and in deriving contracts. They are not accessible from the outside.
- internal

3. What properties must be true of a `view` function? Select all that apply.
- It cannot modify any contract state.
- It cannot send or receive Ethereum.

4. Select the function that correctly returns multiple values.

My answer: 

```
function x() public view returns (uint, int) {
  uint a;
  int b;
  return (a, b);
}
```

5. If a state variable is private it's data is hidden on the blockchain (i.e., it cannot be read from outside of the contract).
- False

Note: Although private variables cannot be accessed from outside of a contract their data can still be found and read on the blockchain. This is because the blockchain is publicly available and anybody can view and verify all of the data on the blockchain.

6. Analyze the smart contract seen below.

```
contract X {
  uint a = 1;
  int b = 2;
  
  function sum() public returns (int){
    return int(a) + b;
  }

  function getA() public returns (uint) {
    return a;
  }

  function setAt(uint newValue) public {
    a = newValue;
  }

  function calc(uint a, uint b) public returns (uint){
    return a * b + a - b;
  }

  function add(uint value) {
    return a + value;
  }
}

```

Which functions could be marked as a pure function?
- calc

Explanation: A function marked as pure is not able to use anything outside of its function definition. It cannot modify or access any state variables or call any function that is not a pure function. This makes calc the only function that could be marked as pure as it's the only function that does not use the state of the contract.

### 11 - Global Keywords

Solidity's global variables are unique and very blockchainy in flavor, certainly unlike anything you've seen in other languages. Don't skip this lesson!

#### Key Terms

##### Global Keywords

In Solidity, there are various Global Keywords that give you information about the current block, transaction, and more.
- The following is a subset of these global keywords:
    - block
    - msg
    - txt

#### Notes from the video

This is where things start to get interesting, and moving away from the basic things that most of us already had intuition about.

Let's start learning how to make contracts with a real purpose!

##### Global Keywords

Global Keywords/Variables: Things you have access to access to within the contract/specific functions in the contract
- 4 main ones:
    - this: the contract instance itself
        - think .this in Java, .self in Python
        - makes more sense once we get into constructor

    - msg: how the smart contract execution begun 
        - who forced the smart contract to start executing this function, how much money was sent, etc.

    - block: information about the block that the transaction being sent to the smart contract, is included in
        - when you submit the transaction, it is added to a block
            - once that block has mined, the execution actually begins
                - NOT: the block the smart contract was deployed to
                - YES: the block the transaction forcing the smart contract to execute is on
                    - this block could change change for every single transaction that is sent to the smart contract (cannot rely on block data being the same between transactions)

    - tx: gives us information about the transaction itself
        - similar to the message:
            - msg: refers to how the smart contract was executed
                - could be about the smart contract that called this smart contract
            - tx: information about the original transaction 
                - origin of the transaction ie. original person thing that submitted the transaction, causing this smart contract to call another

##### this

this: 
- Current usage: Get balance of a smart contract.

```
contract HelloWorld {
    function getBalance() public view returns (uint) {
        return this.balance; // old
        return address(this).balance // new!
    }
}

```

Note: Each address has a .balance property

##### msg

msg: 
- Current usage: Useful when we want to know who called the contract, and how much was sent to the contract.

```
contract HelloWorld {
    function viewMsg() public view returns (address) {
        return msg.sender;
    }
}

```

Notes:
- sender: who invoked the smart contract. could be one of the following:
    - another smart contract
    - an address of Ethereum account (in this case, it will be our wallet address)

##### msg (Extras)

Extras:
- msg.data: Data associated with the call to the function
    - Arguments to the function
- msg.sig: First 4 bytes of the call data
    - Specifically: For the function that is to be called
- msg.value: How much ETH was sent to the smart contract/function via transaction
    - we will do more with this later!

##### block

block: 
- block.number
- block.chainid
- block.gaslimit
- block.difficulty
- block.timestamp
- block.coinbase: Address of the miner who mined the block (Where the reward went)

```
contract HelloWorld {
    function viewBlockNumber() public view returns (uint) {
        return block.number;
    }
    function viewBlockTimestamp() public view returns (uint) {
        return block.timestamp;
    }
}

```

##### tx

tx: Origin of the transaction
- 

```
contract HelloWorld {
    function viewMsg() public view returns (address) {
        return tx.origin;
    }
}

```

Remember:
- msg.sender: who called the smart contract
- tx.origin : who originated the transaction

##### gasleft

gasleft: How much gas is actually remaining
- Involves a function, not a global variable
- Can derive how much gas was sent with the following calculation:
    - Gas Remaining = Gas Limit - gasleft()
        - Gas Limit: Set when deploying in Remix IDE
        - gasleft(): self-explanatory

```
contract HelloWorld {
    function viewGas() public view returns (uint) {
        return gasleft();
    }
}

```

##### Quick Recap

Next video we will use the global variables with more utility, but here is a quick recap:
- address(this).balance: Balance of the smart contract itself
- msg:
    - msg.sender
    - msg.value: amount of ETH sent
    - msg.sig
    - msg.data
- block:
    - block.chainid
    - block.difficulty
    - block.coinbase: Address of miner who mined the block 
    - much more!
- tx:
    - tx.origin: Address of whoever originated the initial call that ended up at this smart contract

##### Practice Questions

1. Which of the following are valid global variables? Select all that apply.
- msg
- tx
- block

Note: The important global variables to know are tx, block and msg.

2. What code snippet would return the balance of the current smart contract?
- address(this).balance

3. What is the most correct way to view the address of the creator of the transaction that is being executed?
- tx.origin

Explanation:
- The most correct way to determine the address of the creator of the transaction is to use tx.origin.
    - This returns the address of the origin of the transaction.
- If you were to use msg.sender you would receive the address of whoever made the external function call, which could be another smart contract and not necessarily the address of whoever originally created the transaction.

Note: In most cases it is fine to use msg.sender but it is good to be aware of the differences.

### 12 - Sending And Receiving Eth

How do you actually receive and send Ether into and from a smart contract? This lesson will show you the wei.

#### Key Term

##### Ether Units

Solidity provides built-in keywords that make working with amounts of Ether easier.
- `wei`: the smallest unit of ether.
- `gwei`: equal to 1,000,000,000 or 10^9
- `ether`: equal to 1,000,000,000,000,000,000 or 10^18

#### Notes from the video

##### Ethereum Units

Ethereum Units (that we can use in Solidity):
- wei: smallest possible unit of measure (you cannot have less than 1 wei)
- gwei: 
- ether: 

Recap:
- 1 wei = 1
- 1 gwei = 1e9
- 1 ether = 1e18

Note: There are more units, but we will not get into those!

This is all valid code:

```
contract HelloWorld {
    uint x = 1 wei;
    uint y = 1 gwei;
    uint z = 1 ether;
}
```

##### Receiving Ethereum

In lots of cases, you will send a bunch of Ethereum to the contract. There are a few ways to do this:

1. receive(): Handles receiving ETH
- Not necessary for receiving ETH, but handles all of the work for you
    - Function is triggered automatically when ETH is sent to the smart contract (function is called if msg.data is blank ie. we are not calling a function/sending data to the contract)

- Invoked via 'Transact' in the bottom left of Remix IDE

```
contract HelloWorld {
    uint public received;

    receive() external payable {
        received += msg.value;
    }
}

```

2. fallback(): Called anytime that there is no function that handles what was sent to the smart contract (Not used just for receiving ETH)
- msg.data is NOT empty
    - Think of it as the else-statement, or the default of a switch-statement
- contains a function that doesn't exist ie. information that cannot be handled by the smart contract
    

```
contract HelloWorld {
    uint public received;
    uint public fallbackReceived;

    receive() external payable {
        received += msg.value;
    }

    fallback() external payable {
        fallbackReceived += msg.value;
    }
}

```

3. pay(): Sending Ethereum to a specific function in the smart contract
- 

```
contract HelloWorld {
    uint public received;
    uint public fallbackReceived;
    uint public payReceived;

    function pay() external payable {
        payReceived += msg.value;
    }

    receive() external payable {
        received += msg.value;
    }

    fallback() external payable {
        fallbackReceived += msg.value;
    }
}

```

Recap on Receiving Ethereum:
- receive(): no msg.data
    - if you remove this function: it goes to the fallback function automatically (if you don't call a specific function)
- fallback(): msg.data OR function call that is not handled by smart contract
- pay(): send to a specific function

Notes:
- These are Special functions that must be an `external` + `payable` function
    - If you try to send ETH to a function that is not `payable`, the transaction error out (when you error out, it will revert the smart contract to original state ie. nothing will be persistent)

##### Sending Ethereum

Start out by writing a function in 3 ways that allows us to withdraw the funds (This will send the balance of the smart contract to whoever calls the function withdraw())
- Not recommended: These 2 methods only forwards 2300 gas (not a lot of gas...) to whichever function is receiving the ETH
    - send(): returns bool
    - transfer(): returns nothing
        - These are in place to prevent a re-entrance attack
            - Makes them inflexible because if another smart contract calls this, it won't have enough gas and will fail

- Recommended: This forwards all of the gas along to whatever is receiving the ETH
    - call(): 
        - This method will allow you unlimited flexibility in how you are calling the function
        - Argument takes an empty string (no data)
        - Returns:
            - bool sent
            - bytes memory data

```
contract HelloWorld {
    function withdraw() public {
        address payable user = payable(msg.sender); // convert regular address to payable
        
        // send ETH to this user (of the 3 ways, #3 is the best!)
        // 1. send()
        bool sent = user.send(address(this).balance); // balance of smart contract
        // 2. transfer()
        // - same as #1, but it does not return a boolean value
        user.transfer(address(this).balance);
        // 3. call()
        user.call{value: address(this).balance}("");
        // (bool sent, bytes memory data) = user.call{value: address(this).balance}("");
        
    }

    receive() external payable {
    }

    fallback() external payable {
    }
}

```

Recap on Receiving Ethereum:
- send()/transfer(): 2300 gas only
- call(): Preferred method to send Ethereum

##### Re-entrance Attacks

Withdrawal Pattern

Re-entrance Attacks

Key thing to understand: When we sending ETH, we are giving up control to whatever contract we potential are calling that receives the ETH
- ETH address: Address has no function
- Smart Contract: The contract can perform operations, and even call back into the same contract!

Example in action:

```
contract Theif {
    HelloWorld ctr = new HelloWorld();

    function callWithdraw() public {
        ctr.withdraw();
    }
}

```

What is going on here:
- 2 smart contract interacting with each other
    - Opportunity to wipe out one of the contract exists (If we don't check that they have gotten their 1 ETH, they can keep draining the smart contract)

Let's do a basic example to keep track like a bank account:

```
contract HelloWorld {
    mapping(address => uint) received;

    function withdraw() external {
        uint value = received[msg.sender];
        received[msg.sender] = 0;
        payable(msg.sender).call{value: value}("");
    }

    receive() external payable {
        received[msg.sender] += msg.value;
    }

    fallback() external payable {
        received[msg.sender] += msg.value;
    }
}

```

What is going on here:
- When a user calls withdraw(), we put their balance at 0 BEFORE making the payable() call
    - If you do this after, you open up the opportunity for them to clear out the smart contract (They would continue to call withdraw() until it failed!)

Next, let's look into the situation where you are trying to send an amount of ETH that you do not have:

```
contract HelloWorld {
    function withdraw() external {
        (bool sent, ) = payable(msg.sender).call{value: 1 ether}("");
    }
}

```

What happens here:
- Even though we have a balance of 0 ETH, when we hit withdraw(), it still works
    - We do not get an exception/error
        - The return value `(bool sent, )` is going to return false, though to indicate you did not have enough ETH

Note: This is probably the most important thing, so that is why this video goes so long.

##### More Security Concerns

When you are sending funds to somebody, 

```
contract HelloWorld {
    function pay() external payable {
        uint value = msg.value;
        if (value > 1000) {
            payable(msg.sender).transfer(value - 1000); // OK, but you should store values in a mapping
        }
    }
}

```

Better option:

```
contract HelloWorld {
    mapping(address => uint) changeOwed;

    function pay() external payable {
        uint value = msg.value;
        if (value > 1000) {
            changeOwed[msg.sender] = value - 1000;
        }
    }

    function withdraw() public {
        uint value = changeOwed[msg.sender];
        changeOwed[msg.sender] = 0;
        payable(msg.sender).transfer(value);
    }
}

```

What is going on here:
- the transaction has been put into another function (withdraw()) so all the user can do is have the contract fail for them
    - Without this, function can be put into an unusable state (Code can then be exploited, smart contract balance drained, etc.)

- Remedy: Put withdraw() function separate 
    - If they make it fail, it will just fail for them

Takeaway: Giving control to other smart contracts is a really big deal in Solidity - need to be aware of this and the security of your smart contracts when you are sending/doing state changes/etc.

##### Practice Questions

1. How many wei are in 1 Ether?
- 1e18

Explanation: Wei is the smallest unit of Ethereum, followed by gwei which is equivalent to 10e9 wei, followed by ether which is 10e18 wei.

2. How much gas does the transfer method pass when called?
- 2300

Explanation: Both the transfer and send methods pass 2300 gas. This is a hard limit and makes it so that contracts cannot perform a re-entrance attack. These methods are used to safely transfer Ethereum, however, they are inflexible and no longer recommended to be used. This is because if a contracts fallback or receive function performs any operations these calls will fail due to insufficient gas.

3. When writing smart contracts you may implement both a receive and fallback function. In which scenario(s) is the fallback function called? Select all that apply.
- When Ethereum is sent to the contract and msg.data is not empty.
- When a function that does not exist is called on the contract.
- When the Ethereum is sent to the contract and the receive function is not defined.

Explanation: The fallback function is used as a last resort or backup in case the contract cannot handle the call it receives. fallback is called anytime Ethereum is sent to the contract and no receive function is defined.
- If the receive function is defined and no msg.data is passed then receive will be called instead of fallback.
- If Ethereum is sent and msg.data is not empty then the fallback function will be called instead of receive.
- Lastly, if a function that does not exist on the contract is called the fallback function will be called.

4. Write a smart contract named `Richest` that keeps track of the user who has sent the most ether to the contract. Every time a new user becomes the "richest" the Ethereum sent by the previous richest user should be refunded to that user. When the contract is first deployed, the richest user should be the zero address.

Be sure to implement the withdrawl pattern such that no re-entrance attack is possible.

To implement this functionality, complete the following functions on this smart contract:
- `becomeRichest`: a function that accepts ether and updates the richest user if they have sent more Ethereum than the previous richest user
    - should return `true` if the user successfully become the richest, otherwise it should return `false`
    - if a user sends Ethereum to this function and does not become the richest, they should NOT be refunded their Ethereum or be able to withdraw it
- `withdraw`: a function that allows the users who were previously the richest to withdraw their funds. The current richest user should not be able to withdraw any funds. (Be sure to protect against re-entrance attacks!)
- `getRichest`: a function that returns the address of the current richest user

Make sure to get the correct visibility modifiers for your functions such that they are callable from outside of the contract. You may declare any state variables you like/need.

You do not need to handle edge case scenarios like if the richest user sends multiple sets of transactions to the smart contract while they are still the richest user.

Note: this example is a variation of the `WithdrawlContract` shown in the official Solidity Documentation.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Richest {
    address richestUser;
    uint richestUserValue;
    mapping(address => uint256) pendingWithdrawls;
    
    function becomeRichest() external payable returns (bool) {
        uint value = msg.value;
        if (value > richestUserValue) {
            pendingWithdrawls[richestUser] += richestUserValue;
            richestUser = msg.sender;
            richestUserValue = value;
            return true;
        }
        else {
            return false;
        }
    }

    function withdraw() external payable {
        uint256 value = pendingWithdrawls[msg.sender];
        pendingWithdrawls[msg.sender] = 0; // important to do this before transferring the funds to avoid reentrance
        // payable(msg.sender).transfer(value);
        (bool sent, ) = payable(msg.sender).call{value: value}("");
        require(sent);
    }

    function getRichest() public view returns (address) {
        return richestUser;
    }
}

```

5. Write a smart contract named `Balances`. This contract should track the amount of ether received from any address that sends ether to the contract. To do this, implement both a receive() and fallback() function as well as a getAmountSent() function as described below:
- getAmountSent(address addr): returns the amount in ether in `wei` that `addr` has sent to the contract.

Make sure to use the correct visibility modifiers for all your functions and state variables.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Balances {
    mapping(address => uint256) balances;
    function getAmountSent(address addr) public view returns (uint256) {
        return balances[addr];
    }
    receive() external payable {
        balances[msg.sender] += msg.value;
    }

    fallback() external payable {
        balances[msg.sender] += msg.value;
    }
}

```

### 13 - Exceptions And Errors

Proper error handling is exceptionally important in Solidity, since the language doesn't give users feedback by default in the case of transaction failure.

#### Key Terms

##### Require

`require`: Solidity function that is used for error handling.
- If the condition passed to a `require` function returns false: the transaction will fail and the state of the contract will revert.
- Typically: `require` is used to check for preconditions that should be true before executing a block of code.

##### Assert

`assert`: Solidity function that is used for error handling.
- If the condition passed to a `assert` function returns false: the transaction will fail and the state of the contract will revert.
- Typically: `assert` is used to check for conditions that should never be false.

##### Revert

`revert`: Solidity function that when called causes a transaction to fail and the state of the contract to revert.
- Typically: `revert` is used as an alternative to `require` when you are dealing with complex logic

#### Notes from the video

##### Intro

First thing to understand: What an error is in Solidity/what it does.
- When an error is raised, the state of the smart contract reverts to whatever it was before the transaction was submitted
    - Remember: A transaction is required to update the state
    - As soon as an error happens in any smart contract as a part of this transaction, the entire state of the transaction is reverted back to the original value (as if the transaction never happened)
        - If you submitted the transaction, there is not a way to know (You can detect, but not easily/directly told)

##### Require

Let's start explaining with an easy example of a bank account that you can deposit/withdraw money:

```
contract HelloWorld {
    mapping(address => uint) balances;

    function deposit() external payable {
        balances[msg.sender] += msg.value;
    }

    function withdraw(uint amount) public {
        uint balance = balances[msg.sender];
        // if (balance >= amount) {} (we don't use if-else because we won't catch errors...)
        require(balance >= amount, "balance is not sufficient - transaction revert! (refund remaining gas in this smart contract to whoever sent the transaction...)");

        balances[msg.sender] -= amount; // change balance
        payable(msg.sender).call{value: amount}(""); // send money
    }
}

```

What is going on here:
- We added a guard-block (instead of if-else) to check preconditions/arguments
    - We want to let the user know if the condition is false
    - If the condition is true, we will send the money

Note: Remix IDE will give you error messages, but that's not how it works on the real blockchain network. (Not as simple to see what errors are)

Recap on Require:
- Put a condition.
    - if true: continue
    - if false: raise error message + revert state back to pre-transaction

- Usually used at the beginning of a function to check pre-conditions

##### Assert

Assert: Validate that what should be the case, is true
- Stronger statement than require (It should never fail - just like a unit test)
    - If assert() fails, you have a bug in your program
    - If require() fails, you don't necessarily have an issue

Here is an example where assert() should never be wrong, otherwise there is a problem elsewhere in the code:

```
function withdraw(uint amount) public {
    balances[msg.sender] -= amount; // change balance
    (bool sent, ) = payable(msg.sender).call{value: amount}(""); // send money + get return value
    assert(sent, "payment failed"); // if sending money did not work, this will raise
}
```

More on assert():
- Does not refund the gas from the transaction (all gas is consumed, then it throws an error)
- Usually used at the end of the function

##### Revert

Revert: Shortcut for require()
- Essentially the same as require(), but used in more complex situations
    - require(): more clear for checking simple condition / 2-3 conditions chained together
    - revert(): more advanced logic, ability to define/raise custom errors
        - makes it more clear to user what you did wrong (think raise exception in Python)

Example:

```
function withdraw(uint amount) public {
    balances[msg.sender] -= amount;
    (bool sent, ) = payable(msg.sender).call{value: amount}("");
    if (!sent) {
        revert(); // without error
        revert("payment failed"); // with error
    }
}

```

Note: You can use revert with OR without an error message.

##### Custom Errors

You can also use revert() to raise custom errors!

If you are going to re-use the error, you can define it in 2 places:
- global namespace: 
- contract namespace: 

Example:

```
pragma solidity >=0.7.0 <0.9.0;

// error BalanceNotLargeEnough(uint balance, uint amount); // global namespace

contract HelloWorld {
    error BalanceNotLargeEnough(uint balance, uint amount); // in smart contract

    mapping(address => uint) balances;

    function deposit() external payable {
        balances[msg.sender] += msg.value;
    }

    function withdraw(uint amount) public {
        uint balance = balances[msg.sender];
        if (balance < amount) {
            revert BalanceNotLargeEnough(balance, amount);
        }
        balances[msg.sender] -= amount;
        (bool sent, ) = payable(msg.sender).call{value: amount}("");
        if (!sent) {
            revert();
        }
    }
}

```

##### Key Takeaways

Key Takeaways:
- Whenever an exception/error occurs, the state reverts back to before transaction
- 3 guard clauses:
    - require(): pre-conditions, most commonly used
    - revert(): same as require, raise custom errors
    - assert(): check state at end of function (backup), should never fail, consumes all of the gas

##### Practice Questions

1. If you were writing a smart contract function that could only be executed by a specific address what type of guard statement would you use.
- require

Explanation: The require statement is used to check for prerequisites before running a function. In this case the prerequisite is that the caller must be a specific address, warranting the use of a require statement. If a require statement fails it returns the remaining gas to the sender and reverts any state changes.

2. The revert statement returns all unused gas and reverts the state to the original state?
- True

3. If you were writing a smart contract function and wanted to ensure one of your state variables was never holding the value 0 which guard clause would you use?
- assert

Explanation: An assert statement is used to check for invariants and verify contract state. An assert statement should never return false, if it does this means there is a bug or issue with your smart contract. assert's are used as a last line of defense and are typically placed near the end of a function.
- In this scenario, since we are checking an invariant related to state of the smart contract we would use an assert and hope that this would never be false.

4. Write a smart contract named `Voting` that allows people to vote for their favorite number. Each person only gets one vote and must vote for a number in the range of `1-5` (inclusive). Your contract should keep track of the number of votes for each number and be able to determine which number has the most number of votes.

To write this smart contract implement the following methods:
- `getVotes(uint8 number)`: returns the number of votes for the passed `number`. if `number` is not in the range of `1-5` this function call should fail.
- `vote(uint8 number)`: allows a user to vote for the passed `number`. This function call should fail if the user has already voted of they pass an invalid number.
- `getCurrentWinner()`: this function shouuld return the number that currently has the most votes. If two numbers have the same number of votes, it should return the number that received the most recent vote. If no number have received any votes, this function should return `1`.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Voting {
    // Write your code here
    mapping(address => bool) voted;
    mapping(uint => uint) votes;
    uint8 currentWinner;
    uint8 mostVotes;

    function vote(uint8 number) public {
        require(!voted[msg.sender], "address has already voted");
        require(number <= 5 && number >= 1, "number not in range 1-5");
        // add address to voted
        voted[msg.sender] = true;
        // increment votes
        votes[number]++;
        // apply logic for the person w/ most votes
        if (votes[number] >= mostVotes) {
            currentWinner = number;
            mostVotes = votes[number];
        }
    }

    function getVotes(uint8 number) public view returns (uint8) {
        require(number <= 5 && number >= 1, "number not in range 1-5");
        return votes[number];
    }

    function getCurrentWinner() public view returns (uint8) {
        if (currentWinner == 0) {
            return 1;
        }
        return currentWinner;
    }
}

```

### 14 - Constructors

This one-and-done function's lifespan is even more ephemeral than that of a butterfly.

#### Key Terms

##### Constructor

In Solidity, a contract `constructor` is called one time when the contract is deployed. This `constructor` is used to initialize values or accept initial values required by the contract.

```
contract Constructor {
    uint count;

    constructor (uint startingCount) {
        count = startingCount;
    }
}
```

#### Notes from the video

##### Full Video

Constructor: Special function that runs when your smart contract is deployed
- Works similarly to constructors in other programming languages
    - It invokes automatically when the smart contract is deployed
        - you cannot choose when it runs
        - you cannot run it more than 1x
    - We will not get into inheritance just yet in this lesson...

- Adding parameters to the constructor:
    - You can, but it is only relevant when we get into inheritance
    - Currently: We will add none

- Access identifier:
    - Leave as-is for now

What we can do in the constructor:
- Init variables
- Check who deployed the smart contract
- etc.

Main thing that is often done: Checking/Setting who deployed the smart contract
- You may write a smart contract that you only want deployable by a certain person (or a contract with special writes to some person)

Example:

```
contract HelloWorld {
    address public owner;

    constructor() {
        owner = msg.sender;
    }
}

```

Basic example: Smart Contract that people can send money to, and only the owner can withdraw the money:

```
contract HelloWorld {
    address public owner;

    constructor() {
        owner = msg.sender;
    }

    receive() external payable {}

    function withdraw(uint amount) public {
        require(msg.sender == owner, "you are not the owner.");
        require(address(this).balance >= amount, "not enough balance");
        (bool sent, ) = payable(owner).call{value: amount}("");
        require(sent, "failed to send");
    }
}

```

What happens if you try and call withdraw() from an address that is not your own: error! (you are not the owner)

How to use it correctly:
- deploy smart contract
- switch to another account/user
- switch 'value' from 0 to 1000 and press 'transact' (this sends the ETH to receive())
- switch back to your (owner) account
- withdraw the 1000

##### Takeaways

Most common things done with Constructors:
- set owner
- other initial values

Takeaways on Constructors:
- Very basic
- Runs 1x (when contract is deployed)
    - Cannot run after contract is deployed
- When dealing with inheritance, they run different
    - For now, we will not get into parameters/inheritance

##### Practice Questions

1. The constructor() function runs every time a smart contract is sent a transaction?
- False

Explanation: The constructor() function is only run once, immediately after the contract is deployed.

2. Write a smart contract named `OnlyOwner` that only allows the address that deployed the smart contract to interact with it. If any address other than the owner tries to interact with the smart contract, it should raise an exception/error. This smart contract should also contain a state variable that holds a `uint8` value that will be manipulated by the functions listed below. The starting value of the state variable should be `0`.
- `add(uint8 number)`: Adds `number` to the state variable (this function does not return anything)
- `subtract(uint8 number)`: Subtracts `number` from the state variable (this function does not return anything)
- `get()`: returns the value of the state variable keeping track of the `uint8` value.

Use the correct visiblity modifiers and ensure only the owner of the contract can use the functions listed above. You may assume your functions will never encounter an overflow or underflow.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract OnlyOwner {
    // Write your code here
    uint8 value;
    address owner;

    constructor() {
        owner = msg.sender;
    }

    function add(uint8 number) public {
        require(msg.sender == owner, "only the owner can use this function");
        value += number;
    }
    
    function subtract(uint8 number) public {
        require(msg.sender == owner, "only the owner can use this function");
        value -= number;
    }

    function get() public view returns (uint8) {
        require(msg.sender == owner, "only the owner can use this function");
        return value;
    }
    
}

```

### 15 - Self Destruct

Not quite as destructive as Voltorb's signature move.

Okay, okay, we promise we're done with the Pokémon references.

#### Key Terms

##### Self Destruct

In Solidity, the `selfdestruct` function removes a smart contract from the blockchain and sends the balance of that contract to a provided address.

#### Notes from the video

##### Self Destruct

selfdestruct(): Deletes smart contract, and sends balance of contract to the address we place
- Does all of the following:
    - Removes contract from blockchain (Keeps all transaction history, though)
    - Deletes all state
    - Make contract unusable (going forward)
        - Cannot call/send transactions to it

- Why you would use this selfdestruct() function:
    - 

Note: No matter what smart contract/wallet address you put it for `address`, this address is going to receive the funds
- No functions can disallow receiving the funds
    - This allows us to use selfdestruct() in a malicious way (more on this later)

##### Self Destruct Example

Example: A smart contract that allows us to destroy it at any point at time, and when we do, the owner receives all of the funds in the contract

```
contract HelloWorld {
    address owner;

    constructor() {
        owner = msg.sender;
    }

    receive() external payable {}

    function destroy() external {
        require(owner == msg.sender, "you are not the owner");
        selfdestruct(payable(owner));
    }

    // this function will NOT work after we self destruct! (state has been destroyed)
    function getOwner() public view returns (address) {
        return owner;
    }
}

```

##### Self Destruct Exploit

Let's write an example where the following occurs:
- Require that 1 ETH is sent
- Check if you sent the 7th ETH
    - If you are the winner, 

```
contract Winner {
    address winner;

    function pay() external payable {
        require(msg.value == 1 ether, "you need to send 1 ether");
        if (address(this).balance == 7 ether) {
            winner = msg.sender;
        }
    }

    function withdraw() public {
        require(msg.sender == winner, "you are not the winner");
        (bool sent, ) = payable(winner).call{value: address(this).balance}("");
        require(sent, "payment failed");
    }
}

```

Let's talk about the flaw in the code/exploit here:
- We are relying on the balance of the smart contract
    - If we were to selfdestruct() a smart contract and send ETH to this contract, we could make it so that there is never exactly 7 ETH
        - Think about it in the following ways, where nobody can win OR withdraw:
            - If you selfdestruct() 0.5 ETH, then increments of 1 Ether will never get you to hit exactly 7.0 ETH
            - If you selfdestruct() more than 7 ETH, the address(this).balance will always be above 7 Ether

The following code would have the `Theif` smart contract ruin the `Winner` smart contract since it relies on the smart contract's balance. If you change the code to use public state variable `balance` (which I implemented while commenting out the old code), then everything is fine:

```
pragma solidity >=0.7.0 <0.9.0

contract Winner {
    address winner;
    uint balance;

    function pay() external payable {
        require(msg.value == 1 ether, "you need to send 1 ether");
        balance += 1 ether;
        if (balance == 7 ether) {
            winner = msg.sender;
        }
    }

    function withdraw() public {
        require(msg.sender == winner, "you are not the winner");
        (bool sent, ) = payable(winner).call{value: 7}("");
        require(sent, "payment failed");
    }
}

contract Theif {
    receive() external payable {
        selfdestruct()
    }
}
```

Takeaway: Do not rely on address(this).balance, as it relies on the smart contract, which can be impacted by a malicious selfdestruct().

##### Practice Questions

1. The selfdestruct function can fail if it attempts to send Ethereum to a smart contract that doesn't implement the fallback or receive function?
- False

Explanation: The selfdestruct function always passes Ethereum to the address that is passed as an argument, even if that address is a smart contract that doesn't implement fallback or receive.

2. Calling the selfdestruct function deletes the smart contract state from the blockchain?
- True

Note: However, all transactions that were sent to the smart contract are still stored on the blockchain.

3. Review the smart contract below:

```
contract AmISecure {
  address owner;

  constructor() {
      owner = msg.sender;
  }

  receive() external payable {
      require(msg.value == 1 ether, "you can only send one ether at a time");
      require(msg.sender == owner, "only the owner can send money to this contract");
  }

  function withdraw() external {
      require(msg.sender == owner, "only the owner can call this function");
      require(address(this).balance == 5 ether, "you can only withdraw if the balance is 5 ether");
      (bool sent, ) = payable(owner).call{value: address(this).balance}("");
      require(sent, "failed to send");
  }
}
```

- False

Explanation: This smart contract is not secure because the withdraw() function relies on address(this).balance which can be manipulated by hackers sending Ethereum to this contract using a selfdestruct function. To fix this you should instead use a state variable that holds the balance sent by the owner that can only be changed by the owner.

4. Multiple Depositors

Complete the smart contract `Competitors` that only accepts deposits from the first two addresses to send Ethereum to the contract. Each depositor should only be able to send exactly `1` ether to the contract at a time. Once the smart contract has received `3` ether from the depositors, the depositor who deposited the most ether should be able to withdraw `3` ether from the contract.

Complete this smart contract by implementing the following functions, as well as writing the appropriate constructor. Ensure your smart contract is secure from `fallback` function exploits.
- `deposit()`: a payable function that only allows the first two address to call the function to deposit funds to the smart contract. The first two depositors should be able to deposit multiple times. The only accepted deposit amount is 1 ether. Once the sum of the deposits totals `3` ether, no more deposits should be accepted.
- `withdraw()`: allows the depositor who deposited the most ether to withdraw `3` ether. This function should only be callable once the contract has received exactly `3` ether.
- `destroy()`: if the depositor that deposited the most ether has withdrew their funds, this function should call `selfdestruct()` and send the smart contract balance to the address who depoyed it. This function should only be callable by the address that deployed the smart contract.

You may add as many state variables as necessary but do NOT add any new functions.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract Competitors {
    // Write your code here
    address owner;
    // uint256 balance;
    address depositor1_address;
    uint256 depositor1_value;
    address depositor2_address;
    uint256 depositor2_value;

    address maxDepositor;
    bool withdrew;

    constructor() {
        owner = msg.sender;
    }

    // notice: no argument, because user has to send 1 ether via 'transact'
    function deposit() external payable {
        require(
            depositor1_value + depositor2_value < 3 ether,
            "no more deposits accepted!"
        );
        require(
            msg.value == 1 ether,
            "only deposit allowed is 1 ether."
        );
        // see if 1 of 2 depositors
        if (depositor1_address == address(0)) {
            depositor1_address = msg.sender;
            // depositor1_value += 1 ether;
        }
        else if (depositor2_address == address(0)) {
            depositor2_address = msg.sender;
            // depositor2_value += 1 ether;
        }

        // deposit 1 ether
        if (msg.sender == depositor1_address) {
            depositor1_value += 1 ether;
        }
        else if (msg.sender == depositor2_address) {
            depositor2_value += 1 ether;
        }
        else {
            // depositor1_value > 0 && depositor2_value > 0
            revert("2 depositors have already been decided on.");
        }

        // update maxDepositor
        if (depositor1_value + depositor2_value >= 3 ether) {
            if (depositor1_value > depositor2_value) {
                maxDepositor = depositor1_address;
            }
            else {
                maxDepositor = depositor2_address;
            }
        }
        
    }

    function withdraw() external {
        require(
            depositor1_value + depositor2_value >= 3 ether,
            "not enough ether deposited yet."
        );
        require(
            msg.sender == maxDepositor,
            "you did not deposit the most ether."
        );

        payable(maxDepositor).call{value: 3 ether}("");
        withdrew = true;
    }

    function destroy() external {
        require(owner == msg.sender, "function only callable by deployer of smart contract.");
        require(
            withdrew == true,
            "max depositor has not yet withdrew their funds..."
        );

        selfdestruct(payable(owner));
    }
}

```

### 16 - Events

Unfortunately, this lesson about events isn't particularly eventful.

#### Key Terms

##### Event

Events are emitted by smart contracts and stored in transactions logs.
- They are useful for tramsmitting information about a smart contract to outside of the blockchain network.
- Clients sitting outside of the blockchain can query event data or listen for specific events to occur.

#### Notes from the video

##### What Are Events?

When you submit a transaction to the blockchain, you don't get a return value. However, we want to wait and see what is happening inside of the smart contract + what our transaction did. This is where events come in!

Events: Logs that we can emit from our smart contract
- Stored on the blockchain, in the transaction logs
    - What do transaction logs track:
        - arguments sent to smart contract
        - events emitted during smart contract transaction
            - if we emit multiple events, they will be stored in the logs, so we can see what happened

- Events can be used to see the state / update user interface
    - Example: We have a user interface that displays info about our Web3 application, and we want live updating whenever the state changes!
        - Instead of repeated calls to the contract, we will do the following:
            - Listen for events being emitted (listen using webhooks)
            - Once an event is emitted, update something on the front-end interface

Now that we understand basics of events / logging data from the contract, let's get into an example.

##### Auction Example

Basic Auction Example: 
- Somebody deploys the smart contract, who is auctioning off the item
    - Physical item
    - Owner gives the winner the item in real life
- What to keep track of:
    - highest bid
    - highest bidder
        - once highest bid is high enough, owner will let the bidder purchase the item.

Code:

```
contract Auction {
    address owner;
    uint highestBid;
    address highestBidder;
    mapping(address => uint) oldBids;

    constructor() {
        owner = msg.sender;
    }

    function bid() external payable {
        // check if the bid coming in is the highest
        require(msg.value > highestBid,"must be the highest bid");
        // make sure owner is not bidding ie. racking up their bid price
        require(msg.sender != owner,"owner cannot bid!");
        // set values
        oldBids[highestBidder] = highestBid;
        highestBid = msg.value;
        highestBidder = msg.sender;
        
    }

    function withdraw() external {
        require(msg.sender != owner,"owner cannot bid!");
        uint value = oldBids[msg.sender];
        oldBids[msg.sender] = 0;
        (bool sent,) = payable(msg.sender).call{value: value}("");
        require(sent, "payment failed");
    }

    function stopAuction() external {
        // require owner to be the one using this function
        require(msg.sender == owner);
        selfdestruct(payable(owner)); // self destruct and send leftover ETH to owner
    }
}

```

##### Creating and Emitting Events

Let's see how we can create events:

```s
event Bid(address indexed bidder, uint value);
...

function bid() external payable {
    ...
    emit Bid(msg.sender, msg.value);
}

```

What this code means:
- `Bid()`: Declaration of the event Event
    - Parameters:
        - address indexed bidder:
            - `address`: data type
            - `indexed`: "we can search through the Bid event by address"
                - any field that you add indexed to, you can search (up to 3 - it uses more storage)
                    - topic: you can search by (up to 3)
                    - data: all other (unlimited)
            - `bidder`: name of data

        - uint value:
            - `uint`: data type
            - `value`: name of data

- `emit `: Emit the event
    - If somebody makes a transaction and successfully makes a bid, there will be a log for the following
        - `address indexed bidder`: who sent the bid
        - `uint value`: how much the bid was
            - anyone on the blockchain can listen to this, and anybody listening to the event will
            - anyone listening for this event will have it broadcasted to them

Note: You can emit the event before OR after the events in bid(), as long as it is after the require() statements

Let's add one more event:

```s
event StopAuction(address indexed highestBidder, uint highestBid);
...

function stopAuction() external {
    ...
    emit StopAuction(highestBidder, highestBid);
    ...
}

```

##### Viewing EventsWhat happens when we run this entire smart contract:

Following Tim's steps:
- Bid 2 ETH
    - You will see the event and its arguments in the logs
- Withdraw 2 ETH
    - No logs
- Bid 5 ETH
    - You will see the event and its arguments in the logs
- stopAuction
    - This will stop the smart contract from existing (no more logs, state is reset)
- Bid 1 ETH
    - Nothing will happen

Example of the log from event `StopAuction` which was called by function `stopAuction()`:

```
[
	{
		"from": "0x06baEaD96B4a42124B09Bb76429cF3535CB4e2E3",
		"topic": "0x3f43f3e16b474b9a8c50f4e6863422d83177779a4e7fbaf75b3be390a2991afb",
		"event": "StopAuction",
		"args": {
			"0": "0x0000000000000000000000000000000000000000",
			"1": "0",
			"highestBidder": "0x0000000000000000000000000000000000000000",
			"highestBid": "0"
		}
	}
]

[{"address":"0x06baEaD96B4a42124B09Bb76429cF3535CB4e2E3","blockHash":"0xf0198b156c37e922eb7739ec41f22f4cfa74ce34f33e4876f8c6e3f6283be7bc","blockNumber":4329392,"data":"0x0000000000000000000000000000000000000000000000000000000000000000","logIndex":2,"removed":false,"topics":["0x3f43f3e16b474b9a8c50f4e6863422d83177779a4e7fbaf75b3be390a2991afb","0x0000000000000000000000000000000000000000000000000000000000000000"],"transactionHash":"0x85a65fbc1700402f8d5e6af817cf9853b2128db42448f00cd4d9d3c4339a730a","transactionIndex":2,"id":"log_6a036ba8"}]
```

These were the basics on events. In later videos, we will go over the following:
- View event data from outside of the blockchain
- Making use of these logged events (it is cool being able to see this right now, but it did not actually help with anything...)
    - Much more useful when building out Front-end User Interfaces that are dealing with our smart contracts
        - listen to events and do something based on them
        - get all of events omitted based on a specific transaction

##### Practice Questions

1. Where is event data stored?
- Transaction Logs

2. What is the maximum number of parameters you can mark as indexed when defining an event?
- 3

3. You can only define events in the global namespace.
- False

Explanation: Events can be declared in the both the global namespace as well as the contract namespace.

4. Which of the following contracts correctly emits an event when the x function is called?

My answer:

```
contract Events {
  ...
  event XCalled(address indexed sender, uint8 value);

  function x(uint8 value) external {
    ...
    emit XCalled(msg.sender, value); 
  }
}
```

Explanation: In Solidity, you define an event by using the type event followed by the event name and the event parameters. If you decide to list an event parameter as indexed you put the indexed keyword between the type and the parameter name. Once the event is defined you can emit it by using the emit keyword followed by the event with the correct parameters passed.

5. Event Count

Write a smart contract named `EventEmitter` that contains a single public funciton called `count`. This function should emit an event named `Called` that contains two parameters:
- `count`: the number of times this event has been emitted, this value should start at `1`.
- `sender`: the address of the account that called this function.

You may add as many state variables as necessary but do NOT add any functions.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract EventEmitter {
    // Write your code here
    uint value = 1;
    event Called(address indexed sender, uint count);

    function count() public {
        emit Called(msg.sender, value);
        value += 1;
        // return value;
    }
}

```

### 17 - Arrays

Arrays in Solidity are largely the same as arrays in other languages: a data structure that is used to store stuff.

#### Key Terms

##### Fixed-Size Array

A fixed-sized array is a data structure whose sized is determined when it is created/allocated and cannot change.

```
uint[5] fixedArray = [1, 2, 3, 4, 5];
```

##### Dynamic-Sized Array

A dynamic-sized array is a data structure that allows elements to be removed or added and can change its size.
- In Solidity, dynamic-sized arrays can only be defined in storage
- They also have access to the following methods:
    - .push()
    - .pop()

```
uint[] dynamicArray;
```

#### Notes from the video

##### Storage Arrays

```
contract HelloWorld {
    uint[] numbers; // dynamic-sized
    uint[5] numbers; // fixed-sized (defaults to [0, 0, 0, 0, 0])
    uint[5] numbers = [1, 2]; // fixed-sized ( [1, 2, 0, 0, 0])
    uint[5] public numbers = [1, 2]; // creates a getter so we can look at the values, by index
    uint[] public numbers = [1, 2]; // only indices you have access to are 0, 1
}

```

About storage arrays:
- Default type for all elements: The type declared when initializing the array
- Using the getter function, you provide an index of the array
    - When passing an index that does not exist, the transaction is reversed
        - This holds true for dynamic-sized arrays, unless you do some push/pop/delete of values...

##### Push, Pop and Delete

```
contract HelloWorld {
    uint[] public numbers = [1, 2];

    function add(uint x) public {
        numbers.push(x);
    }

    function pop() public {
        numbers.pop();
    }

    function length() public view returns (uint) {
        return numbers.length;
    }

    function remove(uint idx) public {
        delete numbers[idx];
    }    
}

```

About push/pop/delete:
- .push():
    - Only works for dynamic-sized arrays
        - Fixed-size arrays will throw an error
- .pop():
    - Removes the last element from the array
        - Cannot pass indexes to delete elements other than the last
- .length:
    - Works for both dynamic/fixed sized arrays
- .delete
    - Does not actually remove any elements / change length of the array
        - Resets the value to be the default for that data type

Note: Once you choose an array to be fixed-size, you cannot change that (would have to make a new array)

##### Memory Arrays

Arrays in Memory work much different than those in the Storage of a contract!

```
contract HelloWorld {
    function test() public {
        uint[] numbers; // 1. throws error (for array storage in stack)
        uint[] memory numbers; // good!
        numbers.push(1); // 2. throws error (cannot use push)
    }
}

```

What is going on here:
1. You cannot put an array in the stack
- If you do not specify location, it will try and store in the stack
2. You must use fixed-size arrays when in-memory
- When you have a dynamic-sized array defined in-memory, you do not have access to .push()
    - It look like a dynamically sized array, but you cannot add anything... so why even use it...
    - Remedy: use fixed-size

More quirks with memory arrays:

```
contract HelloWorld {
    function test() public {
        uint[] memory numbers = [1, 2, 3]; // error: first type is uint8, array type is uint256
        uint[] memory numbers = [uint(1), 2, 3]; // still error: first type is uint256 now, but Solidity requires you to provide fixed size

        uint[3] memory numbers = [uint(1), 2, 3]; // good!
        
    }
}

```

Takeaways on Memory Arrays:
- Initialize array and set with fixed-size
- Ensure it is in memory
- Cast the first element to be the element of the array

##### Dynamic Array Allocation

How to Dynamically Allocate a fixed-size array in-memory (Essentially: Use variable sizing to create the array)

```
contract HelloWorld {

    uint constant constant_x = 1; // constant, we know it will not change at all!

    function test(uint size) public {
        // error: invalid array length (cannot use a dynamic value ie. a function parameter)
        uint[size] memory numbers;
        
        // error: must use a constant value!
        uint x = 2;
        uint[x] memory numbers;

        // good: using constant/static data (see top of contract for init of `constant_x`)
        uint[constant_x] memory numbers; 
    }
}

```

Now this is fine, but how do we define a fixed-size array that is a specific size, when the size is not known until runtime?

Answer: Special syntax!

```
contract HelloWorld {
    function test(uint size) public {
         uint[] memory numbers = new uint[](size);
    }
}

```

What is going on here:
- `uint[]`: data type
- `(size)`: constructor

Next, how do we return an array from the function?

```
contract HelloWorld {
    function test(uint size) public pure returns (uint[] memory) {
         uint[] memory numbers = new uint[](size);
         return numbers;
    }
}

```

What is going on here:
- We cannot return `uint[]` when we are actually using a `uint[] memory`
    - Data location must be memory/calldata for return parameter in a function
- We CAN return 

Remember in Solidity:
- `pure` function: does not rely on any contract state to execute.
- `view` function: does not mutate/modify the state of a contract but may read it.

##### Array References

Now that we have done this, let's see what happens when we make reference to another array!

Remember: Arrays are a reference-type
- Difference between reference-type and value-type:
    - reference-type: We are pointing to another piece of data
        - Examples:
            - arrays
            - mappings

    - value-type: We create copies of these as we assign them to variables
        - Examples:
            - uint
            - int
            - bool

I will use this example to illustrate:

```
contract HelloWorld {
    uint x = 1;

    function test(uint size) public returns (uint[] memory) {
        uint y = x;
        ...
        y = 100; // this is where the difference is...
    }
}

```

Difference between reference-type and value-type here, if we change `y` to be `100`:
- reference-type: `x` also becomes 100 (it is a reference, not a copy)
- value-type: `x` stays 1 (it is a copy)

Notes:
- Solidity automatically makes a copy if you assign a storage array to a memory array.
    - Not a copy, but a reference/alias, if you go from memory => memory

Example:

```
contract HelloWorld {
    uint[] public nums = [1, 2];

    function test(uint size) public returns (uint[] memory) {
        uint[] memory numbers = nums;
        numbers[1] = 0;
        return numbers;
    }
}

```

What happens here:
- Calling test() will change index 1 to be a 0
- Viewing public nums, you will see that index 1 is NOT a 0
    - Any change to `numbers` (in the function) does NOT affect `nums` (in the contract)

Another example:

```
contract HelloWorld {
    function test() public pure returns (uint[3] memory, uint[3] memory) {
        uint[3] memory numbers = [uint(1), 2, 3];
        uint[3] memory numbers2 = numbers;
        numbers[1] = 0;
        numbers2[1] = 0; // these both do the same
        return (numbers, numbers2);
    }
}

```

What happens here:
- Both arrays return the exact same thing!
    - Making a change to `numbers` also makes a change to `numbers2` (we did not create a copy, but used alias/reference)

##### Array Gas Usage

Arrays: Fairly costly to use!
- As a storage variable (where it can grow to infinite size): Potential exploits to make your code unusable
    - If your transaction cannot complete all of its operation within the gas limit, transactions will fail 
        - Multiple dimensions arrays, looping through entire arrays or O(n^2) time operations will cause every transaction to fail
        - Methods to fix this: Batch/Bundling transactions

Takeaways: Be careful! (especially if you are looping through arrays)

##### Nested Arrays

Nested Arrays: Important to go over since they work differently than other programming languages!

Nested Arrays:

```
contract HelloWorld {
    function test() public pure returns (uint[][3] memory) {
        // 1. both of these work
        uint[][3] memory x;
        uint[][3] memory x = [[], [], []];
        
        // 2. fine, since they are dynamically-allocated size arrays
        uint[][3] memory x = [new uint[](2), new uint[](1), new uint[](1)]; 
        return x;
        
    }
}

```

What is going on here:
1. 1 fixed size array of length 3, and the 3 values are 3 dynamically allocated arrays
- type: uint[] (dynamically allocated array)
- length: [3] (number of uint[]'s)

2. 1 fixed size array of length 3, and the 3 values are 3 different-sized dynamically allocated arrays (2, 1, 1)
- type: uint[] (dynamically allocated array)
- length: [3] (number of uint[]'s)
- new uint[](2): dynamically-allocated array with 2 values of 0 for now

One more example looking at how to access values from: Same as you are used to!

```
contract HelloWorld {
    uint[][3] public x = [new uint[](2), new uint[](1), new uint[](3)];
}
```

Indexing values from `public x`:
- `0, 0`: 1st array, 1st value
- `1, 0`: 2nd array, 1st value
- `1, 1`: error (2nd array does not have a 2nd value - has length of 1!)


Takeaway:
- Accessing values: The same
- Creating arrays/values: Reversed (type, then number of that type)

##### Practice Questions

1. Analyze the smart contract below.

```
contract Arrays {
    uint8[] y;
  
    function test() external {
        uint8[] memory x = y
        ...
        }
}
```
Does the variable x store a copy or a reference of y?

My answer: Copy

Explanation: The variable x stores a copy of the array y. In Solidity, any assignment from storage to memory always makes a copy. (y is in storage, since it was not otherwise stated)

2. Analyze the smart contract below.

```
contract Arrays {
    uint8[] y = [1, 2, 3];
}
```

Can the push() and pop() methods be used on the array y?

My answer: Yes

Explanation: The array y is a dynamic-sized array. Even though it is intialized with three values it is still dynamically sized because it's size was not explicitly set. Therefore, both push() and pop() will work on this array.

3. Write a smart contract named `Following` that keeps track of which addresses are following other addresses. The maximum amount of addresses one address can follow is `3`. Use a combination of the `mapping` and `address[]` array type to achieve this.

To complete this smart contract write the following functions:
- `follow(address toFollow)`: adds the `toFollow` address to the array of addresses the `msg.sender` is following if they are not already following `3` users. If `msg.sender` is already following the maximum number of addresses, this function should raise an exception/error. It should be possible for on address to follow another address multiple times, but an address should not be able to follow itself.
- `getFollowing(address addr)`: returns an array of addresses that the `addr` passed is following.
- `clearFollowing()`: removes all of the addresses that the `msg.sender` is following.

Use the correct visibility modifiers and any state variables you deem necessary.


My answer

```
pragma solidity >=0.4.22 <=0.8.17;

contract Following {
    // Write your code here
    mapping(address => address[]) following;

    function follow(address toFollow) public {
        require(
            // following[msg.sender][2] == address(0),
            following[msg.sender].length < 3,
            "this address is already following 3 users."
        );
        require(
            msg.sender != toFollow,
            "you cannot follow yourself..."
        );
        // add to mapping
        following[msg.sender].push(toFollow);
        // if (following[msg.sender][0] == address(0)) {
        //     following[msg.sender][0] = toFollow;
        // }
        // else if (following[msg.sender][1] == address(0)) {
        //     following[msg.sender][1] = toFollow;
        // }
        // else {
        //     following[msg.sender][2] = toFollow;
        // }  
    }

    function getFollowing(address addr) public view returns (address[] memory) {
        return following[addr];
    }

    function clearFollowing() public {
        // following[msg.sender] = address[3];
        delete following[msg.sender]; // this will clear them back to address(0
    }
}

```

### 18 - Strings

This lesson about strings is secretly a lesson about bytes.

#### Key Terms

##### Strings

In Solidity, the `string` data type is used to store UTF-8 encoded characters.
- Strings have the following properties, making them not-so-fun to use:
    - not flexible
    - expensive to use
    - difficult to manipulate

For this reason, we prefer the `bytes` type when possible!

##### Bytes

In Solidity, the `bytes` type represents an array of bytes. It is useful for storing characters as raw data. The `bytes` type must be stored in `memory`, `calldata`, or `storage`. (Not the stack)

```
bytes myRawData = "hello world";
```

#### Notes from the video

We have left string until this lessons, because we need to know arrays first!

Keep the following in mind:
- Strings are not very useful in Solidity
- You will want to use `bytes` instead

##### Defining Strings

Strings: 
- Reference type: Stores a reference to the string, not the actual string itself
- Default `string`: empty string ie. ""

```
contract HelloWorld {
    string public x = "hello world";
    string public y;
}

```

Notes:
- It is recommended to use double quotes

More examples of what we can/cannot do:

```
contract HelloWorld {
    string public x = "hello world";

    function testString() {
        // these are all INVALID
        x[0]; // no index access
        x.push("z"); // not an operator (neither is .pop())
        x.length; // cannot view length of string

        // Why to use String: It has the UTF-8 characters

    }
}

```

So, why would we use strings if we have to manipulate it ourselves?
- String stores the UTF-8 characters, which are encoded by the bytes, which are a part of the string
    - Each character on your keyboard/you see is encoded with a unique integer
        - Examples:
            - 65 -> A
            - 66 -> B
            - ...
            - ...

    - String does not store the number, but it stores the de-coded UTF-8 character itself!

##### The Difference Between Unicode and UTF-8

Unicode is a character set. UTF-8 is encoding.

Unicode is a list of characters with unique decimal numbers (code points). A = 65, B = 66, C = 67, ...

Example:
- This list of decimal numbers represent the string "hello": 104 101 108 108 111
- UTF-8 encoding will store "hello" like this (binary): 01101000 01100101 01101100 01101100  01101111

##### Defining Bytes

String: UTF-8 data/character
Bytes: Raw data

Bytes: Array that allows index access 
- Preferred data type when working with strings/characters

```
contract HelloWorld {
    string public x = "hello world";
    bytes public y = "hello world";

    function testString() public {
        y[0] = "1";
        y.length;
        y.push("1");
        y.pop();
        delete y[1]; // set to default value
    }
}

```

What is going on here:
- `bytes` type: byte array
    - each slot in this array: 1 byte
        - 1 byte == 8 bits
            - example: uint8 == 1 byte

##### Converting Between bytes and String

Reminder:
- String: UTF-8 data/character
- Bytes: Raw data
- You can convert between bytes/string as you please!

Example:

```
contract HelloWorld {
    string public x = "hello world";
    bytes public y = "hello world";

    function testString() public view returns (bytes memory, string memory, bytes memory) {
        return (
            y,
            string(y),
            bytes(string(y))
        );
    }
}

```

What happens when you deploy:
- public x: "hello world"
- public y: "0x68656c6c6f20776f726c64"
- testString(): bytes, string, bytes
    - this is the bytes version of "hello world"
        - you can convert this to a string, so that it is readable
        - In the same way we can go from bytes to string, we can go from strings to bytes!

Note: If you are using strings/bytes outside of the state variables/storage area, you must use `memory` or `calldata`.

Summary:
- Bytes: for manipulating strings
- Strings: for viewing

Quick note about the bytes type: This is a bytes array!

Let's look at this example to show:

```
pragma solidity >=0.7.0 <0.9.0;

contract HelloWorld {
    string public x = "hello world";
    bytes[] public y = [bytes("one"), bytes("two"), bytes("three"), bytes("four")];

    function getValue(uint idx) public view returns (bytes memory, string memory) {
        return (
            y[idx],
            string(y[idx])
        );
    }
}

```

What this means:
- string public x: bytes as before
- bytes[] public y: an array of bytes
    - this is a dynamic array, and the values of this array are bytes!

##### Strings and Bytes in local functions

Let's look at an example of using strings/bytes in a local function:

```
contract HelloWorld {
    string public x = "hello world";
    bytes public y;

    function test(string memory str) public pure {
        // this method does not work: cannot push onto a data type in memory
        bytes memory convertedStr = bytes(str);
        convertedStr.push("1"); // error: push not available in bytes memory
    }
}

```

What is going on here:
1. To accept string/bytes as a function argument, we must use `memory` (or another location besides stack)
2. To add a character to the end of the string, you must take the following steps:
- convert string to bytes
- add character
- convert bytes to string
3. You cannot use push/pop outside of storage
- Just like arrays, you cannot have dynamic storage in memory
    - Remedy: Create a large enough array so the extra character would be inside of it
        - 1 slot larger works!

So, now that we cannot do it this way, how will we go about doing this?

##### String concat

Tim's Example:

```
contract HelloWorld {
    string public x = "hello world";
    bytes public y;

    function test(string memory str) public pure returns (string memory) {
        string memory newStr = string.concat(str, "s");
        return newStr;
    }
}

```

My example:

```
pragma solidity >=0.7.0 <0.9.0;

contract HelloWorld {
    string public x = "finish this sentence with a period";

    function test(string memory strEndingOfSentence) public view returns (string memory) {
        string memory newStr = string.concat(x, strEndingOfSentence);
        return newStr;
    }
}

```

What is going on here:

1. concat existing string with new string
2. return!

What concat does at a low-level: Convert the bytes arrays

##### Takeaways on Bytes

Takeawys on Bytes:
- Expensive to use
    - much like arrays, because they store multiple values
- bytes > strings:
    - strings are hard to work with
    - strings use up more data than bytes

How to create a dynamically-allocated bytes array:

```
bytes memory z = new bytes(10);
```

##### Practice Questions

1. What are the differences between the string and bytes type in Solidity?
- bytes types provide index access and have a .length property.

2. Any value of type string can be converted to type bytes, but not the other way around.
- False

3. String Generator
- Write a smart contract named `StringGenerator` that allow users to collaboratively generate a string. The smart contract should implement the functions defined below such that each user may submit a single character to add to the string. Once the string reaches a length of `5` it should not allow any new character to be added.
- `addCharacter(string character)`: a function that accepts a single character and adds it to the existing `string`/`bytes` type stored in the contract. This function should raise an error/exception if a user submits a string that is not a single character, if the current string length is `5`, or if the user has already added a character. 
- `getString()`: a public function that returns the current string stored in the contract. This function must return a `string`.

To implement these functions you will have to use a combination of both `string` and `bytes` types.

You may add as many state variables as necessary but do not add any functions.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract StringGenerator {
    mapping(address => bool) hasAddedCharacter;
    string currentString;
    function addCharacter(string memory character) public {
        // Write your code here
        require(bytes(currentString).length < 5, "cannot have length of 5.");
        require(bytes(character).length == 1, "must be single char.");
        require(!hasAddedCharacter[msg.sender], "address/user can only add 1 char!");
        hasAddedCharacter[msg.sender] = true;
        currentString = string.concat(currentString, character);

    }

    function getString() public view returns (string memory) {
        // Write your code here
        return currentString;
    }
}

```

### 19 - Loops

Be mindful of loops in Solidity! Unlike their counterparts in other programming languages, Solidity loops can easily run out of gas...literally.

#### Key Terms

n/a

#### Notes from the video

Seems pretty basic, but it can be very expensive in gas, so it is important that we understood that before diving in.

##### While Loops

Let's start with the while loop:

```
contract HelloWorld {
    function test() public pure {
        while (true) {
            continue;
            break;
        }
    }
}

```

##### For Loops

Syntax is similar to Java/JavaScript:

```
contract HelloWorld {
    function test() public pure {
        for (uint8 i; i < 276, i++) {
            continue;
            break;
        }
    }
}

```

Note: Be careful with the type for `i`, as an infinite loop can be created due to integer overflow.

Here is another example:

```
contract HelloWorld {
    function test(uint maxLoops) public pure returns (uint) {
        uint sum = 0;
        for (uint i = 0; i < maxLoops; i++) {
            sum += i;
        }
        return sum;
    }
}

```

Note: Once you use a number past ~10,000, you will run out of gas!

Now what?

##### Running Out of Gas

Error: "The transaction ran out of gas. Please increase the Gas Limit."
- How to deal with it:
    - Increase gas limit
    - Decrease iterations

When dealing with for-loops, you can never be sure that you will have enough gas (unless you do the math by hand for each operation - 1000's of iterations with simple operations will still use up a lot of gas quickly)

How to avoid this issue? Batching your transactions! (We will go over batching code in the next video...)

##### Looping Over Arrays

Let's finish by looking how we loop over an array:

Example: People can send a transaction to the smart contract, and when they do, we add their address to an array. Once they are in the array, they cannot send the transaction anymore.

```
contract HelloWorld {
    address[] public addresses;

    function addAddress() external {
        // loop through array (there is not a .contains or .include method)
        for (uint idx; idx < addresses.length; idx++) {
            address currentAddress = addresses[idx];
            if (currentAddress == msg.sender) {
                revert("Sender is already in addresses array.");
            }
        }
        addresses.push(msg.sender);
    }
}

```

About this piece of code:
- This is not ideal:
    - Looping through an array is O(n) and can cause you to run out of gas
        - This can make it so that you cannot loop through each address, making the function never work, and the smart contract useless!

A mapping type to a boolean would be a better approach!

```
contract HelloWorld {
    address[] public addresses;
    mapping(address => bool) addressesAdded;

    function addAddress() external {
        require(addressesAdded[msg.sender] == false, "address has already been added.");
        addressesAdded[msg.sender] = true;
        addresses.push(msg.sender);
    }
}

```

About this approach:
- Pros:
    - No need to loop through array (Lookups are faster in mappings)
    - Less gas used
- Cons:
    - Need more gas in storage (We have an additional field)
        - This is the constant battle of time vs. space!

##### Practice Questions

1. There is no limit to the number of iterations that can be performed by a for or while loop.
- False

Explanation: Although there is no specific number of iterations as an upper limit, loops can only execute if they have sufficient gas. Often times large loops will fail to complete due to the gas limit imposed by the Ethereum network.

2. Create Grid
- Complete the smart contract named `GridMaker` that is capable of returning two-dimensional arrays of specified sizes. To complete the smart contract, implement the following functions:
- `make2DIntGrid(uint rows, uint cols, int value)`: this function should return a two-dimensional `int` array that contains `row` nested arrays that contain `cols` elements with the value equal to the passed `int` value. For example, if the function was called like so: `make2DIntGrid(3, 4, -9)`, the expected return value would be `[[-9, -9, -9, -9], [-9, -9, -9, -9], [-9, -9, -9, -9]]`
- `make2DAddressGrid(uint rows, uint cols)`: this function should return a two-dimensional `address` array that contains `row` nested arrays that contain `cols` elements with the value equal to the address of the account that called this function. For example, if the function was called by address `"0xabc"` like so: `make2DIntGrid(5, 2)`, the expected return value would be `[["0xabc", "0xabc"], ["0xabc", "0xabc"], ["0xabc", "0xabc"], ["0xabc", "0xabc"], ["0xabc", "0xabc"]]`

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract GridMaker {
    function make2DIntGrid(
        uint256 rows,
        uint256 cols,
        int256 value
    ) public pure returns (int256[][] memory) {
        // Write your code here
        int256[][] memory array = new int256[][](rows);
        for (uint row = 0; row < rows; row++) {
            int256[] memory nestedArray = new int256[](cols);
            for (uint col = 0; col < cols; col++) {
                // array[row][col] = value;
                nestedArray[col] = value;
            }
            array[row] = nestedArray;
        }

        return array;

    }

    function make2DAddressGrid(uint256 rows, uint256 cols)
        public
        view
        returns (address[][] memory)
    {
        // Write your code here
        address[][] memory array = new address[][](rows);
        for (uint row = 0; row < rows; row++) {
            address[] memory nestedArray = new address[](cols);
            for (uint col = 0; col < cols; col++) {
                // array[row][col] = value;
                nestedArray[col] = msg.sender;
            }
            array[row] = nestedArray;
        }

        return array;
    }
}

```

### 20 - Gas Cost And Estimation

The definitive video on gas. Did it suddenly get smelly in here?

#### Key Terms

##### Gas

In the context of Ethereum, gas is a fee required to execute transactions or smart contracts. Gas is paid in Ether and is denoted in gwei.

#### Notes from the video

##### Gas Units, Gas Price, Tx Fee

Let's break Gas down:
- Gas Units: Measures the computational effort required for a contract
    - Does not tell how much it costs the user to submit this gas, but how many units are being used
    - Examples:
        - 20,000 gas units
        - 50,000 gas units
    

- Gas Price: Amount of Ethereum we are willing to pay, per unit of gas
    - Equation: base + tip
        - base: minimum value we need to pay, per unit of gas
            - if you want your transaction to be added, you need to pay this minimum amount of gas
            - determined by volume of Ethereum network
            - this base fee is burnt ie. miners do not collect this base fee, it actually gets "destroyed"
                - this is to offset the amount of ETH that is created when new blocks are added to the Ethereum blockchain
        - tip: amount you add if you want your transaction to go through faster
            - you want it to go through in a reasonable amount of time, so you will tip to incentivize miners

    - Examples:
        - gas price (gwei) = base + tip

- Tx Fee: Amount of transaction cost
    - When you send a transaction, you pick a maximum value (Tx Fee Sent) that is above the Tx Fee (Not necessarily how much you sent with the transaction)
        - If you send money as your transaction fee, that is more than the actual cost to perform the transaction, you will be refunded!
    - Examples:
        - Tx Fee Sent - Tx Fee (cost) = refunded amount/change

Recap:
- Gas Units: Measure of computational effort
- Gas Price: How much we are willing to pay, per unit of gas
- Real Tx Fee: Cost to perform operation
    - Number of units consumed * gas price
- Sent Tx Fee (Gas Limit/MaxFee): Amount we submit with the transaction
    - Max fee we are willing to pay
- Refund = Tx Fee Sent - Real Tx Fee (Cost)

Recap #2:
- Transaction Fee/Tx Fee = Gas Units * (base fee + tip fee)
    - We set this number, and the higher it is, higher chance of transaction going through quickly
    - Units = determined by operations performed by the smart contract/transaction
- Gas Limit = Max fee
    - 21000 * max price
        - 21000 = max. gas required
- Refund = Gas limit - Tx Fee

##### Gas Edge Cases

What happens if the gas limit we specify is not high enough ie. we run out of gas?
- Operation is incomplete
- State is reverted
- Gas is NOT returned
    - it is used by the smart contract, because the smart contract required to gas to perform the operations in the first place (it still had to perform the computations... too bad for us on losing the Tx fee!) 

When submitting a transaction: Set your gas limit as HIGH as possible! (So that you don't run out of gas and lose it all)

Contradictory, but Reasons why you may not want to send a bunch of gas for each transaction:
- Becomes a problem if you need the money you are sending
    - Example: You have 1 ETH, and you send 1 ETH to the transaction
        - If you want to send another transaction, you have to wait for the 1st transaction to process (that 1 ETH is unavailable until you get the refund)

##### What Is Meant By Gas

What you submit as user: 100 Gas = 100 gwei
- Fee consumed/used by the transaction
In the smart contract: Gas unit = 274
- Smart contract does not know price in terms of ETH, but it knows this operation costs 274 gas units

After operation is performed: Refund = 100 gwei - 274 gas units * gas price = 

##### Block Gas Limit

Max. amount of gas per block:
- Ethereum soft limit: 8,000,000 gas per block
    - This is so each block receives 8,000,000 gas
        - this is so you cannot submit a transaction with more than 8,000,000 gwei, this is imposed by Ethereum
        - you can go above this, but you won't see anything like 25,000,000 (can't send unlimited, we will leave it at that!)
        - need to optimize smart contracts for gas usage, and consider that user's should not have to send $1,000's in fees just for a transaction to go through

That is it for the theoretical aspect of this video!

##### Gas Cost Demo

We will start looking at examples, and eventually learn how to split large transactions up into smaller ones.

Example 1:

```
contract HelloWorld {
    uint public sum;
    uint constant sumTo = 1000000;

    function addIntegers() public {
        for (uint i = 1; i <= sumTo; i++) {
            sum += i;
        }
    }
}

```

When you submit, before clicking confirm in MetaMask, you can edit priority and adjust the gas fee:
- speed: low/medium/high
- gas limit
- max priority fee
- max fee

*I will just go with the suggested gas, which is the recommendation typically*

What happens with this code:
- Click addIntegers()
    - Gas estimation failed: Based on static analysis, we will run out of gas if we send the transaction
        - If we send and it fails: We will waste gas (don't do this! take heed of the warning)

How do we fix this?

##### Splitting Transactions/Computations

By Splitting Transactions/Computations, we can have enough gas for each transaction to perform the sub-computation, which at the end has the entire computation
- We can decide how many transactions to split the work into
    - Starting value: 10 steps

This makes our code more difficult, but let's dive in:

```
contract HelloWorld {
    uint public sum;
    uint constant sumTo = 1000;
    uint public start = 1;
    uint public end = 100;

    function addIntegers() public {
        require(end <= sumTo); // this will cause the function to stop running once we get to 901-1000.

        uint increment = 100; // 100 addition operations, per function call
        for (uint i = start; i <= end; i++) {
            sum += i;
        }
        // this code will make sure that after doing 1-100, we will do 101-200, 201-300, etc.
        start = end + 1;
        end = end + increment;
    }
}

```

What happens here:
- Sum starts at 0
- When start = 1 and end = 100, press addIntegers() and turn the sum into 5050
- When start = 101 and end = 200, press addIntegers() and turn the sum into 20100
- ...
- When start = 901 and end = 1000, press addIntegers() and turn the sum into 500500
- Sum ends at 500500 (Pressing addIntegers() when start == 1001 && end == 1100 is a failed transaction due to requirements)

This way shows how to batch our transactions and perform part on each transaction, so we have sufficient gas for each sub-transaction.

##### gasleft()

gasleft(): Tells you how much gas we have remaining during a computation/transaction
- Can use this function to determine when you need to stop doing a computation, and can then resume it in the next transaction

Example:

```
pragma solidity >=0.7.0 <0.9.0;

contract HelloWorld {
    uint public sum = 0;
    uint public gasLeft;
    
    function test() public {
        uint startGas = gasleft();
        
        for (uint i; i < 100; i++) {
            sum += i;
        }
        gasLeft = startGas - gasleft();
    }
}

```

What is going on here:
- Before 1st iteration of test():
    - sum: 0
    - gasLeft: 0
- After 1st iteration of test():
    - sum: 4950
    - gasLeft: 81039
- After 2nd iteration of test():
    - sum: 9900
    - gasLeft: 63939
- After 3rd iteration of test():
    - sum: 14850
    - gasLeft: 63939 (?)

##### Practice Questions

1. Which of the following is the correct formula for determing the transaction fee of a completed transaction?
- gas units * (base fee + tip fee)

Explanation: The transaction fee of a completed transaction is determined by multiplying the gas units by the gas price which is equal to (base fee + tip fee). The gas units value represents the amount of computational effort that was used to process the transaction while the gas price is what the transaction sender specified as the price they are willing to pay per unit of gas.

2. If a transaction runs out of gas during execution the gas is refunded to the sender?
- False

3. Largest Holders
- Complete the smart contract named `LargestHolder` by implementing the functions defined below. The smart contract will be responsible for processing two large array structures, one containing `address`'s and the other containing `uint`'s. Each corresponding index will represent the balance of an arbitrary Ethereum account (ie. index 1 in the `uint` array represents the balance of the address stored at index 1 in the `address` array). In order to process these large structures, you will need to perform sub-computations and will require multiple transactions be sent to the contract

The goal of this smart contract will be to determine the address of the two largest Ether holders using the passes arrays. The largest holder is the address that contains the largest corresponding value in the passed `uint` array.

When implementing these functions, imagine you can do at most `10` iterations of a for/while loop for each provided transaction.
- `submitBalances(uint[] memory _balances, address[] memory _holders)`: this function must be called first, before any other function can be called. it should store the appropriate storage values (from the two arrays) and determine the number of transactions that will be required to process the structures (recall, you can only do 10 iterations per transaction). You may assume each address in the passed `_holders` array will be unique and that there will never be a tie for the largest holder. You may also assume the length of the two passed arrays will be the same.
- `process()`: this function will be called multiple times to process the arrays passed to `submitBalances` and determine the addresses of the two largest holders. It should iterate through portions of the arrays (or other data structures you decide to create) and keep track of where it left off. Once the addresses of the largest holders have been determined, this function should not be callable (ie. it should fail when called). This function should raise an exception/error if called when the balances have not yet been submitted.
- `numberOfTxRequired()`: this function should return the current number of transactions still required to process the values passed to `submitBalances`. This function should raise an exception/error if called when the balances have not yet been submitted.
- `getLargestHolder`: this function should return the addresses of the largest holder. This function should raise an exception/error if called when the largest holders have not been determined or if the balances have not yet been submitted.

To solve this problem you will likely need to store multiple values in storage.

My answer:

```


pragma solidity >=0.4.22 <=0.8.17;

contract LargestHolder {
    address[] holders;
    uint256[] balances;

    bool balancesSubmitted;

    uint256 txRequired;

    uint256 processStartIdx;
    uint256 processEndIdx;

    address largestHolder;
    uint256 currentLargestBalance;
    function submitBalances(
        uint256[] memory _balances,
        address[] memory _holders
    ) public {
        // Write your code here
        require(!balancesSubmitted, "balances have already been submitted");
        balancesSubmitted = true;
        holders = _holders;
        balances = _balances;

        txRequired = holders.length / 10;
        if (txRequired * 10 < holders.length) {
            txRequired++; // need to handle remainder from division
        }

        processEndIdx = 10;
        if (processEndIdx > balances.length) {
            // make sure we do not iterate over values that do not exist
            processEndIdx = balances.length;
        }
    }

    function process() public {
        // Write your code here
        require(balancesSubmitted, "balances have not yet been submitted");
        require(txRequired > 0, "you have already processed the balances");

        for (uint256 idx = processStartIdx; idx < processEndIdx; idx++) {
            uint256 amount = balances[idx];

            if (amount > currentLargestBalance) {
                address account = holders[idx];
                largestHolder = account;
                currentLargestBalance = amount;
            }
        }

        processStartIdx = processEndIdx;
        processEndIdx += 10;
        if (processEndIdx > balances.length) {
            processEndIdx = balances.length;
        }

        txRequired--;
    }

    function numberOfTxRequired() public view returns (uint256) {
        // Write your code here
        require(balancesSubmitted, "balances have not yet been submitted");
        return txRequired;
    }

    function getLargestHolder() public view returns (address) {
        // Write your code here
        require(txRequired == 0, "you have not finished processing");
        return largestHolder;
    }
}

```

## Assessment

1. Write a smart contract named `AdvancedCounter` that allows multiple users to keep track of their own independent counters. Each counter will be represented by a `string` id and will be specific to each user/account that interacts with the smart contract. Each user should have a limit of `3` counters. Each counter should store an `int` value.

For example, account with the address `0xabc...` may have three counters with id's `a`/`b`/`c`. Each counter should be able to be manipulated independently of all other counters by using the functions below. To clarify, if another address, say `0xbbb...`, had a counter with id `a`, this would be a separate counter from the counter with id `a` that is controlled by `0xabc...`. Each address should only be able to control their own counters.

To write this smart contract, implement thhe functions defined below.
- `createCounter(string id, int value)`: this function should set the counter with the passed `id` to that passed `value` for the address that called this function. This function should fail if the user already has `3` counters (the maximum allowed) or if the passed counter `id` already exists for this user.
- `deleteCounter(string id)`: this function should delete the counter with the passed `id` for the address that called this function. After the deletion the address should be able to create another counter with the same or a new id. This function should fail if called with an `id` for a counter that does not exist.
- `incrementCounter(string id)`: this function should increment the counter with the passed `id` by `1` for the address that called this function. This function should fail if called with an `id` for a counter that does not exist. (ie. it has not been created yet OR it was deleted).
- `decrementCounter(string id)`: this function should decrement the counter with the passed `id` by `1` for the address that called this function. This function should fail if called with an `id` for a counter that does not exist. (ie. it has not been created yet OR it was deleted).
- `getCount(string id)`: this function should return the value of the counter with the passed `id` for the address that called this function. This function should fail if called with an `id` for a counter that does not exist. (ie. it has not been created yet OR it was deleted).

You are welcome to create any additional functions and use as many storage variables as you deem necessary.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract AdvancedCounter {
    mapping(address => mapping(string => int256)) counters;
    mapping(address => mapping(string => bool)) counterIdExists; // required to keep track of used ids
    mapping(address => uint256) numCountersCreated; // required to keep track of number of counters

    function counterExists(string memory id) internal view returns (bool) {
        return counterIdExists[msg.sender][id];
    }

    function createCounter(string memory id, int256 value) public {
        // Write your code here
        require(
            numCountersCreated[msg.sender] != 3,
            "you have already created the maximum number of counters"
        );
        require(!counterExists(id), "a counter with this id already exists");
        counters[msg.sender][id] = value;
        numCountersCreated[msg.sender]++;
        counterIdExists[msg.sender][id] = true;
    }

    function deleteCounter(string memory id) public {
        // Write your code here
        require(counterExists(id), "a counter with this id does not exist.");
        delete counters[msg.sender][id];
        numCountersCreated[msg.sender]--;
        counterIdExists[msg.sender][id] = false;
    }

    function incrementCounter(string memory id) public {
        // Write your code here
        require(counterExists(id), "this counter does not exist");
        counters[msg.sender][id]++;
    }

    function decrementCounter(string memory id) public {
        // Write your code here
        require(counterExists(id), "this counter does not exist");
        counters[msg.sender][id]--;
    }

    function getCount(string memory id) public view returns (int256) {
        // Write your code here
        require(counterExists(id), "this counter does not exist");
        return counters[msg.sender][id];
    }
}

```

2. Greedy Banker

Write a smart contract named `GreedyBanker` that acts as a bank account for users. It should allow users to deposit funds by sending ether directly to the contract address via the `recieve` function and to withdraw their funds using a function you'll implement named `withdraw`. The catch is, the deployer of this smart contract is greedy and wants to collect a fee from users when they make a deposit.

Each address that deposits to the smart contract should get exactly one free deposit, afters a fe of `1000 wei` should be charged for each deposit. The fees collected by this smart contract should be stored such that the owner can withdraw/collect them at their convenience. If a user has used up their free deposit and attempts to send less money than `1000 wei` (the fee) their deposit should fail. All of this logic should be handled in the `receive` function.

If a user incorrectly sends funds (ie. the transaction triggers the `fallback` function), all the funds recieved should be added to the current fees collected and become withdrawable by the owner/deployer of the contract.

As well as the functionality listed above, implement the following functions:
- `withdraw(uint amount)`: a function that allows users to withdraw funds. Assuming the amount they requested to withdraw is valid they should be sent that amount. If the user attempts to withdraw more funds than they have available, this function should fail. Withdrawls are free (ie. they don't cost the user a gas fee).
- `getBalance()`: a function that returns the callers current withdrawable balance.
- `collectFees()`: a function that can only be called by the deployer/owner of the smart contract. This function should send the owner all received fees. Make sure this function is not exploitable.

Recall, every deposit costs the user `1000 wei`, make sure to adjust the users balance correctly to handle these fees.

Note: Make sure to protect against re-entrance attacks and other smart contract exploits.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract GreedyBanker {
    uint256 constant fee = 1000 wei;

    mapping(address => uint256) balances;
    mapping(address => uint256) depositCount;

    uint256 feesCollected;

    address owner;

    constructor() {
        owner = msg.sender;
    }
    receive() external payable {
        // Write your code here
        uint256 depositFee;
        if (depositCount[msg.sender] >= 1) {
            require(msg.value >= fee, "amount is not enough to cover the fee");
            depositFee = fee;
        }

        balances[msg.sender] += msg.value - depositFee;
        feesCollected += depositFee;
        depositCount[msg.sender]++;
    }

    fallback() external payable {
        // Write your code here
        feesCollected += msg.value;
    }

    function withdraw(uint256 amount) external {
        // Write your code here
        require(balances[msg.sender] >= amount, "insufficient balance");
        balances[msg.sender] -= amount;
        (bool sent, ) = payable(msg.sender).call{value: amount}("");
        require(sent, "withdraw failed");
    }

    function collectFees() external {
        // Write your code here
        require(msg.sender == owner, "only the owner can call this function");
        uint256 totalFees = feesCollected;
        feesCollected = 0;
        (bool sent, ) = payable(owner).call{value: totalFees}("");
        require(sent, "transfer failed");
    }

    function getBalance() public view returns (uint256) {
        // Write your code here
        return balances[msg.sender];
    }
}

```

3. Ether Election

Write a smart contract named `EtherElection` that allows users to vote for the "Ether King". This smart contract will go through three main phases: candidate enrollment, voting, and rewards/payouts.

During the first phase, users that wish to run for election will need to submit exactly `1` Ethereum. Once three users have enrolled as candidates the enrollment phase will end and the voting phase will start.

During the voting phase, users will be able to submit a vote for one of the three candidates. Users that wish to vote will have to pay a fee of exactly `10,000 wei`. This fee will be non-refundable and held in the balance of the smart contract. Once any candidate receives exactly `5` votes they will be declared the winner and the voting phase will end.

In the final phase (once the winner has been declared), the winner will be able to withdraw `3` Ethereum from the contract as their prize for winning. Once the winner has withdrawn their prize, the contract can be destroyed by the owner/deployer who should collect all of the fees paid by voters.

To implement this functionality, write the following functions:

- `enroll()`: a functions that allows exactly three users to enroll as candidates. If the caller of the function is not already a candidate and submits exactly `1` Ethereum, they should be added as a candidate. This function should fail if it is not sent exactly `1` Ethereum or if all candidates have already been chosen.

- `vote(address candidate)`: this function should allow any users to vote for their favorite candidate by sending the correct fee of `10,000 wei`. Each user should only be allowed to vote one time. This function should fail if it does not receive `10,000 wei`, if the user has already voted, if the address the user votes for is not a candidate, or if the voting phase is done.

- `getWinner()`: this function should return who the winner of the election was. If the winner has not yet been decided, this function should fail.

- `claimReward()`: this function should only be callable by the winner of the election and should send the winner `3` Ethereum when called. This function should fail if the winner has not yet been decided, if the winner has already received their reward, or if it has been caleld by an address that is not the winner.

- `collectFees()`: this function should destroy the smart contract, erasing its state. It should send the remaining smart contract balance to the deployer/owner of the contract. This function should fail if it is called before the winner has been declared or if the winner has not withdrew their reward. Only the owner/deployer of the contract should be able to call this.

Note: candidates are allowed to vote and they may vote for themselves.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract EtherElection {
    address owner;

    address[] candidates;
    mapping(address => uint256) votes;
    mapping(address => bool) voted; // store who has already voted

    address winner;
    bool winnerWithdrew;

    constructor() {
        owner = msg.sender;
    }

    function isCandidateInCandidates(address candidate)
        internal
        view
        returns (bool)
    {
        for (uint256 idx; idx < candidates.length; idx++) {
            address currentCandidate = candidates[idx];

            if (currentCandidate == candidate) {
                return true;
            }
        }

        return false;
    }

    function enroll() public payable {
        // Write your code here
        require(candidates.length != 3, "3 candidates have already enrolled");
        require(msg.value == 1 ether, "you must send exaclty one ether");
        require(
            !isCandidateInCandidates(msg.sender),
            "you are already a candiate"
        );

        candidates.push(msg.sender);
    }

    function vote(address candidate) public payable {
        // Write your code here
        require(candidates.length == 3, "enrollment is not done");
        require(isCandidateInCandidates(candidate), "invalid candidate");
        require(winner == address(0), "voting has ended");
        require(!voted[msg.sender], "you have already voted");
        require(msg.value == 10000, "incorrect fee");
        voted[msg.sender] = true;
        votes[candidate]++;

        if (votes[candidate] == 5) {
            winner = candidate;
        }
    }

    function getWinner() public view returns (address) {
        // Write your code here
        require(winner != address(0), "winner has not been declared");
        return winner;
    }

    function claimReward() public {
        // Write your code here
        require(winner != address(0), "winner has not been declared");
        require(msg.sender == winner, "you are not the winner");
        require(!winnerWithdrew, "you have already withdrawn your reward");
        winnerWithdrew = true;
        (bool sent, ) = payable(winner).call{value: 3 ether}("");
        require(sent, "transfer failed");
    }

    function collectFees() public {
        // Write your code here
        require(winnerWithdrew, "winner has not yet withdrawn reward");
        require(msg.sender == owner, "only the owner can call this function");
        selfdestruct(payable(owner));
    }
}

```

4. Ether Math

Write a smart contract named `EtherMath` that provides mathematical challenges for users. If a user successfully solves the mathematical challenge they will receive the reward provided by the creator of the challenge.

The owner/deployer of the contract will submit an array of integers and a single integer representing a desired sum. They will also send a non-zero amount of ether to provide as a reward. The goal for participants will be to determine which values from the array to use to create the sum (this is the challenge). You may assume all challenges submitted will always have at least one valid solution.

Once the array of integers, sum and reward have been submitted, any participant may attempt to solve the challenge by submitting their solution. Their solution will simply be an array containing integers found in the original array that sum to the target sum. They may reuse integers from the array. Each user should only receive one guess/submission per challenge.

If a user submits the correct solution they should be able to withdraw the provided reward and the contract should reset, allowing the owner to submit another challenge and users to guess the answer for this new challenge. Only one user can recieve the reward for submitting the correct answer and users can only submit answers if a challenge has been set.

To write this smart contract implementing the following functions. These function should adhere to the behavior defined:

- `submitChallenge(int[] memory array, int targetSum)`: a function that allows the owner to set a challenge. This function can only be called when no challenge has been set or the previous challenge has been solved. This function should fail if it is called by someone who is not the owner, or if the owner fails to send a non-zero ether reward.

- `submitSolution(int[] memory solution)`: this function should allow each user to submit exactly one solution for the current challenge. If a user submits the correct solution, the challenge should reset and they should be able to withdraw the reward for this challenge. This function should fail if called by a user that has already submitted a solution for the current challenge of it no challenge is set.

- `claimRewards()`: this function should allow users to claim any rewards they have received (from one or multiple challenges) by sending them the reward ether amount.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract EtherMath {
    int256[] usableNumbers;
    int256 sum;
    uint256 reward;

    address owner;

    mapping(address => uint256) unclaimedRewards;

    address[] submittedSolution;

    constructor() {
        owner = msg.sender;
    }

    function verifySolution(int256[] memory solution)
        internal
        view
        returns (bool)
    {
        int256 solutionSum;

        for (uint256 idx; idx < solution.length; idx++) {
            bool numberExists;
            for (uint256 j; j < usableNumbers.length; j++) {
                // check if the number the solution used is in usableNumbers
                if (usableNumbers[j] == solution[idx]) {
                    numberExists = true;
                }
            }

            if (!numberExists) {
                return false;
            }
            solutionSum += solution[idx];
        }

        return solutionSum == sum;
    }

    function userSubmittedSolution(address user) internal view returns (bool) {
        for (uint256 idx; idx < submittedSolution.length; idx++) {
            address currentUser = submittedSolution[idx];
            if (currentUser == user) {
                return true;
            }
        }
        return false;
    }

    function submitChallenge(int256[] memory array, int256 targetSum)
        public
        payable
    {
        require(msg.sender == owner, "only the owner can call this function");
        require(reward == 0, "a challenge is already active");
        require(msg.value > 0, "you must send a non-zero value for the reward");
        reward = msg.value;
        usableNumbers = array;
        sum = targetSum;
    }

    function submitSolution(int256[] memory solution) public {
        require(reward != 0, "no challenge is currently active");
        require(
            !userSubmittedSolution(msg.sender),
            "you have already submitted a solution"
        );

        submittedSolution.push(msg.sender);
        if (verifySolution(solution)) {
            unclaimedRewards[msg.sender] += reward;
            reward = 0;
            sum = 0;
            delete submittedSolution;
            delete usableNumbers;
        }
    }

    function claimRewards() public {
        uint256 userReward = unclaimedRewards[msg.sender];
        unclaimedRewards[msg.sender] = 0;
        (bool sent, ) = payable(msg.sender).call{value: userReward}("");
        require(sent, "transfer failed");
    }
}

```

5. Fizz Buzz

Write a smart contract named `FizzBuzz` that implements the famous Fizz Buzz algorithm, but with a twist. Rather than returning strings "Fizz" and "Buzz" you'll emit events.

The FizzBuzz problems is a famous algorithm style coding questions where you are tasked to iterate through a sequence of integers and print "Fizz" if the integer is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if the integer is divisible by both 3 and 5.

For this question your contract will need to keep track of a count and emit custom events each time the count has changed. The events will be as follows:

- `Fizz(address sender, uint indexed count)`

- `Buzz(address sender, uint indexed count)`

- `FizzAndBuzz(address sender, uint indexed count)`

To implement this functionality, define the events specified above and emit the correct one each time the count of the contract is changed. The count will be changed by calling the function defined below. Your function should emit a maximum of 1 event per call.

- `increment()`: this function should simply increment the internal count of the contract by one and emit the correct event based on the new value of the count. For example, if the count before calling the function is 2 then the function would change the count to 3 and emit Fizz. If the new count is not divisible by 3 or 5, no event should be emitted.

Note: the count should start at 0.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract FizzBuzz {
        // Write your code here
        uint count = 0;
        event Fizz(address sender, uint indexed count);
        event Buzz(address sender, uint indexed count);
        event FizzAndBuzz(address sender, uint indexed count);

        function increment() public {
            // increment
            count += 1;
            // emit events, based on count
            if (count % 3 == 0 && count % 5 == 0) {
                emit FizzAndBuzz(msg.sender, count);
            }
            else if (count % 3 == 0) {
                emit Fizz(msg.sender, count);
            }
            else if (count % 5 == 0) {
                emit Buzz(msg.sender, count);
            }
            // else {
            //     continue;
            // }
    }
}

```

---

# 5 - Advanced Solidity

This is where we get deeper into the technical weeds of the Solidity programming language, examining some of its more advanced features and peculiarities.

## Lessons

### 1 - Math and Arithmetic

Everyone knows how dangerous math can be! Thankfully, though, Solidity provides us with a library named SafeMath so that we can practice safe math.

#### Key Terms

n/a

#### Notes from the video

##### Fixed/Floating Point Values

You cannot implement floating point values in Solidity! (No decimals)

```
contract HelloWorld {
    fixed x = 21.55; // error: 
}
```

How to use decimals in Solidity:
- Use existing types in Solidity to represent this:
    - Take your value (21.55)
    - Multiply by level of precision ie. 100
    - Split apart integer and decimal components:
        - integer: 21
        - decimal: 55

##### Overflow and Underflows

We have previously looked at Overflow and Underflows, but let's go into further depth:

```
contract HelloWorld {
    function testMath(uint8 x, uint8 y) public pure returns (uint8) {
        return x + y;
    }
}
```

What is going on here:
- uint8 can store a max value of 255
    - if we sum 2 uint8's that add to above 255, then we don't have enough bits to store it in the uint8 type

- In the new Solidity 0.8.0 and up, Overflows/Underflows are automatically handled during runtime. If they occur, the contract reverts.
    - This is as opposed to getting a weird value back

This 2nd example is the same, but for subtraction:

```
contract HelloWorld {
    function testMath(uint8 x, uint8 y) public pure returns (uint8) {
        return x - y;
    }
}

```

What is going on here:
- uint8 can store a min value of 0
    - if the sum is less than 0, the value is too small to store in the space
        - there is an underflow + the contract reverts

##### SafeMath Library

In older versions of Solidity: You do not automatically handle Overflows/Underflows.

You can try this out by going into Remix IDE and using a compiler such as 0.7.6.
- For the underflow example, you will see a random number returned

We can handle these overflows and underflows with these methods:
- assert() statements
- SafeMath library

Examples:

```
// assert() example
contract HelloWorld {
    function testMath(uint8 x, uint8 y) public pure returns (uint8) {
        assert(y <= x); // prevent the underflow
        assert(y + x <= 255); // prevent the overflow
        return x - y;
    }
}

```

We will look at this SafeMath library to see another way to handle overflows/underflows
- We won't use it in newer Solidity, but it is still good to learn how these libraries work.

How to call functions from the SafeMath library:

```
pragma solidity >=0.7.0 <0.9.0;

import"https://github.com/OpenZeppelin/openzeppelin-contracts/blob/master/contracts/utils/math/Math.sol";

contract HelloWorld {
    function testMath(uint x, uint y) public pure returns (uint8) {
        return SafeMath.add(x, y);
        // return SafeMath.sub(x, y);
        // return SafeMath.div(x, y);
    }
}

```

How this would work:
- The functions would revert the contract if an overflow/underflow occurred

Another way to use SafeMath:

```
pragma solidity >=0.7.0 <0.9.0;

import"https://github.com/OpenZeppelin/openzeppelin-contracts/blob/master/contracts/utils/math/Math.sol";

contract HelloWorld {
    using SafeMath for uint;
    function testMath(uint x, uint y) public pure returns (uint8) {
        x.mod(y); 
    }
}

```

What this does: You have direct access to call SafeMath functions on uint types!

##### Scientific Notation

Scientific Notation: A cool way to define very large values!

```
pragma solidity >=0.7.0 <0.9.0;

import"https://github.com/OpenZeppelin/openzeppelin-contracts/blob/master/contracts/utils/math/Math.sol";

contract HelloWorld {
    function testMath(uint x, uint y) public pure returns (uint8) {
        uint x = 2.999873e10;
    }
}

```

##### Practice Questions

1. Solidity compiler version 0.8.17 suppors the usage of fixed point (a.k.a. floating point) numbers?
- False

Explanation: As of Solidity compiler version 0.8.17 fixed point numbers are not currently supported. The fixed type does exist in the language but it is not implemented and no values can be assigned to a variable of type fixed.

2. Examine the following code.

```
pragma solidity >=0.7.0 <0.7.6;
  
contract Math {
  function subtractNumbers(uint8 num1, uint8 num2) public pure returns (uint8) {
    uint8 z = num1 - num2;
    return z;
  }  
}
```

If the function subtractNumbers is called in the following way subtractNumbers(243, 255) what the result be?

My answer: The function will return 244.

Explanation: Pay special attention to the pragma line. It states that the compiler version is between 0.7.0 and 0.7.6. This means that Solidity will not handle overflows and underflows by default, meaning the contract will not revert and instead use integer wrapping, resulting in a return value of 244.

Note: in this situation an underflow occurred as the computed value was too small to fit in the uint8 type.

3. Examine the following code.

```
pragma solidity >=0.8.0 <0.8.17;
  
contract Math {
  function addNumbers(uint8 num1, uint8 num2) public pure returns (uint8) {
    uint8 z = num1 + num2;
    return z;
  }  
}
```

My answer: The contract will revert due to an overflow.

Explanation: Pay special attention to the pragma line. It states that the compiler version is between 0.8.0 and 0.8.17. This means that Solidity will handle overflows and underflows by default, meaning the contract will revert when an overflow occurs.

Note: in this situation an overflow occurred as the computed value was too large to fit in the uint8 type.

4. Write a smart contract named `MathUtils` that contains the following functions:

- `floor(int value)`: returns the `value` rounded down to the nearest ten. Positive and negative values should both round towards 0. For example, -97 should round to -90 and 101 should round to 100.

- `ceil(int value)`: returns the value rounded up to the nearest ten. Positive and negative values should both round towards 0. For example, -97 should round to -100 and 101 should round to 110.

- `average(int[] memory values, bool down)`: returns the average of a sequence of numbers. if `down` is `true`, return the average rounded down to the nearest ten; otherwise, return the average rounded up to the nearest ten. The average of an empty array is zero.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract MathUtils {
    function floor(int256 value) public pure returns (int256) {
        // Write your code here
        int256 remainder = value % 10;
        return value - remainder;
    }

    function ceil(int256 value) public pure returns (int256) {
        // Write your code here
        int256 remainder = value % 10;
        if (remainder > 0) {
            return value + (10 - remainder);
        } else if (remainder == 0) {
            return value;
        }
        return value - 10 - remainder;
    }

    function average(int256[] memory values, bool down)
        public
        pure
        returns (int256)
    {
        // Write your code here
        if (values.length == 0) {
            return 0;
        }

        int256 sum;
        for (uint256 idx; idx < values.length; idx++) {
            sum += values[idx];
        }
        int256 avg = sum / int256(values.length);
        return down ? floor(avg) : ceil(avg);
    }
}

```

### 2 - Time and Time Units

Time is one of the most common inputs for a smart contract to react to as part of its execution. So grab a snack or a beverage and make some time for this lesson!

#### Key Terms

##### Time Units

In Solidity, there are various built in time units. These units make it easier to work with time and timestamps. The following are valid time units in Solidity:
- `seconds`
- `minutes`
- `hours`
- `days`
- `weeks`

##### Unix Epoch

The Unix Epoch is the time 00:00:00 UTC on 1 January 1970.

#### Notes from the video

Remember: Contracts are passive - they can only do something when they are called or a transaction is sent to them
- Not really a way to do something at a specific time
    - We can only check what the time is, and respond to whatever is given to use
        - respond to transaction/call (using time)

##### block.timestamp

How to get the time
- block (variable)
- .timestamp (timestamp when block was added to the blockchain ie. when it was mined)
    - note: multiple transactions will have the same timestamp, if they are part of the same block on the chain
        - keep this in mind, in case you ever tried to rely on the ordering of when contracts came in!

```
contract HelloWorld {
    function getTime() public view returns (uint) {
        return block.timestamp;
    }
}
```

What do we get here:
- uint 256: 1663602457
    - This is a Unix timestamp
        - In other words: An integer that tells how many seconds have passed since the Unix Epoch
            - This Unix Epoch date (January 1st 1970) is used all across Computer Science

##### Unix Epoch

Unix Epoch: January 1st 1970

##### Time Units

Time Units Arithmetic:

```
contract HelloWorld {
    function getTime() public view returns (uint) {
        return block.timestamp + 1 minutes;
        return block.timestamp - 1 days;
        return block.timestamp - 7 days;
        
    }
}
```

##### Smart Contract Examples

Next, let's utilize time as part of the logic for our smart contract:

```
contract HelloWorld {
    uint expiry;
    uint count;

    constructor() {
        expiry = block.timestamp + 1 minutes;
    }

    function addOne() public (uint) {
        require(block.timestamp < expiry);
        count++;
    }
}

```

What is going on here:
- You can only use this contract for 1 minute
    - After that 1 minute, the contract is useless/obsolete

Next Example: Let's get the number of minutes since the last call

```
contract HelloWorld {
    uint public lastTime;

    constructor() {
        lastTime = block.timestamp;
    }

    function increment() public {
        count++;
        lastTime = block.timestamp;
    }

    function getMinutesSinceLastCall() public view returns (uint) {
        return (block.timestamp - lastTime); // this returns in seconds
        return (block.timestamp - lastTime) / 1 minutes; // this returns in minutes
    }
}

```

What is going on here:
- if we just clicked it, it returns 0 minutes
- if 1 minute has elapsed, so it returns 1 minute

##### Practice Questions

1. What date is the UNIX epoch?
- Jan 1, 1970

2. Which of the following are valid time units in Solidity? Select all that apply.
- seconds
- minutes
- hours
- days
- weeks

3. Write a contract named `TimedAuction` that runs an auction for exactly 5 minutes. Once the 5 minutes has passed, the winner of the auction can be determined and the owner/deployer of the contract can claim the winning bid. The 5 minute "timer" should start immediately after the contract is deployed. To complete this smart contract, write the following functions and emit the following events.

Functions:
- `bid()`: a payable function that accepts a bid from a user. This function should fail if the bid is less than or equal to the current bid OR if the auction is over. If a bid is valid, it should emit the `Bid` event. Note: that since each bid is unique, a user could outbid themselves by sending a larger amount, in that case they should be able to withdraw their previous bid amount(s).
- `withdraw()`: allows a user to withdraw any bid amounts they have sent that is not currently the highest bid.
- `withdraw()`: this function should destroy the contract and send the winning bid amount to the owner/deployer of the contract. This function should fail if called by anyone other than the owner/deployer or if the auction has not yet ended. This function should also fail if all users have not yet withdrawn their previous bids.
- `getHighestBidder()`: this function should return the address of the current highest bidder.

Events:
- `Bid(address index sender, uint256 amount, uint256 timestamp)`;

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract TimedAuction {
    address highestBidder;
    uint256 highestBid;

    mapping(address => uint256) oldBids;
    uint256 totalWithdrableBids;
    // need this in case users try to tamper with the contract
    // by sending funds without using the bid() function

    address owner;
    uint256 startTime;

    event Bid(address indexed sender, uint256 amount, uint256 timestamp);

    constructor() {
        owner = msg.sender;
        startTime = block.timestamp;
    }

    function bid() external payable {
        require(block.timestamp - startTime < 5 minutes, "auction is over");
        require(msg.value > highestBid, "bid is too low");

        oldBids[highestBidder] += highestBid;
        totalWithdrableBids += highestBid;

        highestBidder = msg.sender;
        highestBid = msg.value;
        emit Bid(msg.sender, msg.value, block.timestamp);
    }

    function withdraw() public {
        uint256 amount = oldBids[msg.sender];
        oldBids[msg.sender] = 0;
        totalWithdrableBids -= amount;

        (bool sent, ) = payable(msg.sender).call{value: amount}("");
        require(sent, "transfer failed");
    }

    function claim() public {
        require(msg.sender == owner);
        require(
            block.timestamp - startTime >= 5 minutes,
            "auction has not completed yet"
        );
        require(
            totalWithdrableBids == 0,
            "not all users have claimed their bids yet"
        );
        selfdestruct(payable(owner));
    }

    function getHighestBidder() public view returns (address) {
        return highestBidder;
    }
}

```

### 3 - Structs

This lesson will in-struct—pun intended—you on the topic of structs.

#### Key Term

##### Struct

In Solidity, a `struct` is a typed collection of fields that can be treated like a custom type.
- Structs are useful for grouping data together

```
struct Book {
    string title;
    string author;
    uint book_id;
}
```

#### Notes from the video

##### Creating Structs / Struct Member Access

Structs:
- Can have different types of fields
    - At init, the values are the default for that dtype
        - Unless you define with a key-value pair syntax
- We must "store our structs"
    - 
- You can have the following:
    - dynamically sized arrays
    - structs within structs

```
contract HelloWorld {
    mapping(address => Person) people;

    struct Person {
        string name;
        address addr;
        uint balance;
    }

    function createPerson(string memory name) public payable {
        // Either of these work
        Person memory p; // this creates a Struct with default values
        Person memory p = Person({name: name, balance: msg.value, addr: msg.sender}); // define the values w/ key-value pair syntax

        people[msg.sender] = p;

        function getName() public view returns (string memory) {
            return people[msg.sender].name;
        }

        function setName(string memory newName) public {
            people[msg.sender].name = newName;
        }
    }
}

```

##### Struct Examples

How to do some more advanced stuff!

```
contract HelloWorld {
    mapping(address => Person) people;

    struct Person {
        string name;
        address addr;
        Person[] friends;
    }
        function setName(string memory name) public {
            people[msg.sender].addr = msg.sender;
            people[msg.sender].name = name;   
        }

        function addFriend(address friend) public {
            require(people[friend].addr != address(0), "friend has not set name");
            people[msg.sender].friends.push(people[friend]);
        }

        function getFriendNames() public view returns (string[] memory) {
            uint numNames = people[msg.sender].friends.length;
            string[] memory names = new string[](numNames);
            for (uint idx; idx < numNames; idx++) {
                names[idx] = people[msg.sender].friends[idx].name;
            }
            return names;
        }
    }

```

How this works: Start by Deploying to Remix VM (Shanghai)
1. setName: Myles
- getFriendNames(), return value is "0": "string[]: "

2. Switch Account to 2nd option

3. setName: Chris
- getFriendNames(), return value is "0": "string[]: "
- Copy address for Chris before moving on

4. Swtich Account back to 1st option
- addFriend() with address we copied
- getFriendNames(), return value is "0": "string[]: Chris"

##### Practice Questions

1. Shopping List
- Write a smart contract named `ShoppingList` that allows users to create and keep track of their shopping list. To complete this smart contract, create multiple structs (as you deem necessary) and implement the following solutions.

Each user that interacts with the `ShoppingList` contract should be able to have multiple shopping lists. Each shopping list should be accessible using a `string` name. Each shopping list should be able to store multiple items. Each item will have a name and a quantity.
- `createList(string memory name)`: creates a new shopping list for the user calling the function. If the list name passed is empty or it already exists, this function should fail.
- `getListNames()`: returns a `string` array containing the names of all the lists the calling user has.
- `addItem(string memory listName, string memory itemName, uint itemQuantity)`: adds an item with the specified name and quantity to the specified list. This function should fail if the given `listName` does not exist.
- `getItemNames(string memory listName)`: returns a `string` array containing the names of all of the items in the specified list. This function should fail if the list with the given name does not exist. 

Hint: converting string to bytes and checking if the length of the bytes object is 0 can be a good way to determine if a string is empty.

My answer:

```
pragma solidity >=0.4.22 <=0.8.17;

contract ShoppingList {
    mapping(address => User) users;

    struct User {
        mapping(string => List) lists;
        string[] listNames;
    }

    struct Item {
        string name;
        uint256 quantity;
    }

    struct List {
        string name;
        Item[] items;
    }

    function listExists(string memory name) internal view returns (bool) {
        // if name of accessed list is empty than list has not been created
        return bytes(users[msg.sender].lists[name].name).length != 0;
    }

    function createList(string memory name) public {
        require(!listExists(name), "a list with this name already exists");
        require(bytes(name).length > 0, "name cannot be empty");
        users[msg.sender].listNames.push(name);
        users[msg.sender].lists[name].name = name;
    }

    function getListNames() public view returns (string[] memory) {
        return users[msg.sender].listNames;
    }

    function getItemNames(string memory listName)
        public
        view
        returns (string[] memory)
    {
        require(listExists(listName), "no list with this name exists");
        string[] memory names = new string[](
            users[msg.sender].lists[listName].items.length
        );
        for (uint256 idx; idx < names.length; idx++) {
            names[idx] = users[msg.sender].lists[listName].items[idx].name;
        }
        return names;
    }

    function addItem(
        string memory listName,
        string memory itemName,
        uint256 quantity
    ) public {
        require(listExists(listName), "no list with this name exists");
        users[msg.sender].lists[listName].items.push(Item(itemName, quantity));
    }
}

```