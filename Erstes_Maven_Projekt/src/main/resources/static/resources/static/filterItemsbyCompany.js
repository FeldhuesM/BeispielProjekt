function filterItemsByCompany() {
    const selectedCompanyID = document.getElementById("companyoforiginID").value;
    const itemSelects = document.querySelectorAll(".item-select");

    console.log("Selected Company ID:", selectedCompanyID); // Debugging-Ausgabe

    // Über alle Artikel-Dropdowns iterieren
    itemSelects.forEach(select => {
        const items = select.querySelectorAll("option");

        items.forEach(item => {
            const companyOfOriginID = item.getAttribute("data-company");

            console.log("Item Company ID:", companyOfOriginID); // Debugging-Ausgabe

            // Zeigen oder Ausblenden der Artikel basierend auf der Firma
            if (selectedCompanyID === companyOfOriginID || item.value === "") {
                item.style.display = "block";
            } else {
                item.style.display = "none";
            }
        });
    });
}
