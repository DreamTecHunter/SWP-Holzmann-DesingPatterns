package observerPattern.vibrationExample;

import observerPattern.vibrationExample.alerter.AlerterObserver;

import java.util.ArrayList;
import java.util.List;

public class Alerter {
    private List<AlerterObserver> alerterObservers = new ArrayList<AlerterObserver>();

    public Alerter() {

    }

    public void add(AlerterObserver alerterObserver) {
        this.alerterObservers.add(alerterObserver);
    }

    public void remove(AlerterObserver alerterObserver) {
        this.alerterObservers.remove(alerterObserver);
    }

    public void notifyObserver() {
        for (AlerterObserver ao : this.alerterObservers){
            ao.alert(this);
        }
    }
}
