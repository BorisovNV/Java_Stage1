package homework_lesson2;

public class hw2 {

    public static void main(String[] args){
        System.out.println(CheckSum(7, 15));
        CheckPosOrNeg(-22);
        System.out.println(Check2(9));
        PrintTextNTimes("Java is not bad", 2);
        System.out.println(CheckLeapYearOrNot(2020));

    }
    static boolean CheckSum(int a, int b){
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static void CheckPosOrNeg(int a){
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    static boolean Check2(int a){
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    static void PrintTextNTimes(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
    static boolean CheckLeapYearOrNot(int a){
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
