/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6;

/**
 *
 * @author 69146
 */
public class Aula6 {
    
    public static void main(String[] args) {       
        //pessoaAluno();
        //criarConstrutor();
        //calculoAluno();
        
    }
    
    
    public static void calculoAluno() {
        /*Calcular a situação do aluno cosiderando media 7 e frequencia de 75%
        para ser aprovado.
        Armazenar no atributo situação do aluno.
        */
        Aluno aluno = new Aluno(1, 7, 75, 11, 
                            "Gabriel", "gabriel@gmail.com", 
                            "9482-2514");
        System.out.println(aluno.toString());
        System.out.println(aluno.getSituacao());
    }
    public static void pessoaAluno() {
        //Sem usar construtor
        Aluno aluno = new Aluno();
        aluno.setId(10);
        aluno.setNome("Gabriel");
        aluno.setMatricula(1234);
        aluno.setEmail("gabriel@gmail.com");
        aluno.setFone("8954-2548");
        aluno.setMedia(11);
        aluno.setFrequencia(750);
        System.out.println(aluno.toString());
    }
    public static void criarConstrutor() {
        //Usando construtor
        Aluno aluno = new Aluno(1, 10, 75, 11, 
                            "Gabriel", "gabriel@gmail.com", 
                            "9482-2514");
        System.out.println(aluno.toString());
    }
}
