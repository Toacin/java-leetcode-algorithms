package HackerRank;

import java.util.List;

public class countingSort {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size()/2;

        for (List<Integer> row: matrix) {
            int leftRowSum = 0;
            int rightRowSum = 0;
            for (int i=0; i<row.size(); i++) {
                if (i<n) {
                    leftRowSum += row.get(i);
                } else {
                    rightRowSum += row.get(i);
                }
            }
            if(rightRowSum>leftRowSum) {
                for (int i=0; i<n; i++) {
                    int leftTemp = row.get(i);
                    row.set(i, row.get(row.size()-i-1));
                    row.set(row.size()-i-1, leftTemp);
                }
            }
        }

        for (int i=0; i<n; i++) {
            int topColumnSum = 0;
            int bottomColumnSum = 0;
            for (int j=0; j<matrix.size(); j++) {
                if (j<n) {
                    topColumnSum += matrix.get(j).get(i);
                } else {
                    bottomColumnSum += matrix.get(j).get(i);
                }
            }
            if (bottomColumnSum>topColumnSum) {
                for (int j=0; j<n; j++) {
                    int topTemp = matrix.get(j).get(i);
                    matrix.get(j).set(i, matrix.get(matrix.size()-j-1).get(i));
                    matrix.get(matrix.size()-j-1).set(i, topTemp);
                }
            }
        }

        int totalSum = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                totalSum += matrix.get(i).get(j);
            }
        }

        return totalSum;
    }
}
