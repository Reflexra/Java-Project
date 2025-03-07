import java.util.Scanner;


public class Grid {

    
    
    public void griglia(String[][] gameMap) {

        
        

       

        
       

        for  (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                

                if (gameMap[i][j] == null) {
                    System.out.print(":xs");
                    break;
                
                } else {
                    System.out.print(gameMap[i][j]);
                }    

                 
                 if (j ==2)  { 
                    System.out.print(gameMap[i][j]+ "|" + "\n");

                } else {
                    System.out.print(gameMap[i][j] + "|");
                }

            }    
        }

    }
    public void turnRequest() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("è il tuo turno" + " giocatore scegli la mossa che vuoi effettuare!");

        int mossa = inputReader.nextInt();
        if (mossa == 1) {}

        
    }

    public static void main(String[] args) {
        String[][] gameMap = {
            {"X", "x", "x"},    // Prima riga
            {"O", null, "X"},   // Seconda riga
            {"X", "O", null}    // Terza riga
        };
        Grid esempio = new Grid();
        esempio.griglia(gameMap);
        
    }

    

    }









    
    
        












    
 

    
