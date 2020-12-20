/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos.Aula3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 69146
 */
public class Java_Fundamentos_Aula3 {
    
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        //instanciandoProcutos();
        //instanciandoCarros();
        //exercicio1();
        //boletim();
        calculadora();
    }      
    
    public static void calculadora() {
        /*
        Crie um programa onde o usuário pode informar dois numeros e a operação
        que deseja realizar.
        O usuário pode realizar várias operações, antes de finalizar o programa.
        */
        //Java_Fundamentos_Aula3_Operações calcular = new Java_Fundamentos_Aula3_Operações();
        float valor1 = 0;
        float valor2 = 0;
        while (true) {       
            Java_Fundamentos_Aula3_Operações calcular = new Java_Fundamentos_Aula3_Operações();
            System.out.println("********************");
            System.out.println("** 1 - Soma       **");
            System.out.println("** 2 - Subtrai    **");
            System.out.println("** 3 - Multiplica **");
            System.out.println("** 4 - Divide     **");
            System.out.println("** 5 - Sair       **");
            System.out.println("********************");
            System.out.println("");
            System.out.print("Escolha uma opção: ");
            int opcao = leitor.nextInt();
            if (opcao < 1 || opcao > 5){
                System.out.println("Opção inválida!!");
                continue;
            }else{
                System.out.print("Digite valor 1: ");
                valor1 = leitor.nextInt();
                System.out.print("Digite valor 2: ");
                valor2 = leitor.nextInt();
            }
            if (opcao == 1){
                System.out.println(calcular.getSoma(valor1, valor2));
            }else if (opcao == 2){
                System.out.println(calcular.getSubtrai(valor1, valor2));
            }else if (opcao == 3){
                System.out.println(calcular.getMultiplica(valor1, valor2));
            }else if (opcao == 4){
                System.out.println(calcular.getSubtrai(valor1, valor2));
            }else if (opcao == 5){
                System.out.println(calcular.getSubtrai(valor1, valor2));
            }
        } 
    }
    
    public static void boletim() {
        Java_Fundamentos_Aula3_Boletim Boletim = new Java_Fundamentos_Aula3_Boletim();
        
        Boletim.setfrequencia(100);
        Boletim.setMedia(10);
        Boletim.setNome("Carlos");
        Boletim.setMatricula("ASA55");
        
        
        System.out.println(Boletim.getMatricula());
        System.out.println(Boletim.getNome());
        System.out.println(Boletim.getMedia());
        System.out.println(Boletim.getFrequencia());
        
    }
    
    public static void exercicio1() {
    /*
        Solicitar ao usuário que digite os dados do produto.
        O usuário poderá digitar vários produtos.
        Então solicite que ele informe a quantidade, e crie um array
        para armazenar cada produto inserido.
        Após inserir todos os produtos vc deve listar todos eles.
    */
        
        System.out.print("Tamanho do array: ");
        int tamanho_array = leitor.nextInt();
        
        Java_fundamentos_Aula3_Produto[] produtos = new Java_fundamentos_Aula3_Produto[tamanho_array];
        
       
        
        for (int i = 0; i < tamanho_array; i++){
            Java_fundamentos_Aula3_Produto produto_inserido = new Java_fundamentos_Aula3_Produto();
            System.out.println("Descrição: ");
            produto_inserido.descriocao = leitor.next();
            System.out.println("Preço: ");
            produto_inserido.preco = leitor.nextFloat();
            System.out.println("Quantidade: ");
            produto_inserido.quantidade = leitor.nextInt();
            
            produtos[i] = produto_inserido;
            
            
        
        }
        System.out.println("");
        
        for (Java_fundamentos_Aula3_Produto i : produtos){
            i.listar(); 
             /*Criar metodo para calcular valor de cada item/objeto e listar o resultado.
                ↓↓↓*/
            i.calculaItem();           
        }
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

