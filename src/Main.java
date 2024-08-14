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
        }
    }
