public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества миль за купленные билеты:");
        int priceticket = 5000;
        int byetickets = 5;
        int price = 20;
        int miles = (priceticket / price) * byetickets;
        System.out.println("Стоимость билета - " + priceticket);
        System.out.println("Куплено билетов - " + byetickets);
        System.out.println("Начислено миль - " + miles);
    }
}
