package CodeWars;// find the hundreth prime number
// my solution:

public class hundredthPrime {
    public static void main(String[] args) {
        boolean whileCondition = true;
        int count = 2;
        int primeCount = 0;

        while (whileCondition) {
            boolean isPrime = true;

            for (int i=2; i<count; i++) {
                if (count % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
            }

            if (primeCount == 100) {
                System.out.println(count);
                whileCondition = false;
            }

            count++;
        }
    }
}
