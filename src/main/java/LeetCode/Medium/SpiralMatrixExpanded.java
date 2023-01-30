package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixExpanded {
    public List<Integer> spiralOrder(int[][] matrix) {
        int xCoordinate = 0;
        int yCoordinate = 0;
        int totalIterations = matrix.length*matrix[0].length;

        int horizontalMaxMoves = matrix[0].length;
        int verticalMaxMoves = matrix.length-1;

        String[] directions = {"right", "down", "left", "up"};
        int directionIndex = 0;

        List<Integer> finalList = new ArrayList<>();

        while(totalIterations > 0) {
            if (directions[directionIndex].equals("right")) {
                for(int i=0; i<horizontalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    xCoordinate++;
                    totalIterations--;
                }
                xCoordinate--;
                horizontalMaxMoves--;
                yCoordinate++;
            } else if (directions[directionIndex].equals("down")) {
                for (int i=0; i<verticalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    yCoordinate++;
                    totalIterations--;
                }
                yCoordinate--;
                verticalMaxMoves--;
                xCoordinate--;
            } else if (directions[directionIndex].equals("left")) {
                for (int i=0; i<horizontalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    xCoordinate--;
                    totalIterations--;
                }
                xCoordinate++;
                horizontalMaxMoves--;
                yCoordinate--;
            } else {
                for (int i=0; i<verticalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    yCoordinate--;
                    totalIterations--;
                }
                yCoordinate++;
                xCoordinate++;
                verticalMaxMoves--;
            }
            directionIndex = (directionIndex == 3) ? 0 : directionIndex+1;
        }

        return finalList;
    }
}
