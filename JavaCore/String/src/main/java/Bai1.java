public class Bai1 {
    /*Bài 1. Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch. Áp dụng liệt kê các số thuận nghịch có 6 chữ số.*/
    // Hàm kiểm tra
    public static boolean checkNumber(int j){
        int n = 999999;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt( str.length()- 1 - i)){
                return false;
            }
        }
return true;
    }
    public static void main(String[] args) {
        for(int j = 100000; j < 999999; j ++){
            if (checkNumber(j)){
                System.out.println(j);
            }
        }
    }
}
