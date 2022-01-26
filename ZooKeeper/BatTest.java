public class BatTest {
    public static void main(String[] args) {
        
        Bat dracula = new Bat(300);
        dracula.displayEnergy();

        for (int i = 0; i < 3; i++){
            dracula.attackTown();
        }
        dracula.displayEnergy();

        dracula.eatHumans();
        dracula.eatHumans();
        dracula.displayEnergy();

        dracula.fly();
        dracula.fly();
        dracula.displayEnergy();

        
    }
}
