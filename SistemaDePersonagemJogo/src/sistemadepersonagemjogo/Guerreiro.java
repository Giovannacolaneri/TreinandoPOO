/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagemjogo;

/**
 *
 * @author Admin
 */
public class Guerreiro extends Personagem{
    
    //Atributos especificos da subclasse
    private String arma;

    public Guerreiro(String arma, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.arma = arma;
    }
    
    //metodo de acesso

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
   
    }
    
    public void defender(){
    System.out.println("O guerreiro com nome "+ getNome() +" defendeu.");
    }
    
    @Override
     public void mostrarStatus(){
    System.out.println("---Status do personagem de jogo---");
    System.out.println("Nome do personagem: "+ getNome());
    System.out.println("Nivel do personagem: "+ getNivel());
    System.out.println("Nivel do personagem: " + getVida());
    System.out.println("Arma: "+arma);

    }
    
    
        
    
}
