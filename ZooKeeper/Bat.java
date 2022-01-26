public class Bat extends Mammal{
    
    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly(){
        System.out.println("WHOOSH\n");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Ah! My leg!");
        this.energyLevel -= 100;
    }
}
