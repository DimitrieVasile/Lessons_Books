package homework_nr_14;

import java.io.Serializable;

public class AirTransportGeneric <T extends Vehicle & Serializable> {
    private T vehicle;

    public AirTransportGeneric(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
