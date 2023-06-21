package LogicHandle;

import Entity.Posts;
import Entity.Reporter;

import java.util.Scanner;

public class ReporterMangementLogic {
    static Reporter[] reporters = new Reporter[1000];

    public static Reporter[] getReporters() {
        return reporters;
    }

    void inputNewReporter() {
        System.out.println("Bạn muốn thêm mới bao nhiêu phóng viên");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin cho phóng viên thứ" + (i + 1));
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }
     void saveReporter(Reporter reporter) {
        for (int j = 0; j < reporters.length; j++) {
            if (reporters[j] == null) {
                reporters[j] = reporter;
                break;
            }
        }
    }
     void showReporter() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }
   boolean reporterIsNotEmpty(){
        for (int i = 0; i < reporters.length; i++){
            if (reporters[i] != null){
                return true;
            }
        }
        return false;
    }
}
