import java.util.Scanner;

public class Bai7 {
    /*Bài 7. Nhập hai xâu S1 và S2. Tìm xâu S2 trong S1. Nếu có hãy loại bỏ S2 trong S1. Chú ý: phải loại bỏ cho đến khi không tìm được S2 trong S1 nữa.*/
    public static String removeString(String S1, String S2){
        StringBuilder result = new StringBuilder(S1);
        while (result.toString().contains(S2)){
            int index1 = result.indexOf(S2);
            int index2 = index1 + S2.length();
            result.delete(index1 , index2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất:");
        String S1 = scr.nextLine();
        System.out.println("Nhập chuỗi thứ 2:");
        String S2 = scr.nextLine();
        System.out.println("Chuỗi thứ nhất là: "+ S1);
        System.out.println("Chuỗi thứ 2 là: " + S2);
        String removedString = removeString(S1, S2);
        System.out.println("Chuỗi thu được sau khi loại bỏ S2: " +removedString);
    }
}
