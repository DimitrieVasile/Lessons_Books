package homework_nr_13;

public class Main {
    public static void main(String[] args) {
        Airplane.AirplaneFilter airplaneFilter = new Airplane.AirplaneFilter();
        Airplane airplaneLBYL = airplaneFilter.createAirplaneLBYL("Boeing", "747", 8);
        Airplane airplaneEAFP = airplaneFilter.createAirplaneEAFP("Boeing", "787 Dreamliner", 6);

        System.out.println(" * " + airplaneLBYL.getManufacturer() + " " + airplaneLBYL.getModel() + " has " + airplaneLBYL.getNrOfEngines() + " engines");
        System.out.println(" * " + airplaneEAFP.getManufacturer() + " " + airplaneEAFP.getModel() + " has " + airplaneEAFP.getNrOfEngines() + " engines");
    }
}
