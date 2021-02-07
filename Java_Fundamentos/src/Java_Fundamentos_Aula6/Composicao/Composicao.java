/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Composicao;

/**
 *
 * @author 69146
 */
public class Composicao {
    
    public static void main(String[] args) {
        compiscaoPessoaAluno();
    }
    
    public static void compiscaoPessoaAluno() {
        Pessoa pessoa = new Pessoa(1, "Gabriel", "gabriel@gamil.com", 
                                    "9458-1564");
        
        Aluno aluno = new Aluno(123, 10, 75, pessoa);
        System.out.println(aluno.toString());
    }
}
