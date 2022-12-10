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

    public static boolean checkUser(String User) {
        return true;
    }

}
