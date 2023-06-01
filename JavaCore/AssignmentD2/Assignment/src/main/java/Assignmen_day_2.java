import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignmen_day_2 {
    public static void main(String[] args) {
        Bai5b();
    }

    public static void Bai1() {
        /*Bài 1: Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a
khác 0.*/
        double x;
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        double a = scr.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        double b = scr.nextDouble();
        if (a == 0) {
            System.out.println("Not Available");
        } else {
            x = -b / a;
            System.out.println("x = " + x);
        }
    }
    public static void Bai2() {
        /*Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn
phím, a khác 0.*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scr.nextDouble() ;
        System.out.println("Nhập b: ");
        double b = scr.nextDouble();
        System.out.println("Nhập c: ");
        double c = scr.nextDouble();
        if(a == 0 ){
            System.out.println("Phương trình vô nghiệm!");
        }
        else {
            double d = (b * b) - (4*a*c);
            if(d > 0 ){
                double x1 = (-b + Math.sqrt(d)) / (2*a);
                double x2 = (-b - Math.sqrt(d)) / (2 *a);
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (d == 0) {
                double x = - b / (2*a);
                System.out.println("Phương trình có nghiệm kép:");
                System.out.println("x = " + x);
            }
            else {
                System.out.println("Phương trình không có nghiệm thực");
            }
        }
    }

    public static void Bai3() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        double a = scr.nextDouble();
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        double b = scr.nextDouble();
        if(a == b){
            double p = a *4;
            double s = a*a;
            System.out.println("Chu vi hình vuông là: " + p);
            System.out.println("Diện tích hình vuông là: " + s);
        }
        else {
            double p = (a + b) * 2;
            double s = a * b;
            System.out.println("Chu vi hình chữ nhật là: " + p);
            System.out.println("Diện tích hình chữ nhật là: " + s);
        }

    }

    public static void Bai4() {
        /*Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi), tính tuổi của
người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh (theo định dạng dd/MM/yyyy):  ");
        String dOfb = scr.next();
        LocalDate dateOfBirth = LocalDate.parse(dOfb, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth , currentDate);
int years = period.getYears();
        System.out.println("Tuổi của người đó là: " + years);
    }


        /*Bài 5:
a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
cuối cùng của ký tự đó trong chuỗi vừa nhập.
b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
“123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”*/
        public static void Bai5a() {
//        a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên
            Scanner scr = new Scanner(System.in);
            System.out.println("Nhập vào một chuỗi: ");
            String str = scr.next();
            System.out.println("Nhập vào 1 ký tự: ");
            char  ch = scr.next().charAt(0);
            int kyTu1 = -1;
            int kyTuCuoi = -1;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ch){
                    if(kyTu1 == - 1){
                        kyTu1 = i;
                    }
                    kyTuCuoi = i;
                }
            }
            if(kyTu1 != -1){
                System.out.println("Vị trí xuất hiện đầu tiên của ký tự là " + kyTu1);
                System.out.println("Vị trí xuất hiện cuối cùng của ký tự là " + kyTuCuoi);
            }
            else{
                System.out.println("Ký tự '" + ch + "' không xuất hiện trong chuỗi.");
            }

    }
    public static void Bai5b(){
            /*b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
“123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập chuỗi gốc: ");
//        Nhập chuỗi s và s1, s2
        String s = scr.nextLine();
        System.out.println("Nhập s1: ");
        String s1 = scr.nextLine();
        System.out.println("Nhập s2: ");
        String s2 = scr.nextLine();
        // Thay thế chuỗi s1 bằng s2
        String rp = s.replaceAll(s1,s2);
        // Trường hợp chuỗi s1 không xuất hiện trong s
        if (!rp.equals(s)){
            System.out.println("Chuỗi mới sau khi thay thế: " + rp);
        }
        else{
            System.out.println("s1 không xuất hiện trong chuỗi s");
        }
    }
}
