package observerPattern;

import observerPattern.vibrationExample.alerter.BlinkAlerter;
import observerPattern.vibrationExample.sensorObserver.SensorCentral;
import observerPattern.vibrationExample.VibrationSensor;

public class Playground {
    public static void main(String[] args) {
        VibrationSensor vb1 = new VibrationSensor(), vb2 = new VibrationSensor(), vb3 = new VibrationSensor();
        SensorCentral central = new SensorCentral();

        vb1.add(central);
        vb2.add(central);
        vb3.add(central);

        BlinkAlerter ba1 = new BlinkAlerter();

        central.add(ba1);

        vb1.measurementAmplitude(3);
        vb2.measurementAmplitude(8);
    }
}
