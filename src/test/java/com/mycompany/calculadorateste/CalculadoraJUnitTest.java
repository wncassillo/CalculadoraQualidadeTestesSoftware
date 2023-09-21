package com.mycompany.calculadorateste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraJUnitTest { //classe de testes do JUNIT
    
    
    public CalculadoraJUnitTest() {
    }
    //Métodos de Teste:
    
    //Cenários de testes função somar 
    //Cenário de Teste 1: Somar dois números positivos
    @Test
    public void testSomar1() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 3;
        int actual;
        actual  = calc.somar(1, 2);
        assertEquals(expected, actual, "O Teste de soma de numeros positivos fracassou");        
    }
    //Cenário de Teste 2: Somar dois valores sendo um delez zero
    @Test
    public void testSomar2() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 2;
        int actual;
        actual  = calc.somar(2, 0);
        assertEquals(expected, actual, "O Teste de soma de dois valores sendo um deles zero fracassou");        
    }
    //Cenário de Teste 3: Somar dois valores sendo ambos zero
    @Test
    public void testSomar3() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 0;
        int actual;
        actual  = calc.somar(0, 0);
        assertEquals(expected, actual, "O Teste de soma de valores sendo ambos zero falhou");        
    }
    //Cenário de Teste 4: Somar dois valores sendo um deles negativo
    @Test
    public void testSomar4() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 1;
        int actual;
        actual  = calc.somar(2, -1);
        assertEquals(expected, actual, "O Teste de soma de dois valores sendo um deles negativo falhou");        
    }
    //Cenário de Teste 5: Somar dois valores sendo ambos negativos
    @Test
    public void testSomar5() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = -2;
        int actual;
        actual  = calc.somar(-1, -1);
        assertEquals(expected, actual, "O Teste de soma de dois valores negativos fracassou");        
    }
    
    //Cenários de testes função subtrair    
    //Cenário de Teste 1: Subtrair dois números positivos
    @Test
    public void testSubtrair1() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 2;
        int actual;
        actual  = calc.subtrair(3, 1);
        assertEquals(expected, actual, "O Teste de subtração de numeros positivos fracassou");    
    }
    //Cenário de Teste 2: Subtrair dois valores sendo um delez zero
    @Test
    public void testSubtrair2() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 3;
        int actual;
        actual  = calc.subtrair(3, 0);
        assertEquals(expected, actual, "O Teste de subtração de dois valores sendo um deles zero falhou");    
    }
    //Cenário de Teste 3: Subtrair dois valores sendo ambos zero
    @Test
    public void testSubtrair3() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 0;
        int actual;
        actual  = calc.subtrair(0, 0);
        assertEquals(expected, actual, "O Teste de subtração de dois valores sendo ambos zero falhou");    
    }
    //Cenário de Teste 4: Subtrair dois valores sendo um deles negativo
    @Test
    public void testSubtrair4() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 4;
        int actual;
        actual  = calc.subtrair(3, -1);
        assertEquals(expected, actual, "O Teste de subtração de dois valores sendo um deles negativo falhou.");    
    }
    //Cenário de Teste 5: Subtrair dois valores sendo ambos negativos
    @Test
    public void testSubtrair5() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = -2;
        int actual;
        actual  = calc.subtrair(-3, -1);
        assertEquals(expected, actual, "O Teste de subtração de dois valores negativos fracassou");    
    }
    
    //Cenários de testes função divisão    
    //Cenário de Teste 1: Dividir dois números positivos
    @Test
    public void testDividir1() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        //Nos testes de divisão o tipo da variavel que faz o teste foi alterada para String
        //Já que no método de divisão o mesmo ocorre, para permitir que uma frase apareça
        //em resposta a tentativas de dividir qualquer valor por zero.
        String expected = "3";
        String actual;
        actual  = calc.dividir(6, 2);
        assertEquals(expected, actual, "O Teste de divisão de numeros positivos fracassou");
    }
    //Cenário de Teste 2: Dividir um valor por outro valor negativo
    @Test
    public void testDividir2() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "-3";
        String actual;
        actual  = calc.dividir(6, -2);
        assertEquals(expected, actual, "O Teste de divisão de um numero positivo por um negativo falhou");
    }
    //Cenário de Teste 3: Dividir um valor negativo por um positivo
    @Test
    public void testDividir3() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "-3";
        String actual;
        actual  = calc.dividir(-6, 2);
        assertEquals(expected, actual, "O Teste de divisão de um valor negativo por um positivo falhou");
    }
    //Cenário de Teste 4: Dividir um valor negativo por outro negativo
    @Test
    public void testDividir4() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "3";
        String actual;
        actual  = calc.dividir(-6, -2);
        assertEquals(expected, actual, "O Teste de divisão de um valor negativo por outro negativo falhou");
    }
    //Cenário de Teste 5: Dividir zero por um valor positivo
    @Test
    public void testDividir5() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "0";
        String actual;
        actual  = calc.dividir(0, 5);
        assertEquals(expected, actual, "O Teste de divisão de zero por um valor positivo falhou");
    }
    //Cenário de Teste 6: Dividir zero por um valor negativo
    @Test
    public void testDividir6() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "0";
        String actual;
        actual  = calc.dividir(0, -5);
        assertEquals(expected, actual, "O Teste de divisão de zero porum valor negativo falhou");
    }
    //Cenário de Teste 7: Dividir um valor positivo por zero
    @Test
    public void testDividir7() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "Não se pode dividir por zero.";
        String actual;
        actual  = calc.dividir(7, 0);
        assertEquals(expected, actual, "O Teste de divisão de um valor positivo por zero falhou");
    }
    //Cenário de Teste 8: Dividir um valor negativo por zero
    @Test
    public void testDividir8() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "Não se pode dividir por zero.";
        String actual;
        actual  = calc.dividir(-7, 0);
        assertEquals(expected, actual, "O Teste de divisão de um valor negativo por zero falhou");
    }
    //Cenário de Teste 9: Dividir zero por zero
    @Test
    public void testDividir9() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        String expected = "Não se pode dividir por zero.";
        String actual;
        actual  = calc.dividir(0, 0);
        assertEquals(expected, actual, "O Teste de divisão de zero por zero falhou");
    } 

    //Cenários de testes função multiplicação    
    //Cenário de Teste 1: Multiplicar dois números positivos
    @Test
    public void testMultiplicar1() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 6;
        int actual;
        actual  = calc.multiplicar(3, 2);
        assertEquals(expected, actual, "O Teste de multiplicação de numeros positivos fracassou");    
    }
    //Cenário de Teste 2: Multiplicar dois valores sendo um deles zero
    @Test
    public void testMultiplicar2() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 0;
        int actual;
        actual  = calc.multiplicar(3, 0);
        assertEquals(expected, actual, "O Teste de multiplicação de dois valores sendo um deles zero fracassou");    
    }
    //Cenário de Teste 3: Multiplicar dois valores sendo ambos zero
    @Test
    public void testMultiplicar3() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 0;
        int actual;
        actual  = calc.multiplicar(0, 0);
        assertEquals(expected, actual, "O Teste de multiplicação de dois valores sendo ambos zero fracassou");    
    }
    //Cenário de Teste 4: Multiplicar dois valores sendo um deles negativo
    @Test
    public void testMultiplicar4() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = -8;
        int actual;
        actual  = calc.multiplicar(4, -2);
        assertEquals(expected, actual, "O Teste de multiplicação de dois valores sendo um deles negativo fracassou");    
    }
    //Cenário de Teste 5: Multiplicar dois valores sendo ambos negativos
    @Test
    public void testMultiplicar5() {
        CalculadoraJUnit calc = new CalculadoraJUnit();
        int expected = 15;
        int actual;
        actual  = calc.multiplicar(-3, -5);
        assertEquals(expected, actual, "O Teste de multiplicação de dois valores sendo um deles zero fracassou");    
    }
    
    
}
