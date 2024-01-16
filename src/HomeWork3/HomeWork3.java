package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

//  1)
//   У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.
//   Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить
//   перемнным типа String следующие значения: string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
//   Помимо string1, string2, string3, string4 новых переменных создавать нельзя.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите надпись: Я тестирую замечательно. Что еще нужно?");
//
//        String string1 = scanner.next();
//        String string2 = scanner.next();
//        String string3 = scanner.next();
//        String string4 = scanner.next() + " еще нужно?";
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string3);
//        System.out.println(string4);

//        2)
//        Пользователь вводит с клавиатуры три целочисленных значения.
//        На экран выводится информация можно ли из этих сторон построить треугольник.
//        (необходимо вспомнить правило построения треугольника по трем сторонам).

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите три целочисленных значения для построения треугольника ");
//        System.out.println("Первое число: ");
//        int x = scanner1.nextInt();
//        System.out.println("Вы ввели: " + x);
//
//        System.out.println("Второе число: ");
//        int y = scanner1.nextInt();
//        System.out.println("Вы ввели: " + y);
//
//        System.out.println("Третье число: ");
//        int z = scanner1.nextInt();
//        System.out.println("Вы ввели: " + z);
//
//        if(x + y > z && x + z > y && y + z > x){
//            System.out.println("Из этих сторон построить треугольник можно");
//        }else{
//            System.out.println("Из этих сторон построить треугольник нельзя");
//        }

//        3)
//        При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
//        и всегда отнимать от большего меньшее. Вывести эту разность в консоль

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int x = scan.nextInt();
//        System.out.println("Enter the second number: ");
//        int y = scan.nextInt();
//        int result = (x > y) ? (x - y) : (y - x);
//        System.out.println("Разность между числами = " + result);

//        4)
//        (Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа:
//        Если число равно 1, то выводин на консоль “Понедельник”; Если число равно 2,
//        то выводин на консоль “Вторник”; Если число равно 3, то выводин на консоль “Среда”;
//        Если число равно 4, то выводин на консоль “Четверг”;
//        Если число равно 5, то выводин на консоль “Пятница”;
//        Если число равно 6, то выводин на консоль “Суббота”;
//        Если число равно 7, то выводин на консоль “Воскресенье”;
//        В противном случае выводим текст: “Лучше бы сегодня была пятница”.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int x = scan.nextInt();
//        if(x == 1) System.out.println("Понедельник");
//        else if (x == 2) System.out.println("Вторник");
//        else if (x == 3) System.out.println("Среда");
//        else if (x == 4) System.out.println("Четверг");
//        else if (x == 5) System.out.println("Пятница");
//        else if (x == 6) System.out.println("Суббота");
//        else if (x == 7) System.out.println("Воскресенье");
//        else System.out.println("Лучше бы сегодня была пятница");


//        5)
//        Написать программу, используя тернарный оператор, где пользователь вводит
//        с клавиатуры два числа и символ – или + или % или / или *.
//        На экран выводится резултат действия над двумя введенными числами.
//        Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int x = scan.nextInt();
//        System.out.print("Enter (-, +, %, /, *): ");
//        String operator = scan.next();
//        System.out.println("Enter the second number: ");
//        int y = scan.nextInt();
//
//
//           int result = operator.equals("-") ?
//                x - y : operator.equals("+") ?
//                x + y : operator.equals("%") ?
//                x % y : operator.equals("*") ?
//                x * y : operator.equals("/") ?
//                x / y : 0;
//        System.out.println(result);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int x = scan.nextInt();
//        System.out.println("Enter the second number: ");
//        int y = scan.nextInt();
//        System.out.print("Enter (-, +, %, /, *): ");
//        char operator = scan.next().charAt(0);
//        int result = 0;
//
//        switch (operator) {
//            case '-':
//                result = x - y;
//                break;
//            case '+':
//                result = x + y;
//                break;
//            case '%':
//                result = x % y;
//                break;
//            case '/':
//                result = x / y;
//                break;
//            case '*':
//                result = x * y;
//                break;
//            default:
//                System.out.println("0");
//        }
//        System.out.println(result);





//        6)
//        Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
//        Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
//        Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
//        а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение
//        в консоль, о том что такой программы не существует. Если указанной пользователем ОС нет,
//        то выводится сообщение в консоль,о том что такой ОС не существует.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Выберите программу для скачивания из таких, как: IntelliJ IDEA, Git, Java");
//        String prog = scan.nextLine();
//        System.out.println("Выберите свою операционную систему из таких, как: Linux, macOS, Windows");
//        String opSystem = scan.nextLine().toLowerCase();
//
//        switch (prog.toLowerCase()) {
//            case ("intellij idea"):
//                switch (opSystem) {
//                    case ("linux"):
//                        System.out.println("www.download.linux/intellij_idea");
//                        break;
//                    case ("macos"):
//                        System.out.println("www.download.macos/intellij_idea");
//                        break;
//                    case ("windows"):
//                        System.out.println("www.download.windows/intellij_idea");
//                        break;
//                    default:
//                        System.out.println("Такой ОС не существует");
//                }
//                break;
//            case ("git"):
//                switch (opSystem) {
//                    case ("linux"):
//                        System.out.println("www.download.linux/git");
//                        break;
//                    case ("macos"):
//                        System.out.println("www.download.macos/git");
//                        break;
//                    case ("windows"):
//                        System.out.println("www.download.windows/git");
//                        break;
//                    default:
//                        System.out.println("Такой ОС не существует");
//                }
//                break;
//            case ("java"):
//                switch (opSystem) {
//                    case ("linux"):
//                        System.out.println("www.download.linux/java");
//                        break;
//                    case ("macos"):
//                        System.out.println("www.download.macos/java");
//                        break;
//                    case ("windows"):
//                        System.out.println("www.download.windows/java");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Такой ОС не существует");
//        }
        }
}





