package Strings.Question3;

public class Question3 {
    public static void main(String[] args) {
        String a = "Java String pool refers to collection of Strings which are stored in heap memory";

        System.out.println("LowerCase:"+a.toLowerCase());
        System.out.println("UpperCase:"+a.toUpperCase());
        System.out.println("Repacement:"+ a.replace("a", "$"));
        if (a.contains("collection")){
            System.out.println("Contains - collection");
        }else{
            System.out.println("Does not contain - collection");
        }
        String b = "java string pool refers to collection of strings which are stored in heap memory";
        if(b.equals(a)) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not Matched");
        }
        if(b.equalsIgnoreCase(a))
            System.out.println("Matched");
        else
            System.out.println("Not Matched");


    }
}
