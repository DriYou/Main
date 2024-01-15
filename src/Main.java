import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée Utilisateur
        System.out.print("Veuillez saisir le premier nombre : ");
        double premierNombre = scanner.nextDouble();

        System.out.print("Veuillez saisir le deuxième nombre : ");
        double deuxiemeNombre = scanner.nextDouble();

        // Choix de l'Opération
        System.out.print("Veuillez choisir l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        // Traitement des Données
        double resultat = 0.0;

        switch (operation) {
            case '+':
                resultat = premierNombre + deuxiemeNombre;
                break;
            case '-':
                resultat = premierNombre - deuxiemeNombre;
                break;
            case '*':
                resultat = premierNombre * deuxiemeNombre;
                break;
            case '/':
                // Gestion de la Division par Zéro
                if (deuxiemeNombre != 0) {
                    resultat = premierNombre / deuxiemeNombre;
                } else {
                    System.out.println("Erreur : Division par zéro impossible.");
                    return;
                }
                break;
            default:
                System.out.println("Erreur : Opération non reconnue.");
                return;
        }

        // Affichage des Résultats
        System.out.println("Résultat : " + resultat);

        // Fermeture du Scanner
        scanner.close();
    }
}
