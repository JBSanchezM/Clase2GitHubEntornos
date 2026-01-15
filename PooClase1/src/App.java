public class App {
    public static void main(String[] args) throws Exception {

        Coche c1 = new Coche();
        c1.color = "Azul";
        c1.anyo = 2007;
        c1.marca = "Audi";
        c1.modelo = "A9";

        Coche toyota = new Coche();
        toyota.color = "Gris";
        toyota.anyo = 2007;
        toyota.marca = "Audi";
        toyota.modelo = "A8";

        System.out.println("El año del toyota es: " + toyota.anyo);
        toyota.anyo = 2015;
        System.out.println("El año del toyota es: " + toyota.anyo);

        Coche bmw = new Coche("Rojo", 2000, "BMW", "MS", 100.0, 4);
        Coche mercedes = new Coche(2000, "Mercedes", "Clase E", 50000);
        System.out.println("El coche " + toyota.marca + " de " + toyota.modelo + " con " + toyota.kilometraje + " KM"
                + " es del año " + toyota.anyo);

        Profesor pablo = new Profesor("z845d", "pablo Gonzalez", 1300);
        Asignatura sistemas = new Asignatura("Sistemas Informaticos", pablo);
        System.out.println("Llamando el metodo sistemas: " + pablo.dni);
        System.out.println("El salario del profe de sistemas es: " + sistemas.docente.salario);

        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Saldo inicial de la cuenta 1 es: " + cuenta1.balance);

        CuentaBancaria cuenta2 = new CuentaBancaria(2500);
        System.out.println("Saldo de la cuenta 2 es: " + cuenta2.balance);

        Calculadora calc = new Calculadora();
        int resultado = calc.restar(80, 7);
        resultado *= 2;
        System.out.println(resultado);

        calc.binevenida("Cuau");
        calc.binevenida("Marina");

        int resultado2 = calc.elevado(5);
        System.out.println("El resultado es: " + resultado2);

        boolean aprobadoNota = calc.aprobado(4.4);
        System.out.println(aprobadoNota);

        double resultado3 = calc.volumenEsfera(5);
        System.out.println("El volumen es: " + resultado3);


        Bombilla bomb = new Bombilla( "LED", 200, false);
        Bombilla bomb2 = new Bombilla("null", 150);

        bomb2.potencia -=50;
        System.out.println("La potencia de la 1 es: " +bomb.potencia);

        System.out.println("Esta encendida la 2 " +bomb2.encendida);
        bomb2.interruptor(true);
        System.out.println("Esta encendida la 2"+ bomb2.encendida);

        boolean resultado4 = bomb.estaEncendida(true);

        System.out.println("La bombilla esta: "+resultado4);

        resultado4 = bomb.interruptor(true);
        System.out.println("Se ha pulsado el interruptor:" + resultado4);
        
       
    }

}
