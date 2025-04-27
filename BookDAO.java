package Library;



import jakarta.persistence.EntityManager;

public class BookDAO {
    public void save(Book book) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

 

    public Book findById(Long id) {
        EntityManager em = HibernateUtil.getEntityManager();
        Book book = em.find(Book.class, id);
        em.close();
        return book;
    }
}