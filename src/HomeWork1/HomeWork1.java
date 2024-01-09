package HomeWork1;
public class HomeWork1 {
    public static void main(String[] args) {

        //Coздать две переменные типа int:
        int a = 7;
        int b = 9;

        System.out.println(a);
        System.out.println(b);
        System.out.println("--------");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
//Поменять между собой значения переменных a и b.
//Создавать новые переменные нельзя.
//Можно применять только арифметические действия к перемнным a и b.
//Вывести в консоль значения переменных a и b после их переопределения.

    }
}

//1)

//mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
//volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
//opel = mercedes%volvo;
//Необходимо вычислить значения
// mersedes = 3,
// volvo = 28,
// opel = 3.

//2)

//int x = 3;
//int y = ++x*2;
//x+=-y*3 + ++x + --y;
//y+=(-x++)%3;
//int z = x + y;

//Необходимо вычислить значения
// x = -8,
// y = -30,
// z = -38.


//3)

//boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
//boolean b = !a||a&&!a;
//boolean c = false&&!true||!((23%3+14)%3==7);

//Необходимо вычислить значения
// a = false
// b = true
// c = false.

