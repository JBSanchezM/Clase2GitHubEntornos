public class Coche {
    // Atributos

    public String color;
    public String marca;
    public String modelo;
    public int anyo;
    public double kilometraje;
    public int puertas;

    // Constructor
    public Coche() {
        System.out.println("Creando coche");
    }

    public Coche(String coloCoche, int anyoCoche, String marcaCoche, String modelocoche, double kilometrajeCoche, int puertasCoche) {
        color = coloCoche;
        anyo = anyoCoche;
        marca = marcaCoche;
        modelo = modelocoche;
        kilometraje = kilometrajeCoche;
        puertas = puertasCoche;

        System.out.println("Creando coche " + marca + " " + modelo);
    }

    public Coche (int anyoCoche, String marcaCoche, String modeloCoche, double kilometrajeCoche){
        anyo = anyoCoche;
        marca = marcaCoche;
        modelo = modeloCoche;
        kilometraje = kilometrajeCoche;

        
    System.out.println("El coche "+ marca +" de "+ modelo +" con "+ kilometraje +" KM" + " es del año "+ anyo);
    }


}
