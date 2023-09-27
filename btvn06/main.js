const btn = document.getElementById('btn');
const image = document.getElementById('image');
const select = document.getElementById('breed-list');

// Vừa load trang phải gọi API để render danh sách breed
// API: https://dog.ceo/api/breeds/list/all

async function getBreedList() {
    try {
        const response = await axios.get("https://dog.ceo/api/breeds/list/all");
        renderBreed(response.data.message);
    } catch (error) {
        console.error("Error fetching breed list:", error);
    }
}

function renderBreed(breeds) {
    // Xóa các option cũ
    select.innerHTML = "";

    // Duyệt qua danh sách breeds và tạo các option
    for (const breed in breeds) {
        const option = document.createElement('option');
        option.value = breed;
        option.textContent = breed;
        select.appendChild(option);
    }
}

btn.addEventListener('click', async () => {
    const selectedBreed = select.value;

    try {
        const response = await axios.get(`https://dog.ceo/api/breed/${selectedBreed}/images/random`);
        const imageUrl = response.data.message;
        image.src = imageUrl;
    } catch (error) {
        console.error("Error fetching image:", error);
    }
});

getBreedList();
