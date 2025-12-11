public class App {
    public static void main(String[] args) throws Exception {
        
        Coche audi = new Coche();
        audi.color = "Gris";
        audi.anyo = 2007;
        audi.marca = "Audi";
        audi.modelo = "A8";
        
        Coche toyota = new Coche();
        toyota.color = "Gris";
        toyota.anyo = 2007;
        toyota.marca = "Audi";
        toyota.modelo = "A8";

        Coche bmw = new Coche("Rojo", 2000, "BMW", "MS", 100.0, 4);

        
    }
}
