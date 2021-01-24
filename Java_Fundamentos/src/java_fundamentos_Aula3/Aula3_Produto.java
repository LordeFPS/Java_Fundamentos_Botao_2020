/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos.Aula3;

/**
 *
 * @author 69146
 */
public class Java_fundamentos_Aula3_Produto {
    
    String descriocao;
    Float  preco;
    int    quantidade;
    
    public void calculaItem() {
     /*
        Criar metodo para calcular valor de cada item/objeto e listar o resultado.
    */
        
        System.out.println("Total.......:" + String.format("%.2f",this.preco * this.quantidade));
    }
    public void listar() {
        
        System.out.println("");
        System.out.println("Descrição...:" + this.descriocao);
        System.out.println("Peço........:" + this.preco);
        System.out.println("Quanditade..:" + this.quantidade);
        
        
    }
}
