/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos_Aula4;

import java.time.LocalDate;
import java.time.temporal.TemporalQueries;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 69146
 */
public class Pessoa {
    static Scanner leitor = new Scanner(System.in);
    
    private String nome;
    private double peso;
    private double altura;
    private Date dataNasc;
    
    public static void main(String[] args) {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String calculoIMC() {
        //calculo IMC peso / altura^2
        String status = "Você esta OK!";
        
        double indice = (this.peso / (this.altura * this.altura));
        
        if (indice < 18.5)
            status = "Magreza";
        else if (indice < 25)
            status = "Normal";
        else if (indice < 30)
            status = "Sobrepeso";
        else if (indice < 35)
            status = "Obesidade Grau I";
        else if (indice < 40)
            status = "Obesidade Grau II";
        else
            status = "Obesidade Grau II";
        
        return status;
        
    }
    
    
    void leitor(){
        System.out.println("Status IMC: " + calculoIMC());
    }
    
}
