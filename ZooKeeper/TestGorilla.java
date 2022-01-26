public class TestGorilla {
    public static void main(String[] args) {
        
        Gorilla harambe =  new Gorilla(100);

        for(int i = 0; i < 3; i++){
            harambe.throwSomething();
        }

        harambe.eatBananas();
        harambe.eatBananas();

        harambe.climb();
        
    }
}
