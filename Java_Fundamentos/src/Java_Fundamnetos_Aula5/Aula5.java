/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5;

import Java_Fundamnetos_Aula5.Entidade.Venda;
import Java_Fundamnetos_Aula5.Heranca.Motocicleta;
import Java_Fundamnetos_Aula5.Heranca.Veiculo;

/**
 *
 * @author 69146
 */
public class Aula5 {
    
    public static void main(String[] args) {
        
        //Classes();
        //ExFinal();
        Herenca();
        
    }
    
    public static void Herenca() {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("abc-1234");
        veiculo.setMarca("Ford");
        veiculo.setModelo("Ford Ka");
        
        Motocicleta motocileta = new Motocicleta();
        motocileta.setCilindrada(300);
        motocileta.setPlaca("cba-4321");
        motocileta.setMarca("Yamaha");
        motocileta.setModelo("Yzf R3");
        
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
        p.setNome("GABRIEL");
        p.setCpf("12345678901");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Cpf: " + p.getCpf());
        //p.Ola("Olá através do Obejeto");
        //Pessoa.Ola("Olá através da Classe");
    }
    
}
