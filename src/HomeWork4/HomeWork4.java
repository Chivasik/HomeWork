package HomeWork4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

       /* 1)
        Написать программу, которая будет считывать введенные пользователем с клавиатуры слова,
        и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли одним предложением.
*/

        /*Scanner scan = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();

        System.out.println("Enter the words");
        while(true){
            String words = scan.next();
            if (words.equals("stop")) {
                break;
            }
            buffer.append(words).append(" ");
        }
        System.out.println(buffer.toString().trim());
    }*/

    /*2)
    Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
    является она полиндромом или нет. И выводит данную информацию на экран.*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Insert number: ");
        String number = scan.nextLine();
        String reverseNumber = "";
        for(int i = number.length() - 1; i >=0; i--){
            reverseNumber = reverseNumber + number.charAt(i);
        }
        System.out.println(number);
        System.out.println(reverseNumber);
        if(number.equals(reverseNumber)){
            System.out.println("Number is polindrome");
        }else{
            System.out.println("Number is not polidrome");
        }
*/
/*        3)
        Написать проограмму, условно для склада приема металла. Представим, что склад может хранить
        определенный вес металла. Пользователь вводит с клавиатуры вес, который может хранится на складе.
        Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад.
        Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки
        такого малого веса. Программа завершается, когда место на складе закончилось.*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальный вес который может храниться на складе: ");
        int criticalWeight = scanner.nextInt();
        System.out.println("Введите вес, который хотите поместить на склад: ");
        int weightMetal = scanner.nextInt();
        if (weightMetal < 5) {
            System.out.println("Вы не можете здать меньше пяти ");

        } else {


            while (weightMetal <= criticalWeight) {
                if (weightMetal == criticalWeight) {
                    break;
                }
                System.out.println("Сколько еще метала вы хотите загрузить на склад? : ");
                int tempWeightMetal = scanner.nextInt();
                if (tempWeightMetal + weightMetal < criticalWeight) {
                    System.out.println("1Вы еще можете загрузить: " + (criticalWeight - weightMetal - tempWeightMetal));
                    tempWeightMetal = 0;
                    continue;
                }
                weightMetal = weightMetal + tempWeightMetal;
                System.out.println("2Вы еще можете загрузить: " + (criticalWeight - weightMetal));

            }
            System.out.println("Склад полон");

        }*/
/*

        4)
        Первый будет состоять из следующих имен: “Петя”, “Маша”, “Ира”, “Федя”, “Саша”, “Антон”, “Глеб”.
        Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
        Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”
*/
        /*String[] str1 = new String[]{"Петя", "Маша", "Ира", "Федя", "Саша", "Антон", "Глеб"};
        int[] str2 = new int[]{10, 12, 14, 16, 18, 20};
        String[] str3 = new String[]{"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Первое число: ");
        int first = scan.nextInt();
        System.out.print("Второе число: ");
        int second = scan.nextInt();
        System.out.print("Третье число: ");
        int therd = scan.nextInt();

        String name = str1[first];
        int time = str2[second];
        String place = str3[therd];

        System.out.println(name + " будет идти в " + place + " в " + time + ":00");
*/

       /* 5)
        Есть одномерный массив из 10 элементов, заполненный случайными числами.
        Пользователь вводит с клавиатуры число.
        Программа показывает есть ли такое число в созданном до этого массиве.*/

     /*   Random rand = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(mas));
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        boolean result = false;
        for (int elem : mas) {
            if (elem == x) {
                result = true;
                break;
            }
        }
            if (result) {
                System.out.println("Число " + x + " присутствует в массиве.");
            } else {
                System.out.println("Такого числа " + x + " нет в массиве.");
            }*/

        /*6)
        Заполнить массив на 45 элементов случайными числами от -50 до +50.
        Найти минимальный элемент и вывести его на консоль. Найти максимальный элемент и вывести его на консоль.
*/

       /* Random rand = new Random();
        int[] mas = new int[45];
        int min = mas[0];
        int max = mas[1];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] < min){
                min = mas[i];
            }
            if(mas[i] > max){
                max = mas[i];
            }

        }System.out.println("Минимальное значение в массиве " + min);
        System.out.println("Максимальное значение в массиве "+ max);
*/


        }
}