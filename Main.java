package Library;

public class Main {

    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAO();
        StudentMemberDAO studentDAO = new StudentMemberDAO();
        LibraryService libraryService = new LibraryService();
        
        
        Book book = new Book("Harry Potter", 10, null);
        bookDAO.save(book);

        StudentMember student = new StudentMember("John Doe", "CSE");
        studentDAO.save(student);

        libraryService.borrowBook(student.getId(), book.getId());

        // libraryService.returnBook(student.getId(), book.getId());

        Book rb = bookDAO.findById(book.getId());

        System.out.println(rb.getQuantity());
    }
}