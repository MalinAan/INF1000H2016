//Fra Nicolai Hagen - nicolhag sin gruppetime

class Oppgave6{
    public static void main(String[] args) {

    }

    public static boolean forekommer(char bokstav, String tekst){
        for (int i = 0; i < tekst.length(); i++){
            if (tekst.charAt(i) == bokstav){
                return true;
            }
        }
        return false;
    }

    public static String utenRepetisjon(String tekst){
        String nyTekst = "";

        for (int i = 0; i < tekst.length(); i++){
            char bokstav = tekst.charAt(i);
            if (!forekommer(bokstav, nyTekst)){
                nyTekst += bokstav;
            }
        }
        return nyTekst;
    }

    public static int antallForskjellige(String tekst){
        String tekstUtenRep = utenRepetisjon(tekst);
        return tekstUtenRep.length();
    }
}
