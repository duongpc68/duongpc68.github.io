const users = [
    {
        name: "John Doe",
        quote: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        image: "https://randomuser.me/api/portraits/men/41.jpg",
        color: "blue"
    },
    {
        name: "Jane Smith",
        quote: "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
        image: "https://randomuser.me/api/portraits/women/50.jpg",
        color: "purple"
    },
    {
        name: "Mary Johnson",
        quote: "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.",
        image: "https://randomuser.me/api/portraits/women/22.jpg",
        color: "orange"
    },
    {
        name: "Anna Williams",
        quote: "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
        image: "https://randomuser.me/api/portraits/women/76.jpg",
        color: "green"
    },
    {
        name: "Mike Adams",
        quote: "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        image: "https://randomuser.me/api/portraits/men/17.jpg",
        color: "violet"
    }
];

document.addEventListener('DOMContentLoaded', () => {
    const testimonialsContainer = document.querySelector('.testimonials-container');
    const textElement = document.querySelector('.text');
    const nameElement = document.querySelector('.name');
    const authors = document.querySelectorAll('.author');

    // Hàm để cập nhật thông tin hiển thị của một user
    const updateUserDisplay = (user) => {
        textElement.innerText = user.quote;
        nameElement.innerText = user.name;
        testimonialsContainer.style.backgroundColor = user.color;

        // Xóa lớp 'selected' khỏi tất cả các authors
        authors.forEach(author => {
            author.classList.remove('selected');
        });

        // Thêm lớp 'selected' vào author được chọn
        const selectedAuthor = Array.from(authors).find(author => author.querySelector('img').src === user.image);
        selectedAuthor.classList.add('selected');
    };

    // Bắt sự kiện khi click vào một author
    authors.forEach(author => {
        author.addEventListener('click', () => {
            const selectedUser = users.find(user => user.image === author.querySelector('img').src);
            updateUserDisplay(selectedUser);
        });
    });

    // Hiển thị ban đầu sử dụng user đầu tiên
    updateUserDisplay(users[0]);
});
