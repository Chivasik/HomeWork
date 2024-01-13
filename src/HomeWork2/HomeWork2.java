package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {

//        Задание
//
//        1)
//
//        Создать переменную string1 = "This line that i want to cut, cause it is too long".
//                Создать строку string2 в которой должно быть помещено значение строки string1,
//        Обрезанное до "This line that i want to cut, cause".
//                Создать строку string3 на основе string2 которое будет содержать значение
//        "This line that don't want to cut, cause it is perfect".
//                Вывести на консоль каждое сообщение и его длину.
//

            String string1 = "This line that i want to cut, cause it is too long";
            String string2 = string1.substring(0, 35);
            System.out.println(string2);
            System.out.println("Его длина состовляет - " + string2.length());
            String string3 = string2 + " " + "it is perfect";
            System.out.println(string3);
            System.out.println("Его длина состовляет - " + string3.length());

//        2)
//        Создать строку string = "Testing, is my favourite job".
//                Вывести на экран отдельно каждое слово и длину этого слова в след виде:
//        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
//        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
//        и т.д.
//                Вывести на консоль true, если первое слово длиннее остальных, в
//        противном случае вывести false.
//
            String string = "Testing, is my favourite job";
            String[] words = string.split(" ");

            int i = 1;
            for(String word : words) {
                System.out.println("Cлово " + i + " " + word + " Длина этого слова = " + word.length());
                i += 1;
            }

            boolean theFirstWord = true;
            theFirstWord = words[0].length() > words[1].length() && words[0].length() > words[2].length()
                && words[0].length() > words[3].length() && words[0].length() > words[4].length();
            System.out.println(theFirstWord);

//        3)
//        При применении к массиву строк поля length, можно узнать сколько
//        элементов находится в массиве.
//        Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
//        то при вызове поля length:
//        int size = arrayOfString.length;
//        можно получить какое количество символов находится в данном массиве.
//
//        Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
//        символ 'a' встречается в  строке:
//        "Completely random text in English. In it, we just need to determine how many times the
//        character 'a' occurs there. And we can use the split method and the length method."
//
//        Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.

            String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";

            int size = text.length();
            System.out.println(size);
            String textSizeSmall = text.toLowerCase();
            String[] words2 = textSizeSmall.split("a");
            int count = words2.length - 1;
            System.out.println(count);
    }
}
