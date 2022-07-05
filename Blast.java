import java.util.ArrayList;

public class Blast extends Weapon {
    
    public Blast() {
    }


    public void shot() {
        System.out.println("shot.");
    }

    @Override
    public void drop(ArrayList<Weapon> weapon) {
        super.drop(weapon);
    }


    @Override
    public void pickUp(ArrayList<Weapon> weapon) {
        super.pickUp(weapon);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }



    @Override
    public void setDano(int dano) {
        super.setDano(dano);
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }    

    
}
