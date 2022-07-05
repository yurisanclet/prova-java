import java.util.ArrayList;

public class Jedi implements Force {
    private String nome;
    private String titulo;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    
    public Jedi(String nome, String titulo){
        this.nome = nome;
        this.titulo = titulo;
    }
    
    public void pickUp(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void drop(Weapon weapon) {
        this.weapons.remove(weapon);
        
    }


    public void patience() {

    }



    @Override
    public void mindControl() {
        System.out.println(this.nome + " está usando o poder do controle da mente.");
    }

    public void mindControl(String controlado) {
        System.out.println("Do what I wish " + controlado);
    }

    @Override
    public void farseeing() {
        System.out.println(this.nome + " potencializou seus sentidos e consegue ver além.");
    }

    @Override
    public void telepathy() {
        System.out.println(this.nome + " está usando telepatia.");
    }

    @Override
    public void levitation() {
        System.out.println(this.nome + " está usando o poder da levitação.");
    }

    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public ArrayList<Weapon> getWeapon() {
        return weapons;
    }

    public void setWeapon(ArrayList<Weapon> weapon) {
        this.weapons = weapon;
    }

}
