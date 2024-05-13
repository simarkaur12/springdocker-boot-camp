package com.harskaur.bookclientservice.Repository;

import com.harskaur.bookclientservice.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repository interface for performing CRUD operations on the <code>Book</code> entity.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
