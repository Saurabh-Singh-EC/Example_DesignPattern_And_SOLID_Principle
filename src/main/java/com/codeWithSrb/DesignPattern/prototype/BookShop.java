package com.codeWithSrb.DesignPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }


    //a function whose responsibility is to load the data from database when called after Object creation
    public void loadBooks() {
        for(int i = 0; i<10 ; i++) {
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book" + +i);
            books.add(book);
        }
    }

    // clone method which is responsible for cloning the java object
    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for(Book b : this.getBooks()) {
            shop.getBooks().add(b);
        }
        return shop;
    }
}
