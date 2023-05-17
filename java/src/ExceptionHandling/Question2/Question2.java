package ExceptionHandling.Question2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            if(b==0) {
                throw new UnsupportedOperationException("UnsupportedOperationException");
            }
            else {
                int c = a/b;
                System.out.print(c);
            }
        }
        catch(UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
