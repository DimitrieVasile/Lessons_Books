package homework_nr_13;

public class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;

    // Constructor
    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEnginesException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Attention! Manufacturer null or empty ");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Attention! Model null or empty");
        }
        if (nrOfEngines % 2 != 0 || nrOfEngines == 0) {
            throw new InvalidNrOfEnginesException("Attention! Nr of engines is equal to 0 or an odd number");
        }
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }

    public static class AirplaneFilter {
        public Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) {
            try {
                return new Airplane(manufacturer, model, nrOfEngines);

            } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
                e.printStackTrace();
                return null;
            }
        }

        public Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
            try {
                return new Airplane(manufacturer, model, nrOfEngines);
            } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public void setNrOfEngines(int nrOfEngines) {
        this.nrOfEngines = nrOfEngines;
    }
}


