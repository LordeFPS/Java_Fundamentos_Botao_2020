/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula6.Interface;

import java.util.List;

/**
 *
 * @author 69146
 */
public class Pessoa implements Icrud{

    @Override
    public boolean create() {
        //Aqui é onde colocamos as regras ne negócio ou o código que foi pedido
        //pela equipe de acordo com a documentação
        return true;
    }

    @Override
    public Object retrieve(int id) {
        //Aqui é onde colocamos as regras ne negócio ou o código que foi pedido
        //pela equipe de acordo com a documentação
        return null;
    }

    @Override
    public List<Object> retrieve() {
        //Aqui é onde colocamos as regras ne negócio ou o código que foi pedido
        //pela equipe de acordo com a documentação
        return null;
    }

    @Override
    public boolean update(Object p) {
        //Aqui é onde colocamos as regras ne negócio ou o código que foi pedido
        //pela equipe de acordo com a documentação
        return true;
    }

    @Override
    public void delete(int id) {
        //Aqui é onde colocamos as regras ne negócio ou o código que foi pedido
        //pela equipe de acordo com a documentação
    }
    
}
