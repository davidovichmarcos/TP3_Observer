package MarcosUTN.entities;

import java.util.Observable;
import java.util.Observer;

public class Mechanic implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Car)
        {

        }
    }

}
