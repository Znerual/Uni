/*
    Aufgabe 2) Verzweigungen und while-Schleife

    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Schreiben Sie eine while-Schleife, die alle ungeraden, durch 7 teilbaren
      Zahlen von 0-100 (inklusive) aufsummiert.
    - Geben Sie das Ergebnis mit "System.out.println()" aus.

    Zusatzfragen:
    1) Die Schleife summiert Werte zwischen 0 und 100 (inklusive). Wie könnten
       Sie das Programm umbauen damit die Schleife beliebige Intervalle
       aufsummiert?
*/
public class Aufgabe2{

    public static void main(String[] args) {
        int i = -1;
        int sum = 0;
        while (i++ < 100) {
            if ( i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

