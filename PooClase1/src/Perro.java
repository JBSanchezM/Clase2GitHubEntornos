public class Perro {

    public String raza;
    public String sonido;

    public Perro(String r, String s) {
        raza = r;
        sonido = s;
    }

    public void ladrar() {
        System.out.println("El perro hace " + sonido);
        
    }

}