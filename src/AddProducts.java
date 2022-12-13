import java.util.Objects;
import java.util.Scanner;

public class AddProducts {
    public static void addProducts() {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        System.out.print("Nr Serie: ");
        Products.setNrSerie(scanner.nextInt());
        System.out.print("Add product: ");
        Products.setNameProduct(scanner.next());
        System.out.print("Stock: ");
        Products.setStock(scanner.nextInt());
        System.out.print("Price: ");
        Products.setPrice(scanner.nextDouble());
        DataBase.product.add(products);
    }

    public static void alterPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write player number: ");
        int nrSerie = scanner.nextInt();
        int index = Checker.check(nrSerie);
        System.out.print("Goals:");
        Products.setPrice(scanner.nextDouble());

    }
}
