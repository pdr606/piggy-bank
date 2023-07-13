/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cofrinho;

/**
 *
 * @author tutor
 */
public class Dolar extends Moeda {

    double valor;
    int cotacao = 5;
        
    public Dolar(double v) {
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
        System.out.println("Dolar: R$" + valorFormatado);
        return;
        
    }
    
    @Override
    public double converter(){
        return getValor() * cotacao;
        
    }
    
   
    
    
    
}
