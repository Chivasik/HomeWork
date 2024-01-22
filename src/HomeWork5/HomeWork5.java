package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        /* За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
   та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
 • Перед початком на екран виводиться текст: Let the game begin!
 • Сам процес гри обробляється у нескінченному циклі.
 • Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим,що ввів користувач.
 • Якщо введене число менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again.
 . Якщо введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again.
 • Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
 • Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).
*/
        Random rand = new Random();
        int secretNumber = rand.nextInt(100);
        System.out.println(secretNumber);
        System.out.println("Let the game begin!");
        System.out.print("Введите свое имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);

        while(true){
            System.out.print("Введите число от 0 до 100 - ");
            int numberGamer = scan.nextInt();
            if(numberGamer < secretNumber){
                System.out.println("Your number is too small. Please, try again.");
            }else if(numberGamer > secretNumber){
                System.out.println("Your number is too big. Please, try again");
            }else{
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
