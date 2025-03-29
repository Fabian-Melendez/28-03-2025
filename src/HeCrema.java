public class HeCrema extends Helado implements Sabor {
    private String sab;

    public HeCrema(String tam, double pre) {
        super(tam, pre);
    }

    @Override
    public void agregarSabor(String sab) {
        this.sab = sab;
        System.out.println("Se ha agregado el sabor " + sab + " al helado de crema.");
    }

    @Override
    public void prep() {
        System.out.println("Preparando helado de crema sabor " + sab);
    }
}
