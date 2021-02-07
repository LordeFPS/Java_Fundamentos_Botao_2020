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
public class Aluno {
    private String matricula;
    private float media;
    private float frequencia;
    private Pessoa pessoa;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
     @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", media=" + media + ", frequencia=" + frequencia + ", pessoa=" + pessoa + '}';
    }

}
