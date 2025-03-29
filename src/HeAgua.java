class HeAgua extends Helado implements Sabor{

    protected String sab;

    public HeAgua(String tam, double pre) {
        super(tam, pre);
    }

    @Override
    public void agregarSabor(String sab) {
        this.sab = sab;
        System.out.println("Se ha agregado el sabor " + sab + " al helado de agua.");
    }

    public void prep() {
        System.out.println("Preparando helado de agua sabor " + sab);
    }
}