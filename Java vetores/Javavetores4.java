public class Javavetores4 {
    public static void main(String[] args) {
        // Constante para o valor aproximado de pi
        double pi = 3.14;

        // Volume do cilindro em cm³
        double volume = 785;

        // Altura do cilindro em cm
        double altura = 13;

        // Calculando o raio do cilindro
        double raio = Math.sqrt(volume / (pi * altura));

        System.out.println("Altura do cilindro: " + altura + " cm");
        System.out.println("Raio da base do cilindro: " + raio + " cm");
    }
}