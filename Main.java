import java.util.Scanner;
public class Main {
    static String message = "";
    public static void main(String[] args) throws Exception {
        calc(message);
        calculate();
    }

    static void calculate() throws Exception {

        int a = 0;
        int b = 0;
        int result = 0;
        String[] data = message.split("\\s+", 3);
        try {
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[2]); } catch (NumberFormatException e) {System.out.println("Введите целое чилсло");}
        if (a >= 11 || a <= 0 || b >= 11 | b <= 0) {
            System.out.println("Неподходящие числа.");
            throw new Exception();
        }
        String[] chars = {"+", "-", "*", "/"};
        if (data[1].length() >= 2) {throw new Exception("Введен неправильный оператор");}
        if (data[1].contains(chars[0]) | data[1].contains(chars[1]) | data[1].contains(chars[2]) | data[1].contains(chars[3])) {
            switch (data[1]) {
                default:
                    result = a + b;
                    break;
                case ("-") :
                    result = a - b;
                    break;
                case ("*") :
                    result = a * b;
                    break;
                case ("/") :
                    result = a / b;
                    break;
            }

            System.out.println("Ответ: " + result); } else {System.out.println("Введен неправильный оператор");}

    }
    public static String calc(String input) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение формата 'Число + число' от 1 до 10 включительно");
        input = scn.nextLine();
        message=input;
        return input;
    }
}