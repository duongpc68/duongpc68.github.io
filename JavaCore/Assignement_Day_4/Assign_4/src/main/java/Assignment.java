import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
Bai5();
    }
    public static void Bai1(){
        /*Bài 1:
Viết chương trình Java để tính giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = scr.nextInt();
        int [] array = new int[n];
        System.out.println("Nhập các phần tử trong mảng");
        for (int i = 0; i < n; i++){
            System.out.println("Phần tử thứ" + (i + 1) + ":");
            array[i]=scr.nextInt();
        }
        System.out.printf("Mảng ban đầu: ");
        for (int i = 0; i < n; i++){
            System.out.printf(array[i]+ " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n ; i ++){
            sum += array[i];
        }
        double avg = (double) (sum - max - min) / (n - 2);
        System.out.println("Giá trị trung bình(loại bỏ max và min) là: " + avg);
    }
    public static void  Bai2(){
        /*Bài 2:
Viết chương trình Java để tìm các phần tử trong mảng 1 xuất hiện tại mảng thứ 2 (giá trị chuỗi) in các phần tử đó ra
String[] array1 = {“Python”, “JAVA”, “PHP”, “C#”, “C++”, “SQL”};
String[] array2 = {“MySQL”, “SQL”, “SQLite”, “Oracle”, “PostgreSQL”, “DB2”, “JAVA”};*/
        String[] array1 = {"Python1", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        System.out.println("Các phần tử cùng xuất hiện trong mảng 1 và mảng 2 là: ");
        for (String phanTu1 : array1){
            for (String phanTu2 : array2){
                if (phanTu1.equals(phanTu2)){
                    System.out.println(phanTu1);
                }
            }
        }

    }
    public static void  Bai3(){
        /*Bài 3:
Chèn thêm vào (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}*/
        int [] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int input = 5;
        int posi = 2;
        int [] new_array = new int[my_array.length +1];
        for (int i = 0; i < new_array.length; i ++){
            if (i < posi){
                new_array[i] = my_array[i];
                
            } else if (i == posi) {
                new_array[i] = input;
            }
            else {
                new_array[i] = my_array[i - 1];
            }
        }
        System.out.println("Mảng mới là: ");
        for (int n : new_array){
            System.out.printf(" "+ n );
        }

    }
    public static void  Bai4(){
        /*Bài 4:
Viết chương trình Java để tính giá trị trung bình của các phần tử mảng.
numbers = new int[]{20, 30, 25, 35, -16, 60, -100}*/
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }
double avg = (double) sum / numbers.length;
        System.out.println("Giá trị trung bình của các phần tử trong mảng = "+ avg );
    }
    public static void Bai5(){
        /*Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m. Ví dụ với n=5, m=4:*/
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

}
