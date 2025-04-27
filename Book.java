package Library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Book {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

 

    private String name;

    private int quantity;

 

    @ManyToOne

    @JoinColumn(name = "author_id")

    private Author author;

 

    public Book() {}

 

    public Book(String name, int quantity, Author author) {

        this.name = name;

        this.quantity = quantity;

        this.author = author;

    }

 

    // Getters and Setters

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

 

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

 

    public Author getAuthor() { return author; }

    public void setAuthor(Author author) { this.author = author; }

 

    public void reduceQuantity() { if (quantity > 0) quantity--; }

    public void increaseQuantity() { quantity++; }

}

 

