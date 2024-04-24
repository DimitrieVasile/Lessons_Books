package homework_nr_12;

public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        output.append("\n" + "Months:");
        for (Months months : Months.values())
            output.append(months).append("\n");

        output.append("\nFuel Types:\n");
        for (FuelTypes fuelType : FuelTypes.values())
            output.append(fuelType).append(" is liquid fuel: ").append(fuelType.isLiquidFuel()).append("\n");

        output.append("\nCheck Integer:\n");
        int[] numbers = {8, -6, 15, -3};
        for (int number : numbers) {
            output.append(number).append(" is ")
                    .append(CheckInteger.CHECK_IF_ODD.testNumb(number) ? "odd" : "even").append(", ")
                    .append(CheckInteger.CHECK_IF_POSITIVE.testNumb(number) ? "positive" : "negative")
                    .append("\n");
        }
        System.out.println(output);
    }
}


