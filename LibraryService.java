package Library;

import jakarta.persistence.EntityManager;


public class LibraryService {

    public void borrowBook(Long studentId, Long bookId) {

        EntityManager em = HibernateUtil.getEntityManager();

        em.getTransaction().begin();

 

        StudentMember student = em.find(StudentMember.class, studentId);

        Book book = em.find(Book.class, bookId);

 

        if (book.getQuantity() > 0) {

            book.reduceQuantity();

            student.addBook(book);

        }

 

        em.getTransaction().commit();

        em.close();

    }

 

    public void returnBook(Long studentId, Long bookId) {

        EntityManager em = HibernateUtil.getEntityManager();

        em.getTransaction().begin();

 

        StudentMember student = em.find(StudentMember.class, studentId);

        Book book = em.find(Book.class, bookId);

 

        if (student.getBorrowedBooks().contains(book)) {

            book.increaseQuantity();

            student.removeBook(book);

        }

 

        em.getTransaction().commit();

        em.close();

    }

}

 