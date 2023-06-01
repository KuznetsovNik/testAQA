package Example1;

import java.util.Scanner;

public class AmountGreaterThan7 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(amount > 7 ? "Привет" : "Некоректный ввод");
    }
}

