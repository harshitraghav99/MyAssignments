package BasicDS.Question1;

public class CheckArmstrong {
    public static int lengthOfNumber(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }

    // Function to check whether the given number is
    // Armstrong number or not
    public static boolean isArmstrong(int x)
    {
        // Calling order function
        int n = lengthOfNumber(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + (int)Math.pow(r,n);
            temp = temp / 10;
        }

        // If satisfies Armstrong condition
        return (sum == x);
    }
}
