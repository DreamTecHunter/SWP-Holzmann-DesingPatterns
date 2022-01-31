package strategyPattern;

import strategyPattern.duckExample.*;

import java.util.ArrayList;
import java.util.List;

public class Playground {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new HouseDuck());
        ducks.add(new WoodenDuck());
        ducks.add(new RubberDuck());
        letTheDucksOut(ducks);
        ducks.get(2).setNoiseBehaviour(new Quiet());
        letTheDucksOut(ducks);
    }

    private static void letTheDucksOut(List<Duck> ducks){
        System.out.println("\nA flock of ducks:");
        for(Duck d: ducks){
            System.out.println(d.getClass().getSimpleName());
            d.makeNoise();
            d.move();
        }
    }

}
