import java.util.Scanner;

public class lessonTris {

    // Creiamo una matrice 3x3 per rappresentare la griglia del gioco
    static String[][] board = new String[3][3];
    static String currentPlayer = "X"; // Iniziamo con il giocatore "X"
    static boolean gameOver = false;

    // Metodo per inizializzare la griglia
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    // Metodo per stampare la griglia del gioco
    public static void printBoard() {
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-----------");
        }
    }

    // Metodo per verificare se un giocatore ha vinto
    public static boolean checkWin() {
        // Controllo righe e colonne
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(currentPlayer) && board[i][1].equals(currentPlayer) && board[i][2].equals(currentPlayer)) {
                return true;
            }
            if (board[0][i].equals(currentPlayer) && board[1][i].equals(currentPlayer) && board[2][i].equals(currentPlayer)) {
                return true;
            }
        }

        // Controllo diagonali
        if (board[0][0].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][2].equals(currentPlayer)) {
            return true;
        }
        if (board[0][2].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][0].equals(currentPlayer)) {
            return true;
        }

        return false;
    }

    // Metodo per controllare se la griglia è piena (pareggio)
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    return false; // Se c'è una cella vuota, la griglia non è piena
                }
            }
        }
        return true; // La griglia è piena
    }

    // Metodo per alternare il giocatore
    public static void switchPlayer() {
        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }

    // Metodo per fare una mossa
    public static boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col].equals(" ")) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false; // Se la mossa non è valida
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

        while (!gameOver) {
            printBoard();
            System.out.println("Giocatore " + currentPlayer + ", inserisci la tua mossa (riga colonna): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Proviamo a fare la mossa
            if (makeMove(row, col)) {
                if (checkWin()) {
                    printBoard();
                    System.out.println("Il giocatore " + currentPlayer + " ha vinto!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("Pareggio! La griglia è piena.");
                    gameOver = true;
                } else {
                    switchPlayer(); // Cambiamo giocatore se nessuno ha vinto
                }
            } else {
                System.out.println("Mossa non valida, riprova!");
            }
        }

        scanner.close();
    }
}

