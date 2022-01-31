package observerPattern.vibrationExample.sensorObserver;

import observerPattern.vibrationExample.Sensor;

public interface SensorObserver {
    void update(Sensor sensor, int risk) throws Exception;
}
