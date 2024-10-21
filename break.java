import java.util.*;

public class break_s {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int val = 0;
        while (true) {
            System.out.println("Enter the number:- ");
            val = s.nextInt();
            if (val % 10 == 0) {
                break;
            }
        }
    }
}
