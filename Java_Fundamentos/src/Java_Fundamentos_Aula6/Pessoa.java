/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6;

import java.util.List;

/**
 *
 * @author 69146
 */
public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String email;
    private String fone;

    public Pessoa() {
    }
    
    public Pessoa(int id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }
 
    public abstract boolean create();
    
    public abstract Pessoa retrieve(int id);
    
    public abstract List<Pessoa> retrieve();
    
    public boolean update(Pessoa p){
        return true;
    }
    
    public void delete(int id){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + '}';
    }
       
}
