const scrollable = document.getElementById('scrollable');
const button = document.querySelector('button');

scrollable.addEventListener('click', event => {
    // "If we click on something inside of the container"
    if (event.target !== this) {
        event.target.textContext = 'Clicked'; // if you click on a paragraph, the text changes!
    }
    else {
        event.target.textContext = 'You broke something';
    }
});

// Note: This callback should use a standard function to create a 'this' context