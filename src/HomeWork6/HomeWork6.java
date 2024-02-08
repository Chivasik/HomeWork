package HomeWork6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
 /* *1) Пользователь задает размерность двумерного массива с клавиатуры.
                Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.*/

/*      int[][] a = new int[3][4];
        int[][] numbersMultipleArray =  {{12, 3, 34, 4}, {23, 4, 23, 67},{12, 3, 34, 99}};
        int[] arrayNumber = new int[3];

        for (int i = 0; i < numbersMultipleArray.length; i++){
            int max = numbersMultipleArray[i][0];
            for (int j = 0; j < numbersMultipleArray[i].length; j++){
                if(numbersMultipleArray[i][j] > max){
                    max = numbersMultipleArray[i][j];
                }
            }
            arrayNumber[i] = max;
        }
       *//* for(int[] arrayOfInt : numbersMultipleArray){
            for(int number : arrayOfInt){
                System.out.print(number + " ");
            }*//*

        for(int[] arrayOfInt : numbersMultipleArray){
            System.out.print(Arrays.toString(arrayOfInt));
        }

        System.out.println();

        //System.out.println();
    }*/
        // System.out.println(Arrays.toString(arrayNumber)); }

   /* Написати програму “стрільба по цілі”.
    Технічні вимоги:

            • Даний квадрат 5х5, де програма випадковим чином ставить ціль.
            • Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
            • Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
            • Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
            • Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
            • Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
            • Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
    Приклад виведення в консоль:

            [0, 1, 2, 3, 4, 5]
            [1, -, *, -, -, -]
            [2, -, -, -, -, -]
            [3, -, *, -, -, -]
            [4, -, -, *, -, -]
            [5, -, *, -, -, *]

*/


        Scanner scann = new Scanner(System.in);
        System.out.println("All Set. Get ready to rumble!");

        String[][] target = {{"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"}};

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                System.out.print(target[i][j] + "\t");
            }
            System.out.println();
        }
        while (target[1][1] != "x") {
            System.out.println("Введите линию для стрельбы от 1 до 5:");
            int a = scann.nextInt();
            if (a < 1 || a > 5) {
                System.out.println("Ваше число не подходит. Повторите попытку.");
                continue;
            }
            System.out.println("Введите столбец");
            int b = scann.nextInt();
            if (b < 1 || b > 5) {
                System.out.println("Ваше число не подходит. Повторите попытку.");
                continue;
            }
            if(a != 1 && b != 1){
                System.out.println("Мимо");
                target[a][b] = "*";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Попробуйте еще");
                continue;
            }
            if (a!= 1 && b == 1){
                target[a][b] = "*";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Попробуйте еще");
                continue;
        }
            if (b!= 1 && a == 1){
                target[a][b] = "*";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Попробуйте еще");
                continue;
            }
            if(a == 1 && b == 1){
                target[a][b] = "x";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Вы попали");
                }
                break;
            }
    }
}}
