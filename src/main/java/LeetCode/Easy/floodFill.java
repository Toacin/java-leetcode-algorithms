package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class floodFill {
    static HashMap<String, Integer> visitedIndicies = new HashMap<>();

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int tempPixel = image[sr][sc];
        image[sr][sc] = color;

        List<int[]> stackOfCoordinates = new ArrayList<>();

        if (((sr-1)>=0) && (image[(sr-1)][sc] == tempPixel) && (visitedIndicies.get((sr-1)+","+sc)==null)) {
            visitedIndicies.put((sr-1)+","+sc, 1);
            stackOfCoordinates.add(new int[]{(sr - 1), sc});
        }
        if (((sc+1)<image[0].length) && (image[sr][(sc+1)] == tempPixel) && (visitedIndicies.get(sr+","+(sc+1))==null)) {
            visitedIndicies.put(sr+","+(sc+1), 1);
            stackOfCoordinates.add(new int[]{sr, (sc + 1)});
        }
        if (((sr+1)<image.length) && (image[(sr+1)][sc] == tempPixel) && (visitedIndicies.get((sr+1)+","+sc)==null)) {
            visitedIndicies.put((sr+1)+","+sc, 1);
            stackOfCoordinates.add(new int[]{(sr + 1), sc});
        }
        if (((sc-1)>=0) && (image[sr][(sc-1)] == tempPixel) && (visitedIndicies.get(sr+","+(sc-1))==null)) {
            visitedIndicies.put(sr+","+(sc-1), 1);
            stackOfCoordinates.add(new int[]{sr, (sc - 1)});
        }

        for (int[] coords: stackOfCoordinates) {
            floodFill(image, coords[0], coords[1], color);
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] testArray = {{0,0,0}, {0,0,0}, {0,0,0}};
        System.out.println(Arrays.deepToString(floodFill(testArray, 1, 1, 2)));
    }
}
