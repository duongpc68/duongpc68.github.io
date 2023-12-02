$(document).ready(function () {

    toastr.options.timeOut = 2000; // 2.0s
    let deleteStudentId = -1;
    let updateStudentId = -1;

    $.validator.addMethod("vietnamesePhone", function (value, element) {
        return this.optional(element) || /^0[0-9]{9}/i.test(value);
    }, "SĐT phải là dãy 10 kí tự số bắt đầu bằng số 0");

    $.validator.addMethod("dateValidate", function (value, element) {
        const birthYear = new Date(value).getFullYear();
        const currentYear = new Date().getFullYear();
        return this.optional(element) || currentYear - birthYear > 18;
    }, "Student must be more than 18 years old");
    $.validator.addMethod("pastDate", function (value, element) {
        const dob = new Date(value);
        dob.setUTCHours(0,0,0,0);
        const today = new Date();
        today.setUTCHours(0,0,0,0);

        return this.optional(element) || dob - today < 0 || dob === today;
    }, "Student date of birth must be a past date");

    const validator = $("#create-student-form").validate({
        onfocusout: false,
        onkeyup: false,
        onclick: false,
        rules: {
            "name": {
                required: true,
                maxlength: 255
            },
            "address": {
                required: true,
                maxlength: 255
            },
            "dOb": {
                required: true,
                dateValidate: true,
                pastDate: true,

            },
            "phone": {
                required: true,
                maxlength: 10,
                vietnamesePhone: true,
            },
            "className": {
                required: true,
                maxlength: 10
            }
        },
        messages: {
            "name": {
                required: "Student name is required",
                maxlength: "Student name must be less than 255 characters"
            },
            "address": {
                required: "Address name is required",
                maxlength: "Address name must be less than 255 characters"
            },
            "dOb": {
                required: "Date Of Birth  is required",
                dateValidate: "Student must be more than 18 years old",
                pastDate: "Student date of birth must be a past date"
            },
            "phone": {
                required: "Phone name is required",
                maxlength: "Phone must be less than 10 characters",
                vietnamesePhone: "SĐT phải là dãy 10 kí tự số bắt đầu bằng số 0"
            },
            "className": {
                required: "Class name  is required",
                maxlength: "Class name must be less than 10 characters"
            },

        }
    });
    $(".create-student-btn").click(function () {
        $("#student-creation-modal").modal("show");
    });

    $("#save-student-btn").click(function () {
        const isValidForm = $("#create-student-form").valid();
        if (!isValidForm) {
            return;
        }
        // const name = $("#name").val();
        // const address = $("#address").val();

        const formData = $('#create-student-form').serializeArray();
        if (!formData || formData.length === 0) {
            return;
        }
        const requestBody = {};
        for (let i = 0; i < formData.length; i++) {
            requestBody[formData[i].name] = formData[i].value;
        }

        // call api lên backend
        $.ajax({
            url: "/students",
            type: "POST",
            data: JSON.stringify(requestBody), // dữ liệu được gửi vào trong body của HTTP message lên backend
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                toastr.success("Create a new student successfully");
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
    $(".delete-student-btn").click(function (event) {
        deleteStudentId = parseInt($(event.currentTarget).attr("student-id"))
        $("#student-delete-modal").modal("show");
    });
    $("#delete-student-btn").click(function () {
        $.ajax({
            url: "/students/" + deleteStudentId,
            type: "DELETE",
            success: function (data) {
                toastr.success("Xóa sinh viên thành công");
                setTimeout(() => {
                    location.reload();
                }, 1000);
            },
            error: function (err) {
                toastr.error("Xóa sinh viên không thành công, vui lòng thử lại");
            }
        });

    });
    $(".update-student-modal-open").click(function (event) {

        updateStudentId = parseInt($(event.currentTarget).attr("student-id"));

        $.ajax({
            url: "/students/" + updateStudentId,
            type: "GET",
            success: function (data) {
                // đổ dữ liệu vào form --> dùng jQuerry
                $("#update-student-form #name").val(data.name);
                $("#update-student-form #address").val(data.address);
                $("#update-student-form #phone").val(data.phone);
                $("#update-student-form #className").val(data.className);
                $("#student-update-modal").modal('show');
            },
            error: function (err) {
                toastr.error("Đã có lỗi xảy ra, vui lòng thử lại");
            }
        });
    });
    $("#update-student-btn").click(function () {
        const formData = $('#update-student-form').serializeArray();
        if (!formData || formData.length === 0) {
            return;
        }
        const requestBody = {};
        for (let i = 0; i < formData.length; i++) {
            requestBody[formData[i].name] = formData[i].value;
        }

        // call api lên backend
        $.ajax({
            url: "/students/" + updateStudentId,
            type: "PUT",
            data: JSON.stringify(requestBody), // dữ liệu được gửi vào trong body của HTTP message lên backend
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                toastr.success("Update a student successfully");
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
    $("#student-creation-modal").on('hidden.bs.modal',function () {
        $('#create-student-form').trigger("reset");
        validator.resetForm();
    })
});