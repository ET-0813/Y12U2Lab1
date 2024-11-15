import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StoreTest {

    private Store store;
    private Book book;
    private Phone iPhone16;
    private Phone xiaomimate12;
    @BeforeEach
    void setUp() {
        store = new Store();
        book = new Book("Crime and Punishment", "Bookshelf", 9, "old book", 167750, "a long long time ago", "who cares really", "123456", "First", "Crime and Punishment");
        iPhone16 = new Phone("iPhone 16", "left pocket", 2400, "phone", 16, "16", "Apple", "iOS", "5G", 128);
        xiaomimate12 = new Phone("xiaomi mate12", "right pocket", 10, "phone", 12, "mate 12", "XiaoMi", "Android", "4.5G", 256);
    }

    @AfterEach
    void tearDown() {
        store = null;
        book = null;
        iPhone16 = null;
        xiaomimate12 = null;
    }

    @Test
    void testAddBook() throws ClassNotFoundException {
        store.addBook(book);
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(book, items.get(0));
    }

    @Test
    void testAddBookAndPhone() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone16);
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(book, items.get(0));
        items = store.getItems("Phone");
        assertEquals(1, items.size());
        assertEquals(iPhone16, items.get(0));
    }

    @Test
    void testUpdatePhoneLocationAndGetAllPhones() {
        store.addPhone(iPhone16);
        store.addPhone(xiaomimate12);
        store.updatePhonesLocation("Room 512");
        ArrayList<Phone> phones = store.getAllPhones();
        assertEquals(2, phones.size());
        assertEquals("Room 512", phones.get(0).getLocation());
        assertEquals("Room 512", phones.get(1).getLocation());
    }

    @Test
    void testGetItems() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone16);
        store.addPhone(xiaomimate12);
        ArrayList<CISItem> items1 = store.getItems("Phone");
        assertEquals(2, items1.size());
        assertEquals(iPhone16, items1.get(0));
        assertEquals(xiaomimate12, items1.get(1));
        ArrayList<CISItem> items2 = store.getItems("Book");
        assertEquals(1, items2.size());
        assertEquals(book, items2.get(0));
    }

    @Test
    void testUpdateItems() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone16);
        store.addPhone(xiaomimate12);
        store.updateItems("Phone", "location", "Room 512");
        ArrayList<Phone> phones = store.getAllPhones();
        assertEquals(2, phones.size());
        assertEquals("Room 512", phones.get(0).getLocation());
        assertEquals("Room 512", phones.get(1).getLocation());
        store.updateItems("Book", "price", "300");
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(300, items.get(0).getPrice());
    }

    @Test
    void testShowAllInfo() {
        store.addBook(book);
        store.addPhone(iPhone16);
        store.addPhone(xiaomimate12);
        store.showAllInfo();
    }

}
