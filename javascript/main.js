// Bài 1: Viết function truyền vào mảng các chuỗi có độ dài bất kỳ. Kết quả trả về là 1 mảng các chuỗi có độ dài lớn nhất
function getStringsWithMaxLength(arr) {
    if (arr.length === 0) return [];
  
    let maxLength = 0;
    const result = [];
  
    for (let i = 0; i < arr.length; i++) {
      const str = arr[i];
      const length = str.length;
  
      if (length > maxLength) {
        maxLength = length;
        result.length = 0;  
        result.push(str);
      } else if (length === maxLength) {
        result.push(str);
      }
    }
  
    return result;
  }
  const maxLengthStrings = getStringsWithMaxLength(['aba', 'aa', 'ad', 'c', 'vcd']);
  console.log(maxLengthStrings);  
// Bài 2. Cho mảng users như sau:

users = [
    {
        name: "Bùi Công Sơn",
        age: 30,
        isStatus: true
    },
    {
        name: "Nguyễn Thu Hằng",
        age: 27,
        isStatus: false
    },
    {
        name: "Phạm Văn Dũng",
        age: 20,
        isStatus: false
    }
]
/* Viết function truyền vào 1 mảng các object user. Trả về mảng các user có age > 25 và isStatus = true */
function getUsersByAgeAndStatus(users) {
    const filteredUsers = [];
  
    for (let i = 0; i < users.length; i++) {
      const user = users[i];
      if (user.age > 25 && user.isStatus) {
        filteredUsers.push(user);
      }
    }
  
    return filteredUsers;
  }
/* Viết function truyền vào 1 mảng các object user. Trả về mảng các user có age tăng dần */
function getUsersByAgeAscending(users) {
    const sortedUsers = users.slice().sort((a, b) => a.age - b.age);
    return sortedUsers;
  }

// Bài 3. Viết function truyền vào 1 mảng các chuỗi. Trả về Object hiển thị xem mỗi phần tử trong mảng xuất hiện bao nhiêu lần
function getCountElement(arr) {
    const countObj = {};
  
    for (let i = 0; i < arr.length; i++) {
      const item = arr[i];
      if (countObj[item]) {
        countObj[item] += 1;
      } else {
        countObj[item] = 1;
      }
    }
  
    return countObj;
  }

  