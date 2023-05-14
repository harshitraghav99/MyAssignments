package BasicDS.Question2;

import BasicDS.Question1.CheckArmstrong;

import java.util.ArrayList;

public class ArmstrongNumBetweenRange {
    public static Object[] armstrongNumbersInRange(int min, int max){
        ArrayList<Integer> armstrong = new ArrayList<Integer>();
        for (int i = min; i <=max ; i++) {
            if(CheckArmstrong.isArmstrong(i)){
                armstrong.add(i);
            }

        }
        return armstrong.toArray();

    }
}
