package slovní.kopaná;

import java.util.ArrayList;
import java.util.Scanner;

public class SlovníKopaná {

    public static void main(String[] args) {
        ArrayList<String> seznam = new ArrayList<>();
        Scanner vstup = new Scanner(System.in);
        String posledni = "";
        System.out.print("Vlož slovo: ");
        String něco = vstup.nextLine();
        // opakuj dokud není zadán prázdný vstup
        while (!něco.isEmpty()) {
            if (! posledni.isEmpty() &&
                    něco.charAt(0) != posledni.charAt(posledni.length()-1)) {
                System.out.println("Slovo nezačíná na poslední písmeno předchozího.");
                System.out.println("Vstup neplatí.");
            } else if (seznam.contains(něco)) {
                System.out.println("Tohle slovo už bylo. Vstup neplatí.");
            } else {
                seznam.add(něco);
                posledni = něco;
            }
            System.out.print("Vlož slovo: ");
            něco = vstup.nextLine();
        }
    }
}
