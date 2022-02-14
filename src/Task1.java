public class Task1 {
    public static void main(String[] args) {
        int ticketPrice = 20_000; // - Стоимость билета
        int mileCost = 20; // - Количество рублей для одной бонусной мили
        int bonusMiles = ticketPrice / mileCost; // - Количество бонусных миль
        System.out.println(bonusMiles); // - Вывод значения количества бонусных миль
    }
}
