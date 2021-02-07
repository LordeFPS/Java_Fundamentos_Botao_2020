/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula5.Heranca;

/**
 *
 * @author 69146
 */
public class Motocicleta extends Veiculo{
    //usando o "extends" a calsse Motocicleta passa a ter os atributos
    //da classe veiculo, logo a classe Veiculo é "pai" da classe Motocicleta
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void ronco(){
        System.out.println("Ronco da moto");
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Cilindrada..: " + this.cilindrada);
    }
    
}
