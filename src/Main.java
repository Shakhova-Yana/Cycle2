public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("\ntask 1");
        int money = 0;
        int month = 1;
        while (money <= 2_459_000) {
            money = (int) ((money + 15000) * 1.01);
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
    }
}