//Fra Nicolai Hagen - nicolhag sin gruppetime


import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) throws Exception{

        ArrayList<Person> personer = new ArrayList<Person>();

        Scanner fil = new Scanner(new File("navn.txt"));

        while(fil.hasNextLine()){

            String navn = fil.nextLine();
            String kjonn = fil.nextLine();

            boolean k;

            if (kjonn.equals("M")){
                k = true;
            } else {
                k = false;
            }

            Person nyPerson = new Person(navn, k);
            personer.add(nyPerson);
        }
        printMenn(personer, true);
    }

    public static void printMenn(ArrayList<Person> personer, boolean printMann){
        for (Person hentetUt : personer){
            if (printMann && hentetUt.erMann()){
                System.out.println(hentetUt);
            }
        }
    }
}
