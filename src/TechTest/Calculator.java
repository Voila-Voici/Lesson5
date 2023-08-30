package TechTest;

import java.io.IOException;
import java.util.Arrays;

public class Calculator {
    public static int calc(String input) throws IOException {
        String[] arr = input.split(" "); // 3 # 2
        int ch1 = Integer.parseInt(arr[0]); // ["3", "#", "2"]
        if ((ch1 > 10) || (ch1 < 1)) {
            throw new IOException("Неподходящее число");
        }
        int ch2 = Integer.parseInt(arr[2]);
        if ((ch2 > 10) || (ch2 < 1)) {
            throw new IOException("Неподходящее число");
        }
//
        if (!arr[1].equals("+") && !arr[1].equals("-") && !arr[1].equals("*") && !arr[1].equals("/")){
            throw new IOException("Неподходящее операция, действие не может быть произведено");
        }

        int result;
        switch (arr[1]) {
            case "+":
                result = ch1 + ch2;
                break;
            case "-":
                result = ch1 - ch2;
                break;
            case "*":
                result = ch1 * ch2;
                break;
            case "/":
               result = ch1 / ch2;
                break;
            default:
                throw new IOException("Неподходящая операция");
        }
        return result;
    }
}
