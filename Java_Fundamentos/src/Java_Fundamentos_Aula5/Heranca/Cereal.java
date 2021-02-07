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
public class Cereal extends Produto{
    private String tipoEmbalagem;

    public Cereal(){
        
    }
    
    public Cereal(Cereal cereal) {
        this.tipoEmbalagem = cereal.getTipoEmbalagem();
    }
    
    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }
    
    public void leitor(){
        System.out.println("Tipo de Embalagem: " + getTipoEmbalagem());
    }
    
}
