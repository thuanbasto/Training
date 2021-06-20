const data = [
    {
        tenGiaiDau : "V.League 1",
        cauLacBo : ["Viettel FC", "Hà Nội FC", "Hoàng Anh Gia Lai", "Becamex Bình Dương", "SHB Đà Nẵng", "Sông Lam Nghệ An", "Sài Gòn"]
    },
    {
        tenGiaiDau : "V.League 2",
        cauLacBo : ["Phố Hiến", "Đồng Tháp", "Long An", "Bình Định", "An Giang", "Bà Rịa Vũng Tàu"]
    }
]

$(".giaidau").on("change", function () {
    if ($(this).val() == "") {
        var html = `<option value="">-- Chọn FC --</option>`;
        $(".clb").html(html);
    } else {
        data.forEach(item => {
            if (item.tenGiaiDau == $(this).val()) {
                var html = `<option value="">-- Chọn FC --</option>`;
                item.cauLacBo.forEach(clb => {
                    html += `<option>${clb}</option>`
                })
                $(".clb").html(html);
            }
        })
    }
})

function checkName(text) {
    var re = /^[a-z]{1}[a-z ]{7,25}$/i;
    return re.test(text);
}

function checkInputValid() {
    var check = true;
    
    if ($(".giaidau").val() == "") {
        $(".giaidau").next().removeClass("d-none"); 
        check = false;
    } else {
        $(".giaidau").next().addClass("d-none");
    }

    if ($(".clb").val() == "") {
        $(".clb").next().removeClass("d-none"); 
        check = false;
    } else {
        $(".clb").next().addClass("d-none");
    }

    if (!checkName($(".tencauthu").val())) {
        $(".tencauthu").next().removeClass("d-none"); 
        check = false;
    } else {
        $(".tencauthu").next().addClass("d-none");
    }

    return check;
}

$(".btn-add").on("click", function () {
    if (checkInputValid()) {
        $(".alert-success").removeClass("d-none");
        $(".alert-danger").first().addClass("d-none");
        $(".tbody").append(`
            <tr>
                <td>${$(".giaidau").val()}</td>
                <td>${$(".clb").val()}</td>
                <td>${$(".tencauthu").val()}</td>
                <td style="width: 15%;">
                    <button class="edit-item btn btn-danger">Edit</button>
                    <button class="del-item btn btn-danger">Del</button>
                </td>
            </tr>
        `)
        $("form")[0].reset();
    }
})

$(".tbody").on("click", ".del-item", function () {
    $(this).parent().parent().remove();
    $(".alert-danger").first().removeClass("d-none");
    $(".alert-success").addClass("d-none");
})

$(".tbody").on("click", ".edit-item", function () {
    var item = $(this);

    $(".giaidau > option").each(function () {
        $(".giaidau").val(item.parent().prev().prev().prev().text()).change();
    })

    $(".clb > option").each(function () {
        $(".clb").val(item.parent().prev().prev().text());
    })

    $(".tencauthu").val(item.parent().prev().text());

    item.parent().parent().remove();
})