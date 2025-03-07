import java.util.Scanner;


public class TrisDavide {
    public void griglia() {
        String[][] gameMap;
        gameMap = new String[3][3];

        for  (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                gameMap[i][j] = "  ";
                if (j ==2) {
                    System.out.print( gameMap[i][j] + "|" + "\n");
                } else {
                    System.out.print(gameMap[i][j] + "|");
                }        

    public static void main(String[] args) {
        System.out.println("\nGioco del Tris");
        final String REGOLE = "1. Griglia di gioco:\n" + 
                        "Il gioco si svolge su una griglia di 3x3 celle, quindi ci sono 9 celle in totale.\n" + 
                        "La griglia viene inizialmente vuota.\n" + 
                        "2. Obiettivo del gioco:\n" + 
                        "L'obiettivo è riuscire a disporre tre simboli uguali (X o O) in una riga, colonna o diagonale della griglia.\n" + //
                        "Chi riesce per primo a farlo vince la partita.\n" + 
                        "3. Turni di gioco:\n" + 
                        "I due giocatori alternano i turni, scegliendo una cella vuota e piazzando il proprio simbolo (X o O).\n" + //
                        "I giocatori non possono piazzare il simbolo in una cella già occupata.\n" + 
                        "4. Condizioni di vittoria:\n" + 
                        "Un giocatore vince se riesce a disporre tre simboli uguali in una delle seguenti modalità:\n" + //
                        "Riga orizzontale: Tre simboli consecutivi sulla stessa riga.\n" + //
                        "Colonna verticale: Tre simboli consecutivi sulla stessa colonna.\n" + //
                        "Diagonale: Tre simboli consecutivi sulla diagonale, sia quella da sinistra in alto a destra in basso che quella da destra in alto a sinistra in basso.\n" + //
                        "5. Pareggio (Patta):\n" + //
                        "Se tutte le 9 celle sono riempite e nessun giocatore ha vinto (ossia nessun giocatore ha tre simboli uguali in una riga, colonna o diagonale), la partita termina in pareggio (patta).\n" + //
                        "In altre parole, se la griglia è piena e non c'è un vincitore, la partita è un \"draw\".\n" + //
                        "6. Simboli:\n" + //
                        "Uno dei due giocatori usa il simbolo X e l'altro usa il simbolo O.\n" + //
                        "Di solito, il giocatore con la \"X\" inizia per primo, ma l'ordine può essere scelto a piacere.\n" + //
                        "7. Fine del gioco:\n" + //
                        "Il gioco termina quando un giocatore vince o quando non ci sono più mosse possibili (cioè la griglia è piena e non ci sono 3 simboli consecutivi).\n";

        Scanner inputReader = new Scanner(System.in);

        while (true) { //ciclo dove si svolge il gioco ee a fine gioco se vuole continuare riparte da qua

            System.out.println("Benvenuto! Scegli un'opzione tra le seguenti");    
            System.out.println("\n1. regole\n2. avvia una partita \n\nscegliere un opzione!\n\n");    
            String scelta = inputReader.nextLine();
            //digito cosa voglio fare tra le opzioni
            
            if (scelta.equals("regole")) { // stampo le regole del gioco
                System.out.println(REGOLE);
                continue;
            } else if (scelta.equals("avvia una partita")) { //avvio partita
                System.out.println("\npartita avviata\n");
            } else { 
                System.out.println("\nopzione non valida\n");
                continue;
            }
            

            //decisione per il turno iniziale
            //int min = 10; // valore minimo dell'intervallo
            //int max = 50; // valore massimo dell'intervallo

            //int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            //System.out.println("Numero casuale: " + randomNumber);
            // TODO: stampo di chi è il turno e chiedo un input al giocatore per la mossa -> IPOTESI MULTITHREADING
            
           

             //mettere di inserire le coordinate ogni volta che stampa la griglia                       


                    }    

                }
            }

            // TODO: sviluppare la dinamica del gioco

            // TODO: dinamiche vittoria, pareggio sconfitta ed eventuale tabellone pieno


            // chiedo se si vuole rigiocare
           // System.out.println("vuoi continuare? (si/no)\n");
            //String ritorno = inputReader.nextLine();
            //if (ritorno.equals("no")) {
           //     System.out.println("Arriverci! Alla prossima partita!\n");
          //      break;
           // }

            // TODO: stampo eventuali statistiche
        }

        inputReader.close();
    }
}
   

