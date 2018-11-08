package model;

public abstract class Conta {
    private int nro;
    private double saldo;
    private static double juros;

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getJuros() {
        return juros;
    }

    public static void setJuros(double juros) {
        Conta.juros = juros;
    }
    
    public abstract void saque(double valor);
    
    @Override
    public  String toString(){
        return "numero: " + getNro() + " Saldo: " +getSaldo()+ " juros: " + getJuros();
    }
    
}
