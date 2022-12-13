import java.util.Scanner;

public class Login {
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        String nameUser = "";
        String password = "";
        int count = 0;


        while (!DataBase.checkLogin(nameUser, password) && count < 3) {
            System.out.print("User name: ");
            nameUser = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (DataBase.checkLogin(nameUser, password)) {
                System.out.println("Hello");
            }
            if (!DataBase.checkLogin(nameUser, password)) {
                System.out.println(Color.RED_BOLD + "Your user Name or password its wrong." + "\033[39m" + "\033[49m");
                count++;
            }
        }
    }
}
