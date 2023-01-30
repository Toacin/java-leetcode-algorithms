package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
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
            if (directions[directionIndex].equals("right") || directions[directionIndex].equals("left")) {
                for(int i=0; i<horizontalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    xCoordinate = (directions[directionIndex].equals("right")) ? xCoordinate+1 : xCoordinate-1;
                    totalIterations--;
                }
                xCoordinate = (directions[directionIndex].equals("right")) ? xCoordinate-1 : xCoordinate+1;
                horizontalMaxMoves--;
                yCoordinate = (directions[directionIndex].equals("right")) ? yCoordinate+1 : yCoordinate-1;
            } else {
                for (int i=0; i<verticalMaxMoves; i++) {
                    finalList.add(matrix[yCoordinate][xCoordinate]);
                    yCoordinate = (directions[directionIndex].equals("down")) ? yCoordinate+1 : yCoordinate-1;
                    totalIterations--;
                }
                yCoordinate = (directions[directionIndex].equals("down")) ? yCoordinate-1 : yCoordinate+1;
                verticalMaxMoves--;
                xCoordinate = (directions[directionIndex].equals("down")) ? xCoordinate-1 : xCoordinate+1;
            }
            directionIndex = (directionIndex == 3) ? 0 : directionIndex+1;
        }

        return finalList;
    }
}
