package schuster;

/**
 * Created by Becirovic Samer & Bastian Schuster on 07.09.2017.
 */
public class Hangman {

    private Wortliste wortliste = new Wortliste();
    private String wort = "";
    private char[] richtig;
    private char[] falsch = new char[15];

    public Hangman() {

        wort = wortliste.zufallswort().toLowerCase();
        richtig = new char[wort.length()];

    }

    public void check(char buchstabe) {

        for (int i = 0; i < wort.length(); i++) {

            if (wort.charAt(i) == buchstabe) {

                for (int j = 0; j<richtig.length; j++) {

                    if (richtig[j] == 0) {

                        richtig[j] = buchstabe;

                    }
                }
            }else {

                for (int k = 0; k<falsch.length; k++) {

                    if (falsch[k] == 0) {

                        falsch[k] = buchstabe;

                    }
                }

            }
        }
    }

    public char[] unterstriche() {

        char[] unterStriche = new char[wort.length()];

        for (int i = 0; i < unterStriche.length; i++) {

            unterStriche[i] = wort.charAt(i);

        }

        for (int j = 0; j < richtig.length; j++) {

            for (int k = 0; k < unterStriche.length; k++) {

                if (richtig[j] != unterStriche[k]) {

                    unterStriche[k] = '_';

                }

            }

        }


        return unterStriche;

    }

    public Wortliste getWortliste() {
        return wortliste;
    }

    public void setWortliste(Wortliste wortliste) {
        this.wortliste = wortliste;
    }

    public String getWort() {
        return wort;
    }

    public void setWort(String wort) {
        this.wort = wort;
    }

    public char[] getRichtig() {
        return richtig;
    }

    public void setRichtig(char[] richtig) {
        this.richtig = richtig;
    }

    public char[] getFalsch() {
        return falsch;
    }

    public void setFalsch(char[] falsch) {
        this.falsch = falsch;
    }
}
