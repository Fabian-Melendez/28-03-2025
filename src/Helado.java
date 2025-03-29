abstract class Helado {

    protected String tam;
    protected double pre;

    public Helado(String tam, double pre) {
        this.tam = tam;
        this.pre = pre;
    }

    public abstract void prep();

    public void mostDet() {

        System.out.println("Tamaño: " + tam + ", Precio: " + pre);
    }
}
