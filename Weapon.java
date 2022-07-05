import java.util.ArrayList;

public class Weapon {
    private String descricao;
    private int dano;
    

    public void drop(ArrayList<Weapon> weapon) {
        System.out.println(this.descricao + " dropada.");        
    }

    public void pickUp(ArrayList<Weapon> weapon) {
        System.out.println("Pegou a " + this.descricao);        
    }
  
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
