package impl;

import Models.Book;
import Service.BaseService;
import java.util.ArrayList;
import java.util.List;

public class Bookservice_impl implements BaseService<Book> {

    List<Book> Booklist = new ArrayList<>();
    private Book book;

    @Override
    public List<Book> getAll() {
        return this.Booklist;

    }

    @Override
    public boolean save(Book t) {
        return Booklist.add(book);
    }

    @Override
    public boolean upDate(Book t) {
        if (!this.Booklist.isEmpty()) {
            for (int i = 0; i < this.Booklist.size(); i++) {
                if (book.getiD() == Booklist.get(i).getiD()) {
                    Booklist.get(i).setName(book.getName());
                    Booklist.get(i).setType_book(book.getType_book());
                    Booklist.get(i).setQuantity(book.getQuantity());
                }
            }
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        if (this.Booklist.isEmpty()) {
            for (int i = 0; i < this.Booklist.size(); i++) {
                if (Booklist.get(i).getiD() == id) {
                    Booklist.remove(id);
                }
            }
        }

        return false;
    }

}
