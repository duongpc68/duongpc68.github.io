import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        /*Bài 2:
@input: 1 year = 365 * 1 day = 24 hour = 1440 minute = 86400 second
Viết chương trình Java chuyển đầu vào thành số ngày và số năm:
a. Đầu vào là số giờ
b. Đầu vào là số phút.
c. Đầu vào là số giây.
VD: nhập đầu vào: 24 giờ, 1440 phút, 86400 giây
kết quả: 1 ngày, 0 năm*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập vào số giờ: ");
        int h = scr.nextInt();
        System.out.println("Nhập vào số phút: ");
        int m = scr.nextInt();
        System.out.println("Nhập vào số giây: ");
        int s = scr.nextInt();
        int totalSeconds = h * 3600 + m * 60 + s;
        int days = totalSeconds / 86400;
        int years = (days / 365);
        System.out.println("Số ngày là: " +days+ "ngày");
        System.out.println("Số năm là: " +years+ "năm");
    }
}
