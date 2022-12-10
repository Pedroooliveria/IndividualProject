import java.util.ArrayList;
import java.util.Scanner;


public class CreateUser {
    public void addUsers() {
        Scanner scanner = new Scanner(System.in);
        Person user = new Person();
        String password = "";
        String nif = "";
        String email = "";
        System.out.print("Name: ");
        user.setName(scanner.next());
        System.out.print("User: ");
        user.setUser(scanner.next());

        while (!Checker.validEmail(email)) {
            System.out.print("Email: ");
            email = scanner.next();
            if (Checker.validEmail(email)) {
                user.setEmail(email);
            }
            if (!Checker.validEmail(email)) {
                System.out.println(Color.RED_BOLD + "Your password:" +
                        "Letters Uppercase and Lowercase");
            }
        }
        while (!Checker.passValid(password)) {
            System.out.print("Password: ");
            password = scanner.next();
            if (Checker.passValid(password)) {
                user.setPass(password);
            }
            if (!Checker.passValid(password)) {
                System.out.println(Color.RED_BOLD + "Your password:" +
                        "Letters Uppercase and Lowercase");
            }
        }
        while (!Checker.validNif(nif)) {
            System.out.print("NIF: ");
            nif = scanner.next();
            if (Checker.validNif(nif)) {
                user.setNif(nif);
            }
            if (!Checker.validNif(nif)) {
                System.out.println(Color.RED_BOLD + "NIF has to have 9 digits!");
            }
        }
        DataBase.users.add(user);
    }

    public void printUsers() {
        System.out.println("Name:" + " | " + "User: " + " | " + "Email: " + " | " + "Password: " + " | " + "NIF: ");
        for (Person users : DataBase.users) {
            System.out.println(users);
        }
    }
}
