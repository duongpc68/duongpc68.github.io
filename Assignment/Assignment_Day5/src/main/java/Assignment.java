import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Bai12();
    }

    public static void Bai1() {
        /*Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
a) Là số thuận nghịch.
b) Chỉ có chữ số 0, 6, 8
c) Tổng chữ số chia hết cho 10*/
        int min = 1000000;
        int max = 999999999;
        for (int i = min; i <= max; i++) {
            if (soThuanNghich(i) && thoaMan(i, new int[]{0, 6, 8}) && tOng(i)) {
                System.out.println(i);
            }
        }
    }

    /*a) Kiểm tra có là số thuận nghịch không*/
    public static boolean soThuanNghich(int i) {
        int thuanNghich = 0;
        int banDau = i;
        while (i != 0) {
            int digit = i % 10;
            thuanNghich = thuanNghich * 10 + digit;
            i /= 10;
        }
        return banDau == thuanNghich;
    }

    /*b) Chỉ chứa các chữ số 0,6,8*/
    public static boolean thoaMan(int number, int[] array) {
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
    public static boolean tOng(int number) {
        int sum = 0;
        while (number != 0) {
            int d = number % 10;
            sum += d;
            number /= 10;
        }
        return sum % 10 == 0;
    }

    public static void Bai2() {
        /*Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
a) Là số nguyên tố.
b) Tất cả các chữ số là nguyên tố
c) Đảo của nó cũng là một số nguyên tố*/
        int min = 1000000;
        int max = 9999999;
        for (int i = min; i <= max; i++) {
            if (inTe(i) && numInteger(i) && reVerse(i)) {
                System.out.println(i);
            }

        }
    }

    /*a) Là số nguyên tố.*/
    public static boolean inTe(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*b) Tất cả các chữ số là nguyên tố*/
    public static boolean numInteger(int num) {
        while (num != 0) {
            int d = num % 10;
            if (!inTe(d)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    /*c) Đảo của nó cũng là một số nguyên tố*/
    public static boolean reVerse(int num) {
        int reverse = 0;
        while (num != 0) {
            int d = num % 10;
            reverse = reverse * 10 + d;
            num /= 10;
        }
        return inTe(reverse);
    }

    /*Bài 3: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1]; nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).*/
    public static void Bai3() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int[] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i++) {
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        int count = 0;
        for (int i = 0; i < s - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
                if (i < s - 2 && array[i] == array[i + 2]) {
                    count++;
                }
            }
        }
        System.out.println("Mảng vừa nhập có số cặp phần tử liên tiếp bằng nhau là: " + count);
    }

    /*Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.*/
    public static void Bai4() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int[] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i++) {
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        int max = array[0];
        int maxNd = array[0];
        int index = 0;
        for (int i = 1; i < s; i++) {
            if (array[i] > max) {
                max = maxNd;
                max = array[i];
                index = i;
            } else if (array[i] > maxNd && array[i] < max) {
                maxNd = array[i];

            }
        }
        if (maxNd == max) {
            System.out.println("Không tồn tại số lớn thứ 2");
        } else {
            System.out.println("Số lớn thứ 2 là " + maxNd + " nằm ở vị trí " + index);
        }
    }

    /*Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c). Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].*/
    public static void Bai5() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int[] array = new int[s];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i++) {
            System.out.print("array[" + i + "] =");
            array[i] = scr.nextInt();
        }
        System.out.println("Nhập số nguyên b: ");
        int b = scr.nextInt();
        System.out.println("Nhập số nguyên c: ");
        int c = scr.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] >= b && array[i] <= c) {
                sum += array[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Trung bình cộng: " + avg);
    }

    /*Bài 6: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương. Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).*/
    public static void Bai6() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int s = scr.nextInt();
        int[] a = new int[s];
        int length = a.length;
        int count = 0;
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < s; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = scr.nextInt();
        }
        for (int i = 0; i <= length / 2; i++) {
            if (a[i] != a[length - 1 - i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mảng là mảng đối xứng");
        } else {
            System.out.println("Mảng không phải mảng đối xứng");
        }

    }

    /*Bài 7: Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau. Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.*/
    public static void Bai7() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:  ");
        int n = scr.nextInt();
        int[] a = new int[n];


        int c = 0;
        int i = 0;
        do {
            System.out.println("Nhập các phần tử cho mảng: ");
            int s = scr.nextInt();
            boolean lapNhau = false;
            for (i = 0; i < n; i++) {
                if (a[i] == s) {
                    lapNhau = true;
                    break;
                }
            }
            if (lapNhau) {
                System.out.println("Phần tử đã xuất hiện trong mảng. Vui lòng nhập lại!");
            } else {
                a[c] = s;
                c++;
            }
        } while (c < n);

        System.out.println("Dãy số đã nhập:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    /*Bài 8: Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.*/
    public static void  Bai8(){
        Scanner scr = new Scanner(System.in);
        int m1, n1;
        int m2,n2;
        System.out.println("Nhập vào số dòng của ma trận A: ");
        m1 = scr.nextInt();
        System.out.println("Nhập vào số cột của ma trận A: ");
        n1 = scr.nextInt();
        System.out.println("Nhập vào số dòng của ma trận B: ");
        m2 = scr.nextInt();
        System.out.println("Nhập vào số cột của ma trận B: ");
        n2 = scr.nextInt();
        int [][] A = new int[m1][n1];
        int [][] B = new int[m2][n2];
        int [][] C = new int[m1][n2];
        while   (m1 > 0 && n1 > 0 && m2 > 0 && n2 >0){
            if (n1 != m2){
                System.out.println("Để nhân hai ma trận thì số cột của ma trận A phải bằng số dòng của ma trận B");
                System.out.println("Nhập lại số cột của ma trận A: ");
                n1 = scr.nextInt();
                System.out.println("Nhập vào số dòng của ma trận B: ");
                m2 = scr.nextInt();
            }
            else {
                nhapMaTran(A,"A",scr);
                nhapMaTran(B,"B",scr);
                System.out.println("Ma trận A: ");
                inMatran(A);
                System.out.println("Ma trận B: ");
                inMatran(B);
                Tich(A, B, C);
                System.out.println("Ma trận tích C: ");
                inMatran(C);
            }
        }
    }
    /*Hàm nhập ma trận*/
    public static void nhapMaTran(int[][] s, String maTran, Scanner scr) {
        System.out.println("Nhập phần tử của ma trận" + maTran + ":");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(maTran + "[" + i + "][" + j + "] = ");
                s[i][j] = scr.nextInt();
            }
        }
    }
    /*Hàm in ma trận*/
    public static void inMatran(int [][] s){
        for (int[] ints : s) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
    /*Hàm tính tích 2 ma trận*/
    public static void Tich(int[][] A, int[][] B, int [][]C ){
int m1 = A.length;
int n1 = A[0].length;
        int n2 = B[0].length;
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
    /*Bài 9: Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).*/
    public static void Bai9(){
        int min = 100000;
        int max = 999999;
        for (int i = min; i <= max; i++){
            if (soThuanNghich(i) && tOng(i) ){
                System.out.println(i);
            }
        }
    }
    /*Bài 10: Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?*/
    public static void Bai10() {
        int m,n;
        Scanner scr = new Scanner(System.in);
        do {
        System.out.println("Nhập số m: ");
         m = scr.nextInt();
        System.out.println("Nhập số n: ");
      n = scr.nextInt();
        if (n < m){
            System.out.println("Số n phải lớn hơn m! Vui lòng nhập lại");
        }
        }
        while (n < m);
        int count = 0;
        System.out.println("Các số chính phương trong đoạn [" + m + ", " + n + "]:");
        for (int i = m; i <= n; i++){
        double sQuare = Math.sqrt(i);
        if (sQuare == (int) sQuare){
            count ++;
            System.out.println(i);
        }
        }
        System.out.println("Có " + count + " số chính phương trong đoạn [" + m + "," +n+ "]");
    }
    /*Bài 11: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0). Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
     */
    public static void Bai11(){
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int[][] a = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "]["+ j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
//       Tìm giá trị lớn nhất
        int max = a[0][0];
        for (int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                if (max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
//        Tìm giá trị nhỏ nhất
        int min = a[0][0];
        for (int i = 0; i <m; i++){
            for (int j =0; j < n ; j ++){
                if (min > a[i][j]){
                    min = a[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng đã nhập là: " +max);
        System.out.println("Giá trị nhỏ nhất của mảng đã nhập là: " +min);
    }
    /*Bài 12: Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0). Tính tổng đường chéo chính của ma trận này*/
    public static void  Bai12(){
        int m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào kích thước của ma trận: ");
        m = scanner.nextInt();

        int[][] a = new int[m][m];
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0 ; i < m; i++ ){
            for (int j =0; j < m; j++){
                System.out.print("a[" + i + "]["+ j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\t");
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                if (i == j){
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " + sum);
    }
}


