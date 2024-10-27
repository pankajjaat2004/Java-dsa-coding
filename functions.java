public class functions {
    // print hello world n times
    public static void phw(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Hello World");
        }
    }

    // return product of two integer numbers
    public static int pri(int a, int b) {
        return a * b;
    }

    // return product of two float numbers
    public static float pri(float a, float b) {
        return a * b;
    }

    // return factorial of any number
    public static int fac(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    // find binomial coefficient value and print it
    public static void binomialcoefficient(int n, int r) {
        int facn = fac(n);
        int facr = fac(r);
        int facnr = fac(n - r);
        int bincof = facn / (facr * facnr);
        System.out.println("nCr = " + bincof);
    }

    // check whether any number is prime or not positive and greather than equal to
    // 2
    public static boolean isprime(int x) {
        boolean isprime = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    // optimized way for find prime or not for positive and greater than equal to 2
    public static boolean isprimeopt(int x) {
        if (x == 2) {
            return true;
        }
        if (x == 4) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // to print prime numbers in a range from 2 to n.
    public static void primerange(int x) {
        System.out.println("Prime numbers in the given range is:- ");
        for (int i = 2; i <= x; i++) {
            if (isprimeopt(i) == true) {
                System.out.print(i + ",");
            }
        }
    }

    // To calculate power of a number.
    public static int power(int a, int b) {
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }

    // To convert the binary to decimal.
    public static void bintodec(int a) {
        int pow = 0;
        int last = 0;
        int dec = 0;
        while (a > 0) {
            last = a % 10;
            dec += last * power(2, pow);
            a /= 10;
            pow++;
        }
        System.out.println("Decimal value is:- " + dec);
    }

    // To convert from decimal to binary.
    public static void dectobin(int x) {
        int pow = 0;
        int bin = 0;
        while (x > 0) {
            int rem = x % 2;
            bin += rem * power(10, pow);
            pow++;
            x /= 2;
        }
        System.out.println("Binary value is:- " + bin);
    }

    // To find the reverse of a given number.
    public static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }

    // To check whether a number is palindrome or not.
    public static void palindrome(int x) {
        int rev = reverse(x);
        System.out.println("The reverse of the number " + x + " is :- " + rev);
        if (rev == x) {
            System.out.println("So, the number " + x + " is palindrome.");
        } else {
            System.out.println("So, the number " + x + " is not palindrome.");
        }
    }

    // To find the sum of digits.
    public static void sumdigit(int x) {
        int sum = 0;
        while (x > 0) {
            int rem = x % 10;
            sum += rem;
            x /= 10;
        }
        System.out.println("The sum of the digits of number is:- " + sum);
    }

    public static void main(String args[]) {
        phw(5);
        System.out.println("Multiply is:- " + pri(4, 6));
        System.out.println("Multiply is:- " + pri(4.6f, 4.5f));
        System.out.println("The factorial is:- " + fac(7));
        binomialcoefficient(8, 3);
        System.out.println(isprime(4));
        System.out.println(isprimeopt(4));
        primerange(30);
        System.out.println("\nThe square is:- " + power(2, 3));
        bintodec(111);
        dectobin(8);
        System.out.println(reverse(24343));
        palindrome(1235201);
        sumdigit(101010101);
    }
}
