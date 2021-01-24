/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula4;

/**
 *
 * @author 69146
 */
public class Pedido {
    private String produto;
    private double preco;
    private int qtd;
    private float desconto;
    private float acrescimo;
    private double total;

    
    public Pedido(){
        
    }
    public Pedido(String produto, double preco, int qtd, float desconto, float acrescimo) {
        this.produto = produto;
        this.preco = preco;
        this.qtd = qtd;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }
    
    public double getTotal(){
        
        double desconto = this.preco * (this.desconto / 100);
        double acrescimo = this.preco * (this.acrescimo / 100);
        
        return (this.preco + acrescimo - desconto) * this.qtd;
    }
    
    void leitor(){
        System.out.println("Produto: " + getProduto());
        System.out.println("Quantidade: " + getQtd());
        System.out.println("Preço Unit: " + getPreco());
        System.out.println("Total(R$): " + getTotal());
        System.out.println("");
    }
}
