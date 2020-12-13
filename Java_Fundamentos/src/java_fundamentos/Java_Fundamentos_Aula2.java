/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author 69146
 */
public class Java_Fundamentos_Aula2 {

    /**
     * @param args the command line arguments
     */
    // deixamos esse leitor global assim será possivel usar em todo o projeto.
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //entradaGráfica();
        //desvioCondicional();
        //enquanto();
        //mediaAluno();
        //maisDeUmAluno();
        //doWhile();
        //lacoFor();
        arrays();
    }
    
    public static void arrays() {
        
        String[] nomes = {"Joao", "Anto", "Maria"};
        
        System.out.println("Tamanho do array: " + nomes.length);
        System.out.println(nomes[0]);
        nomes[2] = "Antonio";
        
        System.out.println("For Tradicional");
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
        System.out.println("For enhanced");
        for (String i : nomes){
            System.out.println(i);
        }
    }
    
    public static void lacoFor() {
        
        for (int i = 0; i < 10; i++){
            
            System.out.println("Valor " + (i + 1));
            
        }
        
    }
    
    public static void doWhile() {
        
        int x = 0;
        
        do{
            //Bloco do
            System.out.println("Valor " + (x + 1));
            x++;
            
        }while (x < 10);            
            
        
    }
    
    public static void maisDeUmAluno() {
       
        boolean continuar = true;
        
        while (/*true*/continuar) {            
            
            //mediaAluno();
                       
            /*
            // Método do Gabriel com opções de 1 e 2 como escolha
            System.out.println("Cadastrar mais alunos?");
            System.out.print(" Sim = 1");
            System.out.println(" Não = 2");
            System.out.print(" Digite: ");
            int opcao = leitor.nextInt();
            
            if (opcao == 1){
                mediaAluno();
                
            }else if (opcao == 2){
                System.out.println("Você saiu do sistema.");
                break;
            }else if (opcao < 1 || opcao > 2){
                System.out.println("Opção inválida tente novamente");
            }
            */
            
            // Método do professor com opções de lestras S/N
            System.out.println("Cadastrar outro aluno?(S/N)");
            String opcao = leitor.next();
            continuar = opcao.toLowerCase().equals("s");
            
        }
        System.out.println("Saiu do sistema.");
    }
    
    public static void mediaAluno() {
    /*
        Fazer um programa que leia o nome de um aluno e 4 notas;
        Calcule a media do aluno e sua situação.
        O aluno está aprovado caso sua média seja maior ou igual a 7.
        Limitar para que uma data seja válida somente se estiver entre 0 e 10.
    */
    
      //Scanner leitor = new Scanner(System.in);
        
      System.out.print("Nome do Aluno: ");
      String aluno = leitor.next();
      
      int qtdNotas = 4;
      int cont = 1;
      float notas = 0;
      
        while (cont <= 4) {            
            System.out.print("Nota " + cont + ": ");
            float nota = leitor.nextFloat();
            
            if(nota >= 0 && nota <= 10){
                notas += nota;
                
                cont++;
            }else {
                System.out.println("Nota inválida(0 a 10)");
            }
        }
        // Cálculo da média

        float media = notas/qtdNotas;
        
        if (media >= 7){
            System.out.println("Aluno: " + aluno);            
            System.out.println("Média: " + media);
            System.out.println("Status: Aprovado");
        }else{
            System.out.println("Aluno: " + aluno);            
            System.out.println("Média: " + media);
            System.out.println("Status: Reprovado");
        }
    }
    
    public static void enquanto() {
        
        int x = 0;
        
        while (x < 10) {            
            System.out.println("linha " + x);
            x += 2;
        
        }
        System.out.println("Continuando ...");
        
    }
    
    public static void desvioCondicional() {
        
        int idade = 18;
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
            
        }else {
            System.out.println("Menor de idade");
            
        }
        
    }

    public static void entradaGráfica() {
        
        String nome = JOptionPane.showInputDialog("Informe nome");
        System.out.println("Olá" + nome);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe Idade: "));
        JOptionPane.showConfirmDialog(null, idade);
        
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe peso: "));
        System.out.println("Olá " + peso);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe altura: "));
        System.out.println("Olá " + altura);
        
        
        
    }
}