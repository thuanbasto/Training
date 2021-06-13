
$(".btn-minus").on("click", function () {
    if ($(this).next().val() <= 1) {
        alert("Số lượng sản phẩm cần mua tối thiểu là 1")
    } else {
        // minus 1 quantity 
        $(this).next().val($(this).next().val() - 1);
        
        // update total price
        $(this).parent().parent().next().html(
            "$" + $(this).parent().parent().prev().html().substring(1) * $(this).next().val()
        )
    }

})

$(".btn-plus").on("click", function () {
    // plus 1 quantity 
    $(this).prev().val(parseInt($(this).prev().val()) + 1);

    // update total price
    $(this).parent().parent().next().html(
        "$" + $(this).parent().parent().prev().html().substring(1) * $(this).prev().val()
    )

})
