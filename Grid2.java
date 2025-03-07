import java.util.Scanner;


public class Grid2 {

    
    
    
    
    public static void main(String[] args) {
        String[][] gameMap = {
            {"  ", "  ", "  "},    // Prima riga
            {"  ", "  ", "  "},   // Seconda riga
            {"  ", "  ", "  "}  // Terza riga
           
        };
        Scanner inputReader = new Scanner(System.in);
        System.out.print("\nqual'è il nome del giocatore 1? ");
        String giocatore1 = inputReader.nextLine();
        System.out.print("\nche segno vuoi utilizzare? ");
        String segnoGiocatore1 = inputReader.nextLine();
        System.out.print("\nqual'è il nome del giocatore 2? ");
        String giocatore2 = inputReader.nextLine();
        System.out.print("\n che segno vuoi utilizzare? ");
        String segnoGiocatore2 = inputReader.nextLine();
        
        System.out.print("\n");
        int turno = 1;


        while (true) {
            for (int i = 0; i<3; i++) {
                for (int j = 0; j<3; j++) {
                    if (!gameMap[i][j] .equals("  ")) {
                        System.out.print(gameMap[i][j]+ "  |");

                    }
                    
                    if (gameMap[i][j].equals("  ")) {
                        System.out.print(gameMap[i][j] + "  |");
                    }    

                    if (j == 2) {
                        System.out.print("\n");
                    }

                 

                }   
            }

            while (true) 
            if (turno == 1) {
                    System.out.print("è il tuo turno " + giocatore1 +" scegli la mossa che vuoi eseguire" + "! ");
                    int mossaGiocatore1 = inputReader.nextInt();
                    if (mossaGiocatore1 == 1) {                        
                        if (gameMap[0][0].equals("  ")) {
                            System.out.println("ciao");
                            gameMap[0][0] = segnoGiocatore1;
                            turno = turno +1;
                            break;
                        } else {
                            System.out.print("la mossa non è valida");
                        } 
                        
                    } else if (mossaGiocatore1 == 2) {
                            if (gameMap[0][1].equals("  ")) {
                                gameMap[0][1] = " " + segnoGiocatore1;
                                turno = turno +1;
                                break;
                                
                                
                            } else {
                                System.out.print("la mossa non è valida");
                                }            

                    } else if (mossaGiocatore1==3) {
                        if (gameMap[0][2].equals("  ")) {
                            gameMap[0][2] = " " + segnoGiocatore1;
                            turno = turno+1;
                            break;
                        
                            
                        } else {
                            System.out.print("la mossa non è valida");
                            
                             }
                    }       
                     
                    
                }

            

            }     
        
               

    }
    
    

    

        

        
    

    

    











    
    
        












    
 

    
