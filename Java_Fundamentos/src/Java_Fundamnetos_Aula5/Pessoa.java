/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamnetos_Aula5;

/**
 *
 * @author 69146
 */
class Pessoa {
    String nome;
    private String cpf;

    public void setCpf(String cpf) {
        if (cpf.length() == 11){
            this.cpf = cpf;
        }else{
            System.out.println("Cpf inválido");
        }
        
    }
    
}
