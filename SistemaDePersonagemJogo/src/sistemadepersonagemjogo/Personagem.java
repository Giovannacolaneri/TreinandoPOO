/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagemjogo;

/**
 *
 * @author Admin
 */
public class Personagem {

    //atributos
    private String nome;
    private int nivel;
    private int vida;

    //construtores
    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    
    //metodos comuns
    public void atacar(){
       System.out.println(nome +" atacou");
    }
    
    public void mostrarStatus(){
    System.out.println("---Status do personagem de jogo---");
    System.out.println("Nome do personagem: "+nome);
    System.out.println("Nivel do personagem: "+nivel);
    System.out.println("Nivel do personagem: "+vida);
    }
    
    //metodo de acesso
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
