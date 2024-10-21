import java.util.*;

public class reverse_number {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int rev = 0;
        int reverse = 0;
        System.out.println("Enter a number to print its reverse:- ");
        int number = s.nextInt();
        System.out.println(number + " is orignal number entered.");
        while (number > 0) {
            rev = number % 10;
            reverse = reverse * 10 + rev;
            number /= 10;
        }
        System.out.println(reverse + " is reversed number.");
    }
}