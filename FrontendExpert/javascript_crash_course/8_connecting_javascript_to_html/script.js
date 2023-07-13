const button = document.querySelector('button'); // get button element off the page
button.addEventListener('click', setBackgroundColor); // when button is clicked, run this function

function setBackgroundColor() {
    document.body.style.backgroundColor = '#00334C';
}