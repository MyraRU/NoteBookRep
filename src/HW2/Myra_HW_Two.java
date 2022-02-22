package HW2;

import java.util.Scanner;

public class Myra_HW_Two {
    public static void main(String[] args) {

//  Задача 1. Калькулятор факториала
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите факториал");
//        int n = sc.nextInt();
//        int b = 1;
//        for (int a = 1; a <= n; a++) {
//            b = b * a;
//        }
//        System.out.println("Факториал числа " + n + "! = " + b);

//..........................................................//

//  Задача 2. Фибоначчи
//        int[] array = new int[100];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < array.length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//            System.out.println(array[i]);
//        }

//..........................................................//

//  Задача 3. Проверка регистра и латиницы
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите текст на английском языке и в нижнем регистре:");
//        String str = sc.nextLine();
//        boolean onlyLatin = str.matches("^[a-z]+$");
//
//        if (onlyLatin) {
//            System.out.println("Вы справились!");
//        } else {
//
//            System.out.println("Это никуда не годиться. Перезапустите программу и попробуйте снова...");
//        }
        int yearOfPublic = sc.nextInt();
        if (yearOfPublic <= 0 || yearOfPublic > 2022){
            System.out.println("Книга не может быть опубликованна в нулевом году или в более позднем чем есть сейчас!");
        } else {
            System.out.println("Книга не может быть опубликованна в нулевом году или " +
                    "Год публикации не может быть больше текущего годас!");
        }
    }
}
