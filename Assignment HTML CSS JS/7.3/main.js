function isString(ele) {
    var re = /^[a-z]+$/i; // âẫấầăẵặắằạàáưữựứừuũụúùiĩịíìêễệếềẹẽée
    if (!re.test((ele.val()))){
        ele.next().removeClass("d-none");
    } else {
        ele.next().addClass("d-none");
    }
}

function isNumber(ele) {
    var re = /^[0-9]+$/;
    if (!re.test((ele.val()))){
        ele.next().removeClass("d-none");
    } else {
        ele.next().addClass("d-none");
    }
}

function isCheckOut() {
    return $(".checkout").is(":checked");
}

$(".lastName").on("keyup", function () {
    isString($(this));
});

$(".firstName").on("keyup", function () {
    isString($(this));
});

$(".address").on("keyup", function () {
    isString($(this));
});

$(".city").on("keyup", function () {
    isString($(this));
});

$(".nameOnCard").on("keyup", function () {
    isString($(this));
});

$(".phone").on("keyup", function () {
    var re = /^[0-9]{10}$/;
    if (!re.test(($(this).val()))){
        $(this).next().removeClass("d-none");
    } else {
        $(this).next().addClass("d-none");
    }
});

$(".zipcode").on("keyup", function () {
    var re = /^[0-9]{5}$/;
    if (!re.test(($(this).val()))){
        $(this).next().removeClass("d-none");
    } else {
        $(this).next().addClass("d-none");
    }
});

$(".creditCard").on("keyup", function () {
    var re = /^[0-9-]{19}$/;
    if (!re.test(($(this).val()))){
        $(this).next().removeClass("d-none");
    } else {
        $(this).next().addClass("d-none");
    }
    var valueArr = $(this).val().replaceAll("-","").split("");
    var length = valueArr.length;
    var count = 0;
    for (let i = 4; i < length && length <= 19; i += 4) {
        valueArr.splice(i + count++,0,"-");
    }
    $(this).val(valueArr.join(""));
});

$(".expMonth").on("keyup", function () {
    try {
        if (parseInt($(this).val()) >= 1 && parseInt($(this).val()) <= 12) {
            $(this).next().addClass("d-none");
        } else {
            $(this).next().removeClass("d-none");
        }
    } catch (error) {
        $(this).next().addClass("d-none");
    }
});

$(".expYear").on("keyup", function () {
    try {
        if ($(this).val().length == 4 && parseInt($(this).val()) > 2000) {
            $(this).next().addClass("d-none");
        } else {
            $(this).next().removeClass("d-none");
        }
    } catch (error) {
        $(this).next().addClass("d-none");
    }
});

$(".cvv").on("keyup", function () {
    var re = /^[0-9]{3}$/;
    if (!re.test(($(this).val()))){
        $(this).next().removeClass("d-none");
    } else {
        $(this).next().addClass("d-none");
    }
});

$(".email").on("keyup", function () {
    let re = /^[a-zA-Z_0-9]+@fsoft.com.vn$/i; 
    if (!re.test(($(this).val()))){
        $(this).next().removeClass("d-none");
    } else {
        $(this).next().addClass("d-none");
    }
});

$(".card-type").on("click", function () {
    $(".card-type").next().removeClass("border border-primary border-5")
    $(this).next().addClass("border border-primary border-5");
    $(".card-type").parent().parent().next().addClass("d-none");
})

$(".checkout").on("click", function () {
    if (!$(".checkout").is(":checked")) {
        $(".checkout").parent().next().removeClass("d-none");
    } else {
        $(".checkout").parent().next().addClass("d-none");
    }
})

function checkInputsIsEmpty() {
    var check = true; // check all input is fill
    $("input[type=text]").each(function () {
        if($(this).val() == ""){
            $(this).next().removeClass("d-none");
            check = false;
        }
    })
    
    if (!$(".checkout").is(":checked")) {
        $(".checkout").parent().next().removeClass("d-none");
        check = false;
    }

    if (!$(".card-type").is(":checked")){
        $(".card-type").parent().parent().next().removeClass("d-none");
        check = false;
    }

    return check;
}

function checkInputsIsCorrect() {
    var check = true; // check all input is corret
    $("input[type=text]").each(function () {
        if(!$(this).next().hasClass("d-none")){
            check = false;
        }
    })
    
    if (!$(".checkout").parent().next().hasClass("d-none")) {
        check = false;
    }

    if (!$(".card-type").parent().parent().next().hasClass("d-none")){
        check = false;
    }

    return check;
}

$(".sign-in").on("click", function () {
    event.preventDefault();
    if (checkInputsIsEmpty() && checkInputsIsCorrect()) {
        var tr = `
            <tr>
                <td>${$(".firstName").val() + " " + $(".lastName").val()}</td>
                <td>${$(".enail").val()}</td>
                <td>${$(".phone").val()}</td>
                <td>${$(".address").val()}</td>
                <td>${$(".city").val(), $(".state").val(), $(".zipcode").val()}</td>
                <td>${$(".nameOnCard").val()}</td>
                <td>${$(".creditCard").val()}</td>
                <td>${$(".expMonth").val()+"/"+$(".expYear").val()}</td>
                <td>${$(".cvv").val()}</td>
                <td>${$(".card-type:checked").val()}</td>
                <td><a class="delete-item btn btn-danger">X</a></td>
            </tr>
        `;
        $(".tbody").append(tr);
        $("form")[0].reset();
    }
})

$('.table').on("click", ".delete-item", function() {
    if (confirm("Are you sure to want to delete this item?")){
        $(this).parent().parent().remove();
    }
})