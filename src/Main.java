import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        int[] ints = new int[12];
        System.out.println(Arrays.toString(ints));

        double[] doubles = new double[3];
        doubles[0] = 1.57;
        doubles[1] = 7.654;
        doubles[2] = 9.986;
        System.out.println(Arrays.toString(doubles));

        boolean[] booleans = new boolean[2];
        booleans[0] = false;
        booleans[1] = false;
        System.out.println(Arrays.toString(booleans));

        String[] strings = {"Привет", "как дела?", "что делаешь?"};
        System.out.println(Arrays.toString(strings));
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        int[] ints1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints1.length; i++) {
            if (i == ints1.length - 1) {
                System.out.print(ints1[i]);
                break;
            }
            System.out.print(ints1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
            if (i < ints1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();
        for (int i = ints1.length - 1; i >= 0; i--) {
            System.out.print(ints1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();
        int[] ints2 = {-1, -2, -3, -4, -5};
        for (int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 != 0) {
                ints2[i]++;
            }
        }
        System.out.println(Arrays.toString(ints2));
    }
}
