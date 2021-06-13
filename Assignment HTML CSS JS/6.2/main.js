const btn_add = document.querySelector(".add-item");
const btn_clearItems = document.querySelector(".clear-items");
const input_text = document.querySelector(".input-text");
const label_error = document.querySelector(".error");
const items = document.querySelector(".items");


btn_add.addEventListener("click", function (event) {
    event.preventDefault();
    if (input_text.value.trim() != "") {
        items.innerHTML += `
            <div class="item d-flex justify-content-between">
                <span>${input_text.value}</span>
                <div class="action">
                    <button class="edit-item btn text-success border-0 shadow-none" onclick="editItem(this)"><i class="fas fa-edit"></i></button>
                    <button class="delete-item btn text-danger border-0 shadow-none" onclick="deleteItem(this)"><i class="fas fa-ban"></i></button>
                </div>
            </div>
        `
        input_text.value = "";
        label_error.innerHTML = ""
    } else {
        label_error.innerHTML = "Input can be empty"
    }
})

btn_clearItems.addEventListener("click", function () {
    items.innerHTML = "";
})

function deleteItem(element) {
    element.parentNode.parentNode.remove();
}


function editItem(element) {
    input_text.value = element.parentNode.previousElementSibling.innerHTML;
    deleteItem(element);
}