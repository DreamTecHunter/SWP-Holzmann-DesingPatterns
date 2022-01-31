package strategyPattern.duckExample;

public class Quack implements NoiseBehaviour{

    @Override
    public void makeNoise() {
        System.out.println("Quack, quack, quack!");
    }
}
