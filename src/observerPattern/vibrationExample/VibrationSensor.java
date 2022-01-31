package observerPattern.vibrationExample;

public class VibrationSensor extends Sensor {
    double amplitude;

    public VibrationSensor() {
        super();
        this.amplitude = 0;
    }

    public void measurementAmplitude(double amplitude) {
        if (amplitude <= 0) {
            throw new IllegalArgumentException("Amplitude has to be greater then 0");
        }
        this.amplitude = amplitude;
        try {
            switch ((int) amplitude) {
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    notifyObserver(1);
                    break;
                case 6:
                case 7:
                    notifyObserver(2);
                    break;
                default:
                    notifyObserver(3);
                    break;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
