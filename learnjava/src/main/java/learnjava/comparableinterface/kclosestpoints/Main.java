package learnjava.comparableinterface.kclosestpoints;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] points = new int[][] {
            {3, 3},
            {5, -1},
            {-2, 4}
        };
        int k = 2;
        int[][] result = sol.kClosest(points, k);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
