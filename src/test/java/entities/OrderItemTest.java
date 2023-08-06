package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    void subTotal() {
        Product product = new Product("Amendoim", 10.00);
        OrderItem orderItem = new OrderItem(5, product);

        assertEquals(50.00, orderItem.subTotal());
    }
}