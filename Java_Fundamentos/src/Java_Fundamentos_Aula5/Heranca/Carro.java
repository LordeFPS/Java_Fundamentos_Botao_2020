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
public class Carro extends Veiculo{
    private double potencia;
    private int numeroPortas;

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public void ronco(){
        System.out.println("Ronco do carro");
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Potência(cv): " + this.potencia);
        System.out.println("Nº Portas...: " + this.numeroPortas);
    }
    
}
