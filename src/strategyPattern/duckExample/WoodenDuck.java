package strategyPattern.duckExample;

public class WoodenDuck extends Duck{
    public WoodenDuck() {
        super(new Quiet(), new Roll());
    }
}
