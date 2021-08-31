package geekbrains.lesson_1.hello_world;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("введите число");
//        Scanner scanner = new Scanner(System.in);
        //переменные
//        int a = scanner.nextInt();
//        System.out.println("a = " + a);

       // создаем калькулятор
        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите торое число");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Результат = " + result);
    }
}
