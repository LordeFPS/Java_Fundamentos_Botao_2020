/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5.Heranca;

/**
 *
 * @author 69146
 */
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void ronco(){
        System.out.println("Ronco do veículo");
    }
    public void listar(){
        System.out.println("");
        System.out.println("Placa.......: " + this.placa);
        System.out.println("Marca.......: " + this.marca);
        System.out.println("Modelo......: " + this.modelo);
    }
    
    
}
