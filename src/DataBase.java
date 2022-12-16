import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    static ArrayList<Person> users = new ArrayList<>();
    static ArrayList<Products> product = new ArrayList<>();

    private static Person currentUser;
    private static Products currentProduct;


    public static void setCurrentUser(Person currentUser) {
        DataBase.currentUser = currentUser;
    }

    public static void setCurrentProduct(Products currentProduct) {
        DataBase.currentProduct = currentProduct;
    }

    public static Person getCurrentUser() {
        return currentUser;
    }

    public static Products getCurrentProduct() {
        return currentProduct;
    }
}