package n1exercici1;

public class NoGenericMethods {

    public NoGenericMethods(int z) {
        datosElemento = new Object[z];
    }

    public Object get(int i) {
        return datosElemento[i];
    }

    public void add(Object o) {
        datosElemento[i]=o;
        i++;
    }

    private Object[] datosElemento;
    private int i=0;
}
