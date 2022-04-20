package petshop;

import java.util.List;

public class Order {
    private int id;
    private Client client;
    private List<Purchase> itens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Purchase> getItens() {
        return itens;
    }

    public void setItens(List<Purchase> itens) {
        this.itens = itens;
    }

    public Order(int id, Client client, List<Purchase> itens) {
        this.id = id;
        this.client = client;
        this.itens = itens;
    }

    public String toString() {
        return "Order [id= " + id + "client=" + client + ", itens=" + itens + "]";
    }
}