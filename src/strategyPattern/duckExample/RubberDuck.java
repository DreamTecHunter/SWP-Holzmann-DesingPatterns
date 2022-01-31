package strategyPattern.duckExample;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new Squeak(), new Swim());
    }
}
