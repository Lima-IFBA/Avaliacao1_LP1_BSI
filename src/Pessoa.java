/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }
     public void setNome(String _nome){
         nome = _nome;
     }
     public void setIdade(int _idade){
         idade = _idade;
     }
     public void setAltura(double _altura){
         altura = _altura;
     }
     
     public String dados(){
         return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
     }
     
     
     
     
    
}
