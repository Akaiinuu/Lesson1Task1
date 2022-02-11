public class Task1 {
    public static void main(String[] args) {
        int TicketPrice = 20_000; // - Стоимость билета
        int MileCost = 20; // - Количество рублей для одной бонусной мили
        int BonusMiles = TicketPrice / MileCost; // - Количество бонусных миль
        System.out.println(BonusMiles); // - Вывод значения количества бонусных миль
    }
}
