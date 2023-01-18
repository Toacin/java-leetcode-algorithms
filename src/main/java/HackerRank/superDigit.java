package HackerRank;

public class superDigit {
    public static int superDigit(String n, int k) {
        // Write your code here
        String numberStringified = n;
        boolean firstIteration = true;

        while(numberStringified.length()>1) {
            long runningTotal = 0;
            for (int i=0; i<numberStringified.length(); i++) {
                runningTotal += Integer.parseInt(String.valueOf(numberStringified.charAt(i)));
            }

            if (firstIteration) {
                runningTotal *= k;
                firstIteration = false;
            }

            numberStringified = String.valueOf(runningTotal);
        }

        return Integer.parseInt(numberStringified);
    }
}
