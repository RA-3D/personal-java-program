
import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principalAmount = getUserInput(scanner, "Starting amount: ");
        int yearsToInvest = (int) getUserInput(scanner, "Years to invest: ");
        double annualRateOfReturn = getUserInput(scanner, "Hypothetical annual rate of return: ");
        int timeInterval = getCompoundingFrequency(scanner);

        double finalAmount = calculateFinalAmount(principalAmount, yearsToInvest, annualRateOfReturn, timeInterval);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String initialAmountFormatted = decimalFormat.format(principalAmount);
        String finalAmountFormatted = decimalFormat.format(finalAmount);
        String rateFormatted = decimalFormat.format(annualRateOfReturn);

        System.out.println("Investing an initial amount of $" + initialAmountFormatted +
                " could be worth $" + finalAmountFormatted +
                " after " + yearsToInvest + " years if the annual rate of return was " +
                rateFormatted + "%.");

        scanner.close();
    }

    private static double getUserInput(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    private static int getCompoundingFrequency(Scanner scanner) {
        System.out.println("Compounding frequency (Annually, Semiannually, Monthly, Quarterly, Daily): ");
        String frequency = scanner.next().toLowerCase();

        switch (frequency) {
            case "semiannually":
                return 2;
            case "monthly":
                return 12;
            case "quarterly":
                return 4;
            case "daily":
                return 365; 
            default:
                return 1;   
        }
    }

    private static double calculateFinalAmount(double principal, int years, double rate, int timeInterval) {
        return principal * Math.pow(1 + (rate / 100) / timeInterval, timeInterval * years);
    }
}
