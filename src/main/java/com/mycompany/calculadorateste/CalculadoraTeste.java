package com.mycompany.calculadorateste;
/**
 *
 * @author cassi
 */
public class CalculadoraTeste {

    public static void main(String[] args) {
        Teste teste = new Teste();//Criando instância da classe de testes.
        //Chamando métodos de testes
        teste.testarSomar();
        teste.testarSubtrair();
        teste.testarDividir();
        teste.testarMultiplicar(); 
        
    }
}
