import java.util.ArrayList;

public class Calculadora {

    public int restar(int n1, int n2) {

        return n1 - n2;
    }

    public void binevenida(String usuario) {
        System.out.println("Hola " + usuario);

    }

    public int elevado(int n1) {
        return n1 * n1;
    }

    public double media(ArrayList<Double> notas) {
        double notaMedia = 4.86;
        return notaMedia;

    }

    public boolean aprobado(double nota) {
        if (nota >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public double volumenEsfera(double r) {
        double resultado = (4.0 / 3.0) * 3.1416 * (r * r * r);
        return resultado;
    }
}