 package model;

/**
 *
 * @author PC
 */
public class Book {
    private int book_id;
    private String name;
    private String author;
    private int price;
    private int amount;
    private boolean status;

    public Book() {
    }

    
    public Book(int book_id, String name, String author, int price, int amount, boolean status) {
        this.book_id = book_id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.amount = amount;
        this.status = status;
    }
    public Book(String name, String author, int price, int amount, boolean status) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.amount = amount;
        this.status = status;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" + "book_id=" + book_id + ", name=" + name + ", author=" + author + ", price=" + price + ", amount=" + amount + ", status=" + status + '}';
    }
    public Object[] getToTabble(){
        Object [] objects = new Object[5];
        objects[0] = book_id;
        objects[1] = name;
        objects[2] = author;
        objects[3] = price;
        objects[4] = amount;
        
        return objects;     
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.book_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return this.book_id == other.book_id;
    }
    
    
}
