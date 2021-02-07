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
public class Veiculo {
    private String Marca;
    private String modelo;
    private Motor motor;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "Marca=" + Marca + ", modelo=" + modelo + ", "
                + "motor=" + motor + '}';
    }
    
    
}
