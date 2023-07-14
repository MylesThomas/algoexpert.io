const listItems = document.querySelectorAll('li');
const scrollable = document.getElementById('scrollable'); // grabs the scrollable element

// Move the scrolable down to a certain item (without touching mouse)
// scrollable.querySelectorAll('p')[5].scrollIntoView();

// How to smoothly transition:
scrollable.scrollTo({
    top: scrollable.querySelectorAll('p')[2].offsetTop,
    behavior: 'smooth'
});