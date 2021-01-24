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
        //pessoa();
        //tryCatch();
        pedido();
        
    }
    public static void pedido() {
        /*
        Fazer um exemplo de pedido contendo:
        produto
        preco
        quantidade
        desconto
        acrescimo
        __________
        usando
        gets
        sets
        double getToral();
        */
        Pedido pedido = new Pedido("Carne", 10, 10, 10, 0);
        pedido.leitor();
        
        Pedido pedido2 = new Pedido("Arroz", 10, 10, 10, 10);
        pedido2.leitor();
        
    }
    public static void tryCatch(){
        //Todo codigo que esta dentro de TRY protege o sistema para não dar erro
        // e parar o sistema
        try{
            Pessoa obj = null;
            obj.getNome();
        }catch(NullPointerException ex){
            System.out.println("O objeto pessoa não foi instanciado utilize new");
        }
        try{
            int x = 10;
            int y = 0;
            System.out.println("Divisão: " + (x/y));
        }catch(ArithmeticException ex){
            
        }
        System.out.println("Continuando..");
    }
    public static void pessoa() {
        /*
        Foi feito toda a parte de contas atraves de getters e setters
        tabem foi criado a classe pessoa para conter toda a parte de contas 
        necessarias.
        */
        LocalDate dt = LocalDate.of(1999, Month.JANUARY, 24);
        
        Pessoa p = new Pessoa();
        p.setNome("Gabriel");
        p.setPeso(51);
        p.setAltura(1.65);
        p.setDataNasc(dt);
        //System.out.println(p.calculoIdade());
        p.leitor();
        
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
