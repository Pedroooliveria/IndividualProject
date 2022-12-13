import java.util.ArrayList;

public class DataBase {
    static ArrayList<Person> users = new ArrayList<>();
    static ArrayList<Products> product = new ArrayList<>();

    public static boolean checkLogin(String nameUser, String password) {

        users.stream().map(e -> {
            if (e.getUser().equals(nameUser) && e.getPass().equals(password)) ;
            return e;
        });
        return false;
    }
}

