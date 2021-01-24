/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos_Aula3;

/**
 *
 * @author 69146
 */
public class Aula3_Boletim {
    
    private String matricula;
    private String nome;
    private float media;
    private float frequencia;
    
    // Métodos com retorno (função)
    public String getNome(){
        return this.nome;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public  float getMedia(){
        return this.media;
    }
    
    public float getFrequencia(){
        return this.frequencia;
    }
    
    // Métodos sem retorno (parametros)
    public void setNome(String pNome){
        if (pNome.equals("")){
            System.out.println("Informe o nome!!");
        }else {
            this.nome = pNome;
        }
    }
    
    public void setMatricula(String pMatricula){
        if (pMatricula.equals("")){
            System.out.println("Informe a matrícula!!");
        }else {
            this.matricula = pMatricula;
        }
    }
    
    public void setMedia(float pMedia){
        if (pMedia < 0 || pMedia > 10){
            System.out.println("Média inválida!!");
        }else {
            this.media = pMedia;
        }
    }
    
    public void setfrequencia(float pFrequenia) {
        if (pFrequenia < 0 || pFrequenia > 100){
            System.out.println("Frequencia inválida!");
        }else {
            this.frequencia = pFrequenia;
        }
    }
}
