import java.util.Scanner;

public class Bai9 {
    /*Bài 9. Chèn chuỗi S1 vào chuỗi S2 ở vị trí k biết trước với S1, S2 và k nhập vào từ bàn phím.*/
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập chuỗi S1: ");
        String s1 = scr.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scr.nextLine();
        System.out.print("Nhập vị trí k: ");
        int k = scr.nextInt();
        if (k < 0 || k > s2.length()) {
            System.out.println("Vị trí k không hợp lệ!");
            return;
        }
        String result = s2.substring(0, k) + s1 + s2.substring(k);
        System.out.println("Chuỗi sau khi chèn: " + result);
    }
}
