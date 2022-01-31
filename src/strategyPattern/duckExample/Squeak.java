package strategyPattern.duckExample;

public class Squeak implements NoiseBehaviour{
    @Override
    public void makeNoise() {
        System.out.println("Squeak, squeak, squeak!");
    }
}
