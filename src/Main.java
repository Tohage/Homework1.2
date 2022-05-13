import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества миль за купленные билеты:");
        int price_ticket = 5000;
        int bye_tickets = 5;
        int priсe_mile = 20;
        int miles = (price_ticket/priсe_mile)*bye_tickets;
        System.out.println("Стоимость билета - " + price_ticket);
        System.out.println("Куплно билетов - " + bye_tickets);
        System.out.println("Начислено миль - " + miles);

    }
}
