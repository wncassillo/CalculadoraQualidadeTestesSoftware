package com.mycompany.calculadorateste;
/**
 *
 * @author cassi
 */
public class CalculadoraTeste {

    public static void main(String[] args) {
        TesteManual teste = new TesteManual();//Criando instância da classe de testes.
        //Chamando métodos de testes manuais:
        teste.testarSomar();
        teste.testarSubtrair();
        teste.testarDividir();
        teste.testarMultiplicar(); 
        
    }
}
