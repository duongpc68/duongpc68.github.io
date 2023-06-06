import java.util.Scanner;

public class Assignment_Day_4 {
    public static void main(String[] args) {
Bai1();
    }

    public static void Bai1() {
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
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0){
                array[i]++;
            }
        }
        System.out.println("Mảng sau khi thay đổi: ");
        for (int i = 0; i < n ; i++){
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }

}
