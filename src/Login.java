import java.util.Scanner;

public class Login {


    public static void loginProcedure() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Person person = null;

        while (count < 3) {
            System.out.println("Username: ");
            person = checkLogin(scanner.next());
            if (person == null) {
                return;
            }
            if (person == checkLogin("admin")) {
                if (person.login()) {
                    DataBase.setCurrentUser(person);
                    Menu.menuAdmin();
                    return;
                }
            }

            if (person.login()) {
                DataBase.setCurrentUser(person);
                Menu.menuClient();
                return;
            } else {
                System.out.println(Color.RED_BOLD + "Your username or password " + "\033[39m" + "\033[49m");
                count++;
            }
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


    public static void LogOut() {
        String logOut = "3";
        if (DataBase.getCurrentUser().equals(logOut)) {
            DataBase.setCurrentUser(null);
        }
    }


}
