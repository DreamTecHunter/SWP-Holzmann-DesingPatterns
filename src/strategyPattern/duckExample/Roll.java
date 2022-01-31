package strategyPattern.duckExample;

public class Roll implements MovementBehaviour{
    @Override
    public void move() {
        System.out.println("*rolling*");
    }
}
