package LeetCode.Medium;

public class deciBinary {
    public static int minPartitions(String n) {
        int minDeci = 0;
        String currentNumString = n;

        while(currentNumString.length()>0) {
            StringBuilder deciBinaryBuilder = new StringBuilder();
            for (int i = 0; i < currentNumString.length(); i++ ) {
                if (currentNumString.charAt(currentNumString.length()-1-i) != '0') {
                    deciBinaryBuilder.append(1);
                } else {
                    deciBinaryBuilder.append(0);
                }
            }
            deciBinaryBuilder.reverse();
        }

        return 0;
    }
}
