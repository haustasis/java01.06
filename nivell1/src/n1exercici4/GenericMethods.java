package n1exercici4;

public class GenericMethods {

    public static <T> String f(T[] llista) {
        return "La llista conté " + llista.length + " elements.";
    }

}
