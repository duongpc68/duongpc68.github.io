import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
       /*Bài 1: Viết chương trình lấy 1 số nguyên bất kỳ trong khoảng từ 0 đến 1000 và tính tổng các chữ số của nó?
VD: Tổng các chữ số của số 1000 = 1;*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên bất kỳ từ 0 - 1000: ");
        int n = scr.nextInt();
        int sum = 0;
        if (n < 0 || n > 1000){
            System.out.println("Số nhập không hợp lệ!");
        }
        else {

            String str = String.valueOf(n);
            for (int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                int j = Character.getNumericValue(c);
                sum += j;
            }

            System.out.println("Tổng các chữ số trong số nguyên là: " + sum);
        }


    }
    public static void Bai1(){

    }
}
