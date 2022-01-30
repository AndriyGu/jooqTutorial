/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.jooqtutorial;


import com.baeldung.jooq.introduction.db.DefaultCatalog;
import com.baeldung.jooq.introduction.db.jooqtutorial.tables.Author;
import com.baeldung.jooq.introduction.db.jooqtutorial.tables.AuthorBook;
import com.baeldung.jooq.introduction.db.jooqtutorial.tables.Book;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooqtutorial extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooqtutorial</code>
     */
    public static final Jooqtutorial JOOQTUTORIAL = new Jooqtutorial();

    /**
     * The table <code>jooqtutorial.author</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>jooqtutorial.author_book</code>.
     */
    public final AuthorBook AUTHOR_BOOK = AuthorBook.AUTHOR_BOOK;

    /**
     * The table <code>jooqtutorial.book</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * No further instances allowed
     */
    private Jooqtutorial() {
        super("jooqtutorial", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Author.AUTHOR,
            AuthorBook.AUTHOR_BOOK,
            Book.BOOK
        );
    }
}