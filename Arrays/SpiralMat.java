import java.util.*;

class SpiralMat {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int right = m - 1, left = 0, top = 0, bottom = n - 1;
        int i;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // left to right
            for (i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for (i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // bottom to top
            if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        SpiralMat obj = new SpiralMat();
        List<Integer> ans = obj.spiralOrder(matrix);

        System.out.println("Spiral Order Traversal:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
