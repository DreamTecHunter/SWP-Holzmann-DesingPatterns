package observerPattern.vibrationExample.alerter;

import observerPattern.vibrationExample.Alerter;

public class BlinkAlerter implements AlerterObserver {
    @Override
    public void alert(Alerter alerter) {
        System.out.println("Blink blink blink!");
    }
}
