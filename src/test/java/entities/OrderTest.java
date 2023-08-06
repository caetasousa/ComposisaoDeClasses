package entities;

import entities.enums.OrderStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;


import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order pedido;
    OrderItem orderItem1;

    @BeforeEach
    void setUp() {
        Cliente eduardo = new Cliente("Eduardo", "caetasousa@gmail.com",
                LocalDate.of(1992, 3, 27));

        Product amendoim = new Product("Amendoim", 10.00);
        Product banana = new Product("Banana", 5.00);

        orderItem1 = new OrderItem(5, amendoim);
        OrderItem orderItem2 = new OrderItem(10, banana);

        pedido = new Order(LocalDateTime.now(), OrderStatus.valueOf("PENDING_PAYMENT"), eduardo);

        pedido.addItem(orderItem1);
        pedido.addItem(orderItem2);
    }

    @Test
    void addItem() {


        int numeroDeItens = 0;
        for (OrderItem item: pedido.getOrderItems()) {
            numeroDeItens ++;
        }
        assertEquals(2, numeroDeItens);
    }

    @Test
    void removeItem() {
        pedido.removeItem(orderItem1);
        int numeroDeItens = 0;

        for (OrderItem item: pedido.getOrderItems()) {
            numeroDeItens ++;
        }
        assertEquals(1, numeroDeItens);
    }

    @Test
    void total() {
        assertEquals(100.0,pedido.total());
    }
}