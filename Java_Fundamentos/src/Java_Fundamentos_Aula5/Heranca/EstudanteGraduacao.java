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
public class EstudanteGraduacao extends ProtectedEstudante{
    private String semestre;
    private String idade;
    private String faculdade;

    public EstudanteGraduacao() {
    }

    public EstudanteGraduacao(String semestre, String idade, String faculdade, int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
        this.semestre = semestre;
        this.idade = idade;
        this.faculdade = faculdade;
    }
    
    
    
    public String getAno() {
        return semestre;
    }

    public void setAno(String semestre) {
        this.semestre = semestre;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Semestre...: " + this.semestre);
        System.out.println("Idade......: " + this.idade);
        System.out.println("Faculdade..: " + this.faculdade);
    }
    
}
