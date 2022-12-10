import java.util.Scanner;

public class Login {
    Person person = new Person();


    public void login() {
        Scanner scanner = new Scanner(System.in);
        String nameUser = "";
        String password = "";
        int count = 0;

        while (!DataBase.checkLogin(nameUser, password) && count < 3) {
            System.out.print("User name: ");
            nameUser = scanner.next();
            System.out.print("Password: ");
            password = scanner.next();
            if (DataBase.checkLogin(nameUser, password)) {
                System.out.println("Hello");
            } if(!DataBase.checkLogin(nameUser, password)){
                System.out.println(Color.RED_BOLD + "Your user Name or password its wrong." + "\033[39m" + "\033[49m");
                count++;
            }
        }
    }
}
