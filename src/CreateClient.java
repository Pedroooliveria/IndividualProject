public class CreateClient {
    String name;
    String user;
    String email;
    String pass;
    int nif;

    public CreateClient() {
    }

    public CreateClient(String name, String user, String email, String pass, int nif) {
        this.name = name;
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.nif = nif;
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

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String toString() {
        return getName() + " " + getUser() + " " + getEmail() + " " + getNif() + " " + getPass();
    }
}
