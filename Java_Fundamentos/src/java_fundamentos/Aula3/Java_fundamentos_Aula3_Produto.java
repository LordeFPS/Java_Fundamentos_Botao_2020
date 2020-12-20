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
    
    public void listar() {
        
        System.out.println("Descrição...:" + this.descriocao);
        System.out.println("Peço........:" + this.preco);
        System.out.println("Quanditade..:" + this.quantidade);
        System.out.println("");
        
    }
}
