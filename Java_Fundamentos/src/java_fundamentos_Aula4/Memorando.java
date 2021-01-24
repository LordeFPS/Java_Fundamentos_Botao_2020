/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula4;

/**
 *
 * @author 69146
 */
public class Memorando {
    private String assunto;
    private String destinatario;
    private String signatario;
    
    //GET's and SET's
    public String getAssunto(){//construtor sem parametro
        return assunto;   
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getSignatario() {
        return signatario;
    }
    public void setSignatario(String signatario) {
        this.signatario = signatario;
    }

    
            
    Memorando() {
    }
    Memorando(String assunto){ //Construtor com sobrecarga com parametro
        this.assunto = assunto;
        
    }
    Memorando(String assunto, String destinatario){ //Construtor com sobrecarga com parametro
        this.assunto = assunto;
        this.destinatario = destinatario;
        
    }
    Memorando(String assunto, String destinatario, String signatario){ //Construtor com sobrecarga com parametro
        this(assunto, destinatario);
        this.signatario = signatario;
    }
    void listar(){
        System.out.println(assunto);
        System.out.println(destinatario);
        System.out.println(signatario);
        System.out.println("");
    }
}
