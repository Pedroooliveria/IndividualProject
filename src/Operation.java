import java.util.Scanner;

public class Operation {
    private static Products currentProduct = DataBase.getCurrentProduct();
    private static Person currentUser = DataBase.getCurrentUser();



    public static void addBalance() {
        Scanner scanner = new Scanner(System.in);
        Person person = DataBase.getCurrentUser();

        System.out.print("Add balance: ");
        currentUser.setBalance(currentUser.getBalance() + scanner.nextInt());
        PrintProductsUsers.printUsers();
        PrintProductsUsers.printProducts();
    }


    public static void buyProduct() {
        Scanner scanner = new Scanner(System.in);
        Products products = null;
        System.out.println("Product: ");
        products = Checker.checkProducts(scanner.next());
        if (products == null) {
            return;
        }
        if (products.stock()) {
            currentProduct = products;
            checkOut(products.getPrice());
            System.out.print ("TOTAL: ");
            System.out.println(products.getPrice() + "€");

        }
    }

    public static void checkOut(double sum) {

        double currentBalance = currentUser.getBalance() - sum;

        if (currentBalance > 0) {
            currentUser.setBalance(currentUser.getBalance() - sum);

            return;
        }
        if (currentBalance <= -1) {
            System.out.println("Your balance isn´t enough for this product");
        }

    }
}
