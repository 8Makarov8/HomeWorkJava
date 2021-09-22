import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5(3, 8);
        zadanie6();
    }

    private static void zadanie2() {
        int[] sos = new int[100];
        for (int x = 0; x < 100; x++) {
            sos[x] = x + 1;
        }
        System.out.println(Arrays.toString(sos));
    }

    private static void zadanie1() {
        int[] massiv = {1,1,0,0,1,0,1,1,0,0};
        //пускаем цикл по всем элементам массива (i - индекс массива)
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1) {
                massiv[i] = 0;
            } else {
                massiv[i] = 1;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    private static void zadanie3() {
        int[] massiv = {1,5,3,2,11,4,5,2,4,8,9,1};
        //пускаем цикл по всем элементам массива (i - индекс массива)
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                int x = massiv[i];
                massiv[i] = x * 2;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    private static void zadanie4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                // ...
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void zadanie5(int len, int initialValue) {
        int[] sos = new int[len];
        for (int x = 0; x < sos.length; x++) {
            sos[x] = initialValue;
        }
        System.out.println(Arrays.toString(sos));
    }

    private static void zadanie6() {
        int[] massiv = {3,1,7,3,2,6,4,8,2,5,8,9,4,12};
        int min = massiv[0];
        int max = massiv[0];
        for (int x = 0; x < massiv.length; x++) {
            if (massiv[x] < min) {
                min = massiv[x];
            }
            if (massiv[x] > max) {
                max = massiv[x];
            }

        }
        System.out.println("min: " + min + " max: " + max);
    }
}