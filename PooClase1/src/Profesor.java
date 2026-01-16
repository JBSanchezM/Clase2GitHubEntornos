public class Profesor {
    
    public String dni;
    public String nombre;
    //public String apellido;
    //public int edad;
    //public String cargo;
    public double salario;

    public Profesor(String dniProfe, String nombreProfe, double salarioProfe){
        dni = dniProfe;
        nombre = nombreProfe;
        salario = salarioProfe;
    }

    
    public String toString() {
     
        return "El profesor " + nombre + ", tiene DNI " + dni + " y cobra " + salario;
     
    }

}
