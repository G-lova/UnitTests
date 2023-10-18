import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import seminar4.book.Book;
import seminar4.book.BookRepository;
import seminar4.book.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void findBookById_ShouldReturnCorrectBook() {
        // Arrange
        String bookId = "1";
        Book expectedBook = new Book("1", "Book1", "Author1");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        // Act
        Book actualBook = bookService.findBookById(bookId);

        // Assert
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void findAllBooks_ShouldReturnAllBooks() {
        // Arrange
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2"));
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Act
        List<Book> actualBooks = bookService.findAllBooks();

        // Assert
        assertEquals(expectedBooks, actualBooks);
    }
}