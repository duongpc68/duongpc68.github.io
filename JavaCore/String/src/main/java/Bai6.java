import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    /*Bài 6. Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự. Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.*/
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Nhập câu: ");
        String sentence = scr.nextLine();

        // Tách các từ trong câu
        String[] words = sentence.split("\\s+");

        // Sắp xếp các từ theo thứ tự alphabet
        Arrays.sort(words);

        // In các từ đã sắp xếp
        System.out.println("Các từ theo thứ tự alphabet:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
