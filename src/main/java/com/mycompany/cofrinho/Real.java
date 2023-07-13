
package com.mycompany.cofrinho;


public class Real extends Moeda {
    
    double valor;
    
    public Real(double v){
        setValor(getValor() + v);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    @Override
    public void info(){
        String valorFormatado = String.format("%.2f", getValor());
        System.out.println("Real: R$" + valorFormatado);
        return;
        
    }
    
    @Override
    public double converter(){
        return this.getValor();
        
        
    }

    @Override
    public String toString() {
        return "Real:" + valor;
    }
    
    
    
}
