package Nomor01;

public class Product {
    private int productId;
    private double productPrice;
    private String productType;
    private Stock stock;

    public Product(int prodctId, double prodctPrice, String prodctType, Stock stck) {
        this.productId = prodctId;
        this.productPrice = prodctPrice;
        this.productType = prodctType;
        this.stock = stck;
    }
    
    public int getProductId() { 
        return productId; 
    }

    public double getProductPrice() { 
        return productPrice; 
    }

    public String getProductType() { 
        return productType; 
    }

    public Stock getStock() { 
        return stock; 
    }
    
    public void addProduct() {
        System.out.println("[Product] Produk baru terdaftar -> ID: " + productId + " | Tipe: " + productType + " | Harga: Rp" + productPrice + "\n");
    }

    public void modifyProduct(double newPrice, String newType) {
        this.productPrice = newPrice;
        this.productType = newType;
        System.out.println("[Product] Data Produk ID " + productId + " diperbarui -> Tipe Baru: " + productType + " | Harga Baru: Rp" + productPrice + "\n");
    }

    public void selectProduct(int productId) {
        System.out.println("[Product] Menampilkan detail Produk ID: " + productId + " (" + this.productType + ") - Harga: Rp" + this.productPrice + "\n");
    }
}