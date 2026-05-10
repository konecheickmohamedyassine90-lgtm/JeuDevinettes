import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        // Créer un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        int essais = 0;
        boolean gagne = false;

        System.out.println(" Jeu de Devinettes ");
        System.out.println("Devine un nombre entre 1 et 100 !");
        System.out.println("Tu as 10 essais !");

        // Boucle de jeu
        while (essais < 10 && !gagne) {
            System.out.print("Essai " + (essais + 1) + "/10 : ");

            try {
                int devine = scanner.nextInt();
                essais++;

                if (devine == nombreSecret) {
                    gagne = true;
                    System.out.println(" Bravo. Tu as gagné en " + essais + " essais !");
                } else if (devine < nombreSecret) {
                    System.out.println(" Trop petit. Essaie plus grand.");
                } else {
                    System.out.println("Trop grand ! Essaie plus petit.");
                }

            } catch (Exception e) {
                System.out.println("Entre un nombre valide !");
                scanner.next();
            }
        }

        if (!gagne) {
            System.out.println(" Tu as perdu. Le nombre était : " + nombreSecret);
        }

        scanner.close();
    }
}