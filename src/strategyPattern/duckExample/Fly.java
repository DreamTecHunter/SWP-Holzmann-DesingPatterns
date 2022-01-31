package strategyPattern.duckExample;

public class Fly implements MovementBehaviour{
    @Override
    public void move() {
        System.out.println("*flying*");
    }
}
