import java.util.Scanner;

public class I1_Waehrungsumrechnen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char calculateAgain = 'Y';

        while (Character.toUpperCase(calculateAgain) == 'Y') {
            System.out.print("This shoe costs ???? USD\nUser enters: ");
            double costInUSD = scanner.nextDouble();

            System.out.print("\nTransport and customs costs are:\nUser enters: ");
            double transportCosts = scanner.nextDouble();

            System.out.print("\nThe exchange rate is:\nUser enters: ");
            double exchangeRate = scanner.nextDouble();

            double totalCostCHF = (costInUSD + transportCosts) * exchangeRate;

            System.out.printf("\nResult is CHF %.4f\n", totalCostCHF);

            System.out.print("\nDo you want to calculate again? [Y] / [N]\nUser enters: ");
            calculateAgain = scanner.next().charAt(0);

            if (Character.toUpperCase(calculateAgain) != 'Y' && Character.toUpperCase(calculateAgain) != 'N') {
                System.out.println("Invalid input. Exiting program.");
                break;
            }
        }

        System.out.println("\nThank you for using me.");
        scanner.close();
    }
}
