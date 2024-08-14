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
        }
    }
