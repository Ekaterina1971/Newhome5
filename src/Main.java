public class Main {
    public static void main(String[] args) {
        // задача №1
        System.out.println(" Задача №1");
        int vklad = 15000;
        int summa = 0;
        int i = 0;
        while ( summa <= 2459000) {
            summa = summa + summa / 100;
            summa = summa + vklad;
            i = i+1;
            System.out.println("Месяц " + i + " Итого " + summa);
            }
        // Задача №2
        System.out.println(" Задача №2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" "+a+" ");
            a = a + 1;
        }
        {
            System.out.println();
        }
        for (int a1 = 10; a1 >= 1; a1--) {
            System.out.print(" "+a1+" ");
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
        while ( summa1 <= 12_000_000);{
                System.out.println("Количество месяцев равно " + month);
            }
        }
    }
