public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }
        balance = balance + payment + bonus;
        System.out.println("Итоговый счет: " + balance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}