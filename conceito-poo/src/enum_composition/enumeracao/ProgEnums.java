package enum_composition.enumeracao;

import java.util.Date;

public class ProgEnums {
    public static void main(String[] args) {
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMET);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
