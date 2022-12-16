import java.util.Scanner;

public class AddProducts {

    public static void addProducts() {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();
        System.out.print("Nr Serie: ");
        products.setNrSerie(scanner.nextInt());
        System.out.print("Name: ");
        products.setNameProduct(scanner.next());
        System.out.print("Stock: ");
        products.setStock(scanner.nextInt());
        System.out.print("Price: ");
        products.setPrice(scanner.nextDouble());
        DataBase.product.add(products);
    }

    public static void alterPrice() {
        Scanner scanner = new Scanner(System.in);
        int index;
        int nrSerie;
        Products products = new Products();
        System.out.print("Serial number: ");
        nrSerie = scanner.nextInt();
        index = Checker.check(nrSerie);
        System.out.print("Value: ");
        products.setPrice(scanner.nextDouble());

    }
}
