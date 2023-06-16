import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();
            Scanner scr = new Scanner(System.in);

            while (true) {
                System.out.println("===== MENU =====");
                System.out.println("1. Thêm thẻ mượn");
                System.out.println("2. Xóa thẻ mượn");
                System.out.println("3. Hiển thị danh sách thẻ mượn");
                System.out.println("4. Thoát chương trình");
                System.out.print("Vui lòng chọn một số: ");
                int choice = scr.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("----- Thêm thẻ mượn -----");
                        System.out.print("Nhập mã phiếu mượn: ");
                        int maPhieuMuon = scr.nextInt();
                        scr.nextLine();
                        System.out.print("Nhập ngày mượn: ");
                        int ngayMuon = scr.nextInt();
                        scr.nextLine();
                        System.out.print("Nhập hạn trả: ");
                        int hanTra = scr.nextInt();
                        scr.nextLine();
                        System.out.print("Nhập số hiệu sách: ");
                        int soHieuSach = scr.nextInt();
                        scr.nextLine();
                        System.out.print("Nhập họ tên sinh viên: ");
                        String hoTen = scr.nextLine();
                        System.out.print("Nhập tuổi sinh viên: ");
                        int tuoi = scr.nextInt();
                        scr.nextLine();
                        System.out.print("Nhập lớp sinh viên: ");
                        String lop = scr.nextLine();
                        SinhVien sinhVien = new SinhVien(hoTen, tuoi, lop);
                        TheMuon theMuon = new TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien);
                        quanLyTheMuon.themTheMuon(theMuon);
                    }
                    case 2 -> {
                        System.out.println("----- Xóa thẻ mượn -----");
                        System.out.print("Nhập mã phiếu mượn cần xóa: ");
                        int maPhieuMuonXoa = scr.nextInt();
                        quanLyTheMuon.xoaTheMuon(maPhieuMuonXoa);
                    }
                    case 3 -> {
                        System.out.println("----- Hiển thị danh sách thẻ mượn -----");
                        quanLyTheMuon.hienThiDanhSachTheMuon();
                    }
                    case 4 -> {
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                    default -> {
                        System.out.println("Lựa chọn không hợp lệ.");
                        System.out.println();
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
