

    const buttons = document.querySelectorAll('.submitAllForms');

    buttons.forEach(button => {
    button.addEventListener('click', function() {

        document.getElementById("form1").submit();
        document.getElementById("form2").submit();
        document.getElementById("form3").submit();
        document.getElementById("form4").submit();
    });
});

