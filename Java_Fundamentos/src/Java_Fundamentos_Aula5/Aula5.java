/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Fundamentos_Aula5;


import Java_Fundamentos_Aula5.Heranca.Carro;
import Java_Fundamentos_Aula5.Heranca.Cereal;
import Java_Fundamentos_Aula5.Heranca.EstudanteFundamental;
import Java_Fundamentos_Aula5.Heranca.EstudanteGraduacao;
import Java_Fundamentos_Aula5.Heranca.EstudanteMedio;
import Java_Fundamentos_Aula5.Heranca.Motocicleta;
import Java_Fundamentos_Aula5.Heranca.Pessoa;
import Java_Fundamentos_Aula5.Heranca.Produto;
import Java_Fundamentos_Aula5.Heranca.ProtectedEstudante;
import Java_Fundamentos_Aula5.Heranca.Veiculo;

/**
 *
 * @author 69146
 */
public class Aula5 {
    
    public static void main(String[] args) {
        
        //Classes();
        //ExemploFinal();
        //Herenca();
        //Produto();
        //ExemploProtected();
        Exercicio();
        
    }
    
    public static void Exercicio() {
        //Criar 3 classes derivadasde ProtectedEstudante
        EstudanteFundamental construtor = new EstudanteFundamental(
                "Jorge","Come de tudo",true,
                123,"Jose","12345678901");
        construtor.listar();
        
        EstudanteMedio medio = new EstudanteMedio("2º", "15", 
                "Sagrada Família", 123, "Josifaldo", 
                "12345678901");
        medio.listar();
        
        EstudanteGraduacao faculdade = new EstudanteGraduacao("5º", 
                "21", "SENAI", 123, "Gabriel", 
                "08425648925");
        faculdade.listar();
        
        /*
        EstudanteFundamental fundamental = new EstudanteFundamental();
        fundamental.setNome("Jose");
        fundamental.setCpf("12345678901");
        fundamental.setMatricula(123);
        fundamental.setNomeResponsavel("Jorge");
        fundamental.setObservacao("Come de tudo");
        fundamental.setCuidadoEspecial(false);
        fundamental.listar();
        */
    }
    
   public static void ExemploProtected(){
       ProtectedEstudante estudante = new ProtectedEstudante();
       estudante.setNome("Gabriel");
       estudante.setMatricula(1234);
       estudante.setCpf("12345678901");
       estudante.listar();
   }
    
    public static void Produto() {
        Produto produto = new Produto();
        produto.setDescricao("Fruta");
        produto.setPreco(1);
        produto.setCategoria("Banana");
        
                
        Cereal cereal = new Cereal();
        cereal.setDescricao("Cereal de banana");
        cereal.setPreco(5);
        cereal.setCategoria("Industrializado");
        cereal.setTipoEmbalagem("Monama Granola");
        
    }
    
    public static void Herenca() {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("abc-1234");
        veiculo.setMarca("Ford");
        veiculo.setModelo("Ford Ka");
        
        veiculo.listar();
        veiculo.ronco();
        
        Motocicleta motocileta = new Motocicleta();
        motocileta.setCilindrada(300);
        motocileta.setPlaca("cba-4321");
        motocileta.setMarca("Yamaha");
        motocileta.setModelo("Yzf R3");
        motocileta.listar();
        motocileta.ronco();
        
        Carro carro = new Carro();
        carro.setPotencia(421);
        carro.setNumeroPortas(4);
        carro.setPlaca("asd-5433");
        carro.setMarca("Mercedes-AMG");
        carro.setModelo("A45 S");
        carro.listar();
        carro.ronco();
        
    }
    
    public static void ExemploFinal() {
        ExemploFinal exfinal = new ExemploFinal();
        System.out.println("Valor de x " + exfinal.x);
        //exfinal.x = 50;
        exfinal.y = 100;
        System.out.println("Resultado " + exfinal.Soma());
    }
    
    public static void Classes() {
        Pessoa p = new Pessoa();
        p.setNome("GABRIEL");
        p.setCpf("12345678901");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Cpf: " + p.getCpf());
        //p.Ola("Olá através do Obejeto");
        //Pessoa.Ola("Olá através da Classe");
    }
    
}
