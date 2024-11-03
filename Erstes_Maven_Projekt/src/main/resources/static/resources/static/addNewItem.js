let itemCount = 1; // Initiale Anzahl der Artikel-Dropdowns

// Funktion zum Hinzufügen neuer Artikel-Dropdowns
function addNewItem() {
    const container = document.getElementById("item-container");

    // Neues Auswahlfeld für Artikel erstellen
    const newItemDiv = document.createElement("div");
    newItemDiv.classList.add("item-selection");

    // Neues Drop-down für Artikel
    newItemDiv.innerHTML = `
            <select name="items[${itemCount}].itemID" class="item-select">
                
                ${document.querySelector(".item-select").innerHTML}
            </select>
            <input type="number" name="items[${itemCount}].quantity" placeholder="Menge" min="1" />
            <button type="button" onclick="removeItem(this)">–</button>
        `;

    // Neues Drop-down dem Container hinzufügen
    container.appendChild(newItemDiv);
    itemCount++;
}
function removeItem(button) {
    const itemDiv = button.parentElement;
    itemDiv.remove();
}