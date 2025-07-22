const screen = document.getElementById('screen');
const buttons = document.querySelectorAll('button');
let screenValue = '';

buttons.forEach(button => {
    button.addEventListener('click', (event) => {
        const buttonText = event.target.innerText;

        if (buttonText === 'C') {
            screenValue = '';
            screen.value = screenValue;
        } else if (buttonText === 'CE') {
            screenValue = screenValue.slice(0, -1);  // Remove last character
            screen.value = screenValue;
        } else if (buttonText === '=') {
            screen.value = eval(screenValue.replace('x', '*').replace('÷', '/'));
        } else {
            screenValue += buttonText;
            screen.value = screenValue;
        }
    });
});