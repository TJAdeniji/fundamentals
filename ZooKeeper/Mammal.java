public class Mammal {
    
    public int energyLevel = 100;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("The energy level is: " + this.energyLevel);
        return this.energyLevel;
    }
}
