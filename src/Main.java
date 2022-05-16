public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества миль за купленные билеты:");
        int priceTicket = 10_000;
        int byeTickets = 1;
        int price = 20;
        int miles = (priceTicket / price) * byeTickets;
        System.out.println("Стоимость билета - " + priceTicket);
        System.out.println("Куплено билетов - " + byeTickets);
        System.out.println("Начислено миль - " + miles);
    }
}
