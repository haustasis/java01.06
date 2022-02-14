package n1exercici2;

public class GenericMethods {

    public static <T> String f(T first, T second, T third) {
        return "Primer parametre: " + first + "\nSegon parametre: " + second + "\nTercer parametre: " + third;
    }

}
