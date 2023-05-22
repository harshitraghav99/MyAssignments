package Collections.Question2;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vals");
        while (i!=-1){
            i=scanner.nextInt();
            if (i != -1) {
                t.add(i);
            }

        }
        for(int a: t)
            System.out.print(a + " ");
        System.out.println();
        System.out.print(t.size());

    }
}
