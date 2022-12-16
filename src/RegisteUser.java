import java.util.Scanner;

public class RegisteUser {

    public static void addUsers() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        String password = "";
        String nif = "";
        String email = "";
        System.out.print("Name: ");
        person.setName(scanner.next());
        System.out.print("User: ");
        person.setUser(scanner.next());

        while (!Checker.validEmail(email)) {
            System.out.print("Email: ");
            email = scanner.next();
            if (Checker.validEmail(email)) {
                person.setEmail(email);
            }
            if (!Checker.validEmail(email)) {
                System.out.println(Color.RED_BOLD + "You need put @ and ." + "\033[39m" + "\033[49m");
            }
        }
        while (!Checker.passValid(password)) {
            System.out.print("Password: ");
            password = scanner.next();

            if (Checker.passValid(password)) {
                person.setPass(password);
            }
            if (!Checker.passValid(password)) {
                System.out.println(Color.RED_BOLD + "Your password:" +
                        "Letters Uppercase and Lowercase" +
                        "Special charters" +
                        "Numbers" + "\033[39m" + "\033[49m");
            }
        }
        while (!Checker.validNif(nif)) {
                System.out.print("NIF: ");
                nif = scanner.next();
                if (Checker.validNif(nif)) {
                    person.setNif(nif);
                }
                if (!Checker.validNif(nif)) {
                    System.out.println(Color.RED_BOLD + "NIF has to have 9 digits!" + "\033[39m" + "\033[49m");
                }


        }
        if (DataBase.users.add(person)) {
            Menu.menuLogin();
        }

        System.out.println(DataBase.users);
    }


}
