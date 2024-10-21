import java.util.*;

public class largest_of_three {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers to check greatest among them :- ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greater.");
        } else if (b > c) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println(c + " is greater.");
        }
    }
}
