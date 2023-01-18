package HackerRank;

public class superDigit {
    public static int superDigit(String n, int k) {
        // Write your code here
        String numberStringified = n;
        boolean firstIteration = true;
        while(numberStringified.length()>1) {
            long runningTotal = 0;
            for (int i=0; i<numberStringified.length(); i++) {
                System.out.println("the number being added to runnning total is: " + Integer.parseInt(String.valueOf(numberStringified.charAt(i))));
                runningTotal += Integer.parseInt(String.valueOf(numberStringified.charAt(i)));
            }
            System.out.println("the running total is: " + runningTotal);
            if (firstIteration) {
                runningTotal *= k;
                firstIteration = false;
                System.out.println("the running total updated with k is: " + runningTotal);
            }
            numberStringified = String.valueOf(runningTotal);
        }

        return Integer.parseInt(numberStringified);
    }
}
