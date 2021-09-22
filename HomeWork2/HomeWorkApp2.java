
public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(zadanie1(11, 8)); /*1 ЗАДАНИЕ*/
//        System.out.println(zadanie1(11, 12));} значения для false
        zadanie2(-5); /*2 ЗАДАНИЕ*/
//        zadanie2 ( r: 5); /*Вариант для положительного числа*/
        System.out.println(zadanie3(4));
        zadanie4("Java lesson very hard", 5);
        System.out.println(zadanie5(400));
    }

    public static boolean zadanie1(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }


    public static void zadanie2(int r) {
        if (r >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static boolean zadanie3(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void zadanie4(String word, int barrow) {
        for (int n = barrow; n > 0; n--) {
            System.out.println(word);
        }
    }
        public static boolean zadanie5 (int z){
            if (z % 4 != 0) {
                return false;
            }
            return (z%100 != 0) || (z%400 == 0);
        }
}