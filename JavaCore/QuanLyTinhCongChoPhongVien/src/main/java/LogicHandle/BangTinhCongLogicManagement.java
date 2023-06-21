package LogicHandle;

import Entity.Posts;
import Entity.Reporter;

import java.util.Scanner;

import static LogicHandle.ReporterMangementLogic.reporters;

public class BangTinhCongLogicManagement {
    ReporterMangementLogic reporter;
    PostLogicManagement post ;
    public BangTinhCongLogicManagement(ReporterMangementLogic reporter, PostLogicManagement post) {
        this.reporter = reporter;
        this.post = post;
    }

    public void bangTinhCong() {
        if (!reporter.reporterIsNotEmpty() || !post.postIsNotEmpty()){
            System.out.println("Không có dữ liệu về phóng viên hoặc kiểu bài viết, vui lòng tạo dữ liệu trước khi lập bảng");
            return;
        }
        System.out.println("Nhập số phóng viên mà bạn muốn lập bảng:");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin cho phóng viên thứ" + (i + 1) + "muốn lập bảng:");
            System.out.println("Nhập ID phóng viên:");
            int reporterID;
            Reporter reporter = null;
            do {
                reporterID = new Scanner(System.in).nextInt();
                for (int j = 0; j < reporters.length; j++) {
                    if (reporters[j].getIdReporter() == reporterID) {
                        reporter = reporters[j];
                        break;
                    }
                }
                if (reporter != null){
                    break;
                }
                System.out.println("Không tồn tại ID phóng viên vừa nhập, vui lòng nhập lại!");
            }while (true);
            System.out.println("Phóng viên này có bao nhiêu bài viết:");
            int postNumber;
            Posts post = null;
            do {
                postNumber = new Scanner(System.in).nextInt();
                for (int j = 0; j < postNumber; j++) {
                    System.out.println(" Kiểu bài viết thứ" + (j + 1) + "mà phóng viên này viết:");
                    int postID = new Scanner(System.in).nextInt();
                    for (int k = 0; k < posts.length; k++) {
                        if (posts[k].getIdPost() == postID) {
                            post = posts[k];
                            break;
                        }
                    }
                    if (post != null) {
                        break;
                    }
                    System.out.println("Không tôn tại ID bài viết, vui lòng nhập lại!");
                }
            }while (true);
        }
    }
    public void showBangTinhCong(){

    }
}
