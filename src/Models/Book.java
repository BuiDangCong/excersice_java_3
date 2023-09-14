package Models;

public class Book extends Common {

    private String type_book;
    private int quantity;

    public Book(String type_book, int quantity, int iD, String name) {
        super(iD, name);
        this.type_book = type_book;
        this.quantity = quantity;
    }

    public String getType_book() {
        return type_book;
    }

    public void setType_book(String type_book) {
        this.type_book = type_book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
