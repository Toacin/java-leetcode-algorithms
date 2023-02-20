package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangeClss {
    public List<String> summaryRanges(int[] nums) {
        List<String> returnList = new ArrayList<>();
        if (nums.length==0) return returnList;

        for (int i=0; i<nums.length; i++) {
            int startingNum = nums[i];
            int referenceIndex = i+1;
            Integer finishingNum = null;
            while ((referenceIndex<nums.length) && (nums[referenceIndex-1]+1==nums[referenceIndex])) {
                finishingNum = nums[referenceIndex];
                referenceIndex++;
            }

            if (finishingNum == null) returnList.add(String.valueOf(startingNum));
            else returnList.add(startingNum+"->"+finishingNum);

            i=referenceIndex-1;
        }


        return returnList;
    }
}
