import java.util.ArrayList;

public class Store {

    private ArrayList<CISItem> cisItems = new ArrayList<CISItem>();

    public void addBook(Book book){
        cisItems.add(book);
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }

    public void updatePhonesLocation(String location){
        for(CISItem item : cisItems){
            if(item instanceof Phone){
                item.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        for(CISItem item : cisItems){
            if(item instanceof Phone){
                phones.add((Phone)item);
            }
        }
        return phones;
    }

    public ArrayList<CISItem> getItems(String itemType){
        ArrayList<CISItem> items = new ArrayList<>();
        for(CISItem item : cisItems){
            if(item.getClass().getSimpleName().equals(itemType)){
                items.add(item);
            }
        }
        return items;
    }

    public void updateItems(String itemType, String property, String value){
        for(CISItem item : cisItems){
            if(item.getClass().getSimpleName().equals(itemType)){
                switch(property){
                    case "name":
                        item.setName(value);
                        break;
                    case "location":
                        item.setLocation(value);
                        break;
                    case "price":
                        item.setPrice(Integer.parseInt(value));
                        break;
                    case "description":
                        item.setDescription(value);
                        break;
                    case "wordCount":
                        ((ReadingItem)item).setWordCount(Integer.parseInt(value));
                        break;
                    case "datePublished":
                        ((ReadingItem)item).setDatePublished(value);
                        break;
                    case "author":
                        ((ReadingItem)item).setAuthor(value);
                        break;
                    case "coverStoryTitle":
                        ((Magazine)item).setCoverStoryTitle(value);
                        break;
                    case "printDate":
                        ((Magazine)item).setPrintDate(value);
                        break;
                    case "version":
                        ((Arduino)item).setVersion(value);
                        break;
                    case "storageCapacity":
                        ((ElectronicItem)item).setStorageCapacity(Integer.parseInt(value));
                        break;
                    case "model":
                        ((ElectronicItem)item).setModel(value);
                        break;
                    case "maker":
                        ((ElectronicItem)item).setMaker(value);
                        break;
                    case "operatingSystem":
                        ((ElectronicItem)item).setOperatingSystem(value);
                        break;
                }
            }
        }

    }

    public void showAllInfo(){
        for(CISItem item : cisItems){
            System.out.println(item.toString());
        }
    }

    public void addItems(CISItem cisItem){
        cisItems.add(cisItem);
    }

    public CISItem getItems(CISItem cisItem){
        return cisItem;
    }



}
