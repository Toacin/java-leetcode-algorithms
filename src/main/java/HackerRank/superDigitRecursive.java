package HackerRank;

public class superDigitRecursive {
    public static int superDigitRecursive(String n, int k) {
        long runningTotal = 0;
        for (int i=0; i<n.length(); i++) {
            runningTotal += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        runningTotal *= k;

        if (runningTotal>9) return superDigitRecursive(String.valueOf(runningTotal), 1);
        else return (int) runningTotal;
    }
}
