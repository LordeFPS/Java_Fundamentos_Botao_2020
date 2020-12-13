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
        //arrays();
        //exercicio1();
        //matrizes();
        exercicioMatriz();
    }
    
    public static void exercicioMatriz() {
    /*
        Criar uma area de jogo de batalha naval (5x5).
        Posicionar 2 navios no mapa.
        Solicitar ao usuario para efetuar um disparo.
        Verificar se acertou o tiro.
    */
      
        // método mais rápido (professor)
        String[][] tabuleiro = new String[5][5];
        
        // preechimento do tabuleiro
        for (int l = 0; l < tabuleiro.length; l++){
            for (int c = 0; c < tabuleiro[l].length; c++){
                tabuleiro[l][c] = "-";
            }
        }
        
        // posicionar os navios       
        tabuleiro[2][3] = "Navio1";
        tabuleiro[1][2] = "Navio2";
        
        // Realizar os disparos
        System.out.println("Informe linha que deseja atingir (0-4)");
        int linha = leitor.nextInt();
        System.out.println("Informe coluna que deseja atingir (0-4)");
        int coluna = leitor.nextInt();
        
        if (tabuleiro[linha][coluna].equals("Navio1")){
            System.out.println("Você acertou!!");
        }else if (tabuleiro[linha][coluna].equals("Navio2")){
            System.out.println("Você acertou!!");
        }else {
            System.out.println("Você errou!!");
        }
        /*
        // método "braçal"
                
        int[][] tabuleiro = new int[5][5];
                
        int navio1 = tabuleiro[1][3]; 
        int navio2 = tabuleiro[2][2];
        
        System.out.println("Selecione um lugar para disparar");
        System.out.print("Linha de 0 a 4: ");
        int linha = leitor.nextInt();
        System.out.print("Coluna de 0 a 4: ");
        int coluna = leitor.nextInt();

        if (linha == 1 && coluna == 3) {
            System.out.println("Afundou um navio");
        }else if (linha == 2 && coluna == 2) {
            System.out.println("Afundou um navio");
        }else if (linha == 1 || linha == 2) {
            System.out.println("Acertou o disparo");
        }else if (coluna == 3 || coluna == 2) {
            System.out.println("Acertou o disparo");
        }else {
            System.out.println("Errou o disparo");
        }
        */
    }
    
    public static void matrizes() {
    /*
        System.out.println("Digite o tamanho da Matriz");
        System.out.print("Quantidade de linhas: ");
        int linhas = leitor.nextInt();
        System.out.print("Quantidade de colunas: ");
        int colunas = leitor.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
    */
        /*
            ↓ Como seria a matriz ↓
                    10 11 12
                    13 14 15
                    16 17 18
        */
        int[][] matriz = new int[3][3];
        
        matriz[0][0] = 10;
        matriz[0][1] = 11;
        matriz[0][2] = 12;
        
        matriz[1][0] = 13;
        matriz[1][1] = 14;
        matriz[1][2] = 15;
        
        matriz[2][0] = 16;
        matriz[2][1] = 17;
        matriz[2][2] = 18;
        
        for (int l = 0; l < matriz.length; l++) {
            System.out.println("");
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(" " + matriz[l][c]);
            }       
        }
        System.out.println("");
        
        int[][] m = {{10,20,30,40},{50,60,70},{80,90}};
        
        for (int l = 0; l < m.length; l++){
            System.out.println("");
            for (int c = 0; c < m[l].length; c++){
                System.out.print(" " + m[l][c]);
            }
        }
        
    }
    
    public static void exercicio1() {
    /*
        Faça um programa que pede para o usuário informar 10 números inteiros.
        Em seguida multiplique todos os valores por um fator informado pelo usuário.
        Perguntar ao usario se deseja inserir mais numeros.
    */
        int[] array1 = new int[2];
        //Preenchimento do array
        for (int i = 0; i < array1.length; i++){
            System.out.print("Valor " + (i+1) + ": " );
            array1[i] = leitor.nextInt();
        }
        
        //Pede o fator de multiplicação
        System.out.print("Digite um número para multiplicar os valores: ");
        int multiplica = leitor.nextInt();
        
        //Percorre o array para mostrar os valores dentro dele.
        for (int i = 0; i < array1.length; i++){
            System.out.println("Resultado " + (i+1) + ": " + (array1[i]*multiplica));
        }  
        
        System.out.print("Aumentor o array: + ");
        int adicionar = leitor.nextInt();
        
        int[] array2 = new int[array1.length + adicionar];
        
        // Transfirir o valores de um array para o outro array
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }
        //Preenchimento do array
        for (int i = array1.length; i < array2.length; i++){
            System.out.print("Valor " + (i+1) + ": " );
            array2[i] = leitor.nextInt();
        }
        
        //Percorre o array para mostrar os valores dentro dele.
        for (int i = 0; i < array2.length; i++){
            System.out.println("Resultado " + (i+1) + ": " + (array2[i]*multiplica));
        } 
        
        
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