


public class Ecommerce_methods {
    //metodo menù iniziale
    public static void printOptions() {
        System.out.print("1. informazioni generali\n2. metodi di pagamento\n3. scelta acquisti\n4. assistenza clienti\n5. esci\n\n");
    }
    //metodo sottomenù informazioni generali
    public static void printgeneralInformation() {
        System.out.print("1. politiche di pagamento\n2. gestione dei rimborsi\n3. voglio tornare indietro\n\n");
    }
    //metodi opzioni sotto informazioni generali
    public static void printpaymentPolicies() {
        System.out.print("Termini di pagamento: I pagamenti devono essere effettuati entro 7 giorni dalla ricezione della fattura. I pagamenti ritardati sono soggetti a una penale del 2% mensile.\n" +
                                                        "Sicurezza: Tutte le transazioni sono protette tramite crittografia SSL per garantire la sicurezza dei dati.\n");

    }
    public static void printrefundPolicy() {
        System.out.print("Rimborsi: I rimborsi saranno emessi solo per prodotti difettosi o non conformi, entro 14 giorni dall'acquisto.\\n");
    }
    // metodo pagamenti accettati
    public static void printallowedPayments() {
        System.out.print("i metodi di pagamento accettati sono:\n"+"1. Visa\n2. Mastercard\n3. Google Pay\n");
    }
    
    //metodi relativi alla parte di acquisti
    public static void printCategory() {
        System.out.print("Scegliere una tra le seguenti opzioni:\n\n");
        System.out.print("1. abbigliamento sportivo\n2. articoli tecnologici\n3. articoli scolastici\n4. voglio tornare indietro\n\n");
    }}

   