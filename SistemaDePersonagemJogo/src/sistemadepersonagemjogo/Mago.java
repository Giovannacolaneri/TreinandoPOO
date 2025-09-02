/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagemjogo;

/**
 *
 * @author Admin
 */
public class Mago extends Personagem {

   
    private int mana;

    public Mago(int mana, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.mana = mana;
    }
    
    //metodos especificos
    public void consumirMana(){
    System.out.println("O mago com nome "+ getNome() + "está consumindo mana!");
    }
    public void recuperarMana(){
    System.out.println("O mago com nome "+ getNome() + "esta recuperando mana!");
    }
    
     public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
}
