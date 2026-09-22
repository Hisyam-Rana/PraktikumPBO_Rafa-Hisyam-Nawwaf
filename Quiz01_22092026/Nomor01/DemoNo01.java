package Nomor01;

public class DemoNo01 {
    public static void main(String[] args) {

        Customer customer1 = new Customer(101, "BudiSpeed", "Jl. Soekarno Hatta No. 9", "08123456789");
        
        Stock stockMouse = new Stock(25, 1);
        Stock stockLaptop = new Stock(10, 1);
        
        Product product1 = new Product(501, 8500000.0, "Laptop", stockLaptop);
        Product product2 = new Product(502, 150000.0, "Mouse Wireless", stockMouse);
        
        Order order1 = new Order(1001, customer1);
        
        customer1.addCustomer();
        product1.addProduct();                   
        product2.addProduct();                   
        order1.addProductToOrder(product1);
        order1.addProductToOrder(product2);
        order1.createOrder();
        order1.editOrder(9999);
        
        customer1.editCustomer("Budi Wijaya", "Jl. Candi Kalasan No. 15", "08987654321");
        stockLaptop.modifyStock(20);         
        stockLaptop.addStock(5);                
        stockLaptop.selectStockItem(501);      
        product1.modifyProduct(8200000.0, "Laptop Gaming");
        product1.selectProduct(501);            
        order1.createOrder();
        
        customer1.deleteCustomer(); 
        order1.createOrder();
    }
}

