/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos_Aula4;

/**
 *
 * @author 69146
 */
public class Memorando {
    private String assunto;
    private String destinatario;
    private String signatario;
    
    //GET's and SET's
    public void setAssunto(String assunto) {
        if (assunto.length() < 5){
            System.out.println("Tamanho Inválido para assunto");
        } else {
            this.assunto = assunto;
        }
    }
    public void setDestinatario(String destinatario) {
        if (destinatario.length() < 5){
            System.out.println("Tamanho Inválido para destinatário");
        } else {
            this.destinatario = destinatario;
        }
    }
    
    public void setSignatario(String signatario) {
        if (signatario.length() < 5){
            System.out.println("Tamanho Inválido para signatario");
        } else {
            this.signatario = signatario;
        }
    }
    
    Memorando(){//construtor sem parametro
        
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
