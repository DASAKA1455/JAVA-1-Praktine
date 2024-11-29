
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("Loterijos bilieto tikrinimas");

        int bandymai = 0;
        Random random = new Random();
        int pirmiSkaiciai, paskSkaiciai;

        while (true) {
            int A = random.nextInt(900000) + 100000;
            bandymai++;
            if (!vienodi(A)) {
                continue;
            }
            int pirmas = (A / 100000) % 10;
            int antras = (A / 10000) % 10;
            int trecias  = (A / 1000) % 10;
            int ketvirtas = (A / 100) % 10;
            int penktas = (A / 10) % 10;
            int sestas = A % 10;

            int sumaPirmu = pirmas + antras + trecias;
            int sumaAntru = ketvirtas + penktas + sestas;

            if (sumaPirmu == sumaAntru) {
                System.out.println("Laimingas bilietas yra: " + A);
                System.out.println("Bandymai: " + bandymai);
            break;
            }


        }
    }
    private static boolean vienodi(int skaicius) {
        boolean[] kartojasi = new boolean[10];
        while (skaicius > 0) {
            int elementas = skaicius % 10;
            if (kartojasi[elementas]) {
                return false;
            }
            kartojasi[elementas] = true;
            skaicius /= 10;
        }
        return true;
    }
}



