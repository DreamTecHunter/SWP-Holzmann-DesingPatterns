package strategyPattern.duckExample;

public class Swim implements MovementBehaviour{
    @Override
    public void move() {
        System.out.println("*swimming*");
    }
}
