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
public class Produto {
    private String descricao;
    private float preco;
    private String categoria;
    
    public Produto(){
        
    }
    
    public Produto(Produto produto) {
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
        this.categoria = produto.getCategoria();
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    void leitor(){
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Categoria: " + getCategoria());
    }
}
