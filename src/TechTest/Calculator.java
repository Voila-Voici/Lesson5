package TechTest;

import java.io.IOException;
import java.util.Arrays;

public class Calculator {
    public static int calc(String input) throws IOException {
        if (!input.contains(" ")){
            throw new IOException("При вводе отсутствует пробел между символами");
        }
        String[] arr = input.split(" ");
        int ch1 = Integer.parseInt(arr[0]);
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
        if (arr.length > 4) {
            throw new IOException("Превышена длина выражения");
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
