public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int i = 0;
        int month = 0;
        while (i <= 2_459_000) {
            i = i + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        {
            for (int b = 10; b > 0; b--) {
                System.out.print(b + " ");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int deathPopulation = y / 1000 * 8;
        int bornPopulation = y / 1000 * 17;
        for (int a = 1; a <= 10; a++) {
            System.out.println("Год " + a + ", численность населения состовляет " + y);
            y = y + bornPopulation - deathPopulation;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");


    }
}