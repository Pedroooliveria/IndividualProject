import java.util.Scanner;

public class Login {
    private static Person currentUser = DataBase.getActualUser();


    public static boolean loginProcedure() {
        Scanner scanner = new Scanner(System.in);
        Person person = null;
        System.out.println("Login: ");
        System.out.println("Username: ");
        person = checkLogin(scanner.next());
        if (person == null) {
            return false;

        }
        if (person.login()) {
            currentUser = person;
            MenuClient.menu();
            return true;
        } else {
            System.out.println(Color.RED_BOLD + "Your username or password " + "\033[39m" + "\033[49m");
            return false;

        }
    }

    public static Person checkLogin(String userName) {
        for (int i = 0; i < DataBase.users.size(); i++) {
            if (userName.equals(DataBase.users.get(i).getUser())) {
                return DataBase.users.get(i);
            }
        }
        System.out.println(Color.RED_BOLD + "User not found" + "\033[39m" + "\033[49m");
        return null;
    }
}
