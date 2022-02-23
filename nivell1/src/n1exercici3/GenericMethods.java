package n1exercici3;

public class GenericMethods {

    public static <T> String f(T first, T second, Character third) {
        return "Primer element: " + first + "\nSegon element: " + second + "\nTercer element: " + third;
    }


}
