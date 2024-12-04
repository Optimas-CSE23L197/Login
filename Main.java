package Login;

public class Main {
    public static void main(String[] args) {

        IdPassword idPassword = new IdPassword();
        idPassword.getLogininfo();

        Login login = new Login(idPassword.getLogininfo());
    }
}
