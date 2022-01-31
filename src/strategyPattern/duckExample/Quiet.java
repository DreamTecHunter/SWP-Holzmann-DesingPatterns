package strategyPattern.duckExample;

public class Quiet implements NoiseBehaviour{
    @Override
    public void makeNoise() {
        System.out.println("*Nothing to hear*");
    }
}
