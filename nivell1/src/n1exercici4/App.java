package n1exercici4;

public class App {
    public static void main(String[] args) {
        String[] llista1 = {"Jordi", "Ana"};
        Integer[] llista2 = {1, 2, 3};
        Boolean[] llista3 = {true, true, false, false};

        // Strings
        System.out.println(GenericMethods.f(llista1));
        System.out.println("-----------");
        // Integers
        System.out.println(GenericMethods.f(llista2));
        System.out.println("-----------");
        // Booleans
        System.out.println(GenericMethods.f(llista3));

    }

}
