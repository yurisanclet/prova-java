public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Leia");
        pessoa1.setSobrenome("Organa");
        pessoa1.setSexo("Feminino");

        Pessoa pessoa2 = new Pessoa("Luke", "Skywalker", "Masculino");
        
        Jedi obiWan = new Jedi("Obi-Wan Kenobi", "Mestre");
        Sith darthVader = new Sith("Darth Vader", "Lorde");

        darthVader.mindControl();
        darthVader.levitation("Sabre");

        obiWan.mindControl("StormTropper");
        obiWan.levitation();

        Saber sabreAzul = new Saber();
        Saber sabreVermelho = new Saber();
        Blast blastLaser = new Blast();
        

        darthVader.pickUp(sabreVermelho);
        darthVader.getWeapon().get(0).setDescricao("Sabre vermelho");
        System.out.println(darthVader.getNome() + " pegou o " + darthVader.getWeapon().get(0).getDescricao()); 
        

        obiWan.pickUp(sabreAzul);
        obiWan.pickUp(blastLaser);
        obiWan.getWeapon().get(0).setDescricao("Sabre azul");
        obiWan.getWeapon().get(1).setDescricao("Blast Laser");      
        


        System.out.println(obiWan.getNome() + " pegou " + obiWan.getWeapon().get(0).getDescricao() + " e " + obiWan.getWeapon().get(1).getDescricao() );
        obiWan.drop(blastLaser);
        
        for (Weapon weapon: obiWan.getWeapon()) {
            System.out.println("Obi-wan tem um " + weapon.getDescricao());
        }

        for (Weapon weapon : darthVader.getWeapon()) {
            System.out.println("Darth Vader tem um " + weapon.getDescricao());
        }


    }
}
