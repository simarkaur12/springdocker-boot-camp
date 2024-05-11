package com.harskaur.simplecrud.Service;

import com.harskaur.simplecrud.Model.Book;
import com.harskaur.simplecrud.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service annotation is used with classes that provide some business functionalities
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Retrieves all books from the repository.
     *
     * @return List of all books
     */
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Saves a list of books to the repository.
     *
     * @param books The list of books to save
     * @return The list of saved books
     */
    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    /**
     * Retrieves a book by its ID from the repository.
     *
     * @param id The ID of the book to retrieve
     * @return The book with the specified ID
     * @throws RuntimeException if no book is found for the given ID
     */
    public Book findByBookId(Long id) {
        Optional<Book> optDb =  bookRepository.findById(id);
        if(optDb.isPresent()) {
            return optDb.get();
        }else {
            throw new RuntimeException("Record with Id:"+ id +" not found");
        }
    }


}