package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class home_3 {

    public static void main(String[] args) {
        invertArray();
        blankArray();
        multiplicationByTwoArray();
        quadraticArray();
        lenInitialValueArray();
        minMaxArray();
    }

    public static void invertArray() {
        int[] num = {1, 1, 1, 0, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i] = 0;
            } else {
                num[i] = 1;
            }
        }

        System.out.println(Arrays.toString(num));
        System.out.println();
    }

    public static void blankArray() {
        int[] number = new int[100];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        System.out.println(Arrays.toString(number));
        System.out.println();
    }

    public static void multiplicationByTwoArray() {
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) {
                number[i] = number[i] * 2;
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println();
    }

    public static void quadraticArray() {
        int[][] box = new int[7][7];

        for (int i = 0; i < 7; i++) {
            box[i][i] = 1;
            box[i][6 - i] = 1;
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++)
                System.out.printf("%2d", box[i][j]);
            System.out.println();
        }
    }

    public static void lenInitialValueArray() {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int initialValue = scan.nextInt();
        int[] arr = new int[len];

        Arrays.fill(arr, initialValue);

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void minMaxArray() {
        int[] num = {4, 2, 13, 1, 0, 5, -7, -2, 18};
        int num_max = num[0];
        int num_min = num[0];

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] > num_max) {
                num_max = num[i];
            } else if (num[i] < num_min) {
                num_min = num[i];
            }
        }
        System.out.println();
        System.out.println("Minimal value: " + num_min);
        System.out.println("Maximal value: " + num_max);
        System.out.println();
    }
 }
