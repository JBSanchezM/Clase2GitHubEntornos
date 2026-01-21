public class CuentaBancaria {
    
    private double balance;

 public CuentaBancaria(){
        balance = 500;
    }

public CuentaBancaria(double saldoInicial){

    balance = saldoInicial;

}

public double getBalance(){
    return balance;
}

public void setBalance(double nuevoB){

    balance = nuevoB;
}

/*public double setBalance(){

    return this.balance;
}*/

}
