/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula4;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author 69146
 */
public class Aula4 {
    
    public static void main(String[] args) {
        
        //Memorando();
        //IMC();
        LocalDate dt = LocalDate.of(1999, Month.JANUARY, 26);
        
        Pessoa p = new Pessoa();
        p.setNome("Gabriel");
        p.setPeso(51);
        p.setAltura(1.65);
        p.setDataNasc(dt);
        System.out.println(p.calculoIdade());
        //p.leitor();
        
    }
    public static void idade(){
        
    }
    
    public static void IMC() {
        /*
        Pessoa p = new Pessoa();
        p.setNome("Gabriel");
        p.setPeso(51);
        p.setAltura(1.65);
        p.leitor();
        */
        
    }
    public static void Memorando() {
        
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
