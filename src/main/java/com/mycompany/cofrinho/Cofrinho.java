
package com.mycompany.cofrinho;
import java.util.Scanner;
import java.util.ArrayList;

public class Cofrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Moeda> lista = new ArrayList<>();
        
        
        while (true){
            System.out.println("COFRINHO: ");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Encerrar");
            
            System.out.println("Escolha sua opção: ");
            int op = scanner.nextInt();
            if(op < 0 || op > 5 ){
                System.out.println("Opção inválida");
                continue;
            }
            
            switch(op){
                case 0:{
                    System.out.println("Encerrando o programa...");
                    return;
                }
                case 1: {
                    System.out.println("Escolha a Moefa: ");
                    System.out.println("1 - Real: ");
                    System.out.println("2 - Dolar: ");
                    System.out.println("3 - Euro: ");
                    int op2 = scanner.nextInt();
                    
                    if(op2 < 1 || op2 > 3){
                        System.out.println("Opção inválida");
                        continue;
                           
                    }
                    
                    System.out.println("Valor: ");
                    float v = scanner.nextFloat();
                    
                    switch(op2){
                        case 1: {
                                                        
                            boolean encontrado = false;
                            
                            for (Moeda moeda : lista){
                                if(moeda.getClass().equals(Real.class)){
                                    Real realExistente = (Real)moeda;                                   
                                    realExistente.setValor(realExistente.getValor() + v);
                                    encontrado = true;
                                    break;
                                }     
                            }
                            
                            if(!encontrado){
                                lista.add(new Real(v));
                                
                            }
                            
                            
                            break;
                            
                        }
                        
                        case 2: {
                            boolean encontrado = false;
                        
                            for (Moeda moeda : lista){
                            if(moeda.getClass().getClass().equals(Dolar.class)){
                                Dolar dolarExistente = (Dolar)moeda;
                                dolarExistente.setValor(dolarExistente.getValor() + v);
                                encontrado = true;
                                break;
                            }
                        }
                            
                          if(!encontrado){
                              lista.add(new Dolar(v));
                          }
                          
                          break;
                        }
                        
                        case 3: {
                            boolean encontrado = false;
                            
                            for(Moeda moeda : lista){
                                if(moeda.getClass().equals(Euro.class)){
                                    Euro euroExistente = (Euro)moeda;
                                    euroExistente.setValor(euroExistente.getValor() + v);
                                    encontrado = true;
                                    break;
                                }
                            }
                            
                            if(!encontrado){
                                lista.add(new Euro(v));
                            }
                        }
                    }
                    
                    continue;
                }
                case 2: {
                    System.out.println("Escolha a Moefa: ");
                    System.out.println("1 - Real: ");
                    System.out.println("2 - Dolar: ");
                    System.out.println("3 - Euro: ");
                    int op2 = scanner.nextInt();
                    if(op2 < 0 || op2 > 3){
                        System.out.println("Opção inválida");
                        continue;
                           
                    }
                    
                    System.out.println("Valor: ");
                    double v = scanner.nextFloat();
                    if(v < 1 || v > 3){
                        System.out.println("Opção inválida");
                        continue;
                    }
                    
                    
                    switch(op2){
                        case 1: {
                                                        
                            boolean encontrado = false;
                            
                            for (Moeda moeda : lista){
                                if(moeda.getClass().equals(Real.class)){
                                    Real realExistente = (Real)moeda;
                                     if((realExistente.getValor() - v) < 0){
                                    System.out.println("Você tem " + realExistente.getValor() + " Não consegue tirar " + v);
                                    encontrado = true;
                                    break;
                                    }
                                    realExistente.setValor(realExistente.getValor() - v);
                                    
                                    break;
                                }     
                            }
                            
                            if(!encontrado){
                                System.out.println("Você ainda não tem moedas de Real");
                                
                            }
                             
                            break;
                            
                        }
                        
                        case 2: {
                            boolean encontrado = false;
                        
                            for (Moeda moeda : lista){
                            if(moeda.getClass().getClass().equals(Dolar.class)){
                                Dolar dolarExistente = (Dolar)moeda;
                                if((dolarExistente.getValor() - v) < 0){
                                    System.out.println("Você tem " + dolarExistente.getValor() + " Não consegue tirar " + v);
                                    encontrado = true;
                                    return;
                                }
                              
                                dolarExistente.setValor(dolarExistente.getValor() - v);
                                
                                break;
                            }
                        }
                            
                          if(!encontrado){
                                System.out.println("Você ainda não tem moedas de Dolar");
                                
                            }
                          
                          break;
                        }
                        
                        case 3: {
                            boolean encontrado = false;
                            
                            for(Moeda moeda : lista){
                                if(moeda.getClass().equals(Euro.class)){
                                    Euro euroExistente = (Euro)moeda;
                                    if((euroExistente.getValor() - v < 0)){
                                        System.out.println("Você tem " + euroExistente.getValor() + " Não consegue tirar " + v);
                                        
                                    }
                                    euroExistente.setValor(euroExistente.getValor() - v);
                                    encontrado = true;
                                    break;
                                }
                            }
                            
                            if(!encontrado){
                                System.out.println("Você ainda não tem moedas de Euro");
                                
                            }
                        }
                    }
                    
                    continue;
                
                }
                case 3: {
                    System.out.println("Moedas no cofrinho: ");
                    for(Moeda moeda : lista){
                        moeda.info();
                        
                    }
                    continue;
                }
                case 4:{
                    double totalConvertido = 0.0;
                    for(Moeda moeda : lista){
                        double valorConvertido = moeda.converter();
                        totalConvertido += valorConvertido;
                    }
                    System.out.println("Total convertido para Real: R$ " + totalConvertido);
                    continue;
                   
                
                } default: {
                    System.out.println("Opção inválida");
                    continue;
                }
            }
            
        }
        
        
    }
}
