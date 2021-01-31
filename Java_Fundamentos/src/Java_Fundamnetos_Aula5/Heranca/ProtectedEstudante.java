/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5.Heranca;

/**
 *
 * @author 69146
 */
public class ProtectedEstudante extends ProtectedPessoa{
    int matricula;
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void listar(){
        System.out.println("Nome......: " + this.nome);
        System.out.println("CPF.......: " + this.cpf);
        System.out.println("Matrícula.: " + this.matricula);
    }
}
