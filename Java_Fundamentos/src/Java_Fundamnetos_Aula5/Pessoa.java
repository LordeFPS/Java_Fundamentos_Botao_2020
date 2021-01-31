/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5;

import Java_Fundamnetos_Aula5.Utils.ValidaCPF;

/**
 *
 * @author 69146
 */
class Pessoa {
    private String nome;
    private String cpf;
    
    public static void Ola(String nome) {
        System.out.println("Nome: " + nome);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome.length() == 0){
            System.out.println("Informe o nome.");
        }else {
            this.nome = nome;
        }
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf) {
        if (ValidaCPF.validar(cpf)){
            this.cpf = cpf;
        }else{
            System.out.println("Cpf inválido");
        }
    }
}