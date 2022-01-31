package strategyPattern.duckExample;

public class HouseDuck extends Duck{
    public HouseDuck() {
        super(new Quack(), new Fly());
    }

}
