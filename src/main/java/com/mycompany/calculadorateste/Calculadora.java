package com.mycompany.calculadorateste;

public class Calculadora { //Classe da calculadora
    //métodos das operações matématicas a serem feitas pela calculadora.
 
    public int somar(int a, int b){//método de soma
        return a+b;
    }  
    
    public int subtrair(int a, int b){//método de subtração
        return a-b;
    }
  
    //Diferente dos outros métodos correspondentes as outras operações matemáticas
    // o método dividir retorna uma String, para que ele possa responder com uma frase
    // as tentativas de fazer uma divisão por zero.
    public String dividir(int a, int b){//método de divisão
        String resultado;
        if(b == 0){
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
