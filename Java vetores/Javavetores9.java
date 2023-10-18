import java.util.Scanner;

public class Javavetores9 {
    public static void main(String[] args) {

        int N;
        Scanner tec = new Scanner (System.in);
        
        System.out.print("Digite um número maior do que zero: ");
        N = tec.nextInt();
            if (N <= 0){
                do {
                    System.out.print("Digite um número válido: ");
                    N = tec.nextInt();
                } while (N <= 0);
            }
            if ((N = 1) || (N = 2)){
                System.out.print("O número é primo");
            }
            
            if (primo = true){
                System.out.print("O número é primo");
            }
            if (primo = false){
                System.out.print("O número NÃO é primo");
            }    
        }
    }
