document.querySelectorAll('.accordion-button').forEach(button => {
    button.addEventListener('click', () => {
        // Toggle the active state of the button
        button.classList.toggle('active');

        // Get the associated content div
        const content = button.nextElementSibling;

        // Toggle the content visibility
        if (content.style.display === 'block') {
            content.style.display = 'none';
            button.querySelector('.arrow').textContent = '▼';
        } else {
            content.style.display = 'block';
            button.querySelector('.arrow').textContent = '▲';
        }
    });
});
