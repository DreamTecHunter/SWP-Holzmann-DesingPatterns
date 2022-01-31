package observerPattern.vibrationExample.alerter;

import observerPattern.vibrationExample.Alerter;

public class SirenAlerter implements AlerterObserver {

    @Override
    public void alert(Alerter alerter) {
        System.out.println("Ta tu ta ta!");
    }
}
