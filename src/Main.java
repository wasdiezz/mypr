import java.util.Random;
import java.util.Scanner;

public class Main {

    static int InputA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number a: ");
        scanner.nextInt();                          //inputA
        return scanner.nextInt();

    }


    static int InputB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number b: ");             //inputB
        return scanner.nextInt();
    }

    static int GetSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Summator");
        int a = InputA();
        int b = InputB();

        int result = GetSum(a, b);
        System.out.println(result);
    }

}