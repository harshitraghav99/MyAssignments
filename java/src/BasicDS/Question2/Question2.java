package BasicDS.Question2;

import java.util.Objects;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int min = 100,max=999;
        Object[] num= ArmstrongNumBetweenRange.armstrongNumbersInRange(min,max);
        for (Object obj:num) {
            System.out.printf("%d  ",obj);
        }
    }
}
