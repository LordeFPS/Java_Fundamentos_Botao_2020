/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos.Aula3;

/**
 *
 * @author 69146
 */
public class Java_Fundamentos_Aula3 {
    
    public static void main(String[] args) {
        
    }
    
    public static void exercicio1() {
    /*
        Solicitar ao usuário que digite os dados do produto.
        O usuário poderá digitar vários produtos.
        Então solicite que ele informe a quantidade, e crie um array
        
    */
    }
    
    public static void instanciandoCarros() {
       // instanciar um objeto
       
       Java_fundamentos_Aula3_Carro obj = new Java_fundamentos_Aula3_Carro();
       obj.marca  = "Ford";
       obj.modelo = "Ka";
       obj.placa  = "abc-1234";
       obj.combutivel = "flex";
       obj.nportas    = 2;
       obj.capacidade = 4;
       obj.cv = 78;
       obj.listar();
    }
    
    public static void instanciandoProcutos() {
       // instanciando objeto
       Java_fundamentos_Aula3_Produto produto1 = new Java_fundamentos_Aula3_Produto();
       produto1.descriocao = "Feijão";
       produto1.preco = 7.89f;
       produto1.quantidade = 10;
       produto1.listar();
       
       Java_fundamentos_Aula3_Produto produto2 = new Java_fundamentos_Aula3_Produto();
       produto2.descriocao = "Arroz";
       produto2.preco = 12.89f;
       produto2.quantidade = 20;
       produto2.listar();
       
        Java_fundamentos_Aula3_Produto produto3 = new Java_fundamentos_Aula3_Produto();
       produto3.descriocao = "Trigo";
       produto3.preco = 22.89f;
       produto3.quantidade = 30;
       produto3.listar();
       
    }
    
    
    
}

