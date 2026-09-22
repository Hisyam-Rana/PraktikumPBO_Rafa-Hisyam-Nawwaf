package Nomor01;

public class Stock {
    private int quantity;
    private int shopNo;

    public Stock(int qty, int shopNum) {
        this.quantity = qty;
        this.shopNo = shopNum;
    }
    
    public int getQuantity() { 
        return quantity; 
    }

    public int getShopNo() { 
        return shopNo; 
    }

    public void addStock(int amount) {
        this.quantity += amount;
        System.out.println("[Stock] Stok barang ditambah " + amount + ". Total stok sekarang: " + this.quantity + "\n");
    }

    public void modifyStock(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("[Stock] Stok diubah menjadi: " + this.quantity + "\n");
    }

    public void selectStockItem(int productId) {
        System.out.println("[Stock] Menampilkan detail stok untuk Product ID " + productId + " -> Stok: " + this.quantity + " (Toko ID: " + this.shopNo + ")\n");
    }
}
