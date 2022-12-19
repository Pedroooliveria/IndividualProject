import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {

    private static final String password =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(password);

    private static String nif = "\\d.{8}";
    private static final Pattern pattern1 = Pattern.compile(nif);

    private static String email = "^(.+)@(.+)$";
    private static final Pattern pattern2 = Pattern.compile(email);


    public static boolean passValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean validNif(final String nif) {
        Matcher matcher = pattern1.matcher(nif);
        return matcher.matches();
    }

    public static boolean validEmail(final String email) {
        Matcher matcher = pattern2.matcher(email);
        return matcher.matches();
    }


    public static int check(int nrSerie) {
        for (int i = 0; i < DataBase.product.size(); i++) {
            if (nrSerie == DataBase.product.get(i).getNrSerie()) {
                return i;
            }

        }
        return 0;
    }

    public static Products checkProducts(String userName) {
        for (int i = 0; i < DataBase.product.size(); i++) {
            if (userName.equals(DataBase.product.get(i).getNameProduct())) {
                return DataBase.product.get(i);
            }
        }
        System.out.println(Color.RED_BOLD + "Don´t exist this product" + "\033[39m" + "\033[49m");
        return null;
    }
    public static boolean checkNrSerie(Products nrSerie) {
        for (Products eachNrSerie : DataBase.product) {
            if (Objects.equals(eachNrSerie.getNrSerie(), nrSerie.getNrSerie())) {
                return true;
            }
        }
        return false;
    }
   public static boolean checkUser(Person user) {
        for (Person eachUser : DataBase.users) {
            if (Objects.equals(eachUser.getUser(), user.getUser())) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkNif(Person nif) {
        for (Person eachNif : DataBase.users) {
            if (Objects.equals(eachNif.getNif(), nif.getNif())) {
                return true;
            }
        }
        return false;
    }

}
