package genprog;

/**
 * @author Joseph Madden 2017
 */
public class Genprog {

    public static void main(String[] args) {
        int x = 12;
        Double[] dArray = {3.3, 7000.0, 23.3, 24.0, 24.1, 5.0, 600.6};
        Integer[] iArray = {1, 43, 37, 888, 90, 666};
        Character[] cArray = {'c', 'a', 'a', '6', 'z', '\n'};

        System.out.println("The larger one of 'This' and 'That' is: "
                + Genprog.largerOne("This", "That"));

        System.out.println("The largest in the array is: " + Genprog.max(dArray));
        System.out.println("The largest in the array is: " + Genprog.max(iArray));
        System.out.println("The largest in the array is: " + Genprog.max(cArray));

        System.out.println("Fibonacci of " + x + ":  " + fibonacci(x));
        System.out.println("Factorial of " + x + ":  " + fac(x));

        System.out.print("Binary of " + x + "   :  ");
        binary(x);
        System.out.println("");
    }

    /**
     * A recursive static method that finds the factorial of an integer
     *
     * @param n the integer we wish to find a factorial of
     * @return an integer or a recursive statement
     */
    public static int fac(int n) {
        //Base part
        if (n == 1) {
            return n;
        }
        //Recursive part
        return n * fac(n - 1);
    }

    /**
     * Fibonacci numbers : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55. A recursive
     * static method that finds and returns the Fibonacci numbers based on user
     * input.
     *
     * @param n integer that we wish to find the fibonacci # of
     * @return an integer or a recursive statement
     */
    public static int fibonacci(int n) {
        // Base
        if (n == 1 || n == 2) {
            return n - 1;
        }
        // Recursion
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Defines a generic method that finds and returns the maximum element in an
     * array.
     *
     * @param <T> Comparable type
     * @param data array of a comparable type
     * @return the maximum value
     */
    public static <T extends Comparable> T max(T[] data) {
        T m = data[0];
        for (T data1 : data) {
            if (m.compareTo(data1) < 0) {
                m = data1;
            }
        }
        return m;
    }

    /**
     * Defines a generic static method that finds and returns the larger 
     * one of two elements.
     * @param <T> Comparable type
     * @param d1 value 1
     * @param d2 value 2
     * @return the larger value
     */
    public static <T extends Comparable> T largerOne(T d1, T d2) {
        // Compare d1 and d2; return the larger one
        // without constraint this will not work (extends Comparable is constraint)
        if (d1.compareTo(d2) > 0) {
            return d1;
        }
        return d2;
    }

    /**
     * Write a static and recursive method that prints out the binary
     * representation of a given integer n: The last binary digit is n % 2 and
     * the rest is the binary representation of n/2
     *
     * @param n integer value whose binary value we wish to discover
     */
    public static void binary(int n) {
        // base part
        if (n < 2) {
            System.out.print(n); // need else because there is no return to stop it
        } else {
            binary(n / 2); // work on the rest first, then print out the last digit
            System.out.print(n % 2);
        }
    }
}
