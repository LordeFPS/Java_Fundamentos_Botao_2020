/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos;

import java.util.Scanner;


/**
 *
 * @author gsuporte
 */
public class Java_Fundamentos_Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variaveis();
        
        //operadoresMatematicos();
        
        //operadoresComparacao();
        
        //desvios(); -> If e else
        
        // lerScanner(); 
        
        exercicio1();
    }
    
    public static void exercicio1() {
       /* Crie um algoritmo que leia o nome e a idade da pessoa e informe
          se la é menor ou maior de idade.*/
       
       Scanner leitor = new Scanner(System.in); // -> classe que le os valores digitados no teclado
        System.out.println("Digite seu nome: ");
        String nome = leitor.next();
        
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        
        if (idade >= 18){
            System.out.println("Aprovado.");
            System.out.println("Você é maior de idade.");
        }else {
            System.out.println("Negado.");
            System.out.println("Você é menor de idade.");
        }
       
    }
    public static void lerScanner() {
        
        Scanner leitor = new Scanner(System.in); // -> classe que le os valores digitados no teclado
        System.out.println("Informe o nome da pessoa: ");
        String nome = leitor.next();
               
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        
        System.out.println("Digite seu peso: ");
        float peso = leitor.nextFloat();
        
        System.out.println("Olá " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
    
    public static void desvios() {
        
        int n1 = 10;
        int n2 = 20;
        
        if (n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }else {
            System.out.println(n1 + " é menor que " + n2);
        }
        
    }
    
    public static void operadoresComparacao() {
        
        int n1 = 10;
        int n2 = 2;
        
        System.out.println("Iguais: " + (n1 == n2));
        System.out.println("Diferentes: " + (n1 != n2));
        System.out.println("Menor: " + (n1 < n2));
        System.out.println("Maior: " + (n1 > n2));
        System.out.println("Menor igual: " + (n1 <= n2));
        System.out.println("Maior igual: " + (n1 >= n2));
        
    }
    
    public static void operadoresMatematicos() {
        
        int n1 = 10;
        int n2 = 2;
        
        System.out.println("Soma = " + (n1 + n2));
        System.out.println("Subtração = " + (n1 - n2));
        System.out.println("Multiplicação = " + (n1 * n2));
        System.out.println("Divisão = " + (n1 / n2));
        System.out.println("Resto = " + (n1 % n2));
        
        n1++;
        System.out.println("Valor 1 = " + n1);
        n1 = n1 + 1;
        System.out.println("Valor 1 = " + n1);
        
        n2--;
        System.out.println("Valor 2 = " + n2);
        n2 = n2 - 1;
        System.out.println("Valor 2 = " + n2);
        
    }
    
    public static void variaveis() {
        // TODO code application logic here
        String nome = "Gabriel Botão";
        byte idade = 10;
        float peso = 53.5f;
        double altura = 1.65;
        boolean autorizado = false;
        char sexo = 'M';
        /*
        System.out.println("Olá " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Autorizado: " + autorizado);
        System.out.println("Sexo: " + sexo);
        */
        
        String precoProduto = "10.50";
        String quantidadeProduto = "10";
        String desconto = "10.5";
        
        // Float com F maiúsculo é um objeto
        // serve tbm para fazer converções de valores 
        
        Float preco = Float.parseFloat(precoProduto);
        // ↑↑ Foi feita uma conversão de String para Float 
        
        Integer qtde = Integer.parseInt(quantidadeProduto);
        // ↑↑ Foi feita uma conversão de String para Integer
        
        double bonus = Double.parseDouble(desconto);
        
        float resultado = preco * qtde;
        
        System.out.println("Total: R$" + resultado);
        System.out.println("Desconto: R$" + (resultado * bonus) / 100);
        
    }
    
}
