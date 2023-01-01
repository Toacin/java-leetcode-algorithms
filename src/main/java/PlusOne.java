import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

// very unoptimized as of now

public class PlusOne {
    static public int[] plusOne(int[] digits) {
        String digitsString = "";
        for (int digit : digits) {
            digitsString += digit;
        }
        BigInteger digitsIntLessOne = new BigInteger(digitsString);
        BigInteger one = new BigInteger("1");
        BigInteger digitsInt = digitsIntLessOne.add(one);
        String returnableInt = String.valueOf(digitsInt);
        String[] returableStringArray = returnableInt.split("");
        int[] returnableIntArray = new int[returableStringArray.length];
        for (int i=0; i<returableStringArray.length; i++) {
            returnableIntArray[i] = parseInt(returableStringArray[i]);
        }

        return returnableIntArray;
    }

    static public void main(String[] args) {
        int[] testArray1 = {1, 0, 3, 4};
        int[] testArray2 = {4, 5, 6, 2, 4, 5};

        System.out.println(Arrays.toString(plusOne(testArray1)));
    }
}
