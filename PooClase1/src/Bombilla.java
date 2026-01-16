public class Bombilla {
    
public String tipo;
public int potencia;
public boolean encendida;

public Bombilla (String t, int pot, boolean enc){
    tipo = t;
    potencia = pot;
    encendida = enc;
}



public boolean estaEncendida (boolean encendida){
    encendida = true;
    return encendida;
}

public boolean interruptor (boolean interruptor){

    if (interruptor == true) {
        encendida = false;

    }else{
        encendida = true;
    } return encendida;
}

}

