import java.util.*;

public class type_casting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter float value to convert into integer by type casting:- ");
        float a = s.nextFloat();
        int b = (int) a;
        // value is converted into integer from float by type casting
        System.out.println("Integer value is:- " + b);
    }
}