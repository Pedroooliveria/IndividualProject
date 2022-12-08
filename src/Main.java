public class Main {
    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();
        LoginClient loginClient=new LoginClient();
        createUser.addUsers();
        createUser.printUsers();
        loginClient.login();
    }
}