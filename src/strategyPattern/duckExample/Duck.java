package strategyPattern.duckExample;

public class Duck {
    private NoiseBehaviour noiseBehaviour;
    private MovementBehaviour movementBehaviour;


    // Constructor
    public Duck(NoiseBehaviour noiseBehaviour, MovementBehaviour movementBehaviour){
        this.noiseBehaviour = noiseBehaviour;
        this.movementBehaviour = movementBehaviour;
    }

    // Make noise
    public void makeNoise(){
        // Delegate
        noiseBehaviour.makeNoise();
    }

    // Move

    public void move(){
        movementBehaviour.move();
    }

    // Change the NoiseBehaviour


    public NoiseBehaviour getNoiseBehaviour() {
        return noiseBehaviour;
    }

    public void setNoiseBehaviour(NoiseBehaviour noiseBehaviour) {
        this.noiseBehaviour = noiseBehaviour;
    }

    public MovementBehaviour getMovementBehaviour() {
        return movementBehaviour;
    }

    public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
        this.movementBehaviour = movementBehaviour;
    }
}
