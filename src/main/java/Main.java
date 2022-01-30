import com.baeldung.jooq.introduction.db.jooqtutorial.tables.Author;
import com.baeldung.jooq.introduction.db.jooqtutorial.tables.AuthorBook;
import com.baeldung.jooq.introduction.db.jooqtutorial.tables.Book;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

public class Main {

    @Autowired
    private DSLContext dsl;

    public static void main(String[] args) {

        Author author = Author.AUTHOR;
        Book book = Book.BOOK;
        AuthorBook authorBook = AuthorBook.AUTHOR_BOOK;

        dsl.insertInto(author)
                .set(author.ID, 4)
                .set(author.FIRST_NAME, "Herbert")
                .set(author.LAST_NAME, "Schildt")
                .execute();
        dsl.insertInto(book)
                .set(book.ID, 4)
                .set(book.TITLE, "A Beginner's Guide")
                .execute();
        dsl.insertInto(authorBook)
                .set(authorBook.AUTHOR_ID, 4)
                .set(authorBook.BOOK_ID, 4)
                .execute();
    }
}
