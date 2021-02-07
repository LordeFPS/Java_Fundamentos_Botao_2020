/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6;

import java.util.List;

/**
 *
 * @author 69146
 */
public final class Aluno extends Pessoa{
    
    private int matricula;
    private float media;
    private float frequencia;
    
    public void validaMedia(float media) {
        if (media < 0 || media > 10){
            System.out.println("Média inválida"); 
        }else{
            this.media = media;
        } 
    }
    
    public void validaFrequencia(float frequencia){
        if (frequencia < 0 || frequencia > 100){
            System.out.println("Frequencia inválida");
        }else{
            this.frequencia = frequencia;
        }
    }
    
    public Aluno() {
    }

    public Aluno(int matricula, float media, float frequencia, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.matricula = matricula;
        /*validaMedia(media);
        validaFrequencia(frequencia);
        */
        this.setMedia(media);
        this.setFrequencia(frequencia);
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
        /*if (media >= 0 && media <= 10){
            this.media = media;
        }else{
            System.out.println("Média inválida"); 
        }*/
        /*if (media < 0 || media > 10){
            System.out.println("Média inválida"); 
        }else{
            this.media = media;
        }*/
        validaMedia(media);
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        /*if (frequencia >= 0 && frequencia <= 100){
            this.frequencia = frequencia;
        }else{
            System.out.println("Frequencia inválida"); 
        }*/
        /*if (frequencia < 0 || frequencia > 100){
            System.out.println("Frequencia inválida");
        }else{
            this.frequencia = frequencia;
        }*/
        validaFrequencia(frequencia);
    }
    
    /*Calcular a situação do aluno cosiderando media 7 e frequencia de 75%
    para ser aprovado.
    Armazenar no atributo situação do aluno.
    */
    public String getSituacao(){
        if (this.media < 7 || this.frequencia < 75){
             return "Reprovado";
        }else {
            return "Aprovado";
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " Aluno{" + "matricula=" + matricula + ", media=" + media + ", frequencia=" + frequencia + '}';
    }   

    @Override
    public boolean create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa retrieve(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
