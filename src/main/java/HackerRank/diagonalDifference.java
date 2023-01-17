package HackerRank;

import java.util.List;

public class diagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i=0; i<arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(arr.size()-i-1).get(arr.size()-i-1);
        }
        return (leftDiagonal>rightDiagonal) ? leftDiagonal-rightDiagonal: rightDiagonal-leftDiagonal;
    }

    public static void main(String[] args) {

    }
}
