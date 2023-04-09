package metode_Week4_2_13_23.Exercise;

import java.util.Scanner;

public class Exe_10_Top_Number_1 {

    /**
     * Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
     * A top number holds the following properties:
     * •	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
     * •	Holds at least one odd digit, e.g. 232, 707, 87578.
     */

    public static boolean sumOfNumberDivisible8(int num) {

        String numString = "" + num;
        int len = numString.length();
        int sumDigit = 0;

        for (int i = 0; i < len; i++) {
            int digit = Integer.parseInt("" + numString.charAt(i));
            sumDigit += digit;
        }

        if (sumDigit % 8 == 0) {
            return true;
        }

        return false;
    }
    public static boolean containOddDigit(int num) {

        String numString = "" + num;
        int len = numString.length();

        for (int i = 0; i < len; i++) {

            int digit = Integer.parseInt("" + numString.charAt(i));

            if (digit % 2 != 0) {
                return true;
            }
        }

        return false;
    }
    public static void topNumber(int number) {

        if (sumOfNumberDivisible8(number) && containOddDigit(number)) {
            System.out.println(number);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {

            topNumber(i);
        }

        /*System.out.println(sumOfNumberDivisible8(17));
        System.out.println(sumOfNumberDivisible8(35));
        System.out.println(sumOfNumberDivisible8(53));
        System.out.println(sumOfNumberDivisible8(71));
        System.out.println(sumOfNumberDivisible8(11));
        System.out.println(sumOfNumberDivisible8(12));
        System.out.println(sumOfNumberDivisible8(99));*/


    }


}
