public class Main {
    public static void main(String[] args) {

        // вводные данные
        int accAmount = 150;
        int payAmount = 1_350;
        int sum = 100;

        // условия программы
        int bonus;
        if (payAmount > 1_000) {
            bonus = payAmount / sum;
        } else {
            bonus = 0;
        }
        int balance = accAmount + payAmount + bonus;
        System.out.println("Вам начислено " + bonus + " бонусных рублей. Баланс счета составляет " + balance + " р.");

    }
}
