public class Main {
    public static void main(String[] args) {

        HeAgua ha1 = new HeAgua("mediano", 3000);

        ha1.agregarSabor("Cereza");
        ha1.prep();
        ha1.mostDet();

        HeCrema hc1 = new HeCrema("grande", 4000);

        hc1.agregarSabor("Chocolate");
        hc1.prep();
        hc1.mostDet();


    }
}