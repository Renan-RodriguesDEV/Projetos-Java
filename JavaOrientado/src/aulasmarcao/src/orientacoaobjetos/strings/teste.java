package strings;

public class teste {
    public static void main(String[] args) {
        String pvl = "Oi";
        pvl = pvl.toLowerCase();
        int x = pvl.indexOf("O");
        System.out.println(pvl.indexOf("o"));
        if (x != -1) {
            System.out.println("oi");
        }
    }
}