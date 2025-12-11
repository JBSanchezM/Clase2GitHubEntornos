public class Coche {
    // Atributos

    public String color;
    public String marca;
    public String modelo;
    public int anyo;
    public double kilometraje;

    // Constructor
    public Coche() {
        System.out.println("Creando coche");
    }

    public Coche(String coloCoche, int anyoCoche, String marcaCoche, String modelocoche, double kilometrajeCoche) {
        color = coloCoche;
        anyo = anyoCoche;
        marca = marcaCoche;
        modelo = modelocoche;
        kilometraje = kilometrajeCoche;

        System.out.println("Creando coche " + marca + " " + modelo);
    }
}
