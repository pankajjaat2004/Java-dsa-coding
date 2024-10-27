import java.util.Scanner;

public class BinarytoDecimal {

    public static int convertBinaryToDecimal(int BinaryNo) {
        int pow = 0;
        int DecimalNo = 0;

        while (BinaryNo > 0) {
            int LastDigit = BinaryNo % 10;
            DecimalNo += (LastDigit * Math.pow(2, pow));
            BinaryNo /= 10;
            pow++;
        }
        return DecimalNo;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary value to convert it into Decimal:- ");
        int BinaryNo = sc.nextInt();
        int Decimal = convertBinaryToDecimal(BinaryNo);
        System.out.println("Decimal conversion of given binary no is:- " + Decimal);

    }
}