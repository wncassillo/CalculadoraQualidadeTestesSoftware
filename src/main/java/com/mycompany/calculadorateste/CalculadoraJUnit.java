package com.mycompany.calculadorateste;

public class CalculadoraJUnit { //Classe da calculadora
    //métodos das operações matématicas a serem feitas pela calculadora.
 
    public int somar(int a, int b){//método de soma
        return a+b;
    }  
    
    public int subtrair(int a, int b){//método de subtração
        return a-b;
    }
  
    public String dividir(int a, int b){//método de divisão
        //esse método é string para poder retornar a mensagem de não ser possível se dividir por 0.
        String resultado;
        if(b == 0){ //estrutura para não permitir dividir por zero
            resultado = "Não se pode dividir por zero.";
            return resultado;
        }else{
        resultado =  Integer.toString(a/b);
        return resultado;       
        }    
    }
    
    public int multiplicar(int a, int b){//método de multiplicação
        return a*b;
    }
    
}
