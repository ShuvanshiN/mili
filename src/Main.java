public class Main {
    public static void main(String[] args) {
        int initialAccount = 6000;
        int replenishmentAmounts = 1100;
        int limitation = 1000;
        int percent = 0;

        if (replenishmentAmounts > limitation) {
            percent = 1;

        }

        int bonus = percent * replenishmentAmounts / 100;

        int finalBalance = initialAccount + replenishmentAmounts + bonus;
        System.out.println ("Ваш баланс " + finalBalance + " рублей "+ "\nБонус " + bonus + " ₽");










    }
}