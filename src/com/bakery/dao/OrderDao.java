package com.bakery.dao;

import com.bakery.model.Order;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    private static final String FILE_PATH = "data/orders.txt";

    // Save Order to Text File
    public void saveOrder(Order order) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String orderData = order.getOrderId() + "," + order.getCustomerName() + "," + order.getItem() + "," + order.getQuantity();
            writer.write(orderData);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read Orders from Text File
    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    orders.add(new Order(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
