import java.util.Scanner;
import java.util.Random;
public class Bai_thuc_hanh_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào số nguyên: ");
int number = scanner.nextInt();
      Random random = new Random();
      int randomNumber = random.nextInt(100) + 1;
      String result = ( number > randomNumber) ? "số được chọn lớn hơn số ngẫu nhiên" : (number < randomNumber) ? "Số được chọn nhỏ hơn số ngẫu nhiên": "Số được chọn bằng số ngẫu nhiên";
      
      System.out.println("Số ngẫu nhiên là: " + randomNumber);
      System.out.println("Kết quả so sánh là: " + result);
    }
}
