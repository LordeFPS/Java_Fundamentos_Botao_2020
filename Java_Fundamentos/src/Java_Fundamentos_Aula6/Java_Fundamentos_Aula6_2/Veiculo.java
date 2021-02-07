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
public class Veiculo {
    private String marca;
    private String modelo;

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
    
    class Motor{
        private String tipoCombutivel;
        private String capacidade;

        public String getTipoCombutivel() {
            return tipoCombutivel;
        }

        public void setTipoCombutivel(String tipoCombutivel) {
            this.tipoCombutivel = tipoCombutivel;
        }

        public String getCapacidade() {
            return capacidade;
        }

        public void setCapacidade(String capacidade) {
            this.capacidade = capacidade;
        }

        @Override
        public String toString() {
            return "Motor{" + "tipoCombutivel=" + tipoCombutivel + ", capacidade=" + capacidade + '}';
        }
        
        
    }

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
}
