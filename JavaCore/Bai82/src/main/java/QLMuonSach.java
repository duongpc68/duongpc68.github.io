import java.util.Scanner;

public class QLMuonSach {
    private static Sach[] sachs = new Sach[10000];
    private static BanDoc[] banDocs = new BanDoc[10000];
    private static int [][] bangQuanLyMuonSach = new int[1000][1000];
    private static int soLuongBanDoc;
    private static int soLuongSach;
public static void themDauSachMoi(){
       System.out.println("Bạn muốn thêm mới bao nhiêu đầu sách: ");
       int sachNumber = new Scanner(System.in).nextInt();
       for (int i = 0; i < sachNumber; i++){
           System.out.println("Nhập đầu sách thứ" +(i+1)+":");
           Sach sach = new Sach ();
           System.out.println("Nhập tên sách:");
           sach.setTenSach(new Scanner(System.in).nextLine());
           System.out.println("Nhập tên tác giả:");
           sach.setTacGia(new Scanner(System.in).nextLine());
           System.out.println("Nhập năm xuất bản:");
           sach.setNamXuatBan(Integer.parseInt(new Scanner(System.in).nextLine()));
           System.out.println("Chọn chuyên ngành:");
           System.out.println("1. Khoa học - Tự Nhiên");
           System.out.println("2. Văn học - Nghệ thuật");
           System.out.println("3. Điện tử viễn thông");
           System.out.println("4. Công nghệ thông tin");
           int nganhChoice;
           do {
               nganhChoice = new Scanner(System.in).nextInt();
               if (nganhChoice >= 1 && nganhChoice <= 4){
                   break;
               }
               System.out.println("vui lòng nhập lại!");
           }
           while (true);
           switch (nganhChoice){
               case 1:
                   sach.setChuyenNganh(ChuyenNganh.KHOA_HOC_TU_NHIEN);
                   break;
               case 2:
                   sach.setChuyenNganh(ChuyenNganh.VAN_HOC_NGHE_THUAT);
                   break;
               case 3:
                   sach.setChuyenNganh(ChuyenNganh.DIEN_TU_VIEN_THONG);
                   break;
               case 4:
                   sach.setChuyenNganh(ChuyenNganh.CONG_NGHE_THONG_TIN);
                   break;
           }
           for (int j = 0; j < sachs.length; j++ ){
               if (sachs[i] == null){
                   sachs[i] =sach;
                   break;
               }
           }
       }
   }
public static void inDanhSachSach(){
    for (int i = 0; i < sachs.length; i++){
        if (sachs[i] != null){
            System.out.println(sachs[i]);
        }
    }
}
public static void themMoiBanDoc(){
        System.out.println("Bạn muốn thêm mới bao nhiêu bạn đọc: ");
        int banDocNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < banDocNumber; i++){
            System.out.println("Nhập bạn đọc thứ" +(i+1)+":");
            BanDoc banDoc = new BanDoc();
            System.out.println("Nhập tên bạn đọc:");
            banDoc.setHoTen(new Scanner(System.in).nextLine());
            System.out.println("Nhập Số điện thoại:");
            banDoc.setPhone(new Scanner(System.in).nextLine());
            System.out.println("Nhập địa chỉ bạn đọc:");
            banDoc.setDiaChi(new Scanner(System.in).nextLine());
            System.out.println("Chọn loại bạn đọc:");
            System.out.println("1. Sinh viên");
            System.out.println("2. Học viên cao học");
            System.out.println("3. Giáo viên");
            int loaiBanDocChoi;
            do {
                loaiBanDocChoi = new Scanner(System.in).nextInt();
                if  (loaiBanDocChoi >= 1 && loaiBanDocChoi <= 3){
                    break;
                }
                System.out.println("Vui lòng nhập lại!");
            }
           while (true);
            switch (loaiBanDocChoi){
                case 1:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.SINH_VIEN.name);
                    break;
                case 2:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.HOC_VIEN_CAO_HOC.name);
                    break;
                case 3:
                    banDoc.setLoaiBanDoc(LoaiBanDoc.GIAO_VIEN.name);
                    break;
            }
            for (int j = 0; j < banDocs.length; j++ ){
                if (banDocs[i] == null){
                    banDocs[i] =banDoc;
                    break;
            }
        }
        }
}
public static void inDanhSachBanDoc(){
    for (int i = 0; i < banDocs.length; i++){
        if (banDocs[i] != null){
            System.out.println(banDocs[i]);
        }
    }
}
    public static void lapBangQuanLyMuonSach() {
    if (!sachIsEmpty() || !banDocIsEmpty()){
        System.out.println("Không có dữ liệu về sách hoặc bạn đọc vui lòng tạo đủ dữ liệu");
        return;
    }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng bạn đọc mượn sách: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin mượn sách cho bạn đọc thứ " + (i + 1) + ":");
            System.out.print("Mã bạn đọc: ");
            int maBanDoc = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập số lượng đầu sách mượn: ");
            int m = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập thông tin đầu sách thứ " + (j + 1) + ":");
                System.out.print("Mã sách: ");
                int maSach = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Số lượng cuốn sách: ");
                int soLuong = scanner.nextInt();
                scanner.nextLine();
                bangQuanLyMuonSach[maBanDoc][maSach] = soLuong;
            }
        }
    }

    public static void inBangQuanLyMuonSach() {
        System.out.println("Bảng quản lý mượn sách:");
        for (int i = 0; i < soLuongBanDoc; i++) {
            BanDoc banDoc = banDocs[i];
            System.out.println("- Mã bạn đọc: " + banDocs.getClass());
            System.out.println("  Họ tên: " + banDocs.getClass());
            System.out.println("  Loại bạn đọc: " + banDocs.getClass());

            for (int j = 0; j < soLuongSach; j++) {
                Sach sach = sachs[j];
                int soLuongMuon = bangQuanLyMuonSach[banDocs.getClass().getModifiers()][sachs.getClass().getModifiers()];
                if (soLuongMuon > 0) {
                    System.out.println("  - Mã sách: " + sachs.getClass());
                    System.out.println("    Tên sách: " + sachs.getClass());
                    System.out.println("    Số lượng mượn: " + soLuongMuon);
                }
            }
            System.out.println();
        }
    }
    public static void sapXepBangQuanLyMuonSachTheoTenBanDoc() {
        for (int i = 0; i < soLuongBanDoc - 1; i++) {
            for (int j = i + 1; j < soLuongBanDoc; j++) {
                if (banDocs[i].getHoTen().compareTo(banDocs[j].getHoTen()) > 0) {
                    BanDoc temp = banDocs[i];
                    banDocs[i] = banDocs[j];
                    banDocs[j] = temp;
                }
            }
        }
    }
    public static void sapXepBangQuanLyMuonSachTheoSoLuongSachMuon() {
        for (int i = 0; i < soLuongBanDoc - 1; i++) {
            for (int j = i + 1; j < soLuongBanDoc; j++) {
                int soLuongMuon1 = 0;
                int soLuongMuon2 = 0;

                for (int k = 0; k < soLuongSach; k++) {
                    soLuongMuon1 += bangQuanLyMuonSach[banDocs[i].getMaBanDoc()][sachs[k].getMaSach()];
                    soLuongMuon2 += bangQuanLyMuonSach[banDocs[j].getMaBanDoc()][sachs[k].getMaSach()];
                }

                if (soLuongMuon1 < soLuongMuon2) {
                    BanDoc temp = banDocs[i];
                    banDocs[i] = banDocs[j];
                    banDocs[j] = temp;
                }
            }
        }
    }
    public static void timKiemVaHienThiDanhSachMuonSachTheoTenBanDoc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên bạn đọc cần tìm kiếm: ");
        String tenBanDoc = scanner.nextLine();

        System.out.println("Danh sách mượn sách của bạn đọc có tên \"" + tenBanDoc + "\":");
        for (int i = 0; i < soLuongBanDoc; i++) {
            if (banDocs[i].getHoTen().equalsIgnoreCase(tenBanDoc)) {
                BanDoc banDoc = banDocs[i];
                System.out.println("- Mã bạn đọc: " + banDoc.getMaBanDoc());
                System.out.println("  Họ tên: " + banDoc.getHoTen());
                System.out.println("  Loại bạn đọc: " + banDoc.getLoaiBanDoc());

                for (int j = 0; j < soLuongSach; j++) {
                    Sach[] danhSachSach = new Sach[0];
                    Sach sach = danhSachSach[j];
                    int soLuongMuon = bangQuanLyMuonSach[banDoc.getMaBanDoc()][sach.getIdSach()];
                    if (soLuongMuon > 0) {
                        System.out.println("  - Mã sách: " + sach.getMaSach());
                        System.out.println("    Tên sách: " + sach.getTenSach());
                        System.out.println("    Số lượng mượn: " + soLuongMuon);
                    }
                }
                System.out.println();
            }
        }
    }

    public static boolean sachIsEmpty(){
        for (int i = 0 ; i < sachs.length; i++){
            if (sachs[i] != null){
                return true;
            }
        }
        return false;
    }
    public static boolean banDocIsEmpty(){
        for (int i = 0 ; i < banDocs.length; i++){
            if (banDocs[i] != null){
                return true;
            }
        }
        return false;
    }
}





