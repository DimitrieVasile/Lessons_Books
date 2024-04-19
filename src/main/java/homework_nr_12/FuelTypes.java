package homework_nr_12;

public enum FuelTypes {
    Gasoline(true),
    Diesel(true),
    Kerosene(true),
    Hydrogen(true),
    Biomass(false),
    Wood(false),
    Electricity(false);

    private boolean isLiquidFuel;

    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }

    public boolean isLiquidFuel() {
        return isLiquidFuel;
    }
}
