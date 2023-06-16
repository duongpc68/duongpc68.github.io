import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        QLCB quanLy = new QLCB();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("===== MENU =====");
                System.out.println("1. Thêm mới cán bộ");
                System.out.println("2. Tìm kiếm theo họ tên");
                System.out.println("3. Hiển thị danh sách cán bộ");
                System.out.println("4. Thoát chương trình");
                System.out.print("Vui lòng chọn một số: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Đọc dòng trống sau khi nhập số để tiếp tục đọc chuỗi

                switch (choice) {
                    case 1 -> {
                        System.out.println("----- Thêm mới cán bộ -----");
                        System.out.print("Chọn loại cán bộ (1: Công nhân, 2: Kỹ sư, 3: Nhân viên): ");
                        int loaiCanBo = scanner.nextInt();
                        scanner.nextLine(); // Đọc dòng trống sau khi nhập số để tiếp tục đọc chuỗi
                        System.out.print("Nhập họ tên: ");
                        String hoTen = scanner.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int tuoi = scanner.nextInt();
                        scanner.nextLine(); // Đọc dòng trống sau khi nhập số để tiếp tục đọc chuỗi
                        System.out.print("Nhập giới tính: ");
                        String gioiTinh = scanner.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        if (loaiCanBo == 1) {
                            System.out.print("Nhập bậc: ");
                            int bac = scanner.nextInt();
                            scanner.nextLine(); // Đọc dòng trống sau khi nhập số để tiếp tục đọc chuỗi

                            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                            quanLy.themCanBo(congNhan);
                        } else if (loaiCanBo == 2) {
                            System.out.print("Nhập ngành đào tạo: ");
                            String nganhDaoTao = scanner.nextLine();

                            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            quanLy.themCanBo(kySu);
                        } else if (loaiCanBo == 3) {
                            System.out.print("Nhập công việc: ");
                            String congViec = scanner.nextLine();

                            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                            quanLy.themCanBo(nhanVien);
                        } else {
                            System.out.println("Lựa chọn không hợp lệ.");
                        }
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("----- Tìm kiếm theo họ tên -----");
                        System.out.print("Nhập họ tên cần tìm: ");
                        String tenCanTim = scanner.nextLine();
                        quanLy.timKiemCanBoTheoTen(tenCanTim);
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("----- Hiển thị danh sách cán bộ -----");
                        quanLy.hienThiDanhSachCanBo();
                        System.out.println();
                    }
                    case 4 -> quanLy.thoatChuongTrinh();
                    default -> {
                        System.out.println("Lựa chọn không hợp lệ.");
                        System.out.println();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        // Đóng đối tượng Scanner sau khi sử dụng
    }
}
