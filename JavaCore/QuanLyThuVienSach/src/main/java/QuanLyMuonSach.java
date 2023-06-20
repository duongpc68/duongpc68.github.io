import java.util.Scanner;

public class QuanLyMuonSach {
    private static final int MAX_SACH_MUON = 3;
    private static final int MAX_DAU_SACH = 5;

    private Sach[] danhSachSach;
    private BanDoc[] danhSachBanDoc;
    private int[][] bangMuonSach;
    private int soLuongSach;
    private int soLuongBanDoc;

    public void QLMuonSach() {
        danhSachSach = new Sach[MAX_SACH_MUON];
        danhSachBanDoc = new BanDoc[MAX_DAU_SACH];
        bangMuonSach = new int[MAX_DAU_SACH][MAX_SACH_MUON];
        soLuongSach = 0;
        soLuongBanDoc = 0;
    }

    public void nhapDanhSachSachMoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng đầu sách mới: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin đầu sách thứ " + (i + 1) + ":");
            System.out.print("Tên sách: ");
            String tenSach = scanner.nextLine();
            System.out.print("Tác giả: ");
            String tacGia = scanner.nextLine();
            System.out.print("Chuyên ngành: ");
            String chuyenNganh = scanner.nextLine();
            System.out.print("Năm xuất bản: ");
            int namXuatBan = scanner.nextInt();
            scanner.nextLine();
            Sach sach = new Sach(tenSach, tacGia, chuyenNganh, namXuatBan);
            danhSachSach[soLuongSach] = sach;
            soLuongSach++;
        }      System.out.println("Danh sách đầu sách mới đã được nhập.");
    }
    public void hienThiDanhSachSach() {
        System.out.println("Danh sách các đầu sách đã có:");
        if (soLuongSach == 0) {
            System.out.println("Chưa có đầu sách nào.");
        } else {
            for (int i = 0; i < soLuongSach; i++) {
                Sach sach = danhSachSach[i];
                System.out.println("Mã sách: " + sach.getMaSach());
                System.out.println("Tên sách: " + sach.getTenSach());
                System.out.println("Tác giả: " + sach.getTacGia());
                System.out.println("Chuyên ngành: " + sach.getChuyenNganh());
                System.out.println("Năm xuất bản: " + sach.getNamXuatBan());
                System.out.println("--------------------");
            }
        }
    }
    public void nhapDanhSachBanDocMoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng bạn đọc mới: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin bạn đọc thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("Loại bạn đọc (sinh viên, học viên cao học, giáo viên): ");
            String loaiBanDoc = scanner.nextLine();
            BanDoc banDoc = new BanDoc(hoTen, diaChi,soDienThoai, loaiBanDoc);
            danhSachBanDoc[soLuongBanDoc] = banDoc;
            soLuongBanDoc++;
        }

        System.out.println("Danh sách bạn đọc mới đã được nhập.");
    }
    public void hienThiDanhSachBanDoc() {
        System.out.println("Danh sách bạn đọc đã có:");
        if (soLuongBanDoc == 0) {
            System.out.println("Chưa có bạn đọc nào.");
        } else {
            for (int i = 0; i < soLuongBanDoc; i++) {
                BanDoc banDoc = danhSachBanDoc[i];
                System.out.println("Mã bạn đọc: " + banDoc.getMaBanDoc());
                System.out.println("Họ tên: " + banDoc.getHoTen());
                System.out.println("Địa chỉ: " + banDoc.getDiaChi());
                System.out.println("Số điện thoại: " + banDoc.getSoDienThoai());
                System.out.println("Loại bạn đọc: " + banDoc.getLoaiBanDoc());
                System.out.println("--------------------");
            }
        }
    }
    public void lapBangMuonSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bạn đọc: ");
        int maBanDoc = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        // Tìm bạn đọc trong danh sách
        BanDoc banDoc = null;
        for (int i = 0; i < soLuongBanDoc; i++) {
            if (danhSachBanDoc[i].getMaBanDoc() == maBanDoc) {
                banDoc = danhSachBanDoc[i];
                break;
            }
        }

        if (banDoc == null) {
            System.out.println("Không tìm thấy bạn đọc có mã " + maBanDoc);
            return;
        }

        System.out.print("Nhập số lượng đầu sách mà bạn đọc muốn mượn: ");
        int soLuongMuon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        // Kiểm tra số lượng sách mượn
        if (soLuongMuon > MAX_SACH_MUON) {
            System.out.println("Bạn đọc chỉ được mượn tối đa " + MAX_SACH_MUON + " đầu sách.");
            return;
        }

        // Kiểm tra loại bạn đọc và số lượng sách mượn
        if ((banDoc.getLoaiBanDoc().equals("sinh viên") && soLuongMuon > 3) ||
                (banDoc.getLoaiBanDoc().equals("học viên cao học") && soLuongMuon > 4) ||
                (banDoc.getLoaiBanDoc().equals("giáo viên") && soLuongMuon > 5)) {
            System.out.println("Bạn đọc loại " + banDoc.getLoaiBanDoc() + " chỉ được mượn tối đa " +
                    (banDoc.getLoaiBanDoc().equals("sinh viên") ? 3 :
                            (banDoc.getLoaiBanDoc().equals("học viên cao học") ? 4 : 5)) + " đầu sách.");
            return;
        }

        // Nhập mã sách và số lượng mượn
        for (int i = 0; i < soLuongMuon; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            int maSach = scanner.nextInt();
            System.out.print("Nhập số lượng sách mượn: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            // Kiểm tra mã sách và số lượng mượn
            Sach sach = null;
            for (int j = 0; j < soLuongSach; j++) {
                if (danhSachSach[j].getMaSach() == maSach) {
                    sach = danhSachSach[j];
                    break;
                }
            }

            if (sach == null) {
                System.out.println("Không tìm thấy đầu sách có mã " + maSach);
                continue;
            }

            if (soLuong > 3) {
                System.out.println("Bạn chỉ được mượn tối đa 3 cuốn sách.");
                continue;
            }

            bangMuonSach[banDoc.getMaBanDoc() - 10000][i] = soLuong;
            System.out.println("Đã thêm sách vào bảng mượn sách.");
        }
    }
    public void hienThiBangMuonSach() {
        System.out.println("Bảng quản lý mượn sách:");
        if (soLuongBanDoc == 0) {
            System.out.println("Chưa có bạn đọc nào.");
        } else {
            for (int i = 0; i < soLuongBanDoc; i++) {
                BanDoc banDoc = danhSachBanDoc[i];
                System.out.println("Mã bạn đọc: " + banDoc.getMaBanDoc());
                System.out.println("Họ tên: " + banDoc.getHoTen());
                System.out.println("Loại bạn đọc: " + banDoc.getLoaiBanDoc());
                System.out.println("Danh sách sách mượn:");

                boolean coSachMuon = false;
                for (int j = 0; j < MAX_SACH_MUON; j++) {
                    if (bangMuonSach[i][j] > 0) {
                        Sach sach = danhSachSach[j];
                        System.out.println("Mã sách: " + sach.getMaSach());
                        System.out.println("Tên sách: " + sach.getTenSach());
                        System.out.println("Số lượng mượn: " + bangMuonSach[i][j]);
                        coSachMuon = true;
                    }
                }

                if (!coSachMuon) {
                    System.out.println("Chưa mượn sách nào.");
                }

                System.out.println("--------------------");
            }
        }
    }
    public void sapXepBangMuonSachTheoTenBanDoc() {
        for (int i = 0; i < soLuongBanDoc - 1; i++) {
            for (int j = i + 1; j < soLuongBanDoc; j++) {
                if (danhSachBanDoc[i].getHoTen().compareTo(danhSachBanDoc[j].getHoTen()) > 0) {
                    // Hoán đổi vị trí
                    BanDoc temp = danhSachBanDoc[i];
                    danhSachBanDoc[i] = danhSachBanDoc[j];
                    danhSachBanDoc[j] = temp;

                    int[] tempBangMuonSach = bangMuonSach[i];
                    bangMuonSach[i] = bangMuonSach[j];
                    bangMuonSach[j] = tempBangMuonSach;
                }
            }
        }

        System.out.println("Danh sách quản lý mượn sách đã được sắp xếp theo tên bạn đọc.");
    }
    public void sapXepBangMuonSachTheoSoLuongSachMuon() {
        for (int i = 0; i < soLuongBanDoc - 1; i++) {
            for (int j = i + 1; j < soLuongBanDoc; j++) {
                int soLuongSachMuon1 = 0;
                int soLuongSachMuon2 = 0;

                for (int k = 0; k < MAX_SACH_MUON; k++) {
                    soLuongSachMuon1 += bangMuonSach[i][k];
                    soLuongSachMuon2 += bangMuonSach[j][k];
                }

                if (soLuongSachMuon1 < soLuongSachMuon2) {
                    // Hoán đổi vị trí
                    BanDoc temp = danhSachBanDoc[i];
                    danhSachBanDoc[i] = danhSachBanDoc[j];
                    danhSachBanDoc[j] = temp;

                    int[] tempBangMuonSach = bangMuonSach[i];
                    bangMuonSach[i] = bangMuonSach[j];
                    bangMuonSach[j] = tempBangMuonSach;
                }
            }
        }

        System.out.println("Danh sách quản lý mượn sách đã được sắp xếp theo số lượng sách mượn giảm dần.");
    }

}




