public class Phone extends ElectronicItem{

    private String networkType;
    private int screenSize;
   private String location;

    public Phone(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
        this.location = location;

    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }



    public String toString() {
        return super.toString() + "\nNetwork Type: " + networkType + "\nScreen Size: " + screenSize;
    }


}
