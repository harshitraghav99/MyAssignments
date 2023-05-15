package BasicDS.Question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UserName");
        String user = scanner.next();
        System.out.println("Enter password");
        String pass = scanner.next();
        System.out.println(Login.loginUser(user,pass));
    }
}
