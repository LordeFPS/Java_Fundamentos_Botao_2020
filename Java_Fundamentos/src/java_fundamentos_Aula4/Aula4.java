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
public class Aula4 {
    
    public static void main(String[] args) {
        Memorando obj = new Memorando("Assunto 1");
        obj.setDestinatario("Destinatario 1 com SET");
        obj.setSignatario("Signatario 1 com SET");
        obj.listar();
        
        Memorando obj2 = new Memorando("Assunto 2", "Destinatario 2");
        obj2.listar();
        
        Memorando obj3 = new Memorando("Assunto 3", "Destina 3", "Signatario 3");
        obj3.listar();
        
        
    }
    
}
