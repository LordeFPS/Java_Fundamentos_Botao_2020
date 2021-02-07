/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Agregation;

/**
 *
 * @author 69146
 */
public class Motor {
    private String tipoConbustivel;
    private String capacidade;

    public String getTipoConbustivel() {
        return tipoConbustivel;
    }

    public void setTipoConbustivel(String tipoConbustivel) {
        this.tipoConbustivel = tipoConbustivel;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return " Motor{" + "tipoConbustivel=" + tipoConbustivel + ", "
                + "capacidade=" + capacidade + '}';
    }
    
    
}
