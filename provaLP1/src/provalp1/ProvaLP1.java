/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provalp1;
import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class ProvaLP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crie uma classe para representar uma pessoa, 
        com os atributos privados de nome, idade e altura.
        Crie os métodos públicos necessários para acessar 
        os atributos privados e também crie um método 
        para imprimir os dados de uma pessoa.*/
        Scanner ent = new Scanner(System.in);
        Pessoa x = new Pessoa();
        
        System.out.println("Insira o nome: ");
        String nome = ent.nextLine();
        x.setNome(nome);
        
        System.out.println("Insira a idade: ");
        int idade = ent.nextInt();
        x.setIdade(idade);
        
        System.out.println("Insira a altura: ");
        double altura = ent.nextDouble();
        x.setAltura(altura);
        
        System.out.println("Esses são os seus dados: ");
        System.out.println(x.dados());
        
    }
    
}
