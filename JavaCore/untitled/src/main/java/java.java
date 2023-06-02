public class java {
    public static void main(String[] args) {
        //    Viết một ctrinh Java để loại bỏ các ký tự trùng lặp trong 1 chuỗi
//    Chuỗi đã cho là : "techmaster" , sau khi loại bỏ các ký tự trùng lặp, chuỗi mới là:"techmasr"
       String s = "techmaster";
        String newString = "";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (newString.indexOf(c) != 1) {
                newString += c;
            }
        }
        System.out.println("Chuỗi ban đầu: " + s);
        System.out.println("Chuỗi mới sau khi loại bỏ các ký tự trùng lặp : " + newString);
}
    }


