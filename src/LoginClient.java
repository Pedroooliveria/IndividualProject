import java.util.Scanner;

public class LoginClient {
    CreateClient clients = new CreateClient();

    public void login() {
        Scanner scanner = new Scanner(System.in);
        String nameUser;
        String password;
        int count = 0;
        System.out.print("User name: ");
        nameUser = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        while(count<3){
        if (clients.getUser().equals(nameUser) && clients.getPass().equals(password)) {
            System.out.println("Method");
        } else {
            System.out.println(Color.RED_BOLD + "Your user Name or password its wrong.");
            count++;
        }
        }
    }
}
