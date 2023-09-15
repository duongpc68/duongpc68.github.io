// Câu 1. Tạo 1 thẻ p có id=“text”, có nội dung bất kỳ (có thể tạo bằng HTML hay Javascript - tùy chọn). Yêu cầu

// Đặt màu văn bản thành #777
// Đặt kích thước phông chữ thành 2rem
// Đặt nội dung HTML thành Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript.
const p = document.querySelector("#text");
p.style.color = "#777";
p.style.fontSize = "2rem";
p.innerHTML = "Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript."
// Câu 2. Sử dụng vòng lặp để đặt màu chữ cho tất cả thẻ li thành màu blue (tạo thẻ ul-li bằng html)
const ul = document.querySelector('ul');
ul.forEach(li => {
    li.style.color = 'blue';
});
// Câu 3. Cho mã HTML có nội dung như sau (tạo thẻ ul-li bằng html):
const ulElement = document.getElementById('list');
// 1.Thêm 3 thẻ <li> có nội dung Item 8, Item 9, Item 10 vào cuối danh sách
for (let i = 8; i <= 10; i++) {
    const newLiElement = document.createElement('li');
    newLiElement.textContent = `Item ${i}`;
    ulElement.appendChild(newLiElement);
  }
// 2. Sửa nội dung cho thẻ <li> 1 thành màu đỏ (color)
const li1 = ulElement.querySelector('li');
    li1.style.color = 'red';
// 3. Sửa background cho thẻ <li> 3 thành màu xanh (background-color)
const li3 = ulElement.querySelector('li:nth-child(3)');
li3.style.backgroundColor = 'blue';
 //4. Xóa thẻ <li> thứ 4
 const li4 = ulElement.querySelector('li:nth-child(4)');
 ulElement.removeChild(li4);
 //5.  Thêm thẻ <li> mới thay thế cho thẻ <li> thứ 4 bị xóa
 const newLi = document.createElement('li');
 newLi.textContent = 'New Item';
 ulElement.insertBefore(newLi, ulElement.children[3]);
