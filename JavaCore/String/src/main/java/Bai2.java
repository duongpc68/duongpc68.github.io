import java.util.Scanner;


public class Bai2 {
    /*Bài 2. Viết chương trình nhập vào một xâu ký tự s bất kỳ, sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường. Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh*/
    public static String convertString(String s){
        StringBuilder result = new StringBuilder();
        for (int i =0; i < s.length(); i ++ ){
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập một xâu ký tự bất kỳ");
        String s = scr.nextLine();
        System.out.println("Chuỗi ban đầu: "+s);
     String result = convertString(s);
        System.out.println("Chuỗi mới: " +result);
    }
}
