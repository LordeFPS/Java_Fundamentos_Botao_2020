/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula5.Heranca;

/**
 *
 * @author 69146
 */
public class EstudanteMedio extends ProtectedEstudante{
    private String ano;
    private String idade;
    private String escola;

    public EstudanteMedio() {
    }

    public EstudanteMedio(String ano, String idade, String escola, int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
        this.ano = ano;
        this.idade = idade;
        this.escola = escola;
    }
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println("Ano........: " + this.ano);
        System.out.println("Idade......: " + this.idade);
        System.out.println("Escola.....: " + this.escola);
    }
}
