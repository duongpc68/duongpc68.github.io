package com.example.studentmanagement.model.request;


import com.example.studentmanagement.statics.Gender;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class StudentCreationRequest {
    @NotBlank(message = "Tên sinh viên bắt buộc nhập")
    @Length(max = 100, message = "Tên sinh viên không được vượt quá 100 ký tự")
    private String name;

    @NotEmpty(message = "Giới tính bắt buộc chọn")
    private Gender gender;

    @NotBlank (message = "Địa chỉ bắt buộc nhập")
    @Length (max = 100, message = "Địa chỉ không quá 100 ký tự")
    private String address;

    @NotBlank (message = "Số điện thoại bắt buộc nhập")
    @Length(max = 10, message = "Số điện thoại không quá 10 số")
    private String phoneNumber;

    @NotBlank (message = "Tên lớp bắt buộc nhập")
    @Length (max = 100, message = "Tên lớp không vượt quá 100 ký tự")
    private String className;


}
