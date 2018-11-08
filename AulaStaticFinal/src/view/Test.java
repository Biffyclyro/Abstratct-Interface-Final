package view;

import model.Conta;
import model.ContaCorrente;

public class Test {
    public static void main(String args[]){
        Conta.setJuros(0.3);
        ContaCorrente cc = new ContaCorrente();
        cc.setNro(321);
        cc.setSaldo(2500.00);
        cc.saque(100);
        imprimir(cc);
        
        
        
    }
    
    public static void imprimir(Conta c){
        System.out.println("Conta: "+ c);
        c.saque(500);
        System.out.println("Novo saldo: "+ c.getSaldo());
    }
    
    
}
