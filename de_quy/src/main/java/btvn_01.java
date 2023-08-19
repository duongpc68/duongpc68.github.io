public class btvn_01 {
    public static class Solution {
        public void print2DArrayRecursive(int[][] arr, int row, int col) {
            // Base case: Nếu hàng và cột đều vượt quá giới hạn mảng
            if (row >= arr.length || col >= arr[0].length) {
                return;
            }

            // In ra phần tử tại vị trí (row, col)
            System.out.print(arr[row][col] + " ");

            // Nếu đã đến cột cuối, di chuyển xuống hàng kế tiếp và cột đầu tiên
            if (col == arr[0].length - 1) {
                print2DArrayRecursive(arr, row + 1, 0);
            } else {
                // Nếu chưa đến cột cuối, di chuyển đến cột kế tiếp trong cùng hàng
                print2DArrayRecursive(arr, row, col + 1);
            }
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            solution.print2DArrayRecursive(array, 0, 0);
            // Output: 1 2 3 4 5 6
        }
    }
}
