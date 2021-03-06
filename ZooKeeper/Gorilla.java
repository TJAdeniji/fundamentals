public class Gorilla extends Mammal {
    
    
    public Gorilla(int energyLevel){
        super(energyLevel);
    }


    public void throwSomething(){
        System.out.println("Gorilla has thrown something. \n");
        energyLevel -= 5;
    } 

    public void eatBananas(){
        System.out.println("Yum, bananas.");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("Gorilla has climbed a tree.");
        energyLevel -= 10;
    }
}
