$(".add-item").on("click", function (event) {
    event.preventDefault();
    if ($(".input-text").val().trim() != "") {
        let item = `
        <div class="item d-flex justify-content-between">
            <span>${$(".input-text").val()}</span>
            <div class="action">
                <button class="edit-item btn text-success border-0 shadow-none" onclick="editItem(this)"><i class="fas fa-edit"></i></button>
                <button class="delete-item btn text-danger border-0 shadow-none" onclick="deleteItem(this)"><i class="fas fa-ban"></i></button>
            </div>
        </div>
        `
        $(".items").append(item);
        $(".input-text").val("");
        $(".error").html("");
    } else {
        $(".error").html("Input can be empty");
    }
})

$(".clear-items").on("click", function () {
    $(".items").html("");
})

function deleteItem(element) {
    element.parentNode.parentNode.remove();
}


function editItem(element) {
    $(".input-text").val(element.parentNode.previousElementSibling.innerHTML);
    deleteItem(element);
}