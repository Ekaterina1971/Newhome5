public class Main {
    public static void main(String[] args) {
        // задача №1
        System.out.println(" Задача №1");
        int vklad = 15_000;
        int summa = 0;
        int i = 0;
        while (summa <= 2_459_000) {
            summa = summa + vklad;
            summa = summa + summa / 100;
            i = i + 1;
            System.out.println("Месяц " + i + " Итого " + summa);
        }
        // Задача №2
        System.out.println(" Задача №2");
        int namber = 1;
        while (namber <= 10) {
            System.out.print(" " + namber + " ");
            namber++;
        }
        {
            System.out.println();
        }
        for (int namberNew = 10; namberNew >= 1; namberNew--) {
            System.out.print(" " + namberNew + " ");
        }
        // задача №3
        System.out.println("Задача №3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * population / 1000;
            int mortalityRate = 8 * population / 1000;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // задача №4
        System.out.println("Задача №4");
        int vkladNew = 15_000;
        int summaNew = 0;
        int month = 0;
        summaNew += vkladNew;
        do {
            System.out.println("Месяц " + month + ", накоплений " + summaNew);
            summaNew += summaNew / 100 * 7;
            month = month + 1;
        }
        while (summaNew <= 12_000_000);
        {
            System.out.println("Количество месяцев равно " + month);
        }
        // задача №5
        System.out.println("Задача №5");
        int newVklad = 15_000;
        int newSumma = 0;
        int newMonth = 0;
        newSumma += newVklad;
        for (; newSumma <= 12_000_000; newMonth++) {
            newSumma += newSumma / 100 * 7;
            if (newMonth % 6 == 0) {
                System.out.println("Месяц " + newMonth + ", накоплений " + newSumma);
            }
        }
        System.out.println("Количество месяцев равно " + newMonth);

        // Задача №6
        System.out.println("Задача №6");
        int contribution = 15_000;
        int allContribution = 0;
        int period = 0;
        allContribution += contribution;
        for (; period <= 108; period++) {
            allContribution += allContribution / 100 * 7;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + " , сумма накоплений равна " + allContribution);
            }
        }
        // задача №7
        System.out.println("Задача №7");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
            friday += 7;
        }
        // задача №8
        System.out.println("Задача №8");
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (int yearPeriod = yearBefore; yearPeriod < yearAfter; yearPeriod++) {
            if (yearPeriod % 79 == 0) {
                System.out.println(yearPeriod);
            }
        }
    }
}

