import java.util.ArrayList;

public class Person {
    private String name;
    private String user;
    private String email;
    private String pass;
    private String nif;
    private int balance;

    public Person() {
    }


    public Person(String name, String user, String email, String pass, String nif, int balance) {
        this.name = name;
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.nif = nif;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return getName() + " " + getUser() + " " + getEmail() + " " + getPass() + " " + getNif();
    }
}
