public class I2_Programm_Aktivitaetsdiagramm {
 
    public static void main(String[] args) {
 
        // Wiederholung des Programms
        while (true) {
 
            // Variablen deklarieren
            int zahl1, zahl2, zahl3;
 
            // Zahlen einlesen
            System.out.print("1. Zahl eingeben: ");
            zahl1 = Integer.parseInt(System.console().readLine());
            System.out.print("2. Zahl eingeben: ");
            zahl2 = Integer.parseInt(System.console().readLine());
            System.out.print("3. Zahl eingeben: ");2
            zahl3 = Integer.parseInt(System.console().readLine());
 
            // Abbruchbedingungen
            // Alle Zahlen sind 0
            if (zahl1 == 0 && zahl2 == 0 && zahl3 == 0) {
                break;
            }
            // Alle Zahlen sind gleich
            if (zahl1 == zahl2 && zahl2 == zahl3) {
                break;
            }
            // Zahl 1 ist gleich Zahl 2 oder Zahl 1 ist gleich Zahl 3
            if (zahl1 == zahl2 || zahl1 == zahl3) {
                break;
            }
 
            // Sortieren von 3 Zahlen
            sortieren(zahl1, zahl2, zahl3);
 
            // Sortierte Zahlen ausgeben
            System.out.println("Die Zahlen in sortierter Reihenfolge sind:");
            System.out.println(zahl1 + " " + zahl2 + " " + zahl3);
 
            // Abfrage zum Beenden des Programms
            System.out.print("Wollen Sie das Programm beenden? (j/n): ");
            String beenden = System.console().readLine();
 
            // Beenden des Programms, wenn "j" eingegeben wird
            if (beenden.equalsIgnoreCase("j")) {
                break;
            }
        }
    }
 
    private static void sortieren(int zahl1, int zahl2, int zahl3) {
 
        // Hilfsvariable
        int temp;
 
        // Tauschen, falls zahl1 größer als zahl2 ist
        if (zahl1 > zahl2) {
            temp = zahl1;
            zahl1 = zahl2;
            zahl2 = temp;
        }
 
        // Tauschen, falls zahl2 größer als zahl3 ist
        if (zahl2 > zahl3) {
            temp = zahl2;
            zahl2 = zahl3;
            zahl3 = temp;
        }
    }
}