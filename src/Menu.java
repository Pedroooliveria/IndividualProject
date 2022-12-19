import java.util.Scanner;

public class Menu {
    public static void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        AddProducts products = new AddProducts();
        PrintProductsUsers print = new PrintProductsUsers();

        System.out.println("""

                 █████╗ ██████╗ ███╗   ███╗ ██╗ ███╗  ██╗
                ██╔══██╗██╔══██╗████╗ ████║ ██║ ████╗ ██║
                ███████║██║  ██║██╔████╔██║ ██║ ██╔██╗██║
                ██╔══██║██║  ██║██║╚██╔╝██║ ██║ ██║╚████║
                ██║  ██║██████╔╝██║ ╚═╝ ██║ ██║ ██║ ╚███║
                ╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝ ╚═╝ ╚═╝  ╚══╝""");
        String choice = "";
        while (!choice.equals("4")) {
            System.out.println("Menu");
            System.out.println("1- Add products");
            System.out.println("2- Alter price");
            System.out.println("3- Manage clients");
            System.out.println("4- Logout");
            choice = scanner.next();

            switch (choice) {
                case "1" -> {
                    try{
                        AddProducts.addProducts();
                    }catch (Exception e){
                        System.out.println("Only accept numbers");
                    }
                }
                case "2" -> AddProducts.alterPrice();
                case "3" -> {
                    PrintProductsUsers.printUsers();
                    RegisteUser.remUser();
                }
                case "4" -> Login.LogOut();

            }

        }
    }

    public static void menuClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""

                 █████╗ ██╗     ██╗ ███████═╗███╗  ██╗████████╗
                ██╔══██╗██║     ██║ ██╔═════╝████╗ ██║╚══██╔══╝
                ██║  ╚═╝██║     ██║ █████╗   ██╔██╗██║   ██║
                ██║  ██╗██║     ██║ ██╔══╝   ██║╚████║   ██║
                ╚█████╔╝███████╗██║ ███████═╗██║ ╚███║   ██║
                 ╚════╝ ╚══════╝╚═╝╚══════╝ ╚═╝  ╚══╝   ╚═╝""");
        String choice = "";
        while (!choice.equals("3")) {
            System.out.println("Menu");
            System.out.println("1- Add balance");
            System.out.println("2- Products ");
            System.out.println("3- Logout");
            choice = scanner.next();

            switch (choice) {
                case "1":
                    Operation.addBalance();
                    break;
                case "2":
                    PrintProductsUsers.printProducts();
                    Operation.buyProduct();

                    break;
                case "3":
                    Login.LogOut();

                    break;
            }


        }
    }

    public static void menuLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "██╗      █████╗  ██████╗ ██╗ ███╗  ██╗    ██╗██████╗ ███████╗ ██████╗ ██╗  ██████╗████████╗███████╗██████╗ \n" +
                "██║     ██╔══██╗██╔════╝ ██║ ████╗ ██║   ██╔╝██╔══██╗██╔════╝██╔════╝ ██║ ██╔════╝╚══██╔══╝██╔════╝██╔══██╗\n" +
                "██║     ██║  ██║██║  ██╗ ██║ ██╔██╗██║  ██╔╝ ██████╔╝█████╗  ██║  ██╗ ██║ ╚█████╗    ██║   █████╗  ██████╔╝\n" +
                "██║     ██║  ██║██║  ╚██╗██║ ██║╚████║ ██╔╝  ██╔══██╗██╔══╝  ██║  ╚██╗██║  ╚═══██╗   ██║   ██╔══╝  ██╔══██╗\n" +
                "███████╗╚█████╔╝╚██████╔╝██║ ██║ ╚███║██╔╝   ██║  ██║███████╗╚██████╔╝██║ ██████╔╝   ██║   ███████╗██║  ██║\n" +
                "╚══════╝ ╚════╝  ╚═════╝ ╚═╝╚═╝  ╚══╝╚═╝    ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝╚═══════╝    ╚═╝   ╚══════╝╚═╝  ╚═╝");
        String choice = "";
        while (!choice.equals("3")) {
            System.out.println("Menu");
            System.out.println("1-Login ");
            System.out.println("2-Register ");
            choice = scanner.next();

            switch (choice) {
                case "1" -> Login.loginProcedure();
                case "2" -> RegisteUser.addUsers();
            }


        }
    }

}





