package HackerRank;

public class mockTest {
    public static void fizzBuzz(int n) {
        for (int i=1; i<=n; i++) {
            if (i<5 && i != 3) System.out.println(i);
            else if (i%5==0 && i%3==0) System.out.println("FizzBuzz");
            else if (i%3 == 0) System.out.println("Fizz");
            else if (i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(2);
        fizzBuzz(6);
        fizzBuzz(15);
    }
}
