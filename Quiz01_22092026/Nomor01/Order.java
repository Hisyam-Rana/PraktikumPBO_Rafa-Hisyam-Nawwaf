package Nomor01;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private double amount;
    private Date orderDate;
    private Customer customer;     
    private List<Product> products; 

    public Order(int ordrId, Customer custmr) {
        this.orderId = ordrId;
        this.customer = custmr;
        this.orderDate = new Date();
        this.products = new ArrayList<>();
        this.amount = 0.0;
    }

    public void addProductToOrder(Product product) {
        this.products.add(product);
        this.amount += product.getProductPrice();
        System.out.println("[Order] Menambahkan '" + product.getProductType() + "' (ID: " + product.getProductId() + ") ke dalam Order #" + orderId);
    }

    public void createOrder() {
        System.out.println("\n==========================================");
        System.out.println("              STRUK PEMESANAN             ");
        System.out.println("==========================================");
        System.out.println("ID Order     : " + orderId);
        System.out.println("Tanggal      : " + orderDate);
        System.out.println("Pelanggan    : " + customer.getCustomerName() + " (ID: " + customer.getCustomerId() + ")");
        System.out.println("Daftar Item  :");
        for (Product p : products) {
            System.out.println("  - [" + p.getProductId() + "] " + p.getProductType() + " : Rp" + p.getProductPrice());
        }
        System.out.println("------------------------------------------");
        System.out.println("TOTAL BAYAR  : Rp" + amount);
        System.out.println("==========================================\n");
    }

    public void editOrder(int newOrderId) {
        System.out.println("[Order] ID Order diubah dari #" + this.orderId + " menjadi #" + newOrderId + "\n");
        this.orderId = newOrderId;
    }
}