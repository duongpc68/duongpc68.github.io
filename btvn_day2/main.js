// Danh sách các sản phẩm có trong giỏ hàng
let products = [
    {
        name: "Iphone 13 Pro Max", // Tên sản phẩm
        price: 3000000, // Giá mỗi sản phẩm
        brand: "Apple", // Thương hiệu
        count: 2, // Số lượng sản phẩm trong giỏ hàng
    },
    {
        name: "Samsung Galaxy Z Fold3",
        price: 41000000,
        brand: "Samsung",
        count: 1,
    },
    {
        name: "IPhone 11",
        price: 15500000,
        brand: "Apple",
        count: 1,
    },
    {
        name: "OPPO Find X3 Pro",
        price: 19500000,
        brand: "OPPO",
        count: 3,
    },
]

// 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product
let newProduct = {
    name: "Iphone 15",
    price: 8000000,
    brand: "Apple",
    count: 2,
};

products.push(newProduct);




// 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng

for (let i = products.length - 1; i >= 0; i--) {
    if (products[i].brand == "Samsung") {
        products.splice(i, 1);
    }
}


// 8. Sắp xếp giỏ hàng theo price tăng dần


for (let i = 0; i < products.length - 1; i++) {
    for (let j = 0; j < products.length - i - 1; j++) {
        if (products[j].price > products[j + 1].price) {
            let temp = products[j];
            products[j] = products[j + 1];
            products[j + 1] = temp;
        }
    }
}


// 9. Sắp xếp giỏ hàng theo count giảm dần


for (let i = 0; i < products.length - 1; i++) {
    for (let j = 0; j < products.length - i - 1; j++) {
        if (products[j].count < products[j + 1].count) {
            let temp = products[j];
            products[j] = products[j + 1];
            products[j + 1] = temp;
        }
    }
}


// 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng

let selectedProducts = [];
for (let i = 0; i < 2 && i < products.length; i++) {
    selectedProducts.push(products[i]);
}

