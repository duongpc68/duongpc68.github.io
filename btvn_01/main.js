//Bài 1: Viết function truyền vào 1 số nguyên dường. Tính giai thừa của số đó

//Ví dụ: calculateFactorial(5) = 5 * 4 * 3 * 2 * 1 = 120
function calculateFactorial(n) {
    if (n < 0) {
        return "Không tính giai thừa cho số âm";
    }

    if (n === 0 || n === 1) {
        return 1;
    }

    let giaiThua = 1;
    for (let i = 2; i <= n; i++) {
        giaiThua *= i;
    }

    return giaiThua;
}

// Sử dụng function để tính giai thừa
let soDuong = 5; // Thay đổi giá trị soDuong tại đây
let ketQua = calculateFactorial(soDuong);

if (typeof ketQua === 'number') {
    console.log("Giai thừa của " + soDuong + " là: " + ketQua);
} else {
    console.log(ketQua); // In thông báo lỗi nếu có
}

//Bài 2: Viết function truyền vào 1 chuỗi. In ra chuỗi đảo ngược của chuỗi đó

//Ví dụ: reverseString(‘hello’) => olleh
function reverseString(inputString) {
    let reversedString = '';
    for (let i = inputString.length - 1; i >= 0; i--) {
        reversedString += inputString[i];
    }
    return reversedString;
}

// Sử dụng function để đảo ngược chuỗi
let chuoiDauVao = 'hello'; // Thay đổi giá trị chuoiDauVao tại đây
let chuoiDaoNguoc = reverseString(chuoiDauVao);
console.log(chuoiDaoNguoc); // Kết quả trả về là 'olleh'

// Bài 3: Viết function truyền vào mã quốc gia. Trả về message có ý nghĩa là “Xin chào”, tương ứng với mã quốc gia được truyền vào

//Ví dụ: translate(‘VN’) => “Xin chào”
//translate(‘EN’) => “Hello”
//Gợi ý : Sử dụng switch - case . Học viên tự nghĩ ra 1 vài mã quốc gia và câu chào tương ứng với quốc gia đó
function translate(maQuocGia) {
    switch (maQuocGia) {
        case 'VN':
            return 'Xin chào';
        case 'EN':
            return 'Hello';
        case 'FR':
            return 'Bonjour';
        case 'ES':
            return 'Hola';
        // Thêm các mã quốc gia và câu chào tương ứng ở đây
        default:
            return 'Không biết mã quốc gia này';
    }
}

// Sử dụng function để dịch mã quốc gia
let maQuocGia = 'VN'; // Thay đổi giá trị maQuocGia tại đây
let message = translate(maQuocGia);
console.log(message); // Kết quả trả về là 'Xin chào'

///Bài 4: Cho function truyền vào 1 chuỗi dài hơn 15 ký tự. Viết 1 function cắt chuỗi, lấy ra 10 ký tự đầu tiên và thêm vào dấu “…” ở cuối chuỗi.

/// Ví dụ : subString(“xinchaocacbandenvoiTechmaster”) => “xinchaocac…”
function subString(chuoi) {
    if (chuoi.length <= 15) {
        return chuoi;
    }

    let kyTuDauTien = chuoi.slice(0, 10); // Lấy 10 ký tự đầu tiên
    let ketQua = kyTuDauTien + "...";
    return ketQua;
}

// Sử dụng function để cắt chuỗi
let chuoiDai = "xinchaocacbandenvoiTechmaster"; // Thay đổi giá trị chuoiDai tại đây
let chuoiCat = subString(chuoiDai);
console.log(chuoiCat); // Kết quả trả về là "xinchaocac..."
