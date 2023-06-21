package LogicHandle;

import Entity.Reporter;

import java.util.Scanner;

public class MenuLogic {
    ReporterMangementLogic reporter = new ReporterMangementLogic();
    PostLogicManagement post = new PostLogicManagement();
    BangTinhCongLogicManagement bangTinhCong = new BangTinhCongLogicManagement(reporter,post );
   public void Menu() {
        while (true) {
            showMenuContent();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    reporter.inputNewReporter();
                    break;
                case 2:
                    reporter.showReporter();
                    break;
                case 3:
                    post.inputNewPosts();
                    break;
                case 4:
                    post.showPosts();;
                    break;
                case 5:
                    bangTinhCong.bangTinhCong();
                    break;
                case 6:

                    break;
                case 7:
                    break;
                case 8:

                    break;
                case 9:
                    break;
                case 10:
                    return;
            }
        }
    }

    public  void showMenuContent() {
        System.out.println("============PHẦN MỀM QUẢN LÝ TÍNH CÔNG CHO PHÓNG VIÊN=============");
        System.out.println("1. Nhập danh sách phóng viên mới");
        System.out.println("2. In ra danh sách phóng viên đã có");
        System.out.println("3. Nhập danh sách kiểu bài viết");
        System.out.println("4. In danh sách bài viết");
        System.out.println("5. Lập  bảng tính công cho phóng viên");
        System.out.println("6. In  bảng tính công cho phóng viên");
        System.out.println("7. Sắp xếp danh sách bảng tính công theo tên phóng viên");
        System.out.println("8. Sắp xếp danh sách bảng tính công theo số lượng bài viết(giảm dần)");
        System.out.println("9. Lập bảng kê thu nhập của mỗi phóng viên");
        System.out.println("10. Thoát chương trình");
        System.out.println("Chọn yêu cầu của bạn: ");
    }
    private static int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 10) {
                break;
            }
            System.out.println("vui lòng nhập lại!");
        }
        while (true);
        return choice;
    }
}
