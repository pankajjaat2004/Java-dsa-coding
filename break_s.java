import java.util.*;

public class break_s {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int val;
        do {
            System.out.println("Enter the number:- ");
            val = s.nextInt();
            if (val % 10 == 0) {
                break;
            }
            System.out.print(val);
        } while (val <= -1);
    }
}
