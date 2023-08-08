const button = document.querySelector('button');

button.addEventListener('click', moveRight);

function moveRight() {
    // debugger;
    const circle = document.getElementById('circle');
    const { left } = getComputedStyle(circle);
    // console.log(left);
    // circle.style.left = parseInt(left) + 10 + 'px';
    // back to not working for the example...
    circle.style.left = left + 10;
}
