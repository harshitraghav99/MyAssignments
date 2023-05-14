package BasicDS.Question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principalAmount = scanner.nextDouble();
        int time = scanner.nextInt();
        double rate = scanner.nextDouble();
        System.out.println(SiCi.simpleInterest(principalAmount,time,rate));
        System.out.println(SiCi.compoundInterest(principalAmount,time,rate));
    }
}
