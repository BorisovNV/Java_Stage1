package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        int runDistance = 200;
        int swimDistance = 0;
        Animals pushistij = new Pushistij(runDistance, swimDistance);

        runDistance = 500;
        swimDistance = 10;
        Animals sobaka = new Sobaka(runDistance, swimDistance);


        System.out.println("Кот может пробежать: " + pushistij.getAnimalRun() +
                " м. \nПёс может пробежать: " + sobaka.getAnimalRun() + " м.");

        System.out.println("Сколько бежим? Введите длину трассы:");
        int distance = scanner.nextInt();

        System.out.println("Кот пытается пробежать " + distance + " метра(ов). Результат: " + pushistij.run(distance));
        System.out.println("Пёс пытается пробежать " + distance + " метра(ов).  Результат: " + sobaka.run(distance));
        System.out.println();


        System.out.println("Кот может проплыть: " + pushistij.getAnimalSwim() + " м." +
                "\nПёс может проплыть: " + sobaka.getAnimalSwim() + " м.");

        System.out.println("Далеко плывём? Введите расстояние:");
        distance = scanner.nextInt();

        System.out.println("Кот пытается проплыть " + distance + " метра(ов). Результат: " + pushistij.swim(distance));
        System.out.println("Пёс пытается проплыть " + distance + " метра(ов). Результат: " + sobaka.swim(distance));

    }


}
