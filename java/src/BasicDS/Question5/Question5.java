package BasicDS.Question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ctc :");
        double ctc= scanner.nextInt();
        System.out.printf("Tax payable:%.2f",TaxAmount.calculateTaxAmount(ctc));
    }
}
