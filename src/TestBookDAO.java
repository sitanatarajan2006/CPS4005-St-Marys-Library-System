import dao.BookDAO;
import model.Book;
public class TestBookDAO {

public static void main(String[] args) {
    BookDAO bookDAO = new BookDAO();
    Book book = new Book(0, "Test Book", "Sita", "Programming", "Available");
    bookDAO.addBook(book);
}