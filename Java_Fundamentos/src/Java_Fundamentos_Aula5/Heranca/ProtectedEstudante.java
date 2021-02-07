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

    public ProtectedEstudante() {
    }

    public ProtectedEstudante(int matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Matrícula..: " + this.matricula);
    }
}
