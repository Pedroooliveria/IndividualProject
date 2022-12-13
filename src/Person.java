import java.util.ArrayList;

public class Person {
    private static String name;
    private static String user;
    private static String email;
    private static String pass;
    private static String nif;
    private static int balance;

    public Person() {
    }


    public Person(String name, String user, String email, String pass, String nif, int balance) {
        Person.name = name;
        Person.user = user;
        Person.email = email;
        Person.pass = pass;
        Person.nif = nif;
        Person.balance=balance;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Person.user = user;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Person.email = email;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        Person.pass = pass;
    }

    public static String getNif() {
        return nif;
    }

    public static void setNif(String nif) {
        Person.nif = nif;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        Person.balance = balance;
    }

    public String toString() {
        return getName() + " " + getUser() + " " + getEmail() + " " + getPass() + " " + getNif() + " " + getBalance();
    }
}
