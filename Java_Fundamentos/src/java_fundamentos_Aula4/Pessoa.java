/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula4;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalQueries;
import java.util.Calendar;
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
    private LocalDate dataNasc;
    
    
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        
        //LocalDate.of(ano, mes, dia);
        
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
    
    public int calculoIdade(){
        
        int idade = 0;
        
        int anoNasc = this.dataNasc.getYear();
        int mesNasc = this.dataNasc.getMonthValue();
        int diaNasc = this.dataNasc.getDayOfMonth();
        
        LocalDate dataHoje = LocalDate.now();
        int anoHoje = dataHoje.getYear();
        int mesHoje = dataHoje.getMonthValue();
        int diaHoje = dataHoje.getDayOfMonth();
        
        idade = anoHoje - anoNasc;
        
        if (mesNasc > mesHoje)
            idade = idade - 1;
        else if (mesHoje == mesNasc){
            if (diaNasc < diaHoje)
                idade = idade - 1;
        }
        
        
        return idade;
    }
    
    public void datas(){
        /*
          Calcula a idade da pessoa cadastrada automaticamento de acordo com
          a data de nascimento cadastrada.
        */
        /*
        Calendar c = Calendar.getInstance();
        c.set(2021, 01, 24);
        System.out.println(c.getTime());
        */
        /*
        Exemplo de para gerar datas
        LocalDate dt = LocalDate.of(2021, Month.JANUARY, 24);
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getMonth());
        System.out.println(dt.getYear());
        */
        
    }
    
    void leitor(){
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Idade: " + calculoIdade());
        System.out.println("Status IMC: " + calculoIMC());
        
    }

}
