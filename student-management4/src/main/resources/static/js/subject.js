$(document).ready(function () {
    $(".create-subject-btn").click(function () {
        $("#subject-creation-modal").modal("show");
    });

    $("#save-subject-btn").click(function () {
        const isValidForm = $("#create-subject-form").valid();
        if (!isValidForm){
            return;
        }
        const formData = $('#create-subject-form').serializeArray();
        if (!formData || formData.length  === 0){
            return;
        }
        const requestBody = {};
        for (let i = 0; i < formData.length; i++){
            requestBody[formData[i].name] = formData[i].value;
        }
        // call api lên backend
        $.ajax({
            url: "/subjects",
            type: "POST",
            data: JSON.stringify(requestBody), // dữ liệu được gửi vào trong body của HTTP message lên backend
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                toastr.success("Create a new subject successfully");
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
})