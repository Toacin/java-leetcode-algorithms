package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class backspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        List<String> stringSArr = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> stringTArr = new ArrayList<>(Arrays.asList(t.split("")));

        for (int i=0; i<stringSArr.size(); i++) {
            if (!stringSArr.get(i).equals("#")) continue;

            stringSArr.remove(i);
            if (i>0) stringSArr.remove(i-1);

            i = (i==1 || i==0) ? -1 : Math.max(i-2, 0);
        }

        for (int i=0; i<stringTArr.size(); i++) {
            if (!stringTArr.get(i).equals("#")) continue;

            stringTArr.remove(i);
            if (i>0) stringTArr.remove(i-1);

            i = (i==1 || i==0) ? -1 : Math.max(i-2, 0);
        }

        return (stringSArr.toString().equals(stringTArr.toString()));
    }
}
