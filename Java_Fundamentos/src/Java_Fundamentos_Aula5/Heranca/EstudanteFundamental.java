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
public class EstudanteFundamental extends ProtectedEstudante{
    private String nomeResponsavel;
    private String observacao;
    private boolean cuidadoEspecial;

    public EstudanteFundamental() {
    }

    public EstudanteFundamental(String nomeResponsavel, String observacao, 
                                boolean cuidadoEspecial, int matricula, 
                                String nome, String cpf) {
        super(matricula, nome, cpf);
        this.nomeResponsavel = nomeResponsavel;
        this.observacao = observacao;
        this.cuidadoEspecial = cuidadoEspecial;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isCuidadoEspecial() {
        return cuidadoEspecial;
    }

    public void setCuidadoEspecial(boolean cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Obeservação: " + this.observacao);
        System.out.println("Responsável: " + this.nomeResponsavel);
        System.out.println("Restrição..: " + this.cuidadoEspecial);
    }
}
