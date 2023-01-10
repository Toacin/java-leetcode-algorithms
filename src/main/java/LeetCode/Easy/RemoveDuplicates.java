package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveDuplicates {

    static public int removeDuplicates(int[] nums) {
        ArrayList<Integer> argumentAsAL = new ArrayList<Integer>();

        for (int num: nums) {
            Integer intObjValue = Integer.valueOf(num);
            argumentAsAL.add(intObjValue);
        }

        for (int i=0; i<argumentAsAL.size(); i++) {
            boolean duplicatesRemoved = false;
            while(!duplicatesRemoved) {
                if ((i != argumentAsAL.size()-1) && Objects.equals(argumentAsAL.get(i), argumentAsAL.get(i + 1))) {
                    argumentAsAL.remove(i+1);
                } else {
                    duplicatesRemoved = true;
                }
            }
        }

//        int sizeOfFinalArray = argumentAsAL.size();
//        int[] finalArray = new int[sizeOfFinalArray];
//
//        for (int i=0; i<sizeOfFinalArray; i++) {
//            finalArray[i] = argumentAsAL.get(i);
//        }

        return argumentAsAL.size();
    }

    static public void main(String[] args) {
        int[] test1 = {0, 0, 0, 1, 1, 2};
        int[] test2 = {0, 1, 2, 3, 4, 5, 5, 5};

        System.out.println(removeDuplicates(test2));
    }
}
