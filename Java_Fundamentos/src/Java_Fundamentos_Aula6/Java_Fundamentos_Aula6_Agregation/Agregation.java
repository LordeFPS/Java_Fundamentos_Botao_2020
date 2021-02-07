/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Java_Fundamentos_Aula6_Agregation;

/**
 *
 * @author 69146
 */
public class Agregation {
    
    public static void main(String[] args) {
        motor();
    }
    
    public static void motor() {
        Motor motor = new Motor();
        motor.setCapacidade("421cv");
        motor.setTipoConbustivel("Gasolina");
        //System.out.println(motor.toString());
    
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Mercedes");
        veiculo.setModelo("AMG A45S");
        veiculo.setMotor(motor);
        System.out.println(veiculo.toString());
    }
}
