package strings;

public class IsEmail {
    public static void main(String[] args) {
        String email = ".com@";
        if (isEmail(email)) {
            System.out.println("e um email");
        } else {
            System.out.println("nao e um email");
        }
    }

    static boolean isEmail(String email) {
        boolean retorno = false;
        if (email.indexOf("@") != -1) {
            if (email.indexOf(".com") != -1) {
                return true;
            }
        }
        return retorno;
    }
}
