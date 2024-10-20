public class type_conversion {
    public static void main(String args[]) {
        int a = 4;
        byte b = 8;
        int c = a * b;// type conversion byte to int
        double d = c;// type conversion int to double
        System.out.println(c);
        System.out.println(d);

    }
}
// byte->short->int->float->long->double