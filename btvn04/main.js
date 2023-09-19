let colors = [
    '#3498db',
    '#9b59b6',
    '#e74c3c',
    '#2c3e50',
    '#d35400',
]
document.addEventListener('DOMContentLoaded', () => {
    const boxesContainer = document.querySelector('.boxes');
    const scoreElement = document.querySelector('.points');
    let totalBoxes = 0;

    // tạo box
    const createBox = (color) => {
        const box = document.createElement('div');
        box.classList.add('box');
        box.style.backgroundColor = color;

        // Click xóa box
        box.addEventListener('click', () => {
            box.remove();
            totalBoxes--;
            scoreElement.textContent = totalBoxes;
        });

        return box;
    };

    // Thêm box
    const addBoxes = (count) => {
        for (let i = 0; i < count; i++) {
            const color = colors[Math.floor(Math.random() * colors.length)];
            const box = createBox(color);
            boxesContainer.appendChild(box);
            totalBoxes++;
        }
        scoreElement.textContent = totalBoxes;
    };

    const moreBoxesButton = document.getElementById('btn');
    moreBoxesButton.addEventListener('click', () => {
        addBoxes(5);
    });

    // Hiển thị các box ban đầu
    addBoxes(5);
});
