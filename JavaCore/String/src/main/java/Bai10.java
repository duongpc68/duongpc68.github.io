import java.util.Scanner;

public class Bai10 {
    /*Bài 10. Loại bỏ chuỗi S1 vào chuỗi S2 với S1, S2 nhập vào từ bàn phím.*/
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập chuỗi S1: ");
        String s1 = scr.nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scr.nextLine();
        String result = s2.replace(s1, "");
        System.out.println("Chuỗi sau khi loại bỏ: " + result);
    }
}
