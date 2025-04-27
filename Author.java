package Library;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

 



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 

    private String name;

 

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> booksWritten;

 

    public Author() {}

 

    public Author(String name) {
        this.name = name;
    }

 

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

 

    public List<Book> getBooksWritten() { return booksWritten; }
    public void setBooksWritten(List<Book> booksWritten) { this.booksWritten = booksWritten; }
}

 
