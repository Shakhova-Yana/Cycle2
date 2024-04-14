public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("\ntask 1");
        int money = 0;
        int month = 1;
        while (money < 2_459_000) {
            money += 15_000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, money);
            month++;
        }
//task2
        System.out.println("\ntask 2");
    }
}