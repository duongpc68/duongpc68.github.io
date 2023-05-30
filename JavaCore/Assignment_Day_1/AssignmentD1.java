import java.text.DecimalFormat;

public class AssignmentD1 {
    public static void main(String[] args) {
    }
    public static void Bai1(){
        /* Bài 1: Tính chu vi và diện tích hình chữ nhật khi biết chiều dài và chiều rộng của chúng.*/
        int a = 20;
        int b = 10;
        System.out.println("Chu vi hình chữ nhật = " + (2*(a+b)));
        System.out.println("Diện tích hình chữ nhật = " + (a*b));
    }
    public static void Bai2(){
        /* Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.*/
        double p = 34.5;
        double c;
        double s;
        System.out.println("Chu vi hình tròn = " + (c =(2*3.14*p)));
        System.out.println("Diện tích hình tròn = " + (s = (3.14 * (p*p))));
    }
    public static void Bai3(){
//        Bài 3: Tìm số lớn nhất trong 4 số biết trước.
        int num1 = 20;
        int num2 = 30;
        int num3 = 42;
        int num4 = 30;
        int max = num1; // Giả sử num1 là số lớn nhất ban đầu

         // so sánh lần lượt các số từ num2 -> num4 với max để tìm số lớn nhất
        if (num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        if(num4 > max){
            max = num4;
        }
        System.out.println("Số lớn nhất trong 4 số là: " + max);

    }
    public static void Bai4(){
//        Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.
        double x = 30.0;
        double squareRoot = Math.sqrt(x);
        System.out.println("Kết quả căn bậc hai là:  " + squareRoot );
        double roundedNumber = Math.round(squareRoot * 1000.0) / 1000.0;
        System.out.println("Kết quả sau khi làm tròn: " + roundedNumber);

    }
    public static void Bai5(){
//        Bài 5: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân.
        int a = 10;
        int b = 14;
        double c = (double) a / b;
        double d = Math.round(c * 1000.0) / 1000.0;
        System.out.println("Thương 2 số nguyên =  " + d);
    }
}

