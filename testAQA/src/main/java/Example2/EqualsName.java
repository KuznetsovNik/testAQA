package Example2;

import java.util.Locale;
import java.util.Scanner;

public class EqualsName {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.toLowerCase(Locale.ROOT).trim().equals("вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }
}
