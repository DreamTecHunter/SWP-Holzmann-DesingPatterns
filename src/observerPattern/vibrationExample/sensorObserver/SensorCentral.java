package observerPattern.vibrationExample.sensorObserver;

import observerPattern.vibrationExample.Alerter;
import observerPattern.vibrationExample.Sensor;

public class SensorCentral extends Alerter implements SensorObserver {

    public SensorCentral(){
        super();
    }

    @Override
    public void update(Sensor sensor, int risk) throws Exception {
        switch (risk) {
            case 1:
                break;
            case 2:
                System.out.println("Warning: low danger");
                break;
            case 3:
                System.out.println("Alert: high danger");
                notifyObserver();
            default:
                    throw new Exception("Sensor defect");

        }
    }
}
