import java.util.Scanner;

    // pagina di presentazione
    // scelta opzioni
    // opzione per tornare indietro
     //  1. informazioni generali
        // politiche di pagamento
        // gestione rimborso
     //  2. metodi di pagamenti
     //  3. scelta acquisti
         // 3.1 scelta della categoria dei prodotti da acquistare
         // check sugli sconti e coupon presenti
            // 3.2chiedere metodo di pagamento e conferma di acquisto
            // 3.3 stampo avvenuta transazione (gestisco eventuali errori)
            // 3.4 invio fatturazione
            // 3.5 chiedo se si vuole acquistare altro o meno
         // 3.2 scelta dei prodotti(opzione di specifiche tecniche)
     //  4. Customer care
     //  5.   Uscita
     //    5.1. stampo messaggio di arrivederci


    
     public class Ecommerce {


        
        public static void main(String[] args) {
        




            System.out.print("Programma e-commerce\n");

            while (true) {
                System.out.println("\nBenvenuti nel negozio online ItaliaShopping, scegliere un opzione desiderata\n");
                Ecommerce_methods.printOptions();
                Scanner inputReader = new Scanner(System.in);


                String chooseString = inputReader.nextLine();
                if (chooseString.equals("informazioni generali")) {
                    Ecommerce_methods.printgeneralInformation();
                    String chooseInformation = inputReader.nextLine();
                    if (chooseInformation.equals("torna indietro")) {
                        continue;

                    } else if (chooseInformation.equals("politiche di pagamento")) {
                        Ecommerce_methods.printpaymentPolicies();
                        continue;



                    } else if (chooseInformation.equals("gestione dei rimborsi")) {
                        Ecommerce_methods.printrefundPolicy();
                        continue;

                    }    
                    
                    

                } else if (chooseString.equals("metodi di pagamento")) {
                    Ecommerce_methods.printallowedPayments();
                    continue;

            
            
                } else if (chooseString.equals("scelta acquisti")) {
                    Ecommerce_methods.printCategory();
                    String chooseCategory = inputReader.nextLine();
                    if (chooseCategory.equals("abbigliamento sportivo")) {
                        System.out.print("\nscegli un opzione!\n\n");
                        Products_methods.choosesportArticle(inputReader);

                    
                    
                    } else if (chooseCategory.equals("articoli tecnologici")) {


                    }


                // implementazione lettura scelta categoria
                // scelta prodotto
                // stampo prodotto + informazioni tecniche
                // richiesta metodo di pagamento
                // invio fatturazione
                // richiesta se vuole fare altri acquisti
            
                } else if (chooseString.equals("assistenza clienti")) {
                // lettura problematica
                // indirizzamento numero corretto per il problema relativo
            
            
                } else if (chooseString.equals("esci")) {
                System.out.print("\nArrivederci!, vuole dare un voto al nostro servizio?");
                break;
                

            }

        
            }
        }
    }    
