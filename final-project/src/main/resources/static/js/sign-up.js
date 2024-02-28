$(document).ready(function (){
    //validate form đăng ký
    const signupValidator = $('#sign-up-form').validate({
        onfocusout: false,
        onkeyup: false,
        onclick: false,
        rules: {
            'fullName': {
                required: true,
                maxlength: 100
            },
            'email': {
                required: true,
                emailFormat: true,
                maxlength: 50
            },
            'password': {
                required: true,
                passwordFormat: true
            }
        },
        messages: {
            'fullName': {
                required: "Họ và tên bắt buộc",
                maxlength: "Họ và tên dài tối đa 50 ký tự"
            },
            'email': {
                required: "Email bắt buộc",
                emailFormat: "Vui lòng nhập địa chỉ email hợp lệ",
                maxlength: "Email dài tối đa 50 ký tự"
            },
            'password': {
                required: "Mật khẩu bắt buộc",
                passwordFormat: "Mật khẩu tối thiểu 8 ký tự, ít nhất một chữ cái, một số và một ký tự đặc biệt"
            }
        }
    });

//gọi api đăng ký
    $('#register-btn').click(function (event) {
        //validate
        const isValidForm = $('#sig-nup-form').valid();
        if (!isValidForm) {
            return;
        }
        //lấy dữ liệu từ form
        const signupData = $('#sign-up-form').serializeArray();
        if (!signupData || signupData.length === 0) {
            return;
        }
        //chuyển dữ liệu từ object sang json
        const RequestBody = {};
        for (let i = 0; i < signupData.length; i++) {
            RequestBody[signupData[i].name] = signupData[i].value;
        }
        const role = $('#teacherCheckbox').prop('checked') ? 'TEACHER' : 'USER'
        RequestBody['role'] = role;
        //call api lên backend
        $.ajax({
            type: "POST",
            url: "/api/v1/authentication/signup",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(RequestBody),
            success: function (data) {
                $.toast({
                    heading: 'Thành công',
                    text: 'Đăng ký tài khoản thành công.',
                    icon: 'success',
                    showHideTransition: 'fade',
                    position: 'top-right',
                    loader: false,
                    bgColor: '#4CAF50'
                })
                setTimeout(() => {
                    window.location.replace("http://localhost:8080/information");
                }, 1500);
            },
            error: function (error) {
                console.log(error);
                //xử lý khi error là 400
                if (error.status === 400) {
                    $('#signup-error-msg').html("Email này đã tồn tại, vui lòng đăng nhập");
                } else {
                    $.toast({
                        heading: 'Lỗi',
                        text: "Đã có lỗi xảy ra, vui lòng thử lại sau!",
                        icon: 'error',
                        showHideTransition: 'fade',
                        position: 'top-right',
                        loader: false,
                        bgColor: '#FF0000'
                    })
                }
            }
        })
    })
});

