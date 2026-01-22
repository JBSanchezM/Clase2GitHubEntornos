public class Cancion {

    private int id;
    private String nombre;
    private double duracion;
    private String fechaDePublicacion;
    private int numeroDeRepeticiones;
    private String foto;

    public Cancion() {
    }

    public Cancion(int identificador, String nombreCancion, double duracionCancion, String fechaDePublicacionCancion,
            int numeroDeRepeticionesCancion, String fotoCancion) {

        id = identificador;
        nombre = nombreCancion;
        duracion = duracionCancion;
        fechaDePublicacion = fechaDePublicacionCancion;
        numeroDeRepeticiones = numeroDeRepeticionesCancion;
        foto = fotoCancion;

    }

    public int getId() {
        return id;
    }

    public void setId(int identificador) {

        id = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCancion) {

        nombre = nombreCancion;
    }

    public double getduracion() {
        return duracion;
    }

    public void setDuracion(double duracionCancion) {

        duracion = duracionCancion;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacionCancion) {

        fechaDePublicacion = fechaDePublicacionCancion;
    }

    public int getNumeroDeRepeticiones() {
        return numeroDeRepeticiones;
    }

    public void setNumeroDeRepeticiones(int numeroDeRepeticionesCancion) {

        numeroDeRepeticiones = numeroDeRepeticionesCancion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String fotoCancion) {

        foto = fotoCancion;
    }

    public String toString() {

        return "Datos" 
        +"/n ID: "+ id 
        +"/n Nombre: "+nombre
        +"/n Duracion: "+duracion+ " minutos"
        +"/n Publicada el:"+fechaDePublicacion
        +"/n Numero de Reproducciones: "+numeroDeRepeticiones
        +"/n Foto: "+foto;
    }

}
