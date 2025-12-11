public class Coche {
    // Atributos

    public String color;
    public String marca;
    public String modelo;
    public int anyo;

    // Constructor
    public Coche() {
        System.out.println("Creando coche");
    }

    public Coche(String coloCoche, int anyoCoche, String marcaCoche, String modelocoche) {
        color = coloCoche;
        anyo = anyoCoche;
        marca = marcaCoche;
        modelo = modelocoche;

        System.out.println("Creando coche " + marca + " " + modelo);
    }
}
