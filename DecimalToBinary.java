import java.util.Scanner;

public class DecimalToBinary {
    public static int ConvertDecimalToBinary(int DecimalNo) {
        int BinaryNo = 0;

        while (DecimalNo != 0) {
            int remainder = DecimalNo % 2;
            BinaryNo = (BinaryNo * 10) + remainder;
            DecimalNo /= 2;
        }
        return BinaryNo;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number:- ");
        int DecimalNo = sc.nextInt();

        int BinaryNo = ConvertDecimalToBinary(DecimalNo);
        System.out.println("Binary conversion of Decimal Number " + DecimalNo + " is " + BinaryNo);
    }

}
