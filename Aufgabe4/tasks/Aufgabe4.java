/*
    Aufgabe 4) while-Schleife

    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Schreiben Sie eine while-Schleife, die die Quersumme der gegebenen
      Variable "value" berechnet. (z.B. Quersumme der Zahl 37489 ist gleich 31)
    - Nachdem Sie die Quersumme berechnet haben geben Sie das Ergebnis mit
      "System.out.println()" aus.

    Zusatzfragen:
    1) Welcher Wert (postitiv und ganzzahlig) muss der Varibalen "value"
       zugewiesen werden damit die höchstmögliche Quersumme berechnet wird?
*/
public class Aufgabe4{

    public static void main(String[] args) {
        int value = 8487304;
        String valueInString = String.valueOf(value);
        int sum = 0;
        int i = 0;
        while (i < valueInString.length()) {
            sum += Integer.parseInt(valueInString.substring(i++,i));
        }
        System.out.println(sum);
        // TODO: Implementieren Sie hier die Angabe
    }
}

