package LeetCode.Easy2;

import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gLength = g.length;
        int sLength = s.length;


        int greedSatiated = 0;
        int gIndex = 0;
        int sIndex = 0;
        while (gIndex<gLength && sIndex<sLength) {
            if (s[sIndex]>=g[gIndex]) {
                greedSatiated++;
                sIndex++;
                gIndex++;
            } else {
                sIndex++;
            }
        }
        return greedSatiated;
    }
}
