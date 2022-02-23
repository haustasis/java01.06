package n1exercici4;

public class GenericMethods {

    public static <T> void f(T... t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print("\n[+] Param: " + i + " - Classe: " + (t[i].getClass().getName()));
        }
    }

}
