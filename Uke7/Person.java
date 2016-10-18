//Fra Nicolai Hagen - nicolhag sin gruppetime


public class Person{
    private String navn;
    private boolean mann;
    Person(String navn, boolean mann){
        this.navn = navn;
        this.mann = mann;
    }

    public String toString(){
        return navn;
    }

    public boolean erMann(){
        return mann;
    }
}
