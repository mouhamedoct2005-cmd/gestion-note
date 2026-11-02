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

        int sommeCoefficient = COEF_ALGO + COEF_ANGLAIS + COEF_BD;
        double moyenneGeneral;

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

        System.out.print("Saisir Note devoirAlgo: ");
        double devoirAlgo = clavier.nextDouble();

        System.out.print("Saisir Note examAlgo: ");
        double examAlgo = clavier.nextDouble();

        System.out.print("Saisir Note devoirBd: ");
        double devoirBd = clavier.nextDouble();

        System.out.print("Saisir Note examBd: ");
        double examBd = clavier.nextDouble();

        System.out.print("Saisir Note devoirAnglais: ");
        double devoirAnglais = clavier.nextDouble();

        System.out.print("Saisir Note examAnglais: ");
        double examAnglais = clavier.nextDouble();

        double moyenneAlgo =
                devoirAlgo * POIDS_DEVOIR + examAlgo * POIDS_EXAMEN;

        double moyenneBd =
                devoirBd * POIDS_DEVOIR + examBd * POIDS_EXAMEN;

        double moyenneAnglais =
                devoirAnglais * POIDS_DEVOIR + examAnglais * POIDS_EXAMEN;

        System.out.println("ta moyenne en algo est: %.2f%n" +moyenneAlgo );
        System.out.println("ta moyenne en Bd est:2f%n " +moyenneBd);
        System.out.println("ta moyenne en anglais est: 2f%n" +moyenneAnglais);

         moyenneGeneral= (moyenneAnglais + moyenneAlgo +moyenneBd)/sommeCoefficient;

         System.out.println("ta moyenne est: " +moyenneGeneral);


//        String prenom = "Awa";
//        String nom = "Ndiaye";
//        int age = 20;
//        String matricule = "ISI-2026-0142";

        System.out.println("Étudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);


        clavier.close();
    }

}






