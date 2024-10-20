public class type_prmotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        int c = b - a;// exp b-a results int by type prmotion
        System.out.println(c);
        char a2 = 'a';
        byte b2 = 43;
        int c2 = 8;
        int d = (a2 + b2) * c2;// exp results int by type prmotion
        System.out.println(d);

    }

}
