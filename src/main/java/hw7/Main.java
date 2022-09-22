package hw7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Kot[] koty = new Kot[4];
        koty[0] = new Kot("Пушок", 35, false);
        koty[1] = new Kot("Шустрик", 30, false);
        koty[2] = new Kot("Васька", 40, false);
        koty[3] = new Kot("Черныш", 25, false);


        Tarelka tarelka = new Tarelka(80);
        tarelka.info();
        for (Kot kot : koty) {
            if (!kot.gluttony && kot.stomach < tarelka.korm) {
                kot.eat(tarelka);
                kot.gluttony = true;
                System.out.println("Кот " + kot.name + " сытый!");
            } else {
                System.out.println("Кот " + kot.name + " остался голодным!");
            }
        }
        tarelka.info();
        System.out.println("Сколько грамм корма насыпать?");
        action = sc.nextInt();
        tarelka.uvelichenieKorma(action);
        tarelka.info();

    }
}
