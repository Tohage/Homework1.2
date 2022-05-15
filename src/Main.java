public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества миль за купленные билеты:");
        int Priceticket = 5000;
        int Byetickets = 5;
        int Price = 20;
        int Miles = (Priceticket / Price) * Byetickets;
        System.out.println("Стоимость билета - " + Priceticket);
        System.out.println("Куплено билетов - " + Byetickets);
        System.out.println("Начислено миль - " + Miles);
    }
}
