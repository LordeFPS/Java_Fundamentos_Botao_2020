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
public interface Icrud {
    public boolean create();
    public Object retrieve(int id);
    public abstract List<Object> retrieve();
    public boolean update(Object p);
    public void delete(int id);
    
}