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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        if (ValidaCPF.validar(cpf)){
            this.cpf = cpf;
        }else {
            System.out.println("Cpf inválido");
        }
    }
}
