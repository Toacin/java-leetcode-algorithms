package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class floodFillRefresh {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        HashSet<String> visitedIndex = new HashSet<>();
        return floodFillRecurr(image, sr, sc, color, visitedIndex);
    }

    public static int[][] floodFillRecurr(int[][] image, int sr, int sc, int color, HashSet<String> visitedIndex) {
        int tempPixel = image[sr][sc];
        image[sr][sc] = color;
        visitedIndex.add(sr+","+sc);

        if (sr-1>=0 && image[sr-1][sc]==tempPixel && !(visitedIndex.contains((sr-1)+","+sc))) floodFillRecurr(image, sr-1, sc, color, visitedIndex);
        if (sr+1<image.length && image[sr+1][sc]==tempPixel && !(visitedIndex.contains((sr+1)+","+sc))) floodFillRecurr(image, sr+1, sc, color, visitedIndex);
        if (sc-1>=0 && image[sr][sc-1]==tempPixel && !(visitedIndex.contains(sr+","+(sc-1)))) floodFillRecurr(image, sr, sc-1, color, visitedIndex);
        if (sc+1<image[0].length && image[sr][sc+1]==tempPixel && !(visitedIndex.contains(sr+","+(sc+1)))) floodFillRecurr(image, sr, sc+1, color, visitedIndex);

        return image;
    }

    public static void main(String[] args) {
        int[][] testArray = {{0,0,0},{0,0,0}};
        System.out.println(Arrays.deepToString(floodFill(testArray, 0, 1, 2)));
    }
}
