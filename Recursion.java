public class Recursion
{
    public static void main(String[] args)
    {
        /*
            Recursion: when a thing is defined in terms of itself.
                       apply the result of a procedure, to a procedure.
                       a recursive method 'calls itself'. can be a substitute for iteration.
                       divide a problem into sub-problems of the same type as the original.
                       commonly used with advanced sorting algorithms and navigating trees

           Advantages:  Easier to read/write
                        Easier to debug

           Disadvantages:   Sometimes slower
                            Uses more memory


         */

        /*
            Simulates walking by recursively taking steps.
            If no steps are left, it prints a message indicating paralysis.
            @param steps The number of steps to walk.
         */
        walk(0);

        /*
            Calculates the factorial of a non-negative integer using recursion.
            @param n The non-negative integer to calculate the factorial for.
            @return The factorial of the given integer.
         */
        System.out.println(factorial(4));

        /*
            Reverses a string using recursion.
            @param str The string to reverse.
            @return The reversed string.
         */
        System.out.println(reverseString("Kagami"));
    }

    public static void walk(int w)
    {
        if (w <= 0)
        {
            System.out.println("My legs are paralyzed, I can't walk anymore!");
        } else
        {
            System.out.println("You take a step!");
            walk(w - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
        {
            return 1;
        } else
        {
            return n * factorial(n - 1);
        }
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
        {
            return str;
        } else
        {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
