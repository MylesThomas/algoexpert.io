const button = document.querySelector('button');

console.log(button);

button.addEventListener('click', moveRight);

function moveRight() {
    // debugger;
    const circle = document.getElementById('circle');
    const { left } = getComputedStyle(circle);
    console.log(left);

    circle.style.left = parseInt(left) + 10 + 'px';
}
