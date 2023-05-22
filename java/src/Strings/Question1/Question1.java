package Strings.Question1;

public class Question1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int n = str.length();
        System.out.println("Length of string: " + n);
        n=0;
        for (char c:str.toCharArray()) {
            n++;
        }
        System.out.println("Length:"+n);
    }
}
