package LeetCode.Easy;

import java.util.Arrays;

public class countOnesBinaryArray {
    public static int countOnes(int indexValue) {
        int currentBase = 65536;
        StringBuilder binaryString = new StringBuilder();
        while(currentBase>=1) {
            if (indexValue>=currentBase) {
                indexValue -= currentBase;
                binaryString.append("1");
            } else {
                binaryString.append("0");
            }
            currentBase /= 2;
        }
        int oneCount = 0;
        for (int i=0; i<binaryString.toString().length(); i++) {
            if (binaryString.toString().charAt(i) == '1') oneCount++;
        }
        return oneCount;
    }

    public static int[] countBits(int n) {
        int[] returnArray = new int[n+1];
        for (int i=0; i<=n; i++) {
            returnArray[i] = countOnes(i);
        }

        return returnArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
//        System.out.println(countOnes(1));
    }
}
