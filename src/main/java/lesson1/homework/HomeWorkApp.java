package lesson1.homework;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    static void checkSumSign() {
        int num1 = 5, num2 = -6;
        if (num1 + num2 >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }
    }
    static void printColor() {
        int value=6;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers() {
        int a = 3, b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");
    }
}
