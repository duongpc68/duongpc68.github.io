package Entity;

import java.util.List;

public class TeachingManagement {
    private Teacher teacher;

//    private TeachingManagementDetail[] details;
    private List<TeachingManagementDetail> details;
    private int totalLesson;


//    public TeachingManagement(Teacher teacher, TeachingManagementDetail[] details) {
//        this.teacher = teacher;
//        this.details = details;
//    }


    public TeachingManagement(Teacher teacher, List<TeachingManagementDetail> details) {
        this.teacher = teacher;
        this.details = details;
        this.totalLesson = totalLesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

//    public TeachingManagementDetail[] getDetails() {
//        return details;
//    }
//
//    public void setDetails(TeachingManagementDetail[] details) {
//        this.details = details;
//    }

    public List<TeachingManagementDetail> getDetails() {
        return details;
    }

    public void setDetails(List<TeachingManagementDetail> details) {
        this.details = details;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    @Override
    public String toString() {
        return "TeachingManagement{" +
                "teacher=" + teacher +
                ", details=" +
                '}';
    }
}
