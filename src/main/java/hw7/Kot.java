package hw7;

public class Kot {
    public String name;
    public int stomach;
    public boolean gluttony;

    Kot(String name, int stomach, boolean gluttony) {
        this.name = name;
        this.stomach = stomach;
        this.gluttony = gluttony;
    }

    public void eat(Tarelka t) {
        t.umenshenieKorma(stomach);
    }


}
