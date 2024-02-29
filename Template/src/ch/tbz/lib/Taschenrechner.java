package ch.tbz.lib;

import static ch.tbz.lib.Input.inputDouble;
import static ch.tbz.lib.Input.inputInt;

public class Taschenrechner {

    public static void main(String[] args) {
        // Title
        System.out.println("Taschenrechner:");

        // Menü anzeigen
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
       §1

        // Benutzereingabe für Operation auswählen
        int choice = inputInt("Wählen Sie eine Operation (1-4): ");

        // Benutzereingabe für Zahlen
        double num1 = inputDouble("Geben Sie die erste Zahl ein: ");
        double num2 = inputDouble("Geben Sie die zweite Zahl ein: ");

        // Ergebnis der ausgewählten Operation
        double result = 0;

        // Operationen durchführen
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                // Überprüfen, ob der Benutzer nicht durch Null teilt
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                    return;
                }
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                return;
        }

        // Ergebnis ausgeben
        System.out.println("Das Ergebnis ist: " + result);
    }
}


