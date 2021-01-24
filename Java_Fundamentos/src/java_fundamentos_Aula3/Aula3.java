/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 69146
 */
public class Aula3 {
    
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        //instanciandoProcutos();
        //instanciandoCarros();
        //exercicio1();
        //boletim();
        calculadora();
    }      
    
    public static void menuProfessor() {
        System.out.println("A - adição");
        System.out.println("S - subtração");
        System.out.println("M - multiplicação");
        System.out.println("D - divisão");
        System.out.println("R - reset");
    }
    
    public static void calculadora() {
        /*
        Crie um programa onde o usuário pode informar dois numeros e a operação
        que deseja realizar.
        O usuário pode realizar várias operações, antes de finalizar o programa.
        */
        /*    // Meu método ↓↓↓
        float valor1 = 0;
        float valor2 = 0;
        while (true) {       
            Java_Fundamentos_Aula3_Operações calcular = new Java_Fundamentos_Aula3_Operações();
            calcular.getMenu();
            
            int opcao = leitor.nextInt();
            if (opcao < 1 || opcao > 5){
                System.out.println("Opção inválida!!");
                continue;
            }else if (opcao == 5){
                System.out.println("Obrigado por usar nosso programa.");
                break;
            }else{
                System.out.print("Digite valor 1: ");
                valor1 = leitor.nextInt();
                System.out.print("Digite valor 2: ");
                valor2 = leitor.nextInt();
            }
            if (opcao == 1){
                System.out.println("Soma: " + String.format("%.2f", calcular.getSoma(valor1, valor2)));
            }else if (opcao == 2){
                System.out.println("Subtração: " + String.format("%.2f", calcular.getSubtrai(valor1, valor2)));
            }else if (opcao == 3){
                System.out.println("Multicação: " + String.format("%.2f", calcular.getMultiplica(valor1, valor2)));
            }else if (opcao == 4){
                System.out.println("Divisão: " + String.format("%.2f", calcular.getDivide(valor1, valor2)));
            }
        }  // Meu método ↑↑↑
        */
        
        // Método do Professor ↓↓↓
        Aula3_Operações calc = new Aula3_Operações();
        
        menuProfessor();
        
        boolean entrar = true;
        float resposta = 0;
        int x = 0;
        float n1 = 0;
        String operacao = "";
        
        while (entrar) {
            if(x==0){
             System.out.print("Informe numero: ");
             n1 = leitor.nextFloat();
             System.out.print("Informe operação: ");
             operacao = leitor.next();
             x = 1;
           }
            System.out.print("Informe numero: ");
            float n2 = leitor.nextFloat();
            
            switch(operacao.toUpperCase()){
                case "A":
                    resposta = calc.getSoma(n1, n2);
                    System.out.println("Resultado " + resposta);
                    break;
                case "S":
                    resposta = calc.getSubtrai(n1, n2);
                    System.out.println("Resultado " + resposta);
                    break;
                case "D":
                    resposta = calc.getDivide(n1, n2);
                    System.out.println("Resultado " + resposta);
                    break;
                case "M":
                    resposta = calc.getMultiplica(n1, n2);
                    System.out.println("Resultado " + resposta);
                    break;
                default:System.out.println("Opção inválida");
                    
            }   
            menuProfessor();
            System.out.println("Para continuar digite a operação");
            
            operacao = leitor.next();
            n1 = resposta;
            entrar = !operacao.toLowerCase().equals("r");            
        }
        System.out.println("Resultado " + resposta);
        // Método do Professor ↑↑↑   
    }
    
    public static void boletim() {
        Aula3_Boletim Boletim = new Aula3_Boletim();
        
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
        
        Aula3_Produto[] produtos = new Aula3_Produto[tamanho_array];
        
       
        
        for (int i = 0; i < tamanho_array; i++){
            Aula3_Produto produto_inserido = new Aula3_Produto();
            System.out.println("Descrição: ");
            produto_inserido.descriocao = leitor.next();
            System.out.println("Preço: ");
            produto_inserido.preco = leitor.nextFloat();
            System.out.println("Quantidade: ");
            produto_inserido.quantidade = leitor.nextInt();
            
            produtos[i] = produto_inserido;
            
            
        
        }
        System.out.println("");
        
        for (Aula3_Produto i : produtos){
            i.listar(); 
             /*Criar metodo para calcular valor de cada item/objeto e listar o resultado.
                ↓↓↓*/
            i.calculaItem();           
        }
    }
    
    public static void instanciandoCarros() {
       // instanciar um objeto
       
       Aula3_Carro obj = new Aula3_Carro();
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
       Aula3_Produto produto1 = new Aula3_Produto();
       produto1.descriocao = "Feijão";
       produto1.preco = 7.89f;
       produto1.quantidade = 10;
       produto1.listar();
       
       Aula3_Produto produto2 = new Aula3_Produto();
       produto2.descriocao = "Arroz";
       produto2.preco = 12.89f;
       produto2.quantidade = 20;
       produto2.listar();
       
        Aula3_Produto produto3 = new Aula3_Produto();
       produto3.descriocao = "Trigo";
       produto3.preco = 22.89f;
       produto3.quantidade = 30;
       produto3.listar();
       
    }
    
    
    
}

