package model;

public class ContaCorrente extends Conta {
    @Override
    public void saque(double valor){
        if(valor < getSaldo()){
            double saldoSaque = getSaldo() - valor;
            setSaldo(saldoSaque - 1.20);
        }
    }
        
}
