package n1exercici3;

public class App {

    public static void main(String[] args) {

        System.out.println(GenericMethods.f("uno", "dos", true));
        System.out.println("---------------");
        System.out.println(GenericMethods.f(1, 2, "treintaytres"));
        System.out.println("---------------");
        System.out.println(GenericMethods.f(true, false, "cuarentaytres"));

    }
}

