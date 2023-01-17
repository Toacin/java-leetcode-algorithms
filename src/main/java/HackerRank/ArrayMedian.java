package HackerRank;


import java.util.*;

public class ArrayMedian {
    public static int appearsOnce(List<Integer> a) {
        int maxValue = Collections.max(a);
        int[] bucketArray = new int[maxValue+1];
        for (Integer number : a) {
            if (bucketArray[number] == 0) bucketArray[number] =  1;
            else bucketArray[number] ++;
        }

        for(int i=0; i<bucketArray.length; i++) {
            if (bucketArray[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);

        System.out.println(appearsOnce(arrayList));
    }
}
