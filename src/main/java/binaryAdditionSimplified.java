import java.util.ArrayList;

public class binaryAdditionSimplified {
    public static String addBinary(String a, String b) {
        String finalBinaryString = "";

        boolean remainder = false;
        for (int i=0; i< Math.max(a.length(), b.length()); i++) {
            char characterFromA = (i<a.length()) ? a.charAt(a.length()-1-i) : '0';
            char characterFromB = (i<b.length()) ? b.charAt(b.length()-1-i) : '0';

            if (characterFromA=='0' && characterFromB=='0' && !remainder) {
                finalBinaryString = "0" + finalBinaryString;
                remainder=false;
            } else if ((characterFromA=='0' && characterFromB=='0' && remainder) || (characterFromA=='0' && characterFromB=='1' && !remainder) || (characterFromA=='1' && characterFromB=='0' && !remainder)) {
                finalBinaryString = "1" + finalBinaryString;
                remainder=false;
            } else if ((characterFromA=='0' && characterFromB=='1' && remainder) || (characterFromA=='1' && characterFromB=='1' && !remainder) || (characterFromA=='1' && characterFromB=='0' && remainder)) {
                finalBinaryString = "0" + finalBinaryString;
                remainder=true;
            } else {
                finalBinaryString = "1" + finalBinaryString;
                remainder=true;
            }
        }
        if (remainder) finalBinaryString = "1" + finalBinaryString;

        return finalBinaryString;
    }

    public static void main(String[] args) {
        String stringB = "10011010";
        String stringA = "1110000";

        System.out.println(addBinary(stringA, stringB));

    }
}
