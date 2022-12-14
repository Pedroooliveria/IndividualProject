import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    static ArrayList<Person> users = new ArrayList<>();
    static ArrayList<Products> product = new ArrayList<>();

    private static Person currentUser;

    public static Person getActualUser() {
        return currentUser;
    }

}