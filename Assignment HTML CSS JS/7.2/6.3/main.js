function filter(text) {
    $(".item-name").each(function () {
        if (this.textContent.toLowerCase().includes(text.toLowerCase())) {
            this.parentNode.parentNode.classList.remove("d-none");
        } else {
            this.parentNode.parentNode.classList += " d-none";
        }
    })
}

function search(text) {
    if (text == "") {
        $(".item-name").each(function () {
            this.parentNode.parentNode.classList.remove("d-none");
        })
    } else {
        $(".item-name").each(function () {
            var check = false;
            this.textContent.toLocaleLowerCase().split(" ").forEach(value => {
                if (value == text.toLowerCase()) {
                    this.parentNode.parentNode.classList.remove("d-none");
                    check = true;
                }
            })
            if (!check) {
                this.parentNode.parentNode.classList += (" d-none");
            }
        })
    }
}

$(".input-text").on("keyup", function () {
    filter($(".input-text").val());
})
