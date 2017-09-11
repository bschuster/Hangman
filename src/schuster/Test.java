package schuster;

import java.util.Arrays;

/**
 * Created by Becirovic Samer on 07.09.2017.
 */
public class Test {

    public static void main(String[] args) {

        Wortliste wortliste = new Wortliste();
        wortliste.hinzu("Int");

        Hangman hangman = new Hangman();
        hangman.check('a');
        char[] unterStriche = hangman.unterstriche();
        System.out.println(Arrays.toString(unterStriche));


    }

}
