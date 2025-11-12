package Assignment;

import java.util.*;

public class LoginSystem {
   public static void main(String[] args) {
       // Step 1: Store user credentials
       String[] userIds = {"user1", "user2", "admin"};
       String[] passwords = {"pass1", "pass2", "admin123"};
       Scanner scanner = new Scanner(System.in);
       int attempts = 0;
       boolean loggedIn = false;
       // Step 3: Allow max 3 attempts
       while (attempts < 3 && !loggedIn) {
           System.out.print("Enter user ID: ");
           String inputUser = scanner.nextLine();
           System.out.print("Enter password: ");
           String inputPass = scanner.nextLine();
           // Step 2: Check credentials
           for (int i = 0; i < userIds.length; i++) {
               if (inputUser.equals(userIds[i]) && inputPass.equals(passwords[i])) {
                   loggedIn = true;
                   break;
               }
           }
           if (loggedIn) {
               // Step 4: Success message
               System.out.println("Login successful! Welcome " + inputUser + "!");
           } else {
               attempts++;
               if (attempts < 3) {
                   System.out.println("Invalid credentials. Try again (" + (3 - attempts) + " attempt(s) left).");
               }
           }
       }
       // Step 5: If 3 failed attempts
       if (!loggedIn) {
           System.out.println("Too many failed attempts. Access denied.");
       }
       scanner.close();
   }
}
