public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

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
        double deposit = 15000;
        int month = 1;
        for (; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 0.07;
            System.out.println("Месяц " + month + " - сумма накоплений: " + deposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int month = 1;
        for (; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - сумма накоплений: " + deposit + " рублей.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15000;
        int month = 1;
        int yearToMonth = 1;
        for (; yearToMonth <= 108; month++) {
            deposit = deposit + deposit * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - сумма накоплений: " + deposit + " рублей.");
            }
            yearToMonth = yearToMonth + 1;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int dateFriday = 1;
        for (int week  = 0; week <= 4; week++ ) {
            System.out.println("Сегодня пятница " + dateFriday + "-е число. Необходимо подготовить отчет!");
            dateFriday = dateFriday + 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int backTo200 = 1823;
        int year100later = 2123;
        while (year < backTo200) {
            year = year + 79;
        }
        while (year < year100later) {
            System.out.println(year);
            year = year +79;
        }
        }

}