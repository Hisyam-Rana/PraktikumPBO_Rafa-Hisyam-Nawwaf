package Nomor01;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;
    
    public Customer(int custmrId, String custmrName, String addrss, String noPhone) {
        this.customerId = custmrId;
        this.customerName = custmrName;
        this.address = addrss;
        this.phone = noPhone;
    }
    
    public int getCustomerId() { 
        return customerId; 
    }
    public String getCustomerName() { 
        return customerName; 
    }
    
    public void addCustomer() {
        System.out.println("[Customer] Pelanggan baru terdaftar -> ID: " + customerId + " | Nama: " + customerName + "\n");
    }

    public void editCustomer(String newName, String newAddress, String newPhone) {
        this.customerName = newName;
        this.address = newAddress;
        this.phone = newPhone;
        System.out.println("[Customer] Profil Customer ID " + customerId + " diperbarui -> Nama: " + customerName + ", Alamat: " + address + ", Telp: " + phone + "\n");
    }

    public void deleteCustomer() {
        System.out.println("[Customer] Customer ID " + customerId + " (" + customerName + ") berhasil dihapus dari sistem.\n");
        customerName = null;
        customerId = 0;
    }
}
