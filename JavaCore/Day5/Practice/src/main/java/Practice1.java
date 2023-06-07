public class Practice1 {
    public static void main(String[] args) {
Bai1();
    }
    public static void  Bai1(){
        /*Viết chương trình in ra màn hình tam giác vuông có hình dạng sau đây:
1
12
123
1234
12345*/
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void  Bai2(){
        /*Bài 2:
Viết chương trình cũng là in ra tam giác vuông nhưng các số trên 1 hàng đc lặp lại:
1
22
333
4444
55555*/
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
