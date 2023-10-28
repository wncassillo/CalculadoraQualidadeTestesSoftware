package com.mycompany.calculadorateste;

/**
 * Uma classe calculadora simples, que realiza as quatro operações aritméticas fundamentais.
 * @author Wilson Cassillo Neto
 * @version 1.5
 * @since Release 1.0 da aplicação (Sep 21 2023).
 * 
 */
public class CalculadoraJUnit { 
    
    //métodos das operações matématicas a serem feitas pela calculadora.
 
    /**
     * Método que realiza a soma de dois valores.
     * @param a O primeiro valor a ser usado na operação de adição, a "primeira parcela".
     * @param b O segundo valor a ser usado na adição. O valor que vai ser adicionado ao primeiro valor, a "segunda parcela".
     * @return Retorna a soma dos dois números informados.
     */
    public int somar(int a, int b){//método de soma
        return a+b;
    }  
    
    /**
     * Método que realiza a subtração.
     * @param a Primeiro valor a ser usado na subtração, o minuendo.
     * @param b Segundo valor usado na subtração, o subtraendo.
     * @return Retorna o resultado final da subtração, chamada de "diferença".
     */
    public int subtrair(int a, int b){//método de subtração
        return a-b;
    }
  
    /**
     * Método que realiza a divisão.
     * @param a Primeiro valor a ser usado na divisão, o dividendo, que será dividido pelo segundo valor.
     * @param b Segundo valor a ser usado na divisão, o divisor, por ele que o primeiro valor será dividido.
     * @return Retorna o resultado da divisão ou a mensagem "Não se pode dividir por zero", caso o divisor informado seja 0.
     */
    public String dividir(float a, float b){//método de divisão
        //esse método é string para poder retornar a mensagem de não ser possível se dividir por 0.
        String resultado;
        if(b == 0){ //estrutura para não permitir dividir por zero
            resultado = "Não se pode dividir por zero.";
            return resultado;
        }else{
        resultado =  Float.toString(a/b);
        return resultado;       
        }    
    }
    
    /**
     * Método que realiza a multiplicação.
     * @param a O primeiro fator a ser usado na multiplicação.
     * @param b O segundo fator a ser usado na multiplicação.
     * @return Retorna o produto da multiplicação dos fatores.
     */
    public int multiplicar(int a, int b){//método de multiplicação
        return a*b;
    }
    
}
