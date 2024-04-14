import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("\ntask 1");
        int money = 0;
        int month = 1;
        while (money <= 2_459_000) {
            money += 15000;
            month++;
        }
        System.out.printf("Месяц %s, сумма накоплений равна %s рублей %n", month, money);
//task2
        System.out.println("\ntask 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
//task3
        System.out.println("\ntask 3");
        int opulationInCountryY = 12_000_000;
        int birthRate;
        int mortalityRate;
        for (int j = 1; j <= 10; j++) {
            birthRate = opulationInCountryY / 1000 * 17;
            mortalityRate = opulationInCountryY / 1000 * 8;
            opulationInCountryY = opulationInCountryY + birthRate - mortalityRate;
            System.out.printf("«Год %s, численность населения составляет %s» %n", j, opulationInCountryY);
        }
//task4
        System.out.println("\ntask 4");
        double vasilyAccount = 15_000;
        for (int u = 1; vasilyAccount < 12_000_000; u++) {
            vasilyAccount = vasilyAccount * 1.07;
            System.out.printf("В %s месяц на счету у Василия %.2f рублей %n", u, vasilyAccount);
        }
//task5
        System.out.println("\ntask 5");
        double vasilyAccount2 = 15_000;
        for (int u = 1; vasilyAccount2 < 12_000_000; u++) {
            vasilyAccount2 = vasilyAccount2 * 1.07;
            if (u % 6 == 0) {
                System.out.printf("В %s месяц на счету у Василия %.2f рублей %n", u, vasilyAccount2);
            }
        }
        System.out.println();
//task6
        System.out.println("\ntask 6");
        double vasilyAccount3 = 15_000;
        int nineYearsMonths = 9 * 12;
        for (int u = 1; u <= nineYearsMonths; u++) {
            vasilyAccount3 = vasilyAccount3 * 1.07;
            if (u % 6 == 0) {
                System.out.printf("В %s месяц на счету у Василия %.2f рублей %n", u, vasilyAccount3);
            }
        }
        System.out.println();

//task7
        System.out.println("\ntask 7");
            int fridayReport = 5;
            if (fridayReport == 0) {
            for (int j = fridayReport; j < 31; j += 7) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", j);
            }
        }
//task8
        System.out.println("\ntask 8");
        int currentYear = 2024;
        int begin = currentYear - 200;
        int end = currentYear + 100;
        for (int j = 0; j < end; j += 79) {
            if (j >= begin) {
                System.out.println(j);
            }
        }
    }
}