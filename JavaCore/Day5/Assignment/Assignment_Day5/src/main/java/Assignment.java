import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Bai6();
    }
    public static void  Bai1(){
        /*Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
a) Là số thuận nghịch.
b) Chỉ có chữ số 0, 6, 8
c) Tổng chữ số chia hết cho 10*/
int min = 1000000;
int max = 999999999;
for (int i = min; i <= max; i++){
    if (soThuanNghich(i) && thoaMan(i, new int[]{0,6,8}) && tOng(i)){
        System.out.println(i);
    }
}
    }
    /*a) Kiểm tra có là số thuận nghịch không*/
    public static boolean soThuanNghich(int i){
        int thuanNghich = 0;
        int original  = i;
        while(i!= 0){
            int digit = i % 10;
            thuanNghich = thuanNghich*10 + digit;
            i /= 10;
        }
        return original == thuanNghich;
    }
    /*b) Chỉ chứa các chữ số 0,6,8*/
    public static boolean thoaMan(int number, int [] array){
        while (number != 0) {
            int d = number % 10;
            boolean contains = false;
            for (int i : array) {
                if (d == i) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

/*c) Tổng các chữ số chia hết cho 10*/
    public static boolean tOng(int number){
        int sum = 0;
        while (number != 0){
            int d = number % 10;
            sum += d;
            number /= 10;
        }
        return sum %10 == 0;
    }
    public static void  Bai2(){
        /*Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
a) Là số nguyên tố.
b) Tất cả các chữ số là nguyên tố
c) Đảo của nó cũng là một số nguyên tố*/
        int min = 1000000;
        int max = 9999999;
        for (int i = min ; i <= max; i++){
            if (inTe(i)&&numInteger(i)&&reVerse(i)){
                System.out.println(i);
            }

        }
    }
    /*a) Là số nguyên tố.*/
    public static boolean inTe(int num){
        if(num < 1){
            return false;
        }
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    /*b) Tất cả các chữ số là nguyên tố*/
    public static boolean numInteger(int num){
        while (num != 0){
            int d = num % 10;
            if (!inTe(d)){
                return false;
            }
            num /= 10;
        }
        return true;
    }
/*c) Đảo của nó cũng là một số nguyên tố*/
    public static boolean reVerse(int num){
        int reverse = 0;
        while (num != 0){
            int d = num % 10;
            reverse = reverse * 10 + d;
            num /= 10;
        }
        return inTe(reverse);
    }
    /*Bài 3: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1]; nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).*/
    public static void Bai3(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int [] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i ++){
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        int count = 0;
        for (int i = 0; i < s - 1; i++){
            if (array[i] == array[i +1]){
                count++;
                if (i < s - 2 && array[i] == array[i+2]){
                    count++;
                }
            }
        }
        System.out.println("Mảng vừa nhập có số cặp phần tử liên tiếp bằng nhau là: " + count);
    }
    /*Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.*/
    public static void Bai4(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int [] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i ++){
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        int max = array[0];
        int maxNd = array[0];
        int index = 0;
        for (int i = 1; i < s; i++){
            if (array[i] > max){
                max = maxNd;
                max = array[i];
                index = i;
            } else if (array[i] > maxNd && array[i] < max) {
                maxNd = array[i];
                
            }
        }
        if (maxNd == max){
            System.out.println("Không tồn tại số lớn thứ 2");
        }
        else {
            System.out.println("Số lớn thứ 2 là " + maxNd + " nằm ở vị trí " +index);
        }
    }
    /*Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c). Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].*/
    public static void Bai5(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int [] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i ++){
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        System.out.println("Nhập số nguyên b: ");
        int b = scr.nextInt();
        System.out.println("Nhập số nguyên c: ");
        int c = scr.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= array.length; i ++){
if (array[i] >= b && array[i] <= c){
sum += array[i];
count++;
}
        }
        double avg = (double) sum / count;
        System.out.println("Trung bình cộng: " + avg);
    }
    /*Bài 6: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương. Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).*/
    public static void Bai6(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int [] a = new int[s];
        int length = a.length;
        int count = 0;
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i ++){
            System.out.print("a[" + i + "] =");
            a[i] = scr.nextInt();
        }
        for (int i = 0; i <= length /2; i++){
            if (a[i] != a[length - 1 - i ]){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mảng là mảng đối xứng");
        }
        else {
            System.out.println("Mảng không phải mảng đối xứng");
        }

    }
}
