/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentos.Aula3;

/**
 *
 * @author 69146
 */
public class Java_Fundamentos_Aula3_Operações {
    private float soma;
    private float subtrai;
    private float multiplica;
    private float divide;
    
    public float getSoma(float pValor1, float pValor2){
        soma = pValor1 + pValor2;
        return this.soma;
    }
    public float getSubtrai(float pValor1, float pValor2){
        subtrai = pValor1 - pValor2;
        return this.subtrai;
    }
    public float getMultiplica(float pValor1, float pValor2){
        multiplica = pValor1 * pValor2;
        return this.multiplica;
    }
    public float getDivide(float pValor1, float pValor2){
        if (pValor2 <= 0){
            System.out.println("Divisão por zero inválida!");
        }else {
            divide = pValor1 / pValor2;
        }
        return this.divide;
    }
}
