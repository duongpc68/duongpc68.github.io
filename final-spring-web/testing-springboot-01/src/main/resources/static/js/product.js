$(document).ready(function () {
    toastr.options.timeOut = 2000; // 2.0s
    let updateProductId = -1;
    $(".create-product-btn").click(function () {
        $("#product-creation-modal").modal("show");
    });
    $("#save-product-btn").click(function () {
        const isValidForm = $("#create-product-form").valid();
        if (!isValidForm) {
            return;
        }
        const formData = $('#create-product-form').serializeArray();
        if (!formData || formData.length === 0) {
            return;
        }
        const requestBody = {};
        for (let i = 0; i < formData.length; i++) {
            requestBody[formData[i].productName] = formData[i].value;
        }
        // call api lên backend
        $.ajax({
            url: "/products",
            type: "POST",
            data: JSON.stringify(requestBody), // dữ liệu được gửi vào trong body của HTTP message lên backend
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                toastr.success("Create a new product successfully");
                setTimeout(() => {
                    location.reload();
                }, 1000);
            },
            error: function (err) {
                console.log(err);
                toastr.warning("Đã có lỗi xảy ra, vui lòng thử lại");
            }
        });
    });
    $(".update-product-modal-open").click(function (event) {
       updateProductId = parseInt($(event.currentTarget).attr("product-id"));
        $.ajax({
            url: "/products/" + updateProductId,
            type: "GET",
            success: function (data) {
                // đổ dữ liệu vào form --> dùng jQuerry
                $("#update-product-form #productName").val(data.productName);
                $("#update-product-form #price").val(data.price);
                $("#update-product-form #description").val(data.description);
                $("#update-product-form #customFile").val(data.image);
                $("#product-update-modal").modal('show');
            },
            error: function (err) {
                toastr.error("Đã có lỗi xảy ra, vui lòng thử lại");
            }
        });
    });
    $("#update-product-btn").click(function () {
        const formData = $('update-product-form').serializeArray();
        if (!formData || formData.length === 0) {
            return;
        }
        const requestBody = {};
        for (let i = 0; i < formData.length; i++) {
        requestBody[formData[i].productName] = formData[i].value;
        }
        // call api lên backend
        $.ajax({
            url: "/products/" + updateProductId,
            type: "PUT",
            data: JSON.stringify(requestBody), // dữ liệu được gửi vào trong body của HTTP message lên backend
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                toastr.success("Update a product successfully");
                setTimeout(() => {
                    location.reload();
                }, 1000);
            },
            error: function (err) {
                console.log(err);
                toastr.warning("Đã có lỗi xảy ra, vui lòng thử lại");
            }
        });
    })
    $("#product-creation-modal").on('hidden.bs.modal',function () {
        $('#create-product-form').trigger("reset");
        validator.resetForm();
    })
})