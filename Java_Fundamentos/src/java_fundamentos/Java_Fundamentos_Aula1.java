/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos;

import javax.print.DocFlavor;

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
        
        operadoresMatematicos();
        
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