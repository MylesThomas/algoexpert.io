function hashString(string) {
    let hash = 0;
    if (string.length == 0) return hash;
    for (let i = 0; i < string.length; i++) {
        charCode = string.charCodeAt(i);
        hash = (hash << 5) - hash + charCode;
        hash |= 0;
    }
    return hash;
}

function computeScore(username, server) {
    const usernameHash = hashString(username);
    const serverHash = hashString(server);
    return (usernameHash * 13 + serverHash * 11) % 67; //clement used an algo to decide these #'s
}

module.exports.hashString = hashString;
module.exports.computeScore = computeScore;
//these allow the functions to be used in hashing_example.js