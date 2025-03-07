import java.util.Map;
import java.util.Scanner;

public class Products_methods {
    
     // abbigliamenti sportivi
    public static Integer choosesportArticle() {
        Scanner inputReader = new Scanner(System.in);
        Map<String, Integer> sportArticle = Map.of(
        "maglietta",20,
        "parastinchi", 7,
        "palloni", 15,
        "pantaloncini", 15);
        sportArticle.keySet().forEach(sportKeys-> System.out.println(sportKeys));
        String Article = inputReader.nextLine();
        System.out.print("\n");
        for (String keys : sportArticle.keySet()) {
        if (keys.equals(Article)) {
            System.out.print("hai scelto la maglietta che ha un prezzo di " +"$");
            return sportArticle.get(Article);

        } else {
            return -1;
        }
        } 
        
        
            
      //  } else if (Article.equals("parastinchi")) {
            
        //}


    }

    
}


