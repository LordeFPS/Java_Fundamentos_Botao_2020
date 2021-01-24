/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula3;

/**
 *
 * @author 69146
 */
public class Aula3_Carro {
    
    String marca;
    String modelo;
    String placa;
    String combutivel;
    int    nportas;
    int    capacidade;
    int    cv;
    String cor;
    
    public void listar() {
        
        System.out.println("________________________________");
        System.out.println("Marca......:" + this.marca);
        System.out.println("Modelo.....:" + this.modelo);
        System.out.println("Placa......:" + this.placa);
        System.out.println("Combustíbel:" + this.combutivel);
        System.out.println("Nº Portas..:" + this.nportas);
        System.out.println("Capacidade.:" + this.capacidade);
        System.out.println("Cavalos(HP):" + this.cv);
        System.out.println("Cor........:" + this.cor);
        System.out.println("________________________________");
    }
}
