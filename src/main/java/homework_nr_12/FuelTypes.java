package homework_nr_12;

public enum FuelTypes {
    Gasoline(true),
    Diesel(true),
    Hydrogen(true),
    Electricity(false);
    private final boolean isLiquidFuel;

    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }
    public boolean isLiquidFuel() {
        return isLiquidFuel;
    }
}
