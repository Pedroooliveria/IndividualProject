import java.util.Scanner;

public class MenuAdmin {
    public static void menu() {
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
        while (!choice.equals("5")) {
            System.out.println("Menu");
            System.out.println("1- Add products");
            System.out.println("2- Alter price");
            System.out.println("3- Manage clients");
            System.out.println("4- Logout");
            choice = scanner.next();

            switch (choice) {
                case "1" -> AddProducts.addProducts();
                case "2" -> AddProducts.alterPrice();
                case "3" -> PrintProductsUsers.printUsers();
                case "4" -> System.out.println();
                case "5" -> MenuClient.menu();

            }

        }
    }


}
