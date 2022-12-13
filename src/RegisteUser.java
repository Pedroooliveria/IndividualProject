import java.util.Scanner;

public class RegisteUser {

    public static void addUsers() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        String password = "";
        String nif = "";
        String email = "";
        System.out.print("Name: ");
        Person.setName(scanner.next());
        System.out.print("User: ");
        Person.setUser(scanner.next());

        while (!Checker.validEmail(email)) {
            System.out.print("Email: ");
            email = scanner.next();
            if (Checker.validEmail(email)) {
                Person.setEmail(email);
            }
            if (!Checker.validEmail(email)) {
                System.out.println(Color.RED_BOLD + "Your password:" +
                        "Letters Uppercase and Lowercase" + "\033[39m" + "\033[49m");
            }
        }
        while (!Checker.passValid(password)) {
            System.out.print("Password: ");
            password = scanner.next();
            if (Checker.passValid(password)) {
                Person.setPass(password);
            }
            if (!Checker.passValid(password)) {
                System.out.println(Color.RED_BOLD + "Your password:" +
                        "Letters Uppercase and Lowercase" + "\033[39m" + "\033[49m");
            }
        }
        while (!Checker.validNif(nif)) {
            System.out.print("NIF: ");
            nif = scanner.next();
            if (Checker.validNif(nif)) {
                Person.setNif(nif);
            }
            if (!Checker.validNif(nif)) {
                System.out.println(Color.RED_BOLD + "NIF has to have 9 digits!" + "\033[39m" + "\033[49m");
            }
        }

        DataBase.users.add(person);
    }


}
