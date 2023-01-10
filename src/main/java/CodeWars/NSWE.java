package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NSWE {
    public static String[] dirReduc(String[] arr) {
        List<String> arrList = new ArrayList<String>();
        Collections.addAll(arrList, arr);

        boolean needToIterate = true;
        while (needToIterate) {
            needToIterate = false;
            for (int i = 0; i<arrList.size()-1; i++) {
                if (
                    (Objects.equals(arrList.get(i), "NORTH") && Objects.equals(arrList.get(i+1), "SOUTH")) ||
                    (Objects.equals(arrList.get(i), "EAST") && Objects.equals(arrList.get(i+1), "WEST")) ||
                    (Objects.equals(arrList.get(i), "SOUTH") && Objects.equals(arrList.get(i+1), "NORTH")) ||
                    (Objects.equals(arrList.get(i), "WEST") && Objects.equals(arrList.get(i+1), "EAST"))
                ) {
                    needToIterate = true;
                    arrList.remove(i+1);
                    arrList.remove(i);
                    break;
                }
            }
        }

        return arrList.toArray(new String[0]);
    }
}
