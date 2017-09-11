package schuster;

import java.util.Random;

/**
 * 1. Model-Klasse f�r das Hangman-Spiel
 * @author Becirovic Samer& Bastian Schuster
 * @version 09-07-2017
 */
public class Wortliste {

    private String[] wortliste = {"Computer", "Laptop", "Java", "Array"};

    public Wortliste() {



    }

    /**
     * @return the wortliste
     */
    public String[] getWortliste() {
        return wortliste;
    }

    /**
     * @param wortliste the wortliste to set
     */
    public void setWortliste(String[] wortliste) {
        this.wortliste = wortliste;
    }

    /**
     * Nimmt zuf�llig ein Wort aus der Wortliste
     * @return das zuf�llig Wort
     */
    public String zufallswort() {

        Random gen = new Random();
        int zufall = gen.nextInt(wortliste.length);
        return wortliste[zufall];

    }

    /**
     * F�gt ein Wort zur Wortliste hinzu
     * @param wort das Wort, das hinzugef�gt werden soll
     */
    public void hinzu(String wort) {

        String[] wortlKopie = new String[wortliste.length+1];
        wortlKopie[wortliste.length] = wort;
        wortliste = wortlKopie;

    }

}
