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
public class Aluno {
    private int matricula;
    private float media;
    private float frequencia;
    private Pessoa pessoa;

    public Aluno() {
    }

    public Aluno(int matricula, float media, float frequencia, Pessoa pessoa) {
        this.matricula = matricula;
        this.media = media;
        this.frequencia = frequencia;
        this.pessoa = pessoa;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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
