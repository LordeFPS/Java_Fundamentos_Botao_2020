/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula5.Utils;

/**
 *
 * @author 69146
 */
public class ValidaCPF {
    
    public static boolean validar(String cpf){
        if(cpf.length() != 11){
            return false;
        }else{
            //calcular modulo 11
        }
        return true;
    }
    
}
