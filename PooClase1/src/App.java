public class App {
    public static void main(String[] args) throws Exception {
        
        Coche c1 = new Coche();
        c1.color = "Gris";
        c1.anyo = 2007;
        c1.marca = "Audi";
        c1.modelo = "A8";
        
        Coche toyota = new Coche();
        toyota.color = "Gris";
        toyota.anyo = 2007;
        toyota.marca = "Audi";
        toyota.modelo = "A8";

        Coche bmw = new Coche("Rojo", 2000, "BMW", "MS", 100.0, 4);
        Coche mercedes = new Coche(2000, "Mercedes", "Clase E", 50000);

        
        
    }
}
