package petshop;

import java.util.ArrayList;
import java.util.List;

public class Store
{
    private List<Item> catItems;
    private List<Client> colClients;
    private List<Order> orders;
    private List<ServiceScheduling> serviceSchedulings;
    public Store()
    {
        this.catItems = new ArrayList<Item>();
        this.colClients = new ArrayList<Client>();
        this.orders = new ArrayList<Order>();
        this.serviceSchedulings = new ArrayList<ServiceScheduling>();
    }
    public List<Item> getCatItems()
    {
        return catItems;
    }
    public void setCatItems(List<Item> catItems)
    {
        this.catItems = catItems;
    }
    public List<Client> getColClients()
    {
        return colClients;
    }
    public void setColClients(List<Client> colClients)
    {
        this.colClients = colClients;
    }
    public List<Order> getOrders()
    {
        return orders;
    }
    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
    public List<ServiceScheduling> getServiceSchedulings()
    {
        return serviceSchedulings;
    }
    public void setServiceSchedulings(List<ServiceScheduling> serviceSchedulings)
    {
        this.serviceSchedulings = serviceSchedulings;
    }

    // method to insert an item to the store
    public void addItem(Item item)
    {
        this.catItems.add(item);
    }

    // method to remove an item from the store
    public void removeItem(Item item)
    {
        this.catItems.remove(item);
    }

    // method to insert a client to the store
    public void addClient(Client client)
    {
        this.colClients.add(client);
    }

    // method to remove a client from the store
    public void removeClient(Client client)
    {
        this.colClients.remove(client);
    }

    // method to insert an order to the store
    public void addOrder(Order order)
    {
        this.orders.add(order);
    }

    // method to remove an order from the store
    public void removeOrder(Order order)
    {
        this.orders.remove(order);
    }

    // method to insert a service scheduling to the store
    public void addServiceScheduling(ServiceScheduling serviceScheduling)
    {
        this.serviceSchedulings.add(serviceScheduling);
    }

    // method to remove a service scheduling from the store
    public void removeServiceScheduling(ServiceScheduling serviceScheduling)
    {
        this.serviceSchedulings.remove(serviceScheduling);
    }

    // method to list all items in the store
    public void listItems()
    {
        for(Item item : this.catItems)
        {
            System.out.println(item);
        }
    }

    // method to list all clients in the store
    public void listClients()
    {
        for(Client client : this.colClients)
        {
            System.out.println(client);
        }
    }

    // method to list all orders in the store
    public void listOrders()
    {
        for(Order order : this.orders)
        {
            System.out.println(order);
        }
    }

    // method to list all service schedulings in the store
    public void listServiceSchedulings()
    {
        for(ServiceScheduling serviceScheduling : this.serviceSchedulings)
        {
            System.out.println(serviceScheduling);
        }
    }

    // method to get client by id
    public Client getClient(int id)
    {
        for(Client client : this.colClients)
        {
            if(client.getShopId() == id)
            {
                return client;
            }
        }
        return null;
    }

    // method to get item by id
    public Item getItem(int id)
    {
        for(Item item : this.catItems)
        {
            if(item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

    // method to get order by id
    public Order getOrder(int id)
    {
        for(Order order : this.orders)
        {
            if(order.getId() == id)
            {
                return order;
            }
        }
        return null;
    }

    // method to get the last id of the clients
    public int getLastClientId()
    {
        int id = 0;
        for(Client client : this.colClients)
        {
            if(client.getShopId() > id)
            {
                id = client.getShopId();
            }
        }
        return id;
    }

    // method to get the last id of the item
    public int getLastItemId() {
        int id = 0;
        for (Item item : this.catItems) {
            if (item.getId() > id) {
                id = item.getId();
            }
        }
        return id;
    }

    // method to get the last id of the order
    public int getLastOrderId() {
        int id = 0;
        for (Order order : this.orders) {
            if (order.getId() > id) {
                id = order.getId();
            }
        }
        return id;
    }

    // method to return a list with all items with a certain type
    public List<Item> getItemsByType(String type)
    {
        List<Item> items = new ArrayList<Item>();
        for(Item item : this.catItems)
        {
            if(item.getType().equals(type))
            {
                items.add(item);
            }
        }
        return items;
    }

    // method to list all items with a certain type
    public void listItemsByType(String type)
    {
        for(Item item : this.getItemsByType(type))
        {
            System.out.println(item);
        }
    }



}