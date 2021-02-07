/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Java_Fundamentos_Aula6_Composicao;

/**
 *
 * @author 69146
 */
public class Composicao {
    
    public static void main(String[] args) {
        compiscaoPessoaAluno();
    }
    
    public static void compiscaoPessoaAluno() {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Gabriel");
        pessoa.setEmail("gabriel@gmail.com");
        pessoa.setFone("9456-0548");
        
        Aluno aluno = new Aluno();
        aluno.setMatricula("123");
        aluno.setMedia(10);
        aluno.setFrequencia(75);
        aluno.setPessoa(pessoa);
        System.out.println(aluno.toString());
    }
}
