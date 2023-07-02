package Logichandle;

import Entity.TeachingManagement;
import Entity.Subject;
import Entity.Teacher;
import Entity.TeachingManagementDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeachingLogicManagement {
//    private final TeachingManagement[] teachingManagements = new TeachingManagement[100];
    private final List<TeachingManagement > teachingManagements = new ArrayList<>();

    private TeacherLogicManagement teacherLogicManagement;
    private SubjectLogicManagement subjectLogicManagement;

    public TeachingLogicManagement(TeacherLogicManagement teacherLogicManagement, SubjectLogicManagement subjectLogicManagement) {
        this.teacherLogicManagement = teacherLogicManagement;
        this.subjectLogicManagement = subjectLogicManagement;
    }

    public void inputNewTeaching() {
        if (!teacherLogicManagement.teacherIsNotEmpty() || !subjectLogicManagement.subjectIsNotEmpty()) {
            System.out.println("Không có dữ liệu về giảng viên hoặc môn học, vui lòng tạo đủ dữ liệu trước khi phân công");
            return;
        }

        System.out.println("Nhập số giảng viên bạn muốn phân công giảng dạy: ");
        int teacherNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < teacherNumber; i++) {
            System.out.println("Nhập thông tin cho giảng viên thứ " + (i + 1) + " muốn phân công giảng dạy.");
            System.out.println("Nhập ID giảng viên: ");
            int teacherId;
            Teacher teacher = null;
            do {
                teacherId = new Scanner(System.in).nextInt();
                for (int j = 0; j < teacherLogicManagement.getTeachers().size(); j++) {
                    if (teacherLogicManagement.getTeachers().get(j).getId() == teacherId) {
                        teacher = teacherLogicManagement.getTeachers().get(j);
                        break;
                    }
                }
                if (teacher != null) {
                    break;
                }
                System.out.println("Không tồn tại ID giảng viên vừa nhập, xin vui lòng nhập lại: ");
            } while (true);

            System.out.println("Ông này dạy bao nhiêu môn: ");
            int subjectNumber = new Scanner(System.in).nextInt();
//            TeachingManagementDetail[] details = new TeachingManagementDetail[subjectNumber];
            List<TeachingManagementDetail> details = new ArrayList<>();
//            int count = 0;
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Môn học thứ " + (j + 1) + " mà ông này muốn dạy là môn nào: ");
                int subjectId;
                Subject subject = null;
                do {
                    subjectId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < subjectLogicManagement.getSubjects().size(); k++) {
                        if ( subjectLogicManagement.getSubjects().get(k).getId() == subjectId) {
                            subject = subjectLogicManagement.getSubjects().get(k);
                            break;
                        }
                    }
                    if (subject != null) {
                        break;
                    }
                    System.out.println("Không tồn tại môn học có ID vừa nhập, vui lòng nhập lại: ");
                } while (true);

                System.out.println("Môn này ông dạy bao nhiêu lớp: ");
                int classNumber;
                do {
                    classNumber = new Scanner(System.in).nextInt();
                    if (classNumber < 1 || classNumber > 3) {
                        System.out.println("Số lớp phải là số dương và nhỏ hơn 3, đừng có tham.");
                        continue;
                    }
                    break;
                } while (true);
                TeachingManagementDetail teachingManagementDetail = new TeachingManagementDetail(subject, classNumber);
//                details[count] = teachingManagementDetail;
//                count++;
                details.add(teachingManagementDetail);
            }

            TeachingManagement teachingManagement = new TeachingManagement(teacher, details);
            teachingManagements.add(teachingManagement);
//            saveTeaching(teachingManagement);
        }

    }

    public void showTeaching() {
        System.out.println(teachingManagements);
//        for (int i = 0; i < teachingManagements.length; i++) {
//            if (teachingManagements[i] != null) {
//                System.out.println(teachingManagements[i]);
//            }
//        }
    }

//    public void saveTeaching(TeachingManagement teachingManagement) {
//        for (int i = 0; i < teachingManagements.length; i++) {
//            if (teachingManagements[i] == null) {
//                teachingManagements[i] = teachingManagement;
//                break;
//            }
//        }
//    }


    public void calculateSalary() {
        for (int i = 0; i < teachingManagements.size(); i++) {
            TeachingManagement teachingManagement = teachingManagements.get(i);
            if (teachingManagement == null) {
                continue;
            }
            Teacher teacher = teachingManagement.getTeacher();
            double salary = 0;
//            TeachingManagementDetail[] details = teachingManagement.getDetails();
            List<TeachingManagementDetail> details = new ArrayList<>();
            for (int j = 0; j < details.size(); j++) {
                Subject subject = details.get(j).getSubject();
                salary += ((subject.getTotalLesson() - subject.getTheoryLesson()) * 0.7 * subject.getPrice() + subject.getPrice() * subject.getTheoryLesson()) * details.get(j).getClassNumber();
            }
            System.out.println("Lương của giảng viên " + teacher.getName() + " là  " + salary);
        }
    }
    private boolean isEmptyTeaching(){
        return teachingManagements.isEmpty();

    }
    public void sortByTeacherName(){
        if (isEmptyTeaching()){
            System.out.println("Không có dữ liệu phân công giảng dạy, vui lòng nhập đầy đủ dữ liệu");
            return;
        }
        for (int i = 0; i < teachingManagements.size(); i++){
            for (int j = 0; j < teachingManagements.size(); j++){
                if (teachingManagements.get(i).getTeacher().getName().compareToIgnoreCase(teachingManagements.get(j).getTeacher().getName()) > 0 ){
                    TeachingManagement temp = teachingManagements.get(i);
                    teachingManagements.set(i, teachingManagements.get(j));
                    teachingManagements.set(j, temp);
                }
            }
        }
    }
}

