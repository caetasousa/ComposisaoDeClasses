package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private Cliente cliente;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();


    public Order(LocalDateTime moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Double total() {
        Double total = 0.0;
        for(OrderItem item: orderItems) {
            total += item.subTotal();
        }
        return total;
    }
}
