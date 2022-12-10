public class Main {
    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();
        Login loginClient=new Login();
        MenuAdmin.Menu();
        createUser.addUsers();
        createUser.printUsers();
        System.out.println("lOGIN");
        loginClient.login();
    }
}