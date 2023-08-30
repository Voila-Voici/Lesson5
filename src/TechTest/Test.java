package TechTest;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = Calculator.calc(input);
        System.out.println("Output: \n" + res);
    }
}

