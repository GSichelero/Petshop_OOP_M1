package petshop;

public class Person {
    private String name;
    private String address;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Person() {
    }

    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", id=" + id + "]";
    }
}