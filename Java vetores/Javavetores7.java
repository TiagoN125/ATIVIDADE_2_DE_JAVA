import java.util.Scanner;

public class Javavetores7 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int i;
      String s;

      System.out.printf("Informe uma frase:\n");
      s = ler.nextLine();

      int cta = 0; 
      int cte = 0; 
      int cti = 0; 
      int cto = 0; 
      int ctu = 0; 
      int n = s.length(); 
      for (i=0; i<n; i++) {
        if ((s.charAt(i) == 'a') || (s.charAt(i) == 'A'))
           cta = cta + 1;

        if ((s.charAt(i) == 'e') || (s.charAt(i) == 'E'))
           cte = cte + 1;

        if ((s.charAt(i) == 'i') || (s.charAt(i) == 'I'))
           cti = cti + 1;

        if ((s.charAt(i) == 'o') || (s.charAt(i) == 'O'))
           cto = cto + 1;

        if ((s.charAt(i) == 'u') || (s.charAt(i) == 'U'))
           ctu = ctu + 1;
      }

      System.out.printf("\nExistem %d vogais \"a\" na frase.", cta);
      System.out.printf("\nExistem %d vogais \"e\" na frase.", cte);
      System.out.printf("\nExistem %d vogais \"i\" na frase.", cti);
      System.out.printf("\nExistem %d vogais \"o\" na frase.", cto);
      System.out.printf("\nExistem %d vogais \"u\" na frase.\n", ctu);
    }

}
