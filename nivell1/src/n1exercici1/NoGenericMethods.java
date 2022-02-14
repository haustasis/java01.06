package n1exercici1;

public class NoGenericMethods<T> {

    private T primer;
    private T segon;
    private T tercer;

    public NoGenericMethods(T primer, T segon, T tercer) {
        this.primer = primer;
        this.segon = segon;
        this.tercer = tercer;
    }

    public T getPrimer() {
        return primer;
    }

    public void setPrimer(T primer) {
        this.primer = primer;
    }

    public T getSegon() {
        return segon;
    }

    public void setSegon(T segon) {
        this.segon = segon;
    }

    public T getTercer() {
        return tercer;
    }

    public void setTercer(T tercer) {
        this.tercer = tercer;
    }
}
