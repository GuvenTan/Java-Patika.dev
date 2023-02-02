package Classes.BoksOyunu;

public class Fighter {
	String name;
    int damage;
    int health;
    int weight;

    int dodgeChance;
    int firstChance;

    public Fighter(String name, int damage, int health, int weight, int dodgeChance, int firstChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodgeChance >= 0 && dodgeChance <= 100){
            this.dodgeChance = dodgeChance;
        }else {
            this.dodgeChance = 0;
        }
    }


	public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }
    boolean isFirst(){
        double firstHit = Math.random()*100;
        return firstHit <= this.firstChance;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodgeChance;
    }
}
