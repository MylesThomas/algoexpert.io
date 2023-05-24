const helpers = require('./helpers');
const messagingApi = require('./messaging_apis');
const readline = require('readline');

const displayedMessages = {}

const terminal = readline.createInterface({
    input: process.stdin,
});
console.log(process.argv);

console.log("-----------------------------------------------");
console.log("-----------------------------------------------");
console.log("-----------------------------------------------");

console.log(process.env);

process.env.NAME = "Antoine"
process.env.MODE = "poll"


terminal.on('line', text => {
    const username = process.env.NAME;
    const id = helpers.getRandomInt(100000);
    displayedMessages[id] = true;

    const message = {id, text, username};
    //messagingApi.sendMessage(message);
    messagingApi.sendMessage(message);
});

function displayMessage(message) {
    console.log(`> ${message.username}: ${message.text}`);
    displayedMessages[message.id] = true;
}

async function getAndDisplayMessages() {
    const messages = await messagingApi.getMessages();

    for (const message of messages) {
        const messageAlreadyDisplayed = message.id in displayedMessages;
        if (!messageAlreadyDisplayed) displayMessage(message);
    }
}

function pollMessages() {
    setInterval(getAndDisplayMessages, 4000); // 4000 = 4 seconds
}

function streamMessages() {
    const messagingSocket = messagingApi.createMessagingSocket();

    messagingSocket.on('message', data => {
        const message = JSON.parse(data);
        const messageAlreadyDisplayed = message.id in displayedMessages;
        if (!messageAlreadyDisplayed) displayMessage(message);
    });
}

if (process.env.MODE === 'poll') {
    getAndDisplayMessages();
    pollMessages();
} else if (process.env.MODE === 'stream') {
    getAndDisplayMessages();
    streamMessages();
}