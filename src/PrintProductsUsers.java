public class PrintProductsUsers {

    public static void printUsers() {
        System.out.println("Name:" + " | " + "User: " + " | " + "Email: " + " | " + "Password: " + " | " + "NIF: " + " | " + "Balance: ");
        for (Person users : DataBase.users) {
            System.out.println(users);
        }
    }
    public static void printProducts() {
        System.out.println("NrSerie: " + "Product:" + " | " + "Stock: " + " | " + "Price: ");
        for (Products products : DataBase.product) {
            System.out.println(products);
        }
    }
}
