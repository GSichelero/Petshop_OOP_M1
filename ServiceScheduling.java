package petshop;

public class ServiceScheduling {
    private Client client;
    private Item item;
    private String dateHour;
    
    public ServiceScheduling(Client client, Item item, String dateHour) {
        this.client = client;
        this.item = item;
        this.dateHour = dateHour;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public String getDateHour() {
        return dateHour;
    }
    
    public void setDateHour(String dateHour) {
        this.dateHour = dateHour;
    }
    
    public String toString() {
        return "Client: " + client.getName() + " Service: " + item.getName() + " Date: " + dateHour;
    }
}
