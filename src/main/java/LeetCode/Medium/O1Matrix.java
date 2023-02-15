package LeetCode.Medium;

public class O1Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int[][] returnArray = new int[mat.length][mat[0].length];

        for (int row=0; row<mat.length; row++) {
            for (int col=0; col<mat[0].length; col++) {
                if (mat[row][col] == 0) continue;
            }
        }

        return returnArray;
    }
}
