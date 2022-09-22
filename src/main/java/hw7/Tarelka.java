package hw7;

public class Tarelka {

    public int korm;
    public Tarelka(int korm) {
        this.korm = korm;
    }
    public void umenshenieKorma(int x) {
        korm -= x;
    }
    public void uvelichenieKorma(int y) {
        korm += y;
    }
    public void info() {
        System.out.println("Корма в тарелке: " + korm + " грамм.");
    }

}
