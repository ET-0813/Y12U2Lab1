public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;

    public CISItem() {
        name = null;
        location = null;
        price = 0;
        description = null;
    }


    public CISItem(String name, String location, int price, String description) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Name: " + name + "\nLocation: " + location + "\nPrice: " + price + "\nDescription: " + description;
    }
}
