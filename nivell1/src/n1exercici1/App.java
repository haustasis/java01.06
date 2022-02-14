package n1exercici1;

public class App {

    public static void main(String[] args) {

        NoGenericMethods<Integer> mostra0 = new NoGenericMethods<>(1, 2, 3);
        // Els arguments es poden posar en qualsevol posició al constructor perquè son del mateix tipus

        // Valors inicialitzats al constructor
        System.out.println(mostra0.getPrimer());
        System.out.println(mostra0.getSegon());
        System.out.println(mostra0.getTercer());
        System.out.println("----------");

        // Emmagatzemat nou valor amb setters
        mostra0.setPrimer(11);
        mostra0.setSegon(22);
        mostra0.setTercer(33);

        // Extreure amb getters
        System.out.println(mostra0.getPrimer());
        System.out.println(mostra0.getSegon());
        System.out.println(mostra0.getTercer());
        System.out.println("----------");

        NoGenericMethods<String> mostra1 = new NoGenericMethods<>("primer", "segon", "tercer");
        // Els arguments es poden posar en qualsevol posició al constructor perquè son del mateix tipus

        // Valors inicialitzats al constructor
        System.out.println(mostra1.getPrimer());
        System.out.println(mostra1.getSegon());
        System.out.println(mostra1.getTercer());
        System.out.println("----------");

        // Emmagatzemat nou valor amb setters
        mostra1.setPrimer("onze");
        mostra1.setSegon("dotze");
        mostra1.setTercer("tretze");

        // Extreure amb getters
        System.out.println(mostra1.getPrimer());
        System.out.println(mostra1.getSegon());
        System.out.println(mostra1.getTercer());

    }
}
