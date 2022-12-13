public class Main {
    public static void main(String[] args) {

        Login loginClient = new Login();
        RegisteUser.addUsers();
        MenuAdmin.menu();
        System.out.println("Login");
      Login.login();
    }
}