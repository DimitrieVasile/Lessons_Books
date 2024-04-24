package homework_nr_13;

public class DivisibleBy7Counter {
    public static void main(String[] args) {
        int inferiorLimit = 1000;
        int superiorLimit = 100;

        try {
            int count = countDivisibleBy7Numbers(inferiorLimit, superiorLimit);
            System.out.println("Number of numbers divisible by 7 in the range " + inferiorLimit + " to " + superiorLimit + " : " + count + " numbers");
        } catch (InvalidRangeException e) {
            System.out.println("Invalid range: " + e.getMessage());
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Inferior limit cannot be greater than superior limit");
        }
        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}
