import java.util.Scanner;

public class Bai3 {
    /*Bài 3. Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)*/
public static String normalString(String s){
    StringBuilder result = new StringBuilder();
    boolean wordNext = true;
    for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if (Character.isLetter(c)){
            if (wordNext){
                result.append(Character.toUpperCase(c));
                wordNext = false;
            }
            else{
                result.append(Character.toLowerCase(c));
            }
        }
    }
    return result.toString().trim();
}

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập xâu ký tự:");
        String inputString = scr.nextLine();
        System.out.println("Xâu ký tự đã nhập:" +inputString);
        String result = normalString(inputString);
        System.out.println("Chuỗi sau khi xử lý: " + result);
    }
}
