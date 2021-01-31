/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5.Heranca;

import Java_Fundamnetos_Aula5.Utils.ValidaCPF;

/**
 *
 * @author 69146
 */
public class ProtectedPessoa {
    protected String nome;
    protected String cpf;

    public ProtectedPessoa() {
        
    }
    
    public ProtectedPessoa(String nome, String cpf) {
        this.nome = nome;
        if (ValidaCPF.validar(cpf)){
            this.cpf = cpf;
        }else {
            System.out.println("Cpf inválido");
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf){
        if (ValidaCPF.validar(cpf)){
            this.cpf = cpf;
        }else {
            System.out.println("Cpf inválido");
        }
    }
    
    public void listar(){
        System.out.println("");
        System.out.println("Nome.......: " + this.nome);
        System.out.println("CPF........: " + this.cpf);
    }
}
