package BasicDS.Question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter subject 1");
        int m1=scanner.nextInt();
        System.out.println("enter subject 2");
        int m2=scanner.nextInt();
        System.out.println("enter subject 3");
        int m3 = scanner.nextInt();
        System.out.println(ResultDeclaration.declareResults(m1,m2,m3));

    }
}
