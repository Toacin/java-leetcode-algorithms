package HackerRank;

public class superDigit {
    public static int superDigit(String n, int k) {
        // Write your code here
        String numberStringified = n;

        while(numberStringified.length()>1) {
            int runningTotal = 0;
            for (int i=0; i<numberStringified.length(); i++) {
                runningTotal += Integer.parseInt(String.valueOf(numberStringified.charAt(i)));
            }
            numberStringified = String.valueOf(runningTotal);
        }

        return Integer.parseInt(numberStringified);
    }
}
