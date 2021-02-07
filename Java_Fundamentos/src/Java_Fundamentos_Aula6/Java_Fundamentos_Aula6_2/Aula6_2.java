/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Java_Fundamentos_Aula6_2;

/**
 *
 * @author 69146
 */
public class Aula6_2 {
    
    public static void main(String[] args) {
        veiculo();
    }
    
    public static void veiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Mercedes");
        veiculo.setModelo("AMG A 45 S");
        
        Veiculo.Motor  motor = veiculo.new Motor();
        motor.setTipoCombutivel("Gasolina");
        motor.setCapacidade("421cv");
        
        System.out.println(veiculo.toString());
        System.out.println(motor.toString());
    }
}
