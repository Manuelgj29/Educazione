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
        int somma = N1 + N2;
        int sottrazione = N1 - N2;
        int moltiplicazione = N1 * N2;
        double divisione = (double) N1 / N2;
        System.out.println("Somma: " + somma);
        System.out.println("Sottrazione: " + sottrazione);
        System.out.println("Moltiplicazione: " + moltiplicazione);
        System.out.println("Divisione: " + divisione);
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