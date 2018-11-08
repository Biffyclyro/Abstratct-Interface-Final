package model;

public class ContaPoupanca extends Conta {
    public void saque(double valor){
        if(valor < getSaldo()){
            double saldoSaque = getSaldo() - valor;
            setSaldo(saldoSaque - 0.20);
        }
    }
    
}
