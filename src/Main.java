import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        for (int i = 0; i <= 2; i++) {
            first[i] = i + 1;
        }
        double[] second = {1.57, 7.654, 9.986};
        int[] third = {9, 2, 0, 28};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] first = new int[3];
        for (int i = 0; i <= 2; i++) {
            first[i] = i + 1;
            if (i != 2) {
                System.out.print(first[i] + ",");
            } else {
                System.out.print(first[i]);
            }
        }
        System.out.println();
            double[] second = {1.57, 7.654, 9.986};
        for (int a = 0; a < 3; a++) {
            if (a != 2) {
                System.out.print(second[a] + ",");
            } else {
                System.out.println(second[a]);
            }
        }

            int[] third = {9, 2, 0, 28};
        for (int b = 0; b < 4; b++) {
            if (b != 3) {
                System.out.print(third[b] + ",");
            } else {
                System.out.println(third[b]);
            }
        }


        }
    public static void task3() {
        System.out.println("Задача 3");
        int[] first = new int[3];
        for (int i = 2; i >= 0; i--) {
            first[i] = i + 1;
            if (i != 0) {
                System.out.print(first[i] + ",");
            } else {
                System.out.print(first[i]);
            }
        }
        System.out.println();
        double[] second = {1.57, 7.654, 9.986};
        for (int a = 2; a >= 0; a--) {
            if (a != 0) {
                System.out.print(second[a] + ",");
            } else {
                System.out.println(second[a]);
            }
        }

        int[] third = {9, 2, 0, 28};
        for (int b = 3; b >=0; b--) {
            if (b != 0) {
                System.out.print(third[b] + ",");
            } else {
                System.out.println(third[b]);
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] first = {1,2,3};
        for (int i = 0; i <first.length; i++) {
            if (first[i]%2!=0) {
                first[i]=first[i]+1;
            }

        }
        System.out.println(Arrays.toString(first));
        System.out.println();

    }



    }
