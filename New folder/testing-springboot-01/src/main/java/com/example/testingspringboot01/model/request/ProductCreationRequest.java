package com.example.testingspringboot01.model.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
public class ProductCreationRequest {

    @NotBlank(message = "Tên Sản Phẩm Bắt Buộc Nhập")
    @Size(max = 255)
    private String productName;

    @NotNull(message = "Giá Sản Phẩm Bắt Buộc Nhập")
    @Positive(message = "Giá Sản Phẩm Phải Là Số Dương")
    private BigDecimal price;


 @Length(max = 1000, message = "Mô tả không quá 1000 ký tự")
    private String description;
// @NotBlank(message = "Ảnh bắt buộc có")
//    private String image;
}
