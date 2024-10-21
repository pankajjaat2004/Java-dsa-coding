import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not:- ");
        int number = s.nextInt();
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Entered number is not prime.");
        } else {
            System.out.println("Entered number is prime.");
        }
    }

}
