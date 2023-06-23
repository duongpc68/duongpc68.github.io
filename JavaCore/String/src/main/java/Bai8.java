import java.util.Scanner;

public class Bai8 {
    /*Bài 8. Tìm kiếm vị trí xuất hiện đầu tiên của chuỗi S1 trong S2. Nếu không tìm thấy trả về -1.*/
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Nhập chuỗi S1: ");
        String s1 = scr.nextLine();
        System.out.println("In chuỗi S1: "+ s1);
        System.out.print("Nhập chuỗi S2: ");
        String s2 = scr.nextLine();
        System.out.println("In chuỗi S2: "+ s2);
        int position = s2.indexOf(s1);
        if (position != -1) {
            System.out.println("Vị trí xuất hiện đầu tiên của chuỗi S1 trong chuỗi S2 là: " + position);
        } else {
            System.out.println("Chuỗi S1 không xuất hiện trong chuỗi S2.");
        }
    }
}
