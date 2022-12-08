import java.util.ArrayList;
import java.util.Scanner;

public class CreateUser {

    static ArrayList<CreateClient> users = new ArrayList<>();

    public void addUsers() {
        Scanner scanner = new Scanner(System.in);
        CreateClient user = new CreateClient();
        System.out.print("Name: ");
        user.setName(scanner.next());
        System.out.print("User: ");
        user.setUser(scanner.next());
        System.out.print("Email: ");
        user.setEmail(scanner.next());
        System.out.print("Password: ");
        user.setPass(scanner.next());
        System.out.print("NIF: ");
        user.setNif(scanner.nextInt());
       /* if (user.nif == 9) {
            users.add(user);
        } else {
            System.out.println("The nif must have 9 digits");
        }*/
        users.add(user);
    }

    public void printUsers() {
        System.out.println("Name:" + " | " + "User: " + " | " + "Email: " + " | " + "Wage: " + " | " + "NIF: ");
        for (CreateClient users : users) {
            System.out.println(users);
        }
    }
}
