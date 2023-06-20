import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        while (true) {
            showMenuContent();
            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <= 10) {
                    break;
                }
                System.out.println("vui lòng nhập lại!");
            }
            while (true);
            switch (choice) {
                case 1:
                   QLMuonSach themDauSach = new QLMuonSach();
                   QLMuonSach.themDauSachMoi();
                    break;
                case 2:
                    QLMuonSach inDanhSach = new QLMuonSach();
                    QLMuonSach.inDanhSachSach();
                    break;
                case 3:
                    QLMuonSach themBanDoc = new QLMuonSach();
                    QLMuonSach.themMoiBanDoc();
                    break;
                case 4:
                    QLMuonSach inBanDoc = new QLMuonSach();
                    QLMuonSach.inDanhSachBanDoc();
                    break;
                case 5:
QLMuonSach lapBangQuanLy = new QLMuonSach();
QLMuonSach.lapBangQuanLyMuonSach();
                    break;
                case 6:
                    QLMuonSach inBangQuanLy = new QLMuonSach();
                    QLMuonSach.inBangQuanLyMuonSach();
                    break;
                case 7:
                    QLMuonSach sapXepTheoTen = new QLMuonSach();
                    QLMuonSach.sapXepBangQuanLyMuonSachTheoTenBanDoc();
                    break;
                case 8:
                    QLMuonSach sapXepTheoSoSach = new QLMuonSach();
                    QLMuonSach.sapXepBangQuanLyMuonSachTheoSoLuongSachMuon();
                    break;
                case 9:
                    QLMuonSach timKiemVaInTheoTenBanDoc = new QLMuonSach();
                    QLMuonSach.timKiemVaHienThiDanhSachMuonSachTheoTenBanDoc();
                    break;
                case 10:
                    return;
            }
        }
    }

    private static void showMenuContent() {
        System.out.println("============PHẦN MỀM QUẢN LÝ THƯ VIỆN SÁCH=============");
        System.out.println("1. Nhập danh sách đầu sách mới");
        System.out.println("2. In ra danh sách các đầu sách");
        System.out.println("3. Nhập danh sách bạn đọc mới");
        System.out.println("4. In danh sách các bạn đọc");
        System.out.println("5. Lập  bảng quản lý mượn sách");
        System.out.println("6. In  bảng quản lý mượn sách");
        System.out.println("7. Sắp xếp danh sách quản lý mượn sách theo tên bạn đọc");
        System.out.println("8. Sắp xếp danh sách quản lý mượn sách theo số lượng sách mượn(giảm dần)");
        System.out.println("9. Tìm kiếm và hiển thị danh sách mượn theo tên bạn đọc");
        System.out.println("10. Thoát chương trình");
        System.out.println("Chọn yêu cầu của bạn: ");
    }
}

