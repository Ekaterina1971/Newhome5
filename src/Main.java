public class Main {
    public static void main(String[] args) {
        // задача №1
        System.out.println(" Задача №1");
        int vklad = 15000;
        int summa = 0;
        int i = 0;
        while (summa <= 2459000) {
            summa = summa + summa / 100;
            summa = summa + vklad;
            i = i + 1;
            System.out.println("Месяц " + i + " Итого " + summa);
        }
        // Задача №2
        System.out.println(" Задача №2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a + " ");
            a = a + 1;
        }
        {
            System.out.println();
        }
        for (int a1 = 10; a1 >= 1; a1--) {
            System.out.print(" " + a1 + " ");
        }
        // задача №3
        System.out.println("Задача №3");
        int population = 12000000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * population / 1000;
            int mortalityRate = 8 * population / 1000;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // задача №4
        System.out.println("Задача №4");
        int vklad1 = 15000;
        int summa1 = 0;
        int month = 0;
        summa1 = summa1 + vklad1;
        do {
            System.out.println("Месяц " + month + ", накоплений " + summa1);
            summa1 = summa1 + summa1 / 100 * 7;
            month = month + 1;
        }
        while (summa1 <= 12_000_000);
        {
            System.out.println("Количество месяцев равно " + month);
        }
        // задача №5
        System.out.println("Задача №5");
        int vklad2 = 15000;
        int summa2 = 0;
        int month1 = 0;
        summa2 = summa2 + vklad2;
        for (; summa2 <= 12_000_000; month1 ++) {
            summa2 = summa2 + summa2 / 100 * 7;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", накоплений " + summa2);
            }
        }
        System.out.println("Количество месяцев равно " + month1);

        // Задача №6
        System.out.println("Задача №6");
        int vklad3 = 15000;
        int summa3 = 0;
        int month2 = 0;
        summa3 = summa3 + vklad3;
        for (; month2 <= 108; month2 ++) {
            summa3 = summa3 + summa3 / 100 * 7;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 +" , сумма накоплений равна " + summa3);
            }
        }
    }
}
