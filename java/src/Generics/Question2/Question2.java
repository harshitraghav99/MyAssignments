package Generics.Question2;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Random random =new Random();
        HashMap<Integer,Double> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int key =random.nextInt(100);
            double value = random.nextDouble(1,100);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key,value);
            }

        }
        for(Map.Entry map : hashMap.entrySet())
            System.out.printf( "%d :%.2f \n", map.getKey() , map.getValue());
    }
}
