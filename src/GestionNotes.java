import java.util.Scanner;



public class GestionNotes {
    static final String[] MATIERES = {"Algorithmique", "Base de données", "Anglais"};
    static final int[] COEFS = {3, 2, 1};
    public static void main(String[] args) {


        System.out.println("=============================\n" +
                "RELEVÉ DE NOTES - L2\n" +
                "==============================");

        double[] moyennes = new double[MATIERES.length];

        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;

//        final int COEF_ALGO = 3;
//        final int COEF_BD = 2;
//        final int COEF_ANGLAIS = 1;

//        int sommeCoefficient = COEF_ALGO + COEF_ANGLAIS + COEF_BD;
        double moyenneGeneral;


        Scanner clavier = new Scanner(System.in);



        System.out.print("Prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Nom : ");
        String nom = clavier.nextLine();



        System.out.print("Matricule : ");
        String matricule = clavier.nextLine();

//        System.out.print("Saisir Note devoirAlgo: ");
//        double devoirAlgo = clavier.nextDouble();
//
//        System.out.print("Saisir Note examAlgo: ");
//        double examAlgo = clavier.nextDouble();
//
//        System.out.print("Saisir Note devoirBd: ");
//        double devoirBd = clavier.nextDouble();
//
//        System.out.print("Saisir Note examBd: ");
//        double examBd = clavier.nextDouble();
//
//        System.out.print("Saisir Note devoirAnglais: ");
//        double devoirAnglais = clavier.nextDouble();
//
//        System.out.print("Saisir Note examAnglais: ");
//        double examAnglais = clavier.nextDouble();

        for(int m = 0;m< MATIERES.length; m++){
            System.out.printf("Saisir note de devoir" + MATIERES[m] );
            double devoir = clavier.nextDouble();

            System.out.printf("Saisir les notes de l'exam" +MATIERES[m]);
            double exam = clavier.nextDouble();

            moyennes[m]= devoir * POIDS_DEVOIR + exam * POIDS_EXAMEN ;

        }


//        double moyenneAlgo =
//                devoirAlgo * POIDS_DEVOIR + examAlgo * POIDS_EXAMEN;
//
//        double moyenneBd =
//                devoirBd * POIDS_DEVOIR + examBd * POIDS_EXAMEN;
//
//        double moyenneAnglais =
//                devoirAnglais * POIDS_DEVOIR + examAnglais * POIDS_EXAMEN;

        double sommePonderee = 0;
        int sommeCoefficient = 0;

        for (int m = 0; m < MATIERES.length; m++) {
            sommePonderee += moyennes[m] * COEFS[m];
            sommeCoefficient += COEFS[m];
        }

//        double moyenneGeneral = sommePonderee / sommeCoefficient;
//
//        System.out.println("ta moyenne general est "+ moyenneGeneral);

//        System.out.println("ta moyenne en algo est: %.2f%n" +moyenneAlgo );
//        System.out.println("ta moyenne en Bd est:2f%n " +moyenneBd);
//        System.out.println("ta moyenne en anglais est: 2f%n" +moyenneAnglais);

//         moyenneGeneral= (moyenneAnglais + moyenneAlgo +moyenneBd)/sommeCoefficient;

//         System.out.println("ta moyenne est: " + moyenneGeneral);

        moyenneGeneral = sommePonderee / sommeCoefficient;

        for (int m = 0; m < MATIERES.length; m++) {
            System.out.printf("Ta moyenne en %s est : %.2f%n",
                    MATIERES[m], moyennes[m]);
        }

        System.out.printf("Ta moyenne générale est : %.2f%n", moyenneGeneral);

//        String prenom = "Awa";
//        String nom = "Ndiaye";
//        int age = 20;
//        String matricule = "ISI-2026-0142";

        System.out.println("Étudiant : " + prenom + " " + nom );
        System.out.println("Matricule : " + matricule);


        clavier.close();
    }

}






