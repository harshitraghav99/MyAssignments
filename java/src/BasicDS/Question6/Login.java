package BasicDS.Question6;

import java.util.Scanner;

class Login {
    private static final String username="Ajay",password="password";
    static String loginUser(String user,String pass){
        Scanner scanner = new Scanner(System.in);
        int i;
        for ( i = 0; i < 2; i++) {
            if(username.equals(user) && password.equals(pass)){
                return "Welcome";
            }
            else {
                System.out.println("Wrong credentials! Enter again");
                System.out.println("Enter Username");
                user = scanner.next();
                System.out.println("Enter password");
                pass = scanner.next();
                continue;
            }
        }
        if(i==2){
            System.out.println("You have entered wrong credentials 3 times  ");
            return "Contact admin";
        }
        else {
            return "!!!!!!!!!";
        }
    }
}
