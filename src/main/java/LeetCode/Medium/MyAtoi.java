package LeetCode.Medium;

public class MyAtoi {
    public static int myAtoi(String s) {
        StringBuilder unparsedNumber = new StringBuilder();
        boolean numberStarted = false;

        for (int i=0; i<s.length(); i++) {
            char characterInQuestion = s.charAt(i);
            if (
                    characterInQuestion == ' ' ||
                    characterInQuestion == '0' ||
                    characterInQuestion == '1' ||
                    characterInQuestion == '2' ||
                    characterInQuestion == '3' ||
                    characterInQuestion == '4' ||
                    characterInQuestion == '5' ||
                    characterInQuestion == '6' ||
                    characterInQuestion == '7' ||
                    characterInQuestion == '8' ||
                    characterInQuestion == '9' ||
                    ((characterInQuestion == '+' || characterInQuestion == '-') && (i<s.length()-1) && (
                            s.charAt(i+1)== '0' ||
                            s.charAt(i+1)== '1' ||
                            s.charAt(i+1)== '2' ||
                            s.charAt(i+1)== '3' ||
                            s.charAt(i+1)== '4' ||
                            s.charAt(i+1)== '5' ||
                            s.charAt(i+1)== '6' ||
                            s.charAt(i+1)== '7' ||
                            s.charAt(i+1)== '8' ||
                            s.charAt(i+1)== '9'
                    ))
            ) {
                if (numberStarted && (characterInQuestion=='-' || characterInQuestion=='+')) return 0;
                if (numberStarted && characterInQuestion==' ') break;
                if (characterInQuestion == ' ') continue;
                numberStarted = true;
                unparsedNumber.append(characterInQuestion);
            } else if (numberStarted){
                break;
            } else {
                return 0;
            }
        }

        String unparsedNumberString = unparsedNumber.toString();
        System.out.println(unparsedNumberString);

        long finalLong = 0;
        long base10Mult = 1;

        for (int i=0; i<unparsedNumberString.length(); i++) {
            finalLong = switch (unparsedNumberString.charAt(unparsedNumberString.length()-i-1)) {
                case '1' -> finalLong + (base10Mult);
                case '2' -> finalLong + (2*base10Mult);
                case '3' -> finalLong + (3*base10Mult);
                case '4' -> finalLong + (4*base10Mult);
                case '5' -> finalLong + (5*base10Mult);
                case '6' -> finalLong + (6*base10Mult);
                case '7' -> finalLong + (7*base10Mult);
                case '8' -> finalLong + (8*base10Mult);
                case '9' -> finalLong + (9*base10Mult);
                case '-' -> -finalLong;
                default -> finalLong;
            };

            base10Mult *= 10;
        }

        System.out.println(finalLong);
        int finalInt = 0;
        if (finalLong>2147483647) finalInt = 2147483647;
        else if (-(Math.pow(2,31)) > finalLong) finalInt = (int) -(Math.pow(2,31));
        else finalInt = (int) finalLong;

        return finalInt;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }
}
