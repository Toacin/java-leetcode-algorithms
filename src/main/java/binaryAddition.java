import java.math.BigInteger;
import java.util.ArrayList;

public class binaryAddition {
    public static String addBinary(String a, String b) {
        int sizeOfIteration = Math.max(a.length(), b.length());

        ArrayList<String> arrayOfSum = new ArrayList<String>();

        boolean remainder = false;
        for (int i=0; i<sizeOfIteration; i++) {
            char characterFromA = (i<a.length()) ? a.charAt(a.length()-1-i) : '0';
            char characterFromB = (i<b.length()) ? b.charAt(b.length()-1-i) : '0';

            if (characterFromA=='0' && characterFromB=='0' && !remainder) {
                arrayOfSum.add("0");
                remainder=false;
            } else if ((characterFromA=='0' && characterFromB=='0' && remainder) || (characterFromA=='0' && characterFromB=='1' && !remainder) || (characterFromA=='1' && characterFromB=='0' && !remainder)) {
                arrayOfSum.add("1");
                remainder=false;
            } else if ((characterFromA=='0' && characterFromB=='1' && remainder) || (characterFromA=='1' && characterFromB=='1' && !remainder) || (characterFromA=='1' && characterFromB=='0' && remainder)) {
                arrayOfSum.add("0");
                remainder=true;
            } else {
                arrayOfSum.add("1");
                remainder=true;
            }
        }
        if (remainder) {
            arrayOfSum.add("1");
        }
        StringBuilder finalBinaryString = new StringBuilder();
        for (String digit: arrayOfSum) {
            finalBinaryString.insert(0, String.valueOf(digit));
        }

        return finalBinaryString.toString();
    }

    public static void main(String[] args) {
        String stringB = "10011010";
        String stringA = "1110000";

//        System.out.println(addBinary(stringA, stringB));

        BigInteger test = new BigInteger("1.0");
        System.out.println(test);
    }
}
