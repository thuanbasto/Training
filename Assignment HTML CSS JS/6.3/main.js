const input_text = document.querySelector(".input-text");
const items = document.querySelector(".items");
const item_names = document.querySelectorAll(".item-name");

function filter(text) {
    item_names.forEach(item_name => {
        if (item_name.textContent.toLowerCase().includes(text.toLowerCase())) {
            item_name.parentNode.parentNode.classList.remove("d-none");
        } else {
            item_name.parentNode.parentNode.classList += (" d-none");
        }
    })
}

function search(text) {
    if (text == "") {
        item_names.forEach(item_name => {
            item_name.parentNode.parentNode.classList.remove("d-none");
        })
    } else {
        item_names.forEach(item_name => {
            var check = false;
            item_name.textContent.toLocaleLowerCase().split(" ").forEach(value => {
                if (value == text.toLowerCase()) {
                    item_name.parentNode.parentNode.classList.remove("d-none");
                    check = true;
                }
            })
            if (!check) {
                item_name.parentNode.parentNode.classList += (" d-none");
            }
        })
    }
}

input_text.addEventListener("keyup", function () {
    filter(input_text.value);
})
