$(document).ready(function() {
    let students = [];
    let selectedStudentIndex = -1;

    $('#student-info-form').submit(function(event) {
        event.preventDefault();

        // Clear previous error messages
        $('.error-message').empty();

        const name = $('#name').val();
        const birthday = $('#birthday').val();
        const phone = $('#phone').val();
        const hometown = $('#hometown').val();

        let isValid = true;

        // Validate the input
        if (!name) {
            displayErrorMessage('#error-name', 'Please enter a valid name.');
            isValid = false;
        }

        // Add more validation as needed for other fields

        if (isValid) {
            if (selectedStudentIndex !== -1) {
                // Update the selected student's information
                students[selectedStudentIndex] = {
                    name: name,
                    birthday: birthday,
                    phone: phone,
                    hometown: hometown
                };
                selectedStudentIndex = -1; // Reset the selected index after update
            } else {
                // Create a new student if no student is selected for editing
                const student = {
                    name: name,
                    birthday: birthday,
                    phone: phone,
                    hometown: hometown
                };
                students.push(student);
            }

            // Display the updated list of students
            displayStudents();

            // Clear form fields
            resetForm();
        }
    });

    $('#reset-btn').click(function() {
        // Reset the form
        resetForm();
    });

    $('#student-table').on('change', '.select-checkbox', function() {
        const selectedRows = $('#student-table .select-checkbox:checked');
        if (selectedRows.length === 1) {
            $('#edit-btn').prop('disabled', false);
            $('#delete-btn').prop('disabled', false);
        } else {
            $('#edit-btn').prop('disabled', true);
            $('#delete-btn').prop('disabled', true);
        }
    });

    $('#edit-btn').click(function() {
        const selectedRows = $('#student-table .select-checkbox:checked');
        if (selectedRows.length !== 1) {
            alert('Bạn chỉ được sửa thông tin của 1 sinh viên');
            return;
        }

        selectedStudentIndex = selectedRows.closest('tr').index();
        const selectedStudent = students[selectedStudentIndex];

        // Populate the form with the selected student's data
        $('#name').val(selectedStudent.name);
        $('#birthday').val(selectedStudent.birthday);
        $('#phone').val(selectedStudent.phone);
        $('#hometown').val(selectedStudent.hometown);

        // Enable the Save button for editing
        $('#save-btn').prop('disabled', false);
    });

    $('#delete-btn').click(function() {
        const selectedRows = $('#student-table .select-checkbox:checked');
        if (selectedRows.length === 0) {
            alert('Bạn chưa chọn sinh viên để xóa.');
            return;
        }

        const confirmDelete = confirm('Bạn có chắc chắn muốn xóa sinh viên đang chọn?');
        if (confirmDelete) {
            selectedRows.each(function() {
                const selectedIndex = $(this).closest('tr').index();
                students.splice(selectedIndex, 1);
            });

            displayStudents();
            resetForm();
        }
    });

    function displayStudents() {
        const tbody = $('#student-list');
        tbody.empty();

        for (let i = 0; i < students.length; i++) {
            const student = students[i];
            const row = `<tr>
                            <td><input type="checkbox" class="select-checkbox"></td>
                            <td>${student.name}</td>
                            <td>${student.birthday}</td>
                            <td>${student.phone}</td>
                            <td>${student.hometown}</td>
                        </tr>`;
            tbody.append(row);
        }
    }

    function displayErrorMessage(field, message) {
        $(field).text(message);
    }

    function resetForm() {
        // Clear form fields
        $('#name, #birthday, #phone, #hometown').val('');

        // Clear previous error messages
        $('.error-message').empty();

        // Disable Save and Edit buttons
        $('#save-btn').prop('disabled', true);
        $('#edit-btn').prop('disabled', true);
        $('#delete-btn').prop('disabled', true);
    }
});
