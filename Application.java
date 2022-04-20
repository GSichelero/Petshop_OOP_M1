package petshop;
// https://lucid.app/lucidchart/2d8ae876-8828-4afb-a851-9bc6ce9f4dd3/edit?invitationId=inv_093445e7-bed0-4622-bdfa-21a76f2558f3&page=0_0#

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Store store = new Store();

        boolean loop = true;
        while (loop) {
            System.out.println("What you want to do? ");
            System.out.println("1 - Add a client");
            System.out.println("2 - Do an order");
            System.out.println("3 - Show all clients");
            System.out.println("4 - Show all orders");
            System.out.println("5 - Remove a client");
            System.out.println("6 - Remove an order");
            System.out.println("7 - Show all services");
            System.out.println("8 - Show all products");
            System.out.println("9 - Add a service");
            System.out.println("10 - Add a product");
            System.out.println("11 - Remove a service");
            System.out.println("12 - Remove a product");
            System.out.println("13 - Show the services schedule");
            System.out.println("14 - Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            
            if (option == 1) {
                System.out.println("Enter the name of the client: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter the address of the client: ");
                String address = new Scanner(System.in).nextLine();
                System.out.println("Enter the Individual Taxpayer Registration of the client: ");
                int id = new Scanner(System.in).nextInt();
                int shopId = store.getLastClientId() + 1;

                Client client = new Client(name, address, id, shopId);

                store.addClient(client);
            }

            if (option == 2) {
                store.listClients();
                System.out.println("Enter the id of the client: ");
                int id = new Scanner(System.in).nextInt();
                Client client = store.getClient(id);
                if (client != null) {
                    List<Purchase> purchases = new ArrayList<>();
                    boolean buyMoreItens = true;
                    while (buyMoreItens) {
                        System.out.println("Do you want to order a product or a service?: ");
                        String typeItem = new Scanner(System.in).nextLine();
                        if (typeItem.equals("product") || typeItem.equals("service")) {
                            if (typeItem.equals("product")) {
                                store.listItemsByType("product");
                                System.out.println("Enter the id of the product: ");
                                int idItem = new Scanner(System.in).nextInt();
                                Item item = store.getItem(idItem);
                                if (item != null) {
                                    System.out.println("Enter the quantity of the product: ");
                                    int quantity = new Scanner(System.in).nextInt();
                                    Purchase purchase = new Purchase(item, quantity);
                                    purchases.add(purchase);
                                }
                                else {
                                    System.out.println("Invalid id");
                                }
                            }
                            else {
                                store.listItemsByType("service");
                                System.out.println("Enter the id of the service: ");
                                int idItem = new Scanner(System.in).nextInt();
                                Item item = store.getItem(idItem);
                                if (item != null) {
                                    int quantity = 1;
                                    Purchase purchase = new Purchase(item, quantity);
                                    purchases.add(purchase);

                                    System.out.println("Which date and hour you want to do the service? ");
                                    System.out.println("Enter the date: ");
                                    String date = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the hour: ");
                                    String hour = new Scanner(System.in).nextLine();
                                    String dateHour = date + " " + hour;
                                    ServiceScheduling serviceScheduling = new ServiceScheduling(client, item, dateHour);
                                    store.addServiceScheduling(serviceScheduling);

                                }
                                else {
                                    System.out.println("Invalid id");
                                }
                            }

                            System.out.println("Do you want to buy more items? (y/n)");
                            String answer = new Scanner(System.in).nextLine();
                            if (answer.equals("n")) {
                                int orderId = store.getLastOrderId() + 1;
                                Order order = new Order(orderId, client, purchases);
                                store.addOrder(order);
                                buyMoreItens = false;
                            }
                        }
                    }
                }
                else {
                    System.out.println("Invalid client");
                }
            }

            if (option == 3) {
                store.listClients();
            }

            if (option == 4) {
                store.listOrders();
            }

            if (option == 5) {
                store.listClients();
                System.out.println("Enter the id of the client: ");
                int id = new Scanner(System.in).nextInt();
                Client client = store.getClient(id);
                if (client != null) {
                    store.removeClient(client);
                }
                else {
                    System.out.println("Invalid client id");
                }
            }

            if (option == 6) {
                store.listOrders();
                System.out.println("Enter the id of the order: ");
                int id = new Scanner(System.in).nextInt();
                Order order = store.getOrder(id);
                if (order != null) {
                    store.removeOrder(order);
                }
                else {
                    System.out.println("Invalid order id");
                }
            }

            if (option == 7) {
                store.listItemsByType("service");
            }

            if (option == 8) {
                store.listItemsByType("product");
            }

            if (option == 9) {
                int id = store.getLastItemId() + 1;
                System.out.println("Enter the name of the service: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter the price of the service: ");
                double price = new Scanner(System.in).nextDouble();
                String type = "service";
                Item service = new Item(id, name, price, type);
                store.addItem(service);
            }

            if (option == 10) {
                int id = store.getLastItemId() + 1;
                System.out.println("Enter the name of the product: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter the price of the product: ");
                double price = new Scanner(System.in).nextDouble();
                String type = "product";
                Item product = new Item(id, name, price, type);
                store.addItem(product);
            }

            if (option == 11) {
                store.listItemsByType("service");
                System.out.println("Enter the id of the service: ");
                int id = new Scanner(System.in).nextInt();
                Item service = store.getItem(id);
                if (service != null) {
                    store.removeItem(service);
                }
                else {
                    System.out.println("Invalid service id");
                }
            }

            if (option == 12) {
                store.listItemsByType("product");
                System.out.println("Enter the id of the product: ");
                int id = new Scanner(System.in).nextInt();
                Item product = store.getItem(id);
                if (product != null) {
                    store.removeItem(product);
                }
                else {
                    System.out.println("Invalid product id");
                }
            }

            if (option == 13) {
                store.listServiceSchedulings();
            }

            if (option == 14) {
                System.out.println("Bye!");
                loop = false;
            }
        }

    }
}