import java.util.ArrayList;

public class Saber extends Weapon{
    public Saber(){
        
    }

    public void slash() {
        System.out.println(" slash");
    }

    @Override
    public void drop(ArrayList<Weapon> weapon) {
        super.drop(weapon);
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
    public void pickUp(ArrayList<Weapon> weapon) {
        super.pickUp(weapon);
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