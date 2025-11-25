import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HelloWorld();
        Calcolatrice();
    }

    //Es 1 
    //Per stampare a schermo la scritta Hello World bisogna utilizzare il seguente codice:
    public static void HelloWorld() {
        System.out.println("Hello, world!");
    }

    //Es 2
    public static void Calcolatrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci due numeri interi:");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        System.out.println("Scegli l'operazione da eseguire (+, -, *, /):");
        String operazione = sc.next();
        if (operazione.equals("+")) {
            System.out.println("Risultato: " + (N1 + N2));
        } else if (operazione.equals("-")) {
            System.out.println("Risultato: " + (N1 - N2));
        } else if (operazione.equals("*")) {
            System.out.println("Risultato: " + (N1 * N2));
        } else if (operazione.equals("/")) {
            if (N2 != 0) {
                System.out.println("Risultato: " + (N1 / N2));
            } else {
                System.out.println("Errore: Divisione per zero non consentita.");
            }
        } else {
            System.out.println("Operazione non valida.");
        }
        sc.close();
    }

    //Es 3
    //Per eseguire un ciclo che stampa i numeri da 1 a 10, si può utilizzare il seguente codice:
    public static void StampaNumeri(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int N1 = sc.nextInt();   
        for (int i = 1; i <= 10; i++) {
            System.out.println(N1);
            N1++;
        }
    }
}