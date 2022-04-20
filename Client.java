package petshop;

public class Client extends Person {
    private int shopId;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public Client(String name, String address, int id, int shopId) {
        super(name, address, id);
        this.shopId = shopId;
    }

    public Client() {
        super();
    }

    public String toString() {
        return "Client [shopId=" + shopId + ", name=" + getName() + ", address=" + getAddress() + ", Individual Taxpayer Registration=" + getId() + "]";
    }
}