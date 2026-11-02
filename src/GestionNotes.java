import java.util.Scanner;


public class GestionNotes {
    public static void main(String[] args) {
        System.out.println("=============================\n" +
                "RELEVÉ DE NOTES - L2\n" +
                "==============================");

        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;

        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANGLAIS = 1;

        Scanner clavier = new Scanner(System.in);



        System.out.print("Prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Nom : ");
        String nom = clavier.nextLine();

        System.out.print("Âge : ");
        int age = clavier.nextInt();
        clavier.nextLine();

        System.out.print("Matricule : ");
        String matricule = clavier.nextLine();

//        String prenom = "Awa";
//        String nom = "Ndiaye";
//        int age = 20;
//        String matricule = "ISI-2026-0142";

        System.out.println("Étudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);


    }clavier.close();

}






