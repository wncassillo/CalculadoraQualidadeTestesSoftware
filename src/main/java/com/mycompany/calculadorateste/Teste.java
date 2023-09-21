package com.mycompany.calculadorateste;

/**
 *
 * @author cassi
 */
public class Teste { //Classe criada para abrigar os métodos de teste.
    
    public void testarSomar(){//Testar método de soma
        Calculadora calc = new Calculadora();
        System.out.println("Testando método de Adição:");
        //Cenário de Testes 01: Somando dois valores
        int resultado = calc.somar(3,7);
        System.out.println(resultado);
        //Cenário de Testes 02: Somando dois valores sendo um deles zero
        resultado = calc.somar(3,0);
        System.out.println(resultado);
        //Cenário de Testes 03: Somando dois valores sendo ambos zero
        resultado = calc.somar(0,0);
        System.out.println(resultado);
        //Cenário de Testes 04: Somando dois valores sendo um deles negativo
        resultado = calc.somar(3,-1);
        System.out.println(resultado);
        //Cenário de Testes 05: Somando dois valores sendo ambos negativos
        resultado = calc.somar(-3,-1);
        System.out.println(resultado);
        
        System.out.println("________");
    }
    
    public void testarSubtrair(){//Testar método de subtração
        Calculadora calc = new Calculadora();
        //Testando a subtração!
        System.out.println("Testando método de Subtração:");
        //Cenário de Testes 01: Subtraindo dois valores
        int resultado = calc.subtrair(3,7);
        System.out.println(resultado);
        //Cenário de Testes 02: Subtraindo dois valores sendo um deles zero
        resultado = calc.subtrair(3,0);
        System.out.println(resultado);
        //Cenário de Testes 03: Subtraindo dois valores sendo ambos zero
        resultado = calc.subtrair(0,0);
        System.out.println(resultado);
        //Cenário de Testes 04: Subtraindo dois valores sendo um deles negativo
        resultado = calc.subtrair(3,-1);
        System.out.println(resultado);
        //Cenário de Testes 05: Subtraindo dois valores sendo ambos negativos
        resultado = calc.subtrair(-3,-1);
        System.out.println(resultado);
        
        System.out.println("________");
    }
    
    public void testarDividir(){//Testar método de divisão
        Calculadora calc = new Calculadora();
        //Testando a divisão!
        System.out.println("Testando método de divisão:");
        //Cenário de Testes 01: Divindo um valor por outro valor positivo
        String resultado = calc.dividir(8,2);
        System.out.println(resultado);
        //Cenário de Testes 02: Divindo um valor por outro valor negativo
        resultado = calc.dividir(8,-2);   
        System.out.println(resultado);
        //Cenário de Testes 03: Divindo um valor negativo por um valor positivo
        resultado = calc.dividir(-16,2);   
        System.out.println(resultado);
        //Cenário de Testes 04: Divindo um valor negativo por outro valor negativo
        resultado = calc.dividir(-8,-2);   
        System.out.println(resultado); 
        //Cenário de Testes 05: Dividindo zero por um valor positivo
        resultado = calc.dividir(0,4);
        System.out.println(resultado);
        //Cenário de Testes 06: Dividind zero por um valor negativo
        resultado = calc.dividir(0,-4);
        System.out.println(resultado);
        
        //Cenário de Testes 07: Dividindo um valor positivo por zero
        resultado = calc.dividir(8,0);
        System.out.println(resultado);      
        //Cenário de Testes 08: Dividindo um valor negativo por zero
        resultado = calc.dividir(-8,0);
        System.out.println(resultado);
        //Cenário de Testes 09: Dividindo zero por zero
        resultado = calc.dividir(0,0);
        System.out.println(resultado);
        
        System.out.println("________");
    }
    
    public void testarMultiplicar(){//Testar método de multiplicação
        Calculadora calc = new Calculadora();
        System.out.println("Testando método de multiplicação:");
        //Cenário de Testes 01: Multiplicando dois valores
        int resultado = calc.multiplicar(3,5);
        System.out.println(resultado);
        //Cenário de Testes 02: Multiplicando dois valores sendo um deles zero
        resultado = calc.multiplicar(3,0);
        System.out.println(resultado);
        //Cenário de Testes 03: Multiplicando dois valores sendo ambos zero
        resultado = calc.multiplicar(0,0);
        System.out.println(resultado);
        //Cenário de Testes 04: multiplicando dois valores sendo um deles negativo
        resultado = calc.multiplicar(3,-5);
        System.out.println(resultado);
        //Cenário de Testes 05: multiplicando dois valores negativos
        resultado = calc.multiplicar(-3,-5);
        System.out.println(resultado);
        
        System.out.println("________");
    }
    
}
