/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5;

import Java_Fundamnetos_Aula5.Entidade.Venda;

/**
 *
 * @author 69146
 */
public class Aula5 {
    
    public static void main(String[] args) {
        
        //Classes();
        ExFinal();
        
    }
    
    public static void ExFinal() {
        ExemploFinal exfinal = new ExemploFinal();
        System.out.println("Valor de x " + exfinal.x);
        //exfinal.x = 50;
        exfinal.y = 100;
        System.out.println("Resultado " + exfinal.Soma());
    }
    
    public static void Classes() {
        Pessoa p = new Pessoa();
        p.nome = "GABRIEL";
        p.setCpf("1234");
        
        Venda v = new Venda();

    }
    
}
