package observerPattern.vibrationExample;

import observerPattern.vibrationExample.alerter.AlerterObserver;
import observerPattern.vibrationExample.sensorObserver.SensorObserver;

import java.util.*;

public class Sensor {
    private List<SensorObserver> sensorObservers = new ArrayList<SensorObserver>();

    public Sensor() {
    }

    public void add(SensorObserver sensorObserver) {
        this.sensorObservers.add(sensorObserver);
    }

    public void remove(SensorObserver sensorObserver) {
        this.sensorObservers.remove(sensorObserver);
    }

    public void notifyObserver(int risk) throws Exception {
        for (SensorObserver so : this.sensorObservers) {
            so.update(this, risk);
        }

    }
}
