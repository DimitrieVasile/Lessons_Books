package homework_nr_12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Months:");
        for (Months month : Months.values()) {
            System.out.println(month);

            System.out.println("\nFuel Types:");
            System.out.println("GASOLINE is liquid fuel: " + FuelTypes.Gasoline.isLiquidFuel());
            System.out.println("Diesel is liquid fuel: " + FuelTypes.Diesel.isLiquidFuel());
            System.out.println("Hydrogen is liquid fuel: " + FuelTypes.Hydrogen.isLiquidFuel());
            System.out.println("Hydrogen is liquid fuel: " + FuelTypes.Hydrogen.isLiquidFuel());
            System.out.println("Kerosene is liquid fuel: " + FuelTypes.Kerosene.isLiquidFuel());

            System.out.println("Biomass is  liquid fuel: " + FuelTypes.Biomass.isLiquidFuel());
            System.out.println("Electricity is  liquid fuel: " + FuelTypes.Electricity.isLiquidFuel());
            System.out.println("Wood is  liquid fuel: " + FuelTypes.Wood.isLiquidFuel());

            System.out.println("\nCheck Integer :");
            int numberA = 8;
            int numberB = -6;
            int numberC = 15;
            int numberD = -3;
            System.out.println(numberA + " is odd : " + CheckInteger.CHECK_IF_ODD.test(numberA));
            System.out.println(numberB + " if even : " + CheckInteger.CHECK_IF_EVEN.test(numberB));
            System.out.println(numberC + " if positive : " + CheckInteger.CHECK_IF_POSITIVE.test(numberC));
            System.out.println(numberD + " is negative : " + CheckInteger.CHECK_IF_NEGATIVE.test(numberD));
        }
    }
}