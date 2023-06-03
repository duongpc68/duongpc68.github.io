import java.util.Scanner;

public class Assignment_day3 {
    public static void main(String[] args) {
Bai5();
    }


    public static void Bai1(){
        /*Bài 1: Viết chương trình thực hiện in ra các số từ 1 đến 100. Trong đó, những số nào chia hết cho 3 thì in chữ Fizz, những số nào chia hết cho 5 thì in chữ Buzz, những số nào chia hết cho cả 3 và 5 thì in chữ FizzBuzz*/
        System.out.println("Chuỗi ban đầu là: ");
        for(int i = 1; i <= 100; i++){
            System.out.println(" " + i);
        }
        System.out.println("Chuỗi mới là: ");
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void Bai2(){
        /*Bài 2:
Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
Chuỗi đã cho là: test string
ký tự xuất hiện nhiều nhất trong chuỗi là: t*/
        String s1 = "test string";
        System.out.println("Chuỗi đã cho là: "+ s1);
        int [] charCount = new int[1000];
        for (char c : s1.toCharArray()){
            charCount[c]++;
        }
char sMax = '0';
        int maxCount = 0;
        for (int i = 0; i <charCount.length; i++){
            if (charCount[i] > maxCount){
                maxCount = charCount[i];
                sMax = (char) i;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là: " + sMax);
    }
    public static void Bai3(){
        /*Bài 3:
Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m. Ví dụ với n=5, m=4 */
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scr.nextInt();
        System.out.println("Nhập số m: ");
        int m = scr.nextInt();
        char [][] hCn =  new char[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                hCn[i][j] = '*';
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(hCn[i][j]);
            }
            System.out.println();
        }
    }
    public static void Bai4(){
        /*Bài 4:
Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5, m=4:*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scr.nextInt();
        System.out.println("Nhập số m: ");
        int m = scr.nextInt();
        char [][] hCn =  new char[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
               if (i == 0 || i == m - 1 || j == 0 || j == n -1){
                   hCn[i][j] = '*';
                }
                else{
                    hCn[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(hCn[i][j]);
            }
            System.out.println();
        }
    }
    public static void Bai5(){
        /*Viết một chương trình Java để đảo ngược một số nguyên dương nhập từ bàn phím bằng cách sử dụng vòng lặp while và do-while và break và continue. Chương trình sẽ yêu cầu người dùng nhập một số nguyên dương, sau đó đảo ngược và in ra số đã đảo ngược.*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương: ");
        int n;
        do {
            n = scr.nextInt();
            if (n <= 0){
                System.out.println("Số nhập phải từ 2 chữ số trở lên!");
            }

        }while (n <= 0 );
        int rE = 0;
        while (n != 0){
            int dig = n % 10;
            rE = rE*10 + dig;
            n /= 10;
        }
        System.out.println("Số đảo ngược là: "+rE);

    }
}
