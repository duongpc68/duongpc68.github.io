public class demo {

    public static void main(String[] args) {
        int [] op = new int[51];
        System.out.println(fibo(40,op));
    }
//    public static void printF(int count){
//        System.out.println("FFF" +count);
//        count++;
//        printF();
//    }
    /// in các số từ 1 đến 9
    public static void printNumbers(int count){
        if (count == 0){
            return;
        }
        System.out.println("Start - " +count);
printNumbers(count  - 1);
//        System.out.println("End -" +count);
    }

    static int giaiThua(int n){
        if (n == 0){
            return 1; // giai thừa của 0 = 1 (0! = 1)
        }
        return n* giaiThua(n - 1);
    }
    static int fibo(int n, int [] optimize){
//    điều kiện dừng
        if (n == 1  || n == 2){
            return 1;
        }
        if (optimize[n] == 0)
        {
            optimize[n] = fibo(n -1, optimize) + fibo(n - 2,optimize);
        }
        return optimize[n];
    }

    static int fibo2(int n){
        int [] res = new int[n];
        res[1] = res[2] = 1;
        for (int i = 3; i < n + 1 ; i++) {
res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }
}
